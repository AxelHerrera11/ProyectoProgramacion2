package Controlador;

import Implementacion.ExportarExcelImp;
import Implementacion.ReportesVentasImp;
import Modelo.ModeloReportesVentas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.io.IOException;


public class ControladorReportesVentas implements MouseListener, KeyListener {

    ModeloReportesVentas modelo;
    ReportesVentasImp implementacion = new ReportesVentasImp();

    public ControladorReportesVentas(ModeloReportesVentas modelo) {
        this.modelo = modelo;
    }
    
    ExportarExcelImp exportar;
    
    

    public void mostrarVentas() {
        LocalDate fechaActual = LocalDate.now();
        Date fecha = Date.valueOf(fechaActual);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String fechaString = formatter.format(fecha);
        modelo.getVistaReportesVentas().tblDatosReporteVentas.setModel(implementacion.modeloReportesVentas(fechaString));

    }

//    public void exportarPDF(){
////        ModeloReportesVentas modeloRV = new ModeloReportesVentas();
//
//        
//        String nombreVendedor = modelo.getVistaReportesVentas().tblDatosReporteVentas.getColumnName(1);
//        String tipoPago = modelo.getVistaReportesVentas().tblDatosReporteVentas.getColumnName(2);
//        String nombreCliente = modelo.getVistaReportesVentas().tblDatosReporteVentas.getColumnName(3);
//        String fechaVenta = modelo.getVistaReportesVentas().tblDatosReporteVentas.getColumnName(4);
//        
//        ModeloReportesVentas model = implementacion.exportarPDF(nombreVendedor, tipoPago, nombreCliente, fechaVenta);
//    }
    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getComponent().equals(modelo.getVistaReportesVentas().btnMostrarVentas)) {
            System.out.println("Botón presionado");
            mostrarVentas();
            modelo.getVistaReportesVentas().btnExportarExcel.setVisible(true);
//            JOptionPane.showMessageDialog(null, "Debe de ingresar todos los campos", "ERROR AL AGREGAR CLIENTE", JOptionPane.ERROR_MESSAGE);
        } else if (e.getComponent().equals(modelo.getVistaReportesVentas().btnExportarPDF)) {
            System.out.println("Bton exportar");
//            implementacion.exportarPDFREPORTE();
            LocalDate fechaActual = LocalDate.now();

            Date fecha = Date.valueOf(fechaActual);
            implementacion.exportarReporteDeVentas(fecha);
        } else if(e.getComponent().equals(modelo.getVistaReportesVentas().btnExportarExcel)){
            try {
                exportar = new ExportarExcelImp();
                exportar.exportarExcel(modelo.getVistaReportesVentas().tblDatosReporteVentas);
            } catch (IOException ex) {
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
