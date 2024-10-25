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

public class ControladorVentas implements MouseListener, KeyListener {
    ModeloVentas modelo;
    VentaImp implementacion = new VentaImp();

    public ControladorVentas(ModeloVentas modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaVentas().btnVentasContinuar)){
            modelo.getVistaVentas().panelAgregarProductos.setVisible(false);
            modelo.getVistaVentas().panelMetodoPago.setVisible(true);
            modelo.getVistaVentas().letTextoContinuar.setVisible(false);
            modelo.getVistaVentas().btnVentasContinuar.setVisible(false);
            modelo.getVistaVentas().btnRegresar.setVisible(true);
            if(modelo.getVistaVentas().txtNombreCliente.getText().isEmpty()){
                modelo.getVistaVentas().btnTerminarVenta.setVisible(false);
            }else{
                modelo.getVistaVentas().btnTerminarVenta.setVisible(true);
            }
        } else if(e.getComponent().equals(modelo.getVistaVentas().btnBuscarProducto)){
            try {
                mostrarProducto();
                modelo.getVistaVentas().btnAgregarProducto.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ControladorVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getComponent().equals(modelo.getVistaVentas().btnAgregarProducto)){
            agregarProudctoEnTabla();
            mostrarTotalVenta();
            modelo.getVistaVentas().letTextoContinuar.setVisible(true);
            modelo.getVistaVentas().btnVentasContinuar.setVisible(true);
            modelo.getVistaVentas().btnEliminarProducto.setVisible(true);
        } else if(e.getComponent().equals(modelo.getVistaVentas().btnRegresar)){
            modelo.getVistaVentas().panelMetodoPago.setVisible(false);
            modelo.getVistaVentas().panelAgregarProductos.setVisible(true);
            modelo.getVistaVentas().btnTerminarVenta.setVisible(false);
            modelo.getVistaVentas().btnRegresar.setVisible(false);
            modelo.getVistaVentas().letTextoContinuar.setVisible(true);
            modelo.getVistaVentas().btnVentasContinuar.setVisible(true);
        } else if(e.getComponent().equals(modelo.getVistaVentas().btnBuscarNIT)){
            mostrarCliente();
            modelo.getVistaVentas().btnTerminarVenta.setVisible(true);
        } else if(e.getComponent().equals(modelo.getVistaVentas().btnEliminarProducto)){
            eliminarProductoEnTabla();
            mostrarTotalVenta();
        } else if(e.getComponent().equals(modelo.getVistaVentas().btnTerminarVenta)){
            realizarVenta();
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
    
    public void mostrarProducto() throws IOException{
        ModeloVentas model = implementacion.mostrarProducto(Integer.parseInt(modelo.getVistaVentas().txtNoCodigoBarras.getText()));
        int seleccion = this.modelo.getVistaVentas().ComBoxPromocion.getSelectedIndex();
        double precio = 0;
        if(seleccion == 0){
            precio = model.getPrecioNormal();
        } else if(seleccion == 1){
            precio = model.getPercioPromocion();
        }
        
        modelo.getVistaVentas().txtIDProducto.setText(String.valueOf(model.getIdProducto()));
        modelo.getVistaVentas().txtNombreProducto.setText(model.getNombreProducto());
        modelo.getVistaVentas().txtPrecioVenta.setText(String.valueOf(precio));
        modelo.getVistaVentas().letImagenVentas.setIcon(implementacion.generarImagen(model.getImagenProducto(), modelo.getVistaVentas().letImagenVentas.getWidth(), modelo.getVistaVentas().letImagenVentas.getHeight()));
    }
    
    public void agregarProudctoEnTabla(){
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
    
    public void mostrarTotalVenta(){
        double fila = 0;
        double total = 0;
        
        for(int i = 0; i < modelo.getVistaVentas().tblProductos.getRowCount(); i++){
            fila = Double.parseDouble(modelo.getVistaVentas().tblProductos.getValueAt(i, 4).toString());
            total += fila;
        }
        modelo.getVistaVentas().txtTotalVenta.setText(String.valueOf(total));
    }
    
    public void mostrarCliente(){
        ModeloVentas model = implementacion.mostrarCliente(modelo.getVistaVentas().txtNITVentas.getText());
        modelo.getVistaVentas().txtNombreCliente.setText(model.getNombreCliente());
        System.out.println(modelo.getNombreCliente());
    }
    
    public void eliminarProductoEnTabla(){
        int fila = modelo.getVistaVentas().tblProductos.getSelectedRow();
        modelo.getVistaVentas().tblProductos.setModel(implementacion.eliminarEnTabla(fila));
    }
    
    public void realizarVenta(){
        ModeloInicioSesion modeloIS = new ModeloInicioSesion();
        int vVendedor = modeloIS.getIdUsuarioEncontrado();
        int tipoPago = modelo.getVistaVentas().comboMetodoPago.getSelectedIndex() + 1;
        
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        
        Date fecha = Date.valueOf(fechaActual);
        Time hora = Time.valueOf(horaActual);
        double vTotal = Double.parseDouble(modelo.getVistaVentas().txtTotalVenta.getText());
        
        double vTotalVenta = 0;
        if(tipoPago == 1){
            vTotalVenta = vTotal;
        } else if(tipoPago == 2){
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
        if(!resultado){
                System.out.println("Insercion realizada con exito.");
            }else{
                System.out.println("Hubo un problema al insertar.");
            }
    }
    
}
