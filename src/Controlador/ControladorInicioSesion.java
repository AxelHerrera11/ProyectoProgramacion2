package Controlador;

import Implementacion.InicioSesionImp;
import Modelo.ModeloInicioSesion;
import Vistas.VistaSupervisor;
import Vistas.VistaVendedor;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

public class ControladorInicioSesion implements WindowListener, MouseListener, KeyListener {

    ModeloInicioSesion modelo;
    InicioSesionImp implementacion = new InicioSesionImp();
  
    public ControladorInicioSesion(ModeloInicioSesion modelo) {
        this.modelo = modelo;
    }
   
    public void validarUsuario() {
        //Obtiene los datos de la vista
        String vUsuario = modelo.getVistaInicioSesion().txtUsuario.getText();
        String vContrasenia = String.valueOf(modelo.getVistaInicioSesion().txtContraseña.getPassword());

        ModeloInicioSesion model = implementacion.consultarUsuario(vUsuario, vContrasenia);

        //Obtiene los datos que se estrajeron de la base de datos
        String pUsuario = modelo.getUsuarioEncontrado();
        String pContrasenia = modelo.getContraseniaEncontrada();
        int pTipoUsuario = modelo.getTipoUsuario();
        System.out.println(pUsuario);
        System.out.println(pContrasenia);
        System.out.println("Este es el tipo de usuario recogido: " + pTipoUsuario);

        if (pTipoUsuario == 1) {
            if (vUsuario.equals(pUsuario) && vContrasenia.equals(pContrasenia)) {
                Vistas.VistaSupervisor vistaS = new VistaSupervisor();
                vistaS.setVisible(true);
                modelo.getVistaInicioSesion().dispose();
            } else {
                System.out.println("Error al ingressar");
            }
        } else if (pTipoUsuario == 2) {
            if (vUsuario.equals(pUsuario) && vContrasenia.equals(pContrasenia)) {
                Vistas.VistaVendedor vistaV = new VistaVendedor();
                vistaV.setVisible(true);
                modelo.getVistaInicioSesion().dispose();
            } else {
                System.out.println("Error al ingressar");
            }
        }
    }
    
    //Metodo para probar el actionlistener para el enter
    
    public void procesoInicioSesion(){
        
        String usuario = modelo.getVistaInicioSesion().txtUsuario.getText();
        String contrasenia = String.valueOf(modelo.getVistaInicioSesion().txtContraseña.getPassword());
        
        if(usuario.isEmpty() || contrasenia.isEmpty()){
            JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS", "ERROR EN EL INICIO DE SESIÓN", JOptionPane.ERROR_MESSAGE);
        } else {
            validarUsuario();
        }
        
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVistaInicioSesion().btnIngreso)) {
            procesoInicioSesion();
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
        //Color original del botón [122,167,167]
        if (e.getComponent().equals(modelo.getVistaInicioSesion().btnIngreso)){
            modelo.getVistaInicioSesion().btnIngreso.setBackground(new Color(183,213,213));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        if (e.getComponent().equals(modelo.getVistaInicioSesion().btnIngreso)){
            modelo.getVistaInicioSesion().btnIngreso.setBackground(new Color(122,167,167));
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        procesoInicioSesion();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }  

}
