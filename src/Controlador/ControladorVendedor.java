package Controlador;

import Modelo.ModeloVendedor;
import Vistas.PanelClientes;
import Vistas.PanelVentas;
import Vistas.VistaInicioSesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JPanel;

public class ControladorVendedor implements MouseListener, WindowListener {

    ModeloVendedor modelo;

    public ControladorVendedor(ModeloVendedor modelo) {
        this.modelo = modelo;
    }

    public void MostrarPanel(JPanel p) {
        p.setSize(1230, 720);
        p.setLocation(0, 0);

        modelo.getVistaVendedor().contenedor1.removeAll();
        modelo.getVistaVendedor().contenedor1.add(p, BorderLayout.CENTER);
        modelo.getVistaVendedor().contenedor1.revalidate();
        modelo.getVistaVendedor().contenedor1.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().equals(modelo.getVistaVendedor().btnVendedorVentas)) {
            PanelVentas panelV = new PanelVentas();
            MostrarPanel(panelV);
        } else if (e.getComponent().equals(modelo.getVistaVendedor().btnVendedorClientes)){
            PanelClientes panelC = new PanelClientes();
            MostrarPanel(panelC);          
        } else if (e.getComponent().equals(modelo.getVistaVendedor().btnVolver)){
            VistaInicioSesion vistaInicioP = new VistaInicioSesion();
            vistaInicioP.setVisible(true);
            modelo.getVistaVendedor().dispose();
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
        if(e.getComponent().equals(modelo.getVistaVendedor().btnVendedorVentas)){
            modelo.getVistaVendedor().btnVendedorVentas.setBackground(new Color(48,133,131));
        } else if(e.getComponent().equals(modelo.getVistaVendedor().btnVendedorClientes)){
            modelo.getVistaVendedor().btnVendedorClientes.setBackground(new Color(48,133,131));
        } else if(e.getComponent().equals(modelo.getVistaVendedor().btnVolver)){
            modelo.getVistaVendedor().btnVolver.setBackground(new Color(183, 213, 213));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVistaVendedor().btnVendedorVentas)){
            modelo.getVistaVendedor().btnVendedorVentas.setBackground(new Color(48,99,99));
        } else if(e.getComponent().equals(modelo.getVistaVendedor().btnVendedorClientes)){
            modelo.getVistaVendedor().btnVendedorClientes.setBackground(new Color(48,99,99));
        } else if(e.getComponent().equals(modelo.getVistaVendedor().btnVolver)){
            modelo.getVistaVendedor().btnVolver.setBackground(new Color(122, 167, 167));
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        PanelVentas panelV = new PanelVentas();
        MostrarPanel(panelV);
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

}
