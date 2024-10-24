package Controlador;

import Implementacion.ClienteImp;
import Modelo.ModeloClientes;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorClientes implements MouseListener, KeyListener, WindowListener {
    ModeloClientes modelo;
    ClienteImp implementacion = new ClienteImp();

    public ControladorClientes(ModeloClientes modelo) {
        this.modelo = modelo;
    }
    
    public void mostrarCliente(){
//        ModeloClientes model = 
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

    @Override
    public void windowOpened(WindowEvent e) {
        if(e.getComponent().equals(modelo.getVistaClientes())){
            modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes()); 
        }
        modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes());
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
