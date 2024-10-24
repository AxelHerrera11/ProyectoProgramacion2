package Controlador;

import Modelo.ModeloClientes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorClientes implements MouseListener, KeyListener {
    ModeloClientes modelo;

    public ControladorClientes(ModeloClientes modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if(e.getComponent().equals(modelo.getVistaClientes().btnAgregar)){
            modelo.getVistaClientes().btnAgregar.setBackground(new Color(83, 134, 134));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnActualizar)){
            modelo.getVistaClientes().btnActualizar.setBackground(new Color(83, 134, 134));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnEliminar)){
            modelo.getVistaClientes().btnEliminar.setBackground(new Color(83, 134, 134));
        }
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaClientes().btnAgregar)){
            modelo.getVistaClientes().btnAgregar.setBackground(new Color(48,99,99));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnActualizar)){
            modelo.getVistaClientes().btnActualizar.setBackground(new Color(48,99,99));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnEliminar)){
            modelo.getVistaClientes().btnEliminar.setBackground(new Color(48,99,99));
        }

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
