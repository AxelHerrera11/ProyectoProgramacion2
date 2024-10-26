package Controlador;

import Implementacion.VentaImp;
import Modelo.ModeloInicioSesion;
import Modelo.ModeloVentas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

public class ControladorVentas implements MouseListener, KeyListener {

    ModeloVentas modelo;
    VentaImp implementacion = new VentaImp();

    public ControladorVentas(ModeloVentas modelo) {
        this.modelo = modelo;
    }

    List<ModeloVentas> listadoProductos = new ArrayList<>();

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaVentas().btnVentasContinuar)) {
            modelo.getVistaVentas().panelAgregarProductos.setVisible(false);
            modelo.getVistaVentas().panelMetodoPago.setVisible(true);
            modelo.getVistaVentas().letTextoContinuar.setVisible(false);
            modelo.getVistaVentas().btnVentasContinuar.setVisible(false);
            modelo.getVistaVentas().btnRegresar.setVisible(true);
            if (modelo.getVistaVentas().txtNombreCliente.getText().isEmpty()) {
                modelo.getVistaVentas().btnTerminarVenta.setVisible(false);
            } else {
                modelo.getVistaVentas().btnTerminarVenta.setVisible(true);
            }
        } else if (e.getComponent().equals(modelo.getVistaVentas().btnBuscarProducto)) {
            try {
                mostrarProducto();
                modelo.getVistaVentas().btnAgregarProducto.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ControladorVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getComponent().equals(modelo.getVistaVentas().btnAgregarProducto)) {
            agregarProudctoEnTabla();
            mostrarTotalVenta();
            modelo.getVistaVentas().letTextoContinuar.setVisible(true);
            modelo.getVistaVentas().btnVentasContinuar.setVisible(true);
            modelo.getVistaVentas().btnEliminarProducto.setVisible(true);
        } else if (e.getComponent().equals(modelo.getVistaVentas().btnRegresar)) {
            modelo.getVistaVentas().panelMetodoPago.setVisible(false);
            modelo.getVistaVentas().panelAgregarProductos.setVisible(true);
            modelo.getVistaVentas().btnTerminarVenta.setVisible(false);
            modelo.getVistaVentas().btnRegresar.setVisible(false);
            modelo.getVistaVentas().letTextoContinuar.setVisible(true);
            modelo.getVistaVentas().btnVentasContinuar.setVisible(true);
        } else if (e.getComponent().equals(modelo.getVistaVentas().btnBuscarNIT)) {
            mostrarCliente();
            modelo.getVistaVentas().btnTerminarVenta.setVisible(true);
        } else if (e.getComponent().equals(modelo.getVistaVentas().btnEliminarProducto)) {
            eliminarProductoEnTabla();
            mostrarTotalVenta();
        } else if (e.getComponent().equals(modelo.getVistaVentas().btnTerminarVenta)) {
            realizarVenta();
            agregarDetalleVenta();
            generarFactura();
//            JOptionPane.showMessageDialog(null, "Venta realizada con éxito", "Venta", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void mostrarProducto() throws IOException {
        ModeloVentas model = implementacion.mostrarProducto(Integer.parseInt(modelo.getVistaVentas().txtNoCodigoBarras.getText()));
        int seleccion = this.modelo.getVistaVentas().ComBoxPromocion.getSelectedIndex();
        double precio = 0;
        if (seleccion == 0) {
            precio = model.getPrecioNormal();
        } else if (seleccion == 1) {
            precio = model.getPercioPromocion();
        }

        modelo.getVistaVentas().txtIDProducto.setText(String.valueOf(model.getIdProducto()));
        modelo.getVistaVentas().txtNombreProducto.setText(model.getNombreProducto());
        modelo.getVistaVentas().txtPrecioVenta.setText(String.valueOf(precio));
        modelo.getVistaVentas().letImagenVentas.setIcon(implementacion.generarImagen(model.getImagenProducto(), modelo.getVistaVentas().letImagenVentas.getWidth(), modelo.getVistaVentas().letImagenVentas.getHeight()));
    }

    public void agregarProudctoEnTabla() {
        String idProducto = modelo.getVistaVentas().txtIDProducto.getText();
        String nombre = modelo.getVistaVentas().txtNombreProducto.getText();
        double precio = Double.parseDouble(modelo.getVistaVentas().txtPrecioVenta.getText());
        int cantidad = Integer.parseInt(modelo.getVistaVentas().txtCantidadVenta.getText());
        double subTotal = precio * cantidad;
        String precioTabla = String.valueOf(precio);
        String cantidadTabla = String.valueOf(cantidad);
        String subTotalTabla = String.valueOf(subTotal);

        modelo.getVistaVentas().tblProductos.setModel(implementacion.agregarEnTabla(idProducto, nombre, precioTabla, cantidadTabla, subTotalTabla));
    }

    public void mostrarTotalVenta() {
        double fila = 0;
        double total = 0;

        for (int i = 0; i < modelo.getVistaVentas().tblProductos.getRowCount(); i++) {
            fila = Double.parseDouble(modelo.getVistaVentas().tblProductos.getValueAt(i, 4).toString());
            total += fila;
        }
        modelo.getVistaVentas().txtTotalVenta.setText(String.valueOf(total));
    }

    public void mostrarCliente() {
        ModeloVentas model = implementacion.mostrarCliente(modelo.getVistaVentas().txtNITVentas.getText());
        modelo.getVistaVentas().txtNombreCliente.setText(model.getNombreCliente());
        System.out.println(modelo.getNombreCliente());
    }

    public void eliminarProductoEnTabla() {
        int fila = modelo.getVistaVentas().tblProductos.getSelectedRow();
        modelo.getVistaVentas().tblProductos.setModel(implementacion.eliminarEnTabla(fila));
    }

    public void realizarVenta() {
        ModeloInicioSesion modeloIS = new ModeloInicioSesion();
        int vVendedor = modeloIS.getIdUsuarioEncontrado();
        int tipoPago = modelo.getVistaVentas().comboMetodoPago.getSelectedIndex() + 1;

        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        Date fecha = Date.valueOf(fechaActual);
        Time hora = Time.valueOf(horaActual);
        double vTotal = Double.parseDouble(modelo.getVistaVentas().txtTotalVenta.getText());

        double vTotalVenta = 0;
        if (tipoPago == 1) {
            vTotalVenta = vTotal;
        } else if (tipoPago == 2) {
            vTotalVenta = vTotal + (vTotal * 0.05);
        }

        double iva = vTotalVenta * 0.12;
        int id_cliente = modelo.getIdCliente();

        boolean resultado;
        ModeloVentas modelo = new ModeloVentas();
        modelo.setIdVendedor(vVendedor);
        modelo.setTipoPago(tipoPago);
        modelo.setFecha(fecha);
        modelo.setHora(hora);
        modelo.setTotalVenta(vTotalVenta);
        modelo.setIva(iva);
        modelo.setIdCliente(id_cliente);
        resultado = implementacion.guardarVenta(modelo);
        if (!resultado) {
            System.out.println("Insercion realizada con exito.");
        } else {
            System.out.println("Hubo un problema al insertar.");
        }
    }

    public void agregarDetalleVenta() {
        double fila = 0;
        int idProducto = 0;
        double precioVenta = 0;
        int CantidadActualizar = 0;
        int CantidadVenta = 0;
        double subTotal = 0;
        int idVenta = 0;

        for (int i = 0; i < modelo.getVistaVentas().tblProductos.getRowCount(); i++) {
            idProducto = Integer.parseInt(modelo.getVistaVentas().tblProductos.getValueAt(i, 0).toString());
            precioVenta = Double.parseDouble(modelo.getVistaVentas().tblProductos.getValueAt(i, 2).toString());
            int cantidadBD = implementacion.buscarCantidad(idProducto);
            int cantidadT = Integer.parseInt(modelo.getVistaVentas().tblProductos.getValueAt(i, 3).toString());

            boolean resultado;
            ModeloVentas modeloA = new ModeloVentas();
            boolean resultado2;
            ModeloVentas modeloD = new ModeloVentas();

            if (cantidadBD < cantidadT) {

            } else {
                CantidadActualizar = cantidadBD - cantidadT;
                modeloA.setIdProducto(idProducto);
                modeloA.setCantidadProducto(CantidadActualizar);
                resultado = implementacion.actualizarCantidad(modeloA);
                CantidadVenta = cantidadT;
                subTotal = Double.parseDouble(modelo.getVistaVentas().tblProductos.getValueAt(i, 4).toString());
                idVenta = implementacion.utimaVenta();

                modeloD.setIdProducto(idProducto);
                modeloD.setPrecioVenta(precioVenta);
                modeloD.setCantidadVenta(CantidadVenta);
                modeloD.setSubTotal(subTotal);
                modeloD.setIdVenta(idVenta);
                resultado2 = implementacion.guardarDetalleVenta(modeloD);
            }

        }
    }

    public void llenarArrayLista() {
        for (int i = 0; i < modelo.getVistaVentas().tblProductos.getRowCount(); i++) {
            String nombreProducto = (String) modelo.getVistaVentas().tblProductos.getValueAt(i, 1);
            double precioVenta = (double) modelo.getVistaVentas().tblProductos.getValueAt(i, 2);
            int cantidadVenta = (int) modelo.getVistaVentas().tblProductos.getValueAt(i, 3);
            double subTotal = (double) modelo.getVistaVentas().tblProductos.getValueAt(i, 4);

            ModeloVentas modeloV = new ModeloVentas(nombreProducto, precioVenta, cantidadVenta, subTotal);
            listadoProductos.add(modeloV);
        }
    }

    public void generarFactura() {
        ModeloInicioSesion modeloIS = new ModeloInicioSesion();
        String vVendedor = modeloIS.getUsuarioEncontrado();
        int tipoPago = modelo.getVistaVentas().comboMetodoPago.getSelectedIndex() + 1;
        String nombreTipoPago = "";

        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();

        Date fecha = Date.valueOf(fechaActual);
        Time hora = Time.valueOf(horaActual);
        double vTotal = Double.parseDouble(modelo.getVistaVentas().txtTotalVenta.getText());
        double recargo = 0;
        double vTotalVenta = 0;
        if (tipoPago == 1) {
            vTotalVenta = vTotal;
            nombreTipoPago = "Efectivo";
            recargo = 0;
        } else if (tipoPago == 2) {
            vTotalVenta = vTotal + (vTotal * 0.05);
            nombreTipoPago = "Trajeta Deb/Cred";
            recargo = (vTotal * 0.05);
        }

        double iva = vTotalVenta * 0.12;
        String nomCliente = modelo.getNombreCliente();
        String nitCliente = modelo.getVistaVentas().txtNITVentas.getText();
        
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Factura Venta.pdf"));
            
            Paragraph tituloFactura = new Paragraph();
            tituloFactura.setAlignment(Paragraph.ALIGN_CENTER);
            tituloFactura.setFont(FontFactory.getFont("Arial", 20, Font.BOLD, BaseColor.BLACK));
            tituloFactura.add("FACTURA\n\n");
            

            Paragraph tituloVendedor = new Paragraph();
            tituloVendedor.setAlignment(Paragraph.ALIGN_LEFT);
            tituloVendedor.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloVendedor.add("ATENDIDO POR: ");
            
            Paragraph nombreVendedor = new Paragraph();
            nombreVendedor.setAlignment(Paragraph.ALIGN_LEFT);
            nombreVendedor.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            nombreVendedor.add(vVendedor + "\n\n");
            
            Paragraph tituloFecha = new Paragraph();
            tituloFecha.setAlignment(Paragraph.ALIGN_LEFT);
            tituloFecha.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloFecha.add("FECHA: ");
            
            Paragraph fechaPDF = new Paragraph();
            fechaPDF.setAlignment(Paragraph.ALIGN_LEFT);
            fechaPDF.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            fechaPDF.add(fecha + "\n\n");
            
            Paragraph tituloHora = new Paragraph();
            tituloHora.setAlignment(Paragraph.ALIGN_LEFT);
            tituloHora.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloHora.add("HORA: ");
            
            Paragraph horaPDF = new Paragraph();
            horaPDF.setAlignment(Paragraph.ALIGN_LEFT);
            horaPDF.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            horaPDF.add(hora + "\n\n");
            
            Paragraph tituloNitC = new Paragraph();
            tituloNitC.setAlignment(Paragraph.ALIGN_LEFT);
            tituloNitC.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloNitC.add("NIT CLIENTE: ");
            
            Paragraph nitC = new Paragraph();
            nitC.setAlignment(Paragraph.ALIGN_LEFT);
            nitC.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            nitC.add(nitCliente + "\n\n");
            
            Paragraph tituloCliente = new Paragraph();
            tituloCliente.setAlignment(Paragraph.ALIGN_LEFT);
            tituloCliente.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloCliente.add("NOMBRE CLIENTE: ");
            
            Paragraph nombreCliente = new Paragraph();
            nombreCliente.setAlignment(Paragraph.ALIGN_LEFT);
            nombreCliente.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            nombreCliente.add(nomCliente + "\n\n");
            
            Paragraph tituloTipoPago = new Paragraph();
            tituloTipoPago.setAlignment(Paragraph.ALIGN_LEFT);
            tituloTipoPago.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloTipoPago.add("TIPO DE PAGO: ");
            
            Paragraph nombreTipPag = new Paragraph();
            nombreTipPag.setAlignment(Paragraph.ALIGN_LEFT);
            nombreTipPag.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            nombreTipPag.add(nombreTipoPago + "\n\n");
            
            Paragraph tituloTotal = new Paragraph();
            tituloTotal.setAlignment(Paragraph.ALIGN_LEFT);
            tituloTotal.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloTotal.add("\n\nTOTAL: ");
            
            Paragraph cantidadTotal = new Paragraph();
            cantidadTotal.setAlignment(Paragraph.ALIGN_LEFT);
            cantidadTotal.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            cantidadTotal.add(String.valueOf(vTotalVenta) + "\n\n");
            
            Paragraph tituloRecargo = new Paragraph();
            tituloRecargo.setAlignment(Paragraph.ALIGN_LEFT);
            tituloRecargo.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloRecargo.add("RECARGO: ");
            
            Paragraph cantidadRecargo = new Paragraph();
            cantidadRecargo.setAlignment(Paragraph.ALIGN_LEFT);
            cantidadRecargo.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            cantidadRecargo.add(String.format("%.2f", recargo) + "\n\n");
            
            Paragraph tituloIva = new Paragraph();
            tituloIva.setAlignment(Paragraph.ALIGN_LEFT);
            tituloIva.setFont(FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK));
            tituloIva.add("IVA: ");
            
            Paragraph cantidadIva = new Paragraph();
            cantidadIva.setAlignment(Paragraph.ALIGN_LEFT);
            cantidadIva.setFont(FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK));
            cantidadIva.add(String.format("%.2f", iva) + "\n\n");
            
            
            
            
            
            documento.open();

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("Producto");
            tabla.addCell("Precio");
            tabla.addCell("Cantidad");
            tabla.addCell("SubTotal");
            for (int i = 0; i < modelo.getVistaVentas().tblProductos.getRowCount(); i++) {
                String nombreProducto = (String) modelo.getVistaVentas().tblProductos.getValueAt(i, 1);
                String precioVenta = (String) modelo.getVistaVentas().tblProductos.getValueAt(i, 2);
                String cantidadVenta = (String) modelo.getVistaVentas().tblProductos.getValueAt(i, 3);
                String subTotal = (String) modelo.getVistaVentas().tblProductos.getValueAt(i, 4);
                
                tabla.addCell(nombreProducto);
                tabla.addCell(precioVenta);
                tabla.addCell(cantidadVenta);
                tabla.addCell(subTotal);
                
            }
            
            documento.add(tituloFactura);
            documento.add(tituloVendedor);
            documento.add(nombreVendedor);
            documento.add(tituloFecha);
            documento.add(fechaPDF);
            documento.add(tituloHora);
            documento.add(horaPDF);
            documento.add(tituloNitC);
            documento.add(nitC);
            documento.add(tituloCliente);
            documento.add(nombreCliente);
            documento.add(tituloTipoPago);
            documento.add(nombreTipPag);
            documento.add(tabla);
            documento.add(tituloTotal);
            documento.add(cantidadTotal);
            documento.add(tituloRecargo);
            documento.add(cantidadRecargo);
            documento.add(tituloIva);
            documento.add(cantidadIva);
            documento.close();
            JOptionPane.showMessageDialog(null, "Venta realizada");

        } catch (DocumentException | FileNotFoundException e) {
        }

    }

}
