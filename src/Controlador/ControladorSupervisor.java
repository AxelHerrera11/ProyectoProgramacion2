package Controlador;

import Modelo.ModeloSupervisor;
import Vistas.PanelInventario;
import Vistas.PanelProductos;
import Vistas.PanelReportesVentas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class ControladorSupervisor implements MouseListener {

    ModeloSupervisor modelo;

    public ControladorSupervisor(ModeloSupervisor modelo) {
        this.modelo = modelo;
    }

    public void MostrarPanel(JPanel p) {

        p.setSize(1230, 720);
        p.setLocation(0, 0);

        modelo.getVistaSupervisor().contenedor1.removeAll();
        modelo.getVistaSupervisor().contenedor1.add(p, BorderLayout.CENTER);
        modelo.getVistaSupervisor().contenedor1.revalidate();
        modelo.getVistaSupervisor().contenedor1.repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorProductos)) {
            PanelProductos panelP = new PanelProductos();
            MostrarPanel(panelP);
        } else if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorInventario)){
            PanelInventario PanelIn = new PanelInventario();
            MostrarPanel(PanelIn);
        } else if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorReportesVentas)){
            PanelReportesVentas PanelRV = new PanelReportesVentas();
            MostrarPanel(PanelRV);  
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

        if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorProductos)) {
            modelo.getVistaSupervisor().btnSupervisorProductos.setBackground(new Color(48, 133, 131));
        } else if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorInventario)) {
            modelo.getVistaSupervisor().btnSupervisorInventario.setBackground(new Color(48, 133, 131));
        } else if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorReportesVentas)) {
            modelo.getVistaSupervisor().btnSupervisorReportesVentas.setBackground(new Color(48, 133, 131));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {

        if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorProductos)) {
            modelo.getVistaSupervisor().btnSupervisorProductos.setBackground(new Color(48, 99, 99));
        } else if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorInventario)) {
            modelo.getVistaSupervisor().btnSupervisorInventario.setBackground(new Color(48, 99, 99));
        } else if (e.getComponent().equals(modelo.getVistaSupervisor().btnSupervisorReportesVentas)) {
            modelo.getVistaSupervisor().btnSupervisorReportesVentas.setBackground(new Color(48, 99, 99));
        }

    }

}
