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
import javax.swing.JOptionPane;

public class ControladorClientes implements MouseListener, KeyListener, WindowListener {

    ModeloClientes modelo;
    ClienteImp implementacion = new ClienteImp();

    public ControladorClientes(ModeloClientes modelo) {
        this.modelo = modelo;
    }

    public void mostrarCliente() {
        ModeloClientes model = implementacion.mostrarCliente(Integer.parseInt(modelo.getVistaClientes().txtIDCliente.getText()));
        modelo.getVistaClientes().txtIDCliente.setText(String.valueOf(model.getCodigo_cliente()));
        modelo.getVistaClientes().txtNombreCliente.setText(modelo.getNombreCliente());
        modelo.getVistaClientes().txtTelefono.setText(modelo.getTelefono_Cliente());
        modelo.getVistaClientes().txtNit.setText(modelo.getNit_cliente());

    }

    public void mostrarDatosTbl() {
//        if(e.getComponent().equals(modelo.getVistaClientes())){
        modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes());

//        modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes());
    }

    public void limpiar() {
        modelo.getVistaClientes().txtNit.setText("");
        modelo.getVistaClientes().txtNombreCliente.setText("");
        modelo.getVistaClientes().txtTelefono.setText("");
        modelo.getVistaClientes().txtIDCliente.setText("");
    }

    public void agregarCliente() {

        modelo.setNombreCliente(this.modelo.getVistaClientes().txtNombreCliente.getText());
        modelo.setTelefono_Cliente(this.modelo.getVistaClientes().txtTelefono.getText());
        modelo.setNit_cliente(this.modelo.getVistaClientes().txtNit.getText());
        implementacion.insertarCliente(modelo);
        JOptionPane.showMessageDialog(null, "Cliente agregado", "CLIENTE AGREGADO", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes());

    }

    public void actualizarCliente() {

        modelo.setNombreCliente(this.modelo.getVistaClientes().txtNombreCliente.getText());
        modelo.setTelefono_Cliente(this.modelo.getVistaClientes().txtTelefono.getText());
        modelo.setCodigo_cliente(Integer.parseInt(this.modelo.getVistaClientes().txtIDCliente.getText()));
        implementacion.actualizarCliente(modelo);
        JOptionPane.showMessageDialog(null, "Cliente actualizado", "ACTUALIZACIÓN CLIENTE", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes());

    }

    public void eliminarCliente() {
        int respuesta = JOptionPane.showConfirmDialog(null, "El Cliente se eliminará, ¿está seguro?", "ELIMINAR CLIENTE", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            implementacion.eliminarCliente(modelo.getVistaClientes().txtNit.getText());
            limpiar();
            modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes());
        }
    }

    public void seleccionTablaClientes() {
        modelo.getVistaClientes().txtIDCliente.setText(String.valueOf(modelo.getVistaClientes().tblClientes.getValueAt(modelo.getVistaClientes().tblClientes.getSelectedRow(), 0)));
        modelo.getVistaClientes().txtNombreCliente.setText(String.valueOf(modelo.getVistaClientes().tblClientes.getValueAt(modelo.getVistaClientes().tblClientes.getSelectedRow(), 1)));
        modelo.getVistaClientes().txtTelefono.setText(String.valueOf(modelo.getVistaClientes().tblClientes.getValueAt(modelo.getVistaClientes().tblClientes.getSelectedRow(), 2)));
        modelo.getVistaClientes().txtNit.setText(String.valueOf(modelo.getVistaClientes().tblClientes.getValueAt(modelo.getVistaClientes().tblClientes.getSelectedRow(), 3)));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().equals(modelo.getVistaClientes().btnAgregar)) {
            if (modelo.getVistaClientes().txtNit.getText().isEmpty() || modelo.getVistaClientes().txtNombreCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de ingresar todos los campos", "ERROR AL AGREGAR CLIENTE", JOptionPane.ERROR_MESSAGE);
            } else {
                agregarCliente();
            }

        } else if (e.getComponent().equals(modelo.getVistaClientes().btnActualizar)) {
            if (modelo.getVistaClientes().txtNit.getText().isEmpty() || modelo.getVistaClientes().txtNombreCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de ingresar todos los campos", "ERROR AL AGREGAR CLIENTE", JOptionPane.ERROR_MESSAGE);
            } else {
                actualizarCliente();

            }

        } else if (e.getComponent().equals(modelo.getVistaClientes().btnEliminar)) {
            if (modelo.getVistaClientes().txtIDCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe de ingresar todos los campos", "ERROR AL ELIMINAR CLIENTE", JOptionPane.ERROR_MESSAGE);
            } else {
                eliminarCliente();
            }

        } else if (e.getComponent().equals(modelo.getVistaClientes().tblClientes)) {
            seleccionTablaClientes();
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

        if (e.getComponent().equals(modelo.getVistaClientes().btnAgregar)) {
            modelo.getVistaClientes().btnAgregar.setBackground(new Color(83, 134, 134));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnActualizar)) {
            modelo.getVistaClientes().btnActualizar.setBackground(new Color(83, 134, 134));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnEliminar)) {
            modelo.getVistaClientes().btnEliminar.setBackground(new Color(83, 134, 134));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaClientes().btnAgregar)) {
            modelo.getVistaClientes().btnAgregar.setBackground(new Color(48, 99, 99));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnActualizar)) {
            modelo.getVistaClientes().btnActualizar.setBackground(new Color(48, 99, 99));
        } else if (e.getComponent().equals(modelo.getVistaClientes().btnEliminar)) {
            modelo.getVistaClientes().btnEliminar.setBackground(new Color(48, 99, 99));
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
//        if(e.getComponent().equals(modelo.getVistaClientes())){
//            modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes()); 
//        }
//        modelo.getVistaClientes().tblClientes.setModel(implementacion.modeloClientes());
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
