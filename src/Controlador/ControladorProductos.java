package Controlador;

import Implementacion.ProductoImp;
import Modelo.ModeloProductos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ControladorProductos implements MouseListener, KeyListener {
    ModeloProductos modelo;
    ProductoImp implementacion = new ProductoImp();

    public ControladorProductos(ModeloProductos modelo) {
        this.modelo = modelo;
    }
    
    public byte[] getImagen(){
        File imagen = new File(implementacion.obtenerRuta());
        byte[] icono;
        try {
            icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
        } catch (Exception e) {
            return null;
        }
        return icono;
    }
    
    public void agregarProducto(){
        boolean resultado;
        int codigoCategoria = modelo.getVistaProductos().comBoxCategoriaProducto.getSelectedIndex() + 1;
        ModeloProductos modelo = new ModeloProductos();
        modelo.setNombreProducto(modelo.getVistaProductos().txtNombreProducto.getText());
        modelo.setCantidad(Integer.parseInt(modelo.getVistaProductos().txtCantidad.getText()));
        modelo.setPrecioNormal(Double.parseDouble(modelo.getVistaProductos().txtPrecioNormal.getText()));
        modelo.setPrecioPromocion(Double.parseDouble(modelo.getVistaProductos().txtPrecioPromocional.getText()));
        modelo.setCategoriaProducto(codigoCategoria);
        modelo.setImagenProducto(getImagen());
        resultado = implementacion.guardarProducto(modelo);
        if(!resultado){
                System.out.println("Insercion realizada con exito.");
            }else{
                System.out.println("Hubo un problema al insertar.");
            }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaProductos().btnImagen)){
            modelo.getVistaProductos().letProductoImagen.setIcon(implementacion.seleccionarImagen());
            
            System.out.println("esta es la ruta: " + implementacion.obtenerRuta());
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
    
}
