package Controlador;

import Implementacion.VentaImp;
import Modelo.ModeloVentas;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
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
            modelo.getVistaVentas().btnEliminar.setVisible(true);
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
        modelo.getVistaVentas().txtNombreProducto.setText(model.getNombreProducto());
        modelo.getVistaVentas().txtPrecioVenta.setText(String.valueOf(precio));
        modelo.getVistaVentas().letImagenVentas.setIcon(implementacion.generarImagen(model.getImagenProducto(), modelo.getVistaVentas().letImagenVentas.getWidth(), modelo.getVistaVentas().letImagenVentas.getHeight()));
    }
    
    public void agregarProudctoEnTabla(){
        String nombre = modelo.getVistaVentas().txtNombreProducto.getText();
        double precio = Double.parseDouble(modelo.getVistaVentas().txtPrecioVenta.getText());
        int cantidad = Integer.parseInt(modelo.getVistaVentas().txtCantidadVenta.getText());
        double subTotal = precio * cantidad;
        String precioTabla = String.valueOf(precio);
        String cantidadTabla = String.valueOf(cantidad);
        String subTotalTabla = String.valueOf(subTotal);
        
        modelo.getVistaVentas().tblProductos.setModel(implementacion.agregarEnTabla(nombre, precioTabla, cantidadTabla, subTotalTabla));
    }
    
    public void mostrarTotalVenta(){
        double fila = 0;
        double total = 0;
        
        for(int i = 0; i < modelo.getVistaVentas().tblProductos.getRowCount(); i++){
            fila = Double.parseDouble(modelo.getVistaVentas().tblProductos.getValueAt(i, 3).toString());
            total += fila;
        }
        modelo.getVistaVentas().txtTotalVenta.setText(String.valueOf(total));
    }
    
    public void mostrarCliente(){
        ModeloVentas model = implementacion.mostrarCliente(modelo.getVistaVentas().txtNITVentas.getText());
        modelo.getVistaVentas().txtNombreCliente.setText(model.getNombreCliente());
        System.out.println(modelo.getNombreCliente());
    }
    
}
