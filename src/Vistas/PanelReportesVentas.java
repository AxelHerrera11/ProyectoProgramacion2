/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Controlador.ControladorReportesVentas;
import Implementacion.ReportesVentasImp;
import Modelo.ModeloReportesVentas;

/**
 *
 * @author Cindy Ruano
 */
public class PanelReportesVentas extends javax.swing.JPanel {

    /**
     * Creates new form PanelReportesVentas
     */
    public PanelReportesVentas() {
        initComponents();
           
        Modelo.ModeloReportesVentas modelo = new ModeloReportesVentas(this);
        Controlador.ControladorReportesVentas controlador = new ControladorReportesVentas(modelo);
        setControlador(controlador);
        
        ReportesVentasImp implementacion = new ReportesVentasImp();
        this.btnExportarExcel.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        letTituloReportesVentas = new javax.swing.JLabel();
        separadorDerecha = new javax.swing.JSeparator();
        separadorIzquierda = new javax.swing.JSeparator();
        btnMostrarVentas = new javax.swing.JPanel();
        letMostrarVentas = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        tblReportesVentas = new javax.swing.JScrollPane();
        tblDatosReporteVentas = new javax.swing.JTable();
        btnExportarExcel = new javax.swing.JPanel();
        letExportarExcel = new javax.swing.JLabel();
        btnExportarPDF = new javax.swing.JPanel();
        letExportarPDF = new javax.swing.JLabel();
        letfondoReportesVentas = new javax.swing.JLabel();

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letTituloReportesVentas.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        letTituloReportesVentas.setForeground(new java.awt.Color(255, 255, 255));
        letTituloReportesVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTituloReportesVentas.setText("REPORTES VENTAS DEL DÍA");
        fondoPanel.add(letTituloReportesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, -1));

        separadorDerecha.setForeground(new java.awt.Color(255, 255, 255));
        separadorDerecha.setOpaque(true);
        fondoPanel.add(separadorDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 130, -1));

        separadorIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        separadorIzquierda.setOpaque(true);
        fondoPanel.add(separadorIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, -1));

        btnMostrarVentas.setBackground(new java.awt.Color(48, 99, 99));
        btnMostrarVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letMostrarVentas.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letMostrarVentas.setForeground(new java.awt.Color(255, 255, 255));
        letMostrarVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letMostrarVentas.setText("MOSTRAR VENTAS DEL DÍA");
        btnMostrarVentas.add(letMostrarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        fondoPanel.add(btnMostrarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, 40));

        panelTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatosReporteVentas.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        tblDatosReporteVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblReportesVentas.setViewportView(tblDatosReporteVentas);

        panelTabla.add(tblReportesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 370));

        fondoPanel.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 800, 370));
        panelTabla.getAccessibleContext().setAccessibleDescription("");

        btnExportarExcel.setBackground(new java.awt.Color(48, 99, 99));
        btnExportarExcel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letExportarExcel.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letExportarExcel.setForeground(new java.awt.Color(255, 255, 255));
        letExportarExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letExportarExcel.setText("EXPORTAR EN EXCEL");
        btnExportarExcel.add(letExportarExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        fondoPanel.add(btnExportarExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 170, 40));

        btnExportarPDF.setBackground(new java.awt.Color(48, 99, 99));
        btnExportarPDF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letExportarPDF.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letExportarPDF.setForeground(new java.awt.Color(255, 255, 255));
        letExportarPDF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letExportarPDF.setText("EXPORTAR EN PDF");
        btnExportarPDF.add(letExportarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        fondoPanel.add(btnExportarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 170, 40));

        letfondoReportesVentas.setBackground(new java.awt.Color(122, 167, 167));
        letfondoReportesVentas.setOpaque(true);
        fondoPanel.add(letfondoReportesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel btnExportarExcel;
    public javax.swing.JPanel btnExportarPDF;
    public javax.swing.JPanel btnMostrarVentas;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel letExportarExcel;
    private javax.swing.JLabel letExportarPDF;
    private javax.swing.JLabel letMostrarVentas;
    private javax.swing.JLabel letTituloReportesVentas;
    private javax.swing.JLabel letfondoReportesVentas;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JSeparator separadorDerecha;
    private javax.swing.JSeparator separadorIzquierda;
    public javax.swing.JTable tblDatosReporteVentas;
    public javax.swing.JScrollPane tblReportesVentas;
    // End of variables declaration//GEN-END:variables



    private void setControlador(ControladorReportesVentas controlador) {
        
        btnMostrarVentas.addMouseListener(controlador);
        btnExportarPDF.addMouseListener(controlador);
        btnExportarExcel.addMouseListener(controlador);
              
    
    }
}
