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
        } else if(e.getComponent().equals(modelo.getVistaVentas().btnBuscarProducto)){
            try {
                mostrarProducto();
                modelo.getVistaVentas().btnAgregarProducto.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ControladorVentas.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    
}
