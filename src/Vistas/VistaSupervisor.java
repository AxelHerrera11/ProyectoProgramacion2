/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.ControladorSupervisor;
import Modelo.ModeloSupervisor;

/**
 *
 * @author Cindy Ruano
 */
public class VistaSupervisor extends javax.swing.JFrame {

    /**
     * Creates new form VistaSupervisor
     */
    public VistaSupervisor() {
        initComponents();
        Modelo.ModeloSupervisor modelo = new ModeloSupervisor(this);
        Controlador.ControladorSupervisor controlador = new ControladorSupervisor(modelo);
        setControlador(controlador);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanelSupervisor = new javax.swing.JPanel();
        letTituloSupervisor = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btnSupervisorProductos = new javax.swing.JPanel();
        letSupervisorProductos = new javax.swing.JLabel();
        btnSupervisorInventario = new javax.swing.JPanel();
        letSupervisorInventario = new javax.swing.JLabel();
        btnSupervisorReportesVentas = new javax.swing.JPanel();
        letSupervisorReportesVentas = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fondoSupervisor = new javax.swing.JLabel();
        contenedor1 = new javax.swing.JPanel();
        contenedor2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanelSupervisor.setBackground(new java.awt.Color(122, 167, 167));
        fondoPanelSupervisor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letTituloSupervisor.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        letTituloSupervisor.setForeground(new java.awt.Color(255, 255, 255));
        letTituloSupervisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTituloSupervisor.setText("SUPERVISOR");
        fondoPanelSupervisor.add(letTituloSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, -1));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setOpaque(true);
        fondoPanelSupervisor.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 200, -1));

        btnSupervisorProductos.setBackground(new java.awt.Color(48, 99, 99));
        btnSupervisorProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupervisorProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letSupervisorProductos.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        letSupervisorProductos.setForeground(new java.awt.Color(255, 255, 255));
        letSupervisorProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letSupervisorProductos.setText("PRODUCTOS");
        letSupervisorProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupervisorProductos.add(letSupervisorProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        fondoPanelSupervisor.add(btnSupervisorProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 40));

        btnSupervisorInventario.setBackground(new java.awt.Color(48, 99, 99));
        btnSupervisorInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupervisorInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letSupervisorInventario.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        letSupervisorInventario.setForeground(new java.awt.Color(255, 255, 255));
        letSupervisorInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letSupervisorInventario.setText("INVENTARIO");
        btnSupervisorInventario.add(letSupervisorInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        fondoPanelSupervisor.add(btnSupervisorInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 40));

        btnSupervisorReportesVentas.setBackground(new java.awt.Color(48, 99, 99));
        btnSupervisorReportesVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupervisorReportesVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letSupervisorReportesVentas.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        letSupervisorReportesVentas.setForeground(new java.awt.Color(255, 255, 255));
        letSupervisorReportesVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letSupervisorReportesVentas.setText("REPORTES VENTAS");
        btnSupervisorReportesVentas.add(letSupervisorReportesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        fondoPanelSupervisor.add(btnSupervisorReportesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 40));

        btnVolver.setBackground(new java.awt.Color(122, 167, 167));
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALIR");

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVolverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVolverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fondoPanelSupervisor.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 80, 40));

        btnRegistrar.setBackground(new java.awt.Color(48, 99, 99));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAR USUARIO");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        fondoPanelSupervisor.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 300, 40));

        fondoSupervisor.setBackground(new java.awt.Color(48, 99, 99));
        fondoSupervisor.setForeground(new java.awt.Color(48, 99, 99));
        fondoSupervisor.setOpaque(true);
        fondoPanelSupervisor.add(fondoSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 720));

        contenedor1.setBackground(new java.awt.Color(122, 167, 167));

        javax.swing.GroupLayout contenedor1Layout = new javax.swing.GroupLayout(contenedor1);
        contenedor1.setLayout(contenedor1Layout);
        contenedor1Layout.setHorizontalGroup(
            contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        contenedor1Layout.setVerticalGroup(
            contenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        fondoPanelSupervisor.add(contenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 980, 720));

        contenedor2.setPreferredSize(new java.awt.Dimension(300, 0));
        contenedor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        fondoPanelSupervisor.add(contenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaSupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel btnRegistrar;
    public javax.swing.JPanel btnSupervisorInventario;
    public javax.swing.JPanel btnSupervisorProductos;
    public javax.swing.JPanel btnSupervisorReportesVentas;
    public javax.swing.JPanel btnVolver;
    public javax.swing.JPanel contenedor1;
    private javax.swing.JPanel contenedor2;
    private javax.swing.JPanel fondoPanelSupervisor;
    private javax.swing.JLabel fondoSupervisor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel letSupervisorInventario;
    private javax.swing.JLabel letSupervisorProductos;
    private javax.swing.JLabel letSupervisorReportesVentas;
    private javax.swing.JLabel letTituloSupervisor;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

    public void setControlador(ControladorSupervisor controlador) {

        btnSupervisorProductos.addMouseListener(controlador);
        btnSupervisorInventario.addMouseListener(controlador);
        btnSupervisorReportesVentas.addMouseListener(controlador);
        btnVolver.addMouseListener(controlador);
        btnRegistrar.addMouseListener(controlador);

    }

}
