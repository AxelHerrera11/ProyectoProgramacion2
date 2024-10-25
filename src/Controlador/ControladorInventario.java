package Controlador;

import Implementacion.GestionInventarioImp;
import Modelo.ModeloInventario;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorInventario implements MouseListener, KeyListener {
    ModeloInventario modelo;
    GestionInventarioImp implementacion = new GestionInventarioImp();

    public ControladorInventario(ModeloInventario modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaInventario().btnMostrarGestionInventario)){
            mostrarGestionInventario();
        } else if(e.getComponent().equals(modelo.getVistaInventario().btnMostrarVentas)){
            mostrarVentas();
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
    
    public void mostrarGestionInventario(){
        modelo.getVistaInventario().tblGestionIventario.setModel(implementacion.consultaGestionInventario());
    }
    
    public void mostrarVentas(){
        modelo.getVistaInventario().tblGestionIventario.setModel(implementacion.consultaVentas());
    }
}
