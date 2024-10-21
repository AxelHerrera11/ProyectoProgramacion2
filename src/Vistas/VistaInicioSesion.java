/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author axels
 */
public class VistaInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form VistaInicioSesion
     */
    public VistaInicioSesion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanelInicio = new javax.swing.JPanel();
        letTitulo = new javax.swing.JLabel();
        letUsuario = new javax.swing.JLabel();
        letContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngreso = new javax.swing.JPanel();
        letInicioSesion = new javax.swing.JLabel();
        fondoDerecha = new javax.swing.JLabel();
        fondoIzquierda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letTitulo.setBackground(new java.awt.Color(255, 255, 255));
        letTitulo.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        letTitulo.setForeground(new java.awt.Color(255, 255, 255));
        letTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTitulo.setText("INICIO SESIÓN");
        fondoPanelInicio.add(letTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 460, 50));

        letUsuario.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letUsuario.setForeground(new java.awt.Color(255, 255, 255));
        letUsuario.setText("USUARIO");
        fondoPanelInicio.add(letUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        letContraseña.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letContraseña.setForeground(new java.awt.Color(255, 255, 255));
        letContraseña.setText("CONTRASEÑA");
        fondoPanelInicio.add(letContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        fondoPanelInicio.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 260, 20));

        txtContraseña.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        fondoPanelInicio.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 260, -1));

        btnIngreso.setBackground(new java.awt.Color(122, 167, 167));
        btnIngreso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letInicioSesion.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        letInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letInicioSesion.setText("INICIAR SESIÓN");
        btnIngreso.add(letInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, -1));

        fondoPanelInicio.add(btnIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 120, 40));

        fondoDerecha.setBackground(new java.awt.Color(122, 167, 167));
        fondoDerecha.setOpaque(true);
        fondoPanelInicio.add(fondoDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 920, 720));

        fondoIzquierda.setBackground(new java.awt.Color(48, 99, 99));
        fondoIzquierda.setOpaque(true);
        fondoPanelInicio.add(fondoIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(VistaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnIngreso;
    private javax.swing.JLabel fondoDerecha;
    private javax.swing.JLabel fondoIzquierda;
    private javax.swing.JPanel fondoPanelInicio;
    private javax.swing.JLabel letContraseña;
    private javax.swing.JLabel letInicioSesion;
    private javax.swing.JLabel letTitulo;
    private javax.swing.JLabel letUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
