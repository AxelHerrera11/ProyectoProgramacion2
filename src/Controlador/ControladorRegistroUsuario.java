/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Implementacion.RegistroImp;
import Modelo.ModeloRegistroUsuario;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author jhosu
 */
public class ControladorRegistroUsuario implements MouseListener {

    ModeloRegistroUsuario modelo;
    RegistroImp implementacion = new RegistroImp();

    public ControladorRegistroUsuario(ModeloRegistroUsuario modelo) {
        this.modelo = modelo;

    }

    public void limpiar() {
        modelo.getVistaRegistro().txtNombreUsuario.setText("");
        modelo.getVistaRegistro().txtContraseniaUsuario.setText("");

    }

    public void agregarUsuario() {

        ModeloRegistroUsuario model = new ModeloRegistroUsuario();
        int CodigoCategoriaU = this.modelo.getVistaRegistro().cmbTipoUsuario.getSelectedIndex() + 1;
        modelo.setNombreUsuario(this.modelo.getVistaRegistro().txtNombreUsuario.getText());
        modelo.setContraseniaUsuario(this.modelo.getVistaRegistro().txtContraseniaUsuario.getText());
        modelo.setCategoriaUsuario(CodigoCategoriaU);
        implementacion.guardarUsuario(model);
        
        
            
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().equals(modelo.getVistaRegistro().btnRegistrar)) {
            if (modelo.getVistaRegistro().txtNombreUsuario.getText().isEmpty() || modelo.getVistaRegistro().txtContraseniaUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de ingresar todos los campos", "ERROR AL AGREGAR CLIENTE", JOptionPane.ERROR_MESSAGE);
            } else {
                agregarUsuario();
                limpiar();
                JOptionPane.showMessageDialog(null, "Usuario agregado con éxito", "USARIO AGREGADO", JOptionPane.INFORMATION_MESSAGE);
            
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaRegistro().btnRegistrar)) {
            modelo.getVistaRegistro().btnRegistrar.setBackground(new Color(83, 134, 134));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaRegistro().btnRegistrar)) {
            modelo.getVistaRegistro().btnRegistrar.setBackground(new Color(48, 99, 99));
        }
    }

}
