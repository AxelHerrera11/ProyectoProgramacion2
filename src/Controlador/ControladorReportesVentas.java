package Controlador;

import Implementacion.ReportesVentasImp;
import Implementacion.VentaImp;
import Modelo.ModeloReportesVentas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorReportesVentas implements MouseListener, KeyListener {

    ModeloReportesVentas modelo;
    ReportesVentasImp implementacion = new ReportesVentasImp();
    
    public ControladorReportesVentas(ModeloReportesVentas modelo){
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

        if (e.getComponent().equals(modelo.getVistaReportesVentas().btnExportarExcel)) {
            modelo.getVistaReportesVentas().btnExportarExcel.setBackground(new Color(83, 134, 134));
        } else if (e.getComponent().equals(modelo.getVistaReportesVentas().btnExportarPDF)) {
            modelo.getVistaReportesVentas().btnExportarPDF.setBackground(new Color(83, 134, 134));
        } else if (e.getComponent().equals(modelo.getVistaReportesVentas().btnMostrarVentas)) {
            modelo.getVistaReportesVentas().btnMostrarVentas.setBackground(new Color(83, 134, 134));

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
         if (e.getComponent().equals(modelo.getVistaReportesVentas().btnExportarExcel)) {
            modelo.getVistaReportesVentas().btnExportarExcel.setBackground(new Color(48, 99, 99));
        } else if (e.getComponent().equals(modelo.getVistaReportesVentas().btnExportarPDF)) {
            modelo.getVistaReportesVentas().btnExportarPDF.setBackground(new Color(48, 99, 99));
        } else if (e.getComponent().equals(modelo.getVistaReportesVentas().btnMostrarVentas)) {
            modelo.getVistaReportesVentas().btnMostrarVentas.setBackground(new Color(48, 99, 99));
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
