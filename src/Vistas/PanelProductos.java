/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Controlador.ControladorProductos;
import Implementacion.ProductoImp;
import Modelo.ModeloProductos;

/**
 *
 * @author Cindy Ruano
 */
public class PanelProductos extends javax.swing.JPanel {

    /**
     * Creates new form PanelProductos
     */
    public PanelProductos() {

        initComponents();

        Modelo.ModeloProductos modelo = new ModeloProductos(this);
        Controlador.ControladorProductos controlador = new ControladorProductos(modelo);
        setControlador(controlador);
        ProductoImp implementacion = new ProductoImp();
        comBoxCategoriaProducto.setModel(implementacion.mostrarCategoriaProducto());
       
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
        letNombreProducto = new javax.swing.JLabel();
        letPrecioNormal = new javax.swing.JLabel();
        letCodigoProducto = new javax.swing.JLabel();
        letImagenProducto = new javax.swing.JLabel();
        letPrecioPromocional = new javax.swing.JLabel();
        letCantidad = new javax.swing.JLabel();
        letCantidad1 = new javax.swing.JLabel();
        letTituloProducto = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        letCodigoBarras = new javax.swing.JLabel();
        btnImagen = new javax.swing.JPanel();
        letProductoImagen = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioNormal = new javax.swing.JTextField();
        txtPrecioPromocional = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        comBoxCategoriaProducto = new javax.swing.JComboBox<>();
        btnAgregarProducto = new javax.swing.JPanel();
        letAgregarProducto = new javax.swing.JLabel();
        btnActualizarProducto = new javax.swing.JPanel();
        letActualizarProducto = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JPanel();
        letEliminarProducto = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnActualizarImagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBorrarImagen = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        separadorIzquierda = new javax.swing.JSeparator();
        separadorDerecha = new javax.swing.JSeparator();
        letFondoProducto = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 720));

        fondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letNombreProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        letNombreProducto.setText("NOMBRE PRODUCTO");
        fondoPanel.add(letNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        letPrecioNormal.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letPrecioNormal.setForeground(new java.awt.Color(255, 255, 255));
        letPrecioNormal.setText("PRECIO NORMAL");
        fondoPanel.add(letPrecioNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        letCodigoProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letCodigoProducto.setForeground(new java.awt.Color(255, 255, 255));
        letCodigoProducto.setText("CÓDIGO PRODUCTO");
        fondoPanel.add(letCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 170, -1));

        letImagenProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letImagenProducto.setForeground(new java.awt.Color(255, 255, 255));
        letImagenProducto.setText("IMAGEN PRODUCTO");
        fondoPanel.add(letImagenProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        letPrecioPromocional.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letPrecioPromocional.setForeground(new java.awt.Color(255, 255, 255));
        letPrecioPromocional.setText("PRECIO PROMOCIONAL");
        fondoPanel.add(letPrecioPromocional, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        letCantidad.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letCantidad.setForeground(new java.awt.Color(255, 255, 255));
        letCantidad.setText("CANTIDAD");
        fondoPanel.add(letCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        letCantidad1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letCantidad1.setForeground(new java.awt.Color(255, 255, 255));
        letCantidad1.setText("CATEGORÍA");
        fondoPanel.add(letCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        letTituloProducto.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        letTituloProducto.setForeground(new java.awt.Color(255, 255, 255));
        letTituloProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTituloProducto.setText("PRODUCTO");
        fondoPanel.add(letTituloProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 980, -1));

        txtCodigoProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        fondoPanel.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 250, -1));
        fondoPanel.add(letCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 250, 70));

        btnImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letProductoImagen.setBackground(new java.awt.Color(255, 255, 255));
        btnImagen.add(letProductoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 250));

        fondoPanel.add(btnImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 250, 250));

        txtNombreProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        fondoPanel.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 260, -1));

        txtPrecioNormal.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        fondoPanel.add(txtPrecioNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 260, -1));

        txtPrecioPromocional.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        fondoPanel.add(txtPrecioPromocional, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 260, -1));

        txtCantidad.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        fondoPanel.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 260, -1));

        comBoxCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fondoPanel.add(comBoxCategoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 260, 30));

        btnAgregarProducto.setBackground(new java.awt.Color(48, 99, 99));
        btnAgregarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letAgregarProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        letAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        letAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.add(letAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        fondoPanel.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 80, 30));

        btnActualizarProducto.setBackground(new java.awt.Color(48, 99, 99));
        btnActualizarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letActualizarProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        letActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        letActualizarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letActualizarProducto.setText("ACTUALIZAR");
        btnActualizarProducto.add(letActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        fondoPanel.add(btnActualizarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 80, 30));

        btnEliminarProducto.setBackground(new java.awt.Color(48, 99, 99));
        btnEliminarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letEliminarProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        letEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        letEliminarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letEliminarProducto.setText("ELIMINAR");
        btnEliminarProducto.add(letEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        fondoPanel.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 80, 30));

        btnBuscarProducto.setBackground(new java.awt.Color(96, 124, 124));
        btnBuscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSCAR");
        btnBuscarProducto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 75, 30));

        fondoPanel.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 75, 30));

        btnActualizarImagen.setBackground(new java.awt.Color(96, 124, 124));
        btnActualizarImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACTUALIZAR");
        btnActualizarImagen.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        fondoPanel.add(btnActualizarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 120, 30));

        btnBorrarImagen.setBackground(new java.awt.Color(96, 124, 124));
        btnBorrarImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BORRAR");
        btnBorrarImagen.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        fondoPanel.add(btnBorrarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 120, 30));

        separadorIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        separadorIzquierda.setOpaque(true);
        fondoPanel.add(separadorIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 280, -1));

        separadorDerecha.setForeground(new java.awt.Color(255, 255, 255));
        separadorDerecha.setOpaque(true);
        fondoPanel.add(separadorDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 280, -1));

        letFondoProducto.setBackground(new java.awt.Color(122, 167, 167));
        letFondoProducto.setForeground(new java.awt.Color(122, 167, 167));
        letFondoProducto.setText("jLabel8");
        letFondoProducto.setOpaque(true);
        fondoPanel.add(letFondoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel btnActualizarImagen;
    public javax.swing.JPanel btnActualizarProducto;
    public javax.swing.JPanel btnAgregarProducto;
    private javax.swing.JPanel btnBorrarImagen;
    public javax.swing.JPanel btnBuscarProducto;
    public javax.swing.JPanel btnEliminarProducto;
    public javax.swing.JPanel btnImagen;
    public javax.swing.JComboBox<String> comBoxCategoriaProducto;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel letActualizarProducto;
    private javax.swing.JLabel letAgregarProducto;
    private javax.swing.JLabel letCantidad;
    private javax.swing.JLabel letCantidad1;
    public javax.swing.JLabel letCodigoBarras;
    private javax.swing.JLabel letCodigoProducto;
    private javax.swing.JLabel letEliminarProducto;
    private javax.swing.JLabel letFondoProducto;
    private javax.swing.JLabel letImagenProducto;
    private javax.swing.JLabel letNombreProducto;
    private javax.swing.JLabel letPrecioNormal;
    private javax.swing.JLabel letPrecioPromocional;
    public javax.swing.JLabel letProductoImagen;
    private javax.swing.JLabel letTituloProducto;
    private javax.swing.JSeparator separadorDerecha;
    private javax.swing.JSeparator separadorIzquierda;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCodigoProducto;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtPrecioNormal;
    public javax.swing.JTextField txtPrecioPromocional;
    // End of variables declaration//GEN-END:variables

    public void setControlador(ControladorProductos controlador) {

        btnActualizarImagen.addMouseListener(controlador);
        btnActualizarProducto.addMouseListener(controlador);
        btnBuscarProducto.addMouseListener(controlador);
        btnAgregarProducto.addMouseListener(controlador);
        btnEliminarProducto.addMouseListener(controlador);
        btnImagen.addMouseListener(controlador);

    }
}
