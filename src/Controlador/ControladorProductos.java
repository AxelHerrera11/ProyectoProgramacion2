package Controlador;

import Implementacion.ProductoImp;
import Modelo.ModeloInicioSesion;
import Modelo.ModeloProductos;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorProductos implements MouseListener, KeyListener {
    ModeloProductos modelo;
    ProductoImp implementacion = new ProductoImp();
    ModeloInicioSesion modeloIS = new ModeloInicioSesion();

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
                
                int pTipoGestion = 1;
                int pCantidad = Integer.parseInt(modelo.getVistaProductos().txtCantidad.getText());
                String pUsuario = modeloIS.getUsuarioEncontrado();
                String nombreProducto = modelo.getVistaProductos().txtNombreProducto.getText();
                
                insertarRegistroVenta(pTipoGestion, pCantidad, pUsuario, nombreProducto);
   
            } catch (IOException ex) {
                Logger.getLogger(ControladorProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getComponent().equals(modelo.getVistaProductos().btnBuscarProducto)){
            try {
                mostrarProducto();
            } catch (IOException ex) {
                Logger.getLogger(ControladorProductos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(e.getComponent().equals(modelo.getVistaProductos().btnActualizarProducto)){
            actualizarProducto();
            int pTipoGestion = 2;
            int pCantidad = Integer.parseInt(modelo.getVistaProductos().txtCantidad.getText());
            String pUsuario = modeloIS.getUsuarioEncontrado();
            String nombreProducto = modelo.getVistaProductos().txtNombreProducto.getText();
            
            insertarRegistroVenta(pTipoGestion, pCantidad, pUsuario, nombreProducto);
        } else if(e.getComponent().equals(modelo.getVistaProductos().btnEliminarProducto)){
            
            int pTipoGestion = 3;
            int pCantidad = 0;
            String pUsuario = modeloIS.getUsuarioEncontrado();
            String nombreProducto = modelo.getVistaProductos().txtNombreProducto.getText();
            
            insertarRegistroVenta(pTipoGestion, pCantidad, pUsuario, nombreProducto);
            eliminarProducto();
        } else if(e.getComponent().equals(modelo.getVistaProductos().btnActualizarImagen)){
            actualizarImagenProducto();
        } else if(e.getComponent().equals(modelo.getVistaProductos().btnBorrarImagen)){
            eliminarImagenProducto();
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
        modelo.getVistaProductos().letProductoImagen.setIcon(null);
        modelo.getVistaProductos().letCodigoBarras.setIcon(null);
        ModeloProductos model = implementacion.mostrarProducto(Integer.parseInt(modelo.getVistaProductos().txtCodigoProducto.getText()));
        modelo.getVistaProductos().txtNombreProducto.setText(model.getNombreProducto());
        modelo.getVistaProductos().txtCantidad.setText(String.valueOf(model.getCantidad()));
        modelo.getVistaProductos().txtPrecioNormal.setText(String.valueOf(model.getPrecioNormal()));
        modelo.getVistaProductos().txtPrecioPromocional.setText(String.valueOf(model.getPrecioPromocion()));
        if(model.getImagenProducto() == null){
        
        }else{
            modelo.getVistaProductos().letProductoImagen.setIcon(implementacion.generarImagen(model.getImagenProducto(), modelo.getVistaProductos().letProductoImagen.getWidth(), modelo.getVistaProductos().letProductoImagen.getHeight()));
        }
        modelo.getVistaProductos().letCodigoBarras.setIcon(implementacion.generarImagen(model.getCodigoBarras(), modelo.getVistaProductos().letCodigoBarras.getWidth(), modelo.getVistaProductos().letCodigoBarras.getHeight()));
    }
    
    public void actualizarProducto(){
        boolean resultado;
        ModeloProductos modelo = new ModeloProductos();
        int codigoCategoria = this.modelo.getVistaProductos().comBoxCategoriaProducto.getSelectedIndex() + 1;
        modelo.setNombreProducto(this.modelo.getVistaProductos().txtNombreProducto.getText());
        modelo.setCantidad(Integer.parseInt(this.modelo.getVistaProductos().txtCantidad.getText()));
        modelo.setPrecioNormal(Double.parseDouble(this.modelo.getVistaProductos().txtPrecioNormal.getText()));
        modelo.setPrecioPromocion(Double.parseDouble(this.modelo.getVistaProductos().txtPrecioPromocional.getText()));
        modelo.setCategoriaProducto(codigoCategoria);
        modelo.setIdProducto(Integer.parseInt(this.modelo.getVistaProductos().txtCodigoProducto.getText()));
        resultado = implementacion.actualizarProducto(modelo);
        if(!resultado){
                JOptionPane.showMessageDialog(null, "Producto actualzado con exito", "Producto", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Error al actualizar el producto", "Producto", 0);
            }
    }
    
    public void eliminarProducto() {
            int respuesta = JOptionPane.showConfirmDialog(null, "El producto se eliminará, ¿está seguro?", "ELIMINAR PRODUCTO", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            implementacion.eliminarProducto(Integer.parseInt(modelo.getVistaProductos().txtCodigoProducto.getText()));
        }
    }
    
    public void eliminarImagenProducto() {
            int respuesta = JOptionPane.showConfirmDialog(null, "La imagen del producto se eliminará, ¿está seguro?", "ELIMINAR IMAGEN DEL PRODUCTO", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            implementacion.eliminarImagen(Integer.parseInt(modelo.getVistaProductos().txtCodigoProducto.getText()));
        }
    }
    
    public void actualizarImagenProducto(){
        boolean resultado;
        ModeloProductos modelo = new ModeloProductos();
        modelo.setIdProducto(Integer.parseInt(this.modelo.getVistaProductos().txtCodigoProducto.getText()));
        modelo.setImagenProducto(getImagen());
        resultado = implementacion.actualizarImagenProducto(modelo);
        if(!resultado){
                JOptionPane.showMessageDialog(null, "Imagen del producto actualzada con exito", "Producto", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Error al actualizar la imagen del producto", "Producto", 0);
            }
    }
    
    public void insertarRegistroVenta(int tipoGestion, int cantidad, String usuario, String nombreProducto){
        boolean resultado;
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        
        Date fecha = Date.valueOf(fechaActual);
        Time hora = Time.valueOf(horaActual);
        
        ModeloProductos modelo = new ModeloProductos();
        modelo.setTipoGestion(tipoGestion);
        modelo.setCantidad(cantidad);
        modelo.setFechaGestion(fecha);
        modelo.setHoraGestion(hora);
        modelo.setUsuarioGestion(usuario);
        modelo.setNombreProducto(nombreProducto);
        resultado = implementacion.insertarGestionInventario(modelo);
        if(!resultado){
                System.out.println("Insercion realizada con exito.");
            }else{
                System.out.println("Hubo un problema al insertar.");
            }
    }
}
