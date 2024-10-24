package Controlador;

import Implementacion.ProductoImp;
import Modelo.ModeloProductos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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
    
    
    
    
    public void agregarProducto() throws IOException{
        boolean resultado;
        int consultaNoCB = implementacion.consultarNoCodigoBarras();
        int noCodigoBarras;
        if(consultaNoCB != 0){
            noCodigoBarras = consultaNoCB + 1;
        } else{
            noCodigoBarras = 10001;
        }
        String numeroCodigoBarras = String.valueOf(noCodigoBarras);
        implementacion.generarCodigoBarras(numeroCodigoBarras);
        int codigoCategoria = this.modelo.getVistaProductos().comBoxCategoriaProducto.getSelectedIndex() + 1;
        ModeloProductos modelo = new ModeloProductos();
        modelo.setNombreProducto(this.modelo.getVistaProductos().txtNombreProducto.getText());
        modelo.setCantidad(Integer.parseInt(this.modelo.getVistaProductos().txtCantidad.getText()));
        modelo.setPrecioNormal(Double.parseDouble(this.modelo.getVistaProductos().txtPrecioNormal.getText()));
        modelo.setPrecioPromocion(Double.parseDouble(this.modelo.getVistaProductos().txtPrecioPromocional.getText()));
        modelo.setCategoriaProducto(codigoCategoria);
        modelo.setImagenProducto(getImagen());
        modelo.setNumeroCodigoBarras(noCodigoBarras);
        modelo.setCodigoBarras(implementacion.obtenerCodigoBarras());
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
        } else if(e.getComponent().equals(modelo.getVistaProductos().btnAgregarProducto)){
            try {
                agregarProducto();
            } catch (IOException ex) {
                Logger.getLogger(ControladorProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getComponent().equals(modelo.getVistaProductos().btnBuscarProducto)){
            try {
                mostrarProducto();
            } catch (IOException ex) {
                Logger.getLogger(ControladorProductos.class.getName()).log(Level.SEVERE, null, ex);
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
        ModeloProductos model = implementacion.mostrarProducto(Integer.parseInt(modelo.getVistaProductos().txtCodigoProducto.getText()));
        modelo.getVistaProductos().txtNombreProducto.setText(model.getNombreProducto());
        modelo.getVistaProductos().txtCantidad.setText(String.valueOf(model.getCantidad()));
        modelo.getVistaProductos().txtPrecioNormal.setText(String.valueOf(model.getPrecioNormal()));
        modelo.getVistaProductos().txtPrecioPromocional.setText(String.valueOf(model.getPrecioPromocion()));
        modelo.getVistaProductos().txtCodigoProducto.setEditable(false);
        modelo.getVistaProductos().letProductoImagen.setIcon(implementacion.generarImagen(model.getImagenProducto(), modelo.getVistaProductos().letProductoImagen.getWidth(), modelo.getVistaProductos().letProductoImagen.getHeight()));
        modelo.getVistaProductos().letCodigoBarras.setIcon(implementacion.generarImagen(model.getCodigoBarras(), modelo.getVistaProductos().letCodigoBarras.getWidth(), modelo.getVistaProductos().letCodigoBarras.getHeight()));
    }
    
}
