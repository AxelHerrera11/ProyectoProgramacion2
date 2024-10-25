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
        model.setNombreUsuario(this.modelo.getVistaRegistro().txtNombreUsuario.getText());
        model.setContraseniaUsuario(this.modelo.getVistaRegistro().txtContraseniaUsuario.getText());
        model.setCategoriaUsuario(CodigoCategoriaU);
        implementacion.guardarUsuario(model);

    }

    public void eliminarUsuario() {

        int respuesta = JOptionPane.showConfirmDialog(null, "El usuario se eliminará, ¿Está seguro?", "ELIMINAR USUARIO", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            implementacion.elimiarUsuario(modelo.getVistaRegistro().txtNombreUsuario.getText());
            System.out.println("Prueba eliminar");
            limpiar();
        }

    }

    public void validarUsuario() {

        String nombreIngresado = modelo.getVistaRegistro().txtNombreUsuario.getText();
        String contraIngresada = modelo.getVistaRegistro().txtContraseniaUsuario.getText();

        ModeloRegistroUsuario model = implementacion.validarUsuario(nombreIngresado, contraIngresada);

        String pUsuario = modelo.getUsuarioEncontrado();
        String pContrasenia = modelo.getContraseniaEncontrada();

        if (nombreIngresado.equals(pUsuario) && contraIngresada.equals(pContrasenia)) {
            eliminarUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "ERROR AL BORRAR USUARIO", JOptionPane.ERROR_MESSAGE);

        }

//        if(){
//            System.out.println("Prueba");
////            eliminarUsuario();
//        } else {
//            JOptionPane.showMessageDialog(null, "Datos incorrectos","ERROR AL BORRAR USUARIO",JOptionPane.ERROR_MESSAGE);
//        }
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
        } else if (e.getComponent().equals(modelo.getVistaRegistro().btnBorrar)) {
            if (modelo.getVistaRegistro().txtNombreUsuario.getText().isEmpty() || modelo.getVistaRegistro().txtContraseniaUsuario.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de ingresar todos los campos", "ERROR AL ELIMINAR EL CLIENTE", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println("Prueba Mouse click");
                validarUsuario();
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
        if (e.getComponent().equals(modelo.getVistaRegistro().btnRegistrar)) {
            modelo.getVistaRegistro().btnRegistrar.setBackground(new Color(83, 134, 134));
        } else if (e.getComponent().equals(modelo.getVistaRegistro().btnBorrar)) {
            modelo.getVistaRegistro().btnBorrar.setBackground(new Color(83, 134, 134));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaRegistro().btnRegistrar)) {
            modelo.getVistaRegistro().btnRegistrar.setBackground(new Color(48, 99, 99));
        } else if (e.getComponent().equals(modelo.getVistaRegistro().btnBorrar)) {
            modelo.getVistaRegistro().btnBorrar.setBackground(new Color(48, 99, 99));
        }
    }

}
