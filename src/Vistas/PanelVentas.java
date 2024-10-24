/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Controlador.ControladorVentas;
import Modelo.ModeloVentas;

/**
 *
 * @author Cindy Ruano
 */
public class PanelVentas extends javax.swing.JPanel {

    /**
     * Creates new form PanelVentas
     */
    public PanelVentas() {
        initComponents();
        this.panelMetodoPago.setVisible(false);
        Modelo.ModeloVentas modelo = new ModeloVentas(this);
        Controlador.ControladorVentas controlador = new ControladorVentas(modelo);
        setControlador(controlador);
        this.btnAgregarProducto.setVisible(false);
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
        letTituloVentas = new javax.swing.JLabel();
        separadorDerecha = new javax.swing.JSeparator();
        separadorIzquierda = new javax.swing.JSeparator();
        panelAgregarProductos = new javax.swing.JPanel();
        letIDProducto = new javax.swing.JLabel();
        txtNoCodigoBarras = new javax.swing.JTextField();
        letCantidadVenta = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        letNombreProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        letPrecio = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        letImagen = new javax.swing.JLabel();
        panelImagenVentas = new javax.swing.JPanel();
        letImagenVentas = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ComBoxPromocion = new javax.swing.JComboBox<>();
        letIDProducto1 = new javax.swing.JLabel();
        panelMetodoPago = new javax.swing.JPanel();
        letNIT = new javax.swing.JLabel();
        txtNITVentas = new javax.swing.JTextField();
        letNombreVentas = new javax.swing.JLabel();
        txtNombreVentas = new javax.swing.JTextField();
        letMetodoPago = new javax.swing.JLabel();
        comboMetodoPago = new javax.swing.JComboBox<>();
        btnBuscarNIT = new javax.swing.JPanel();
        letBuscarNIT = new javax.swing.JLabel();
        letProductosAgregados = new javax.swing.JLabel();
        letTextoContinuar = new javax.swing.JLabel();
        btnVentasContinuar = new javax.swing.JPanel();
        letVentasContinuar = new javax.swing.JLabel();
        panelProductosAgregados = new javax.swing.JPanel();
        tblProductosAgregados = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        letFondoVentas = new javax.swing.JLabel();

        fondoPanel.setMinimumSize(new java.awt.Dimension(980, 720));
        fondoPanel.setPreferredSize(new java.awt.Dimension(980, 720));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letTituloVentas.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        letTituloVentas.setForeground(new java.awt.Color(255, 255, 255));
        letTituloVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTituloVentas.setText("VENTAS");
        fondoPanel.add(letTituloVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 70, 980, -1));

        separadorDerecha.setForeground(new java.awt.Color(255, 255, 255));
        separadorDerecha.setOpaque(true);
        fondoPanel.add(separadorDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 200, -1));

        separadorIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        separadorIzquierda.setOpaque(true);
        fondoPanel.add(separadorIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 200, -1));

        panelAgregarProductos.setBackground(new java.awt.Color(122, 167, 167));
        panelAgregarProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letIDProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letIDProducto.setForeground(new java.awt.Color(255, 255, 255));
        letIDProducto.setText("NO. CODIGO DE BARRAS");
        panelAgregarProductos.add(letIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        txtNoCodigoBarras.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtNoCodigoBarras.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelAgregarProductos.add(txtNoCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 250, 30));

        letCantidadVenta.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letCantidadVenta.setForeground(new java.awt.Color(255, 255, 255));
        letCantidadVenta.setText("CANTIDAD");
        panelAgregarProductos.add(letCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        txtCantidadVenta.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        panelAgregarProductos.add(txtCantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 250, 30));

        letNombreProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        letNombreProducto.setText("NOMBRE PRODUCTO");
        panelAgregarProductos.add(letNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        txtNombreProducto.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        panelAgregarProductos.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 250, 30));

        letPrecio.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letPrecio.setForeground(new java.awt.Color(255, 255, 255));
        letPrecio.setText("PRECIO");
        panelAgregarProductos.add(letPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        panelAgregarProductos.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 250, 30));

        letImagen.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letImagen.setForeground(new java.awt.Color(255, 255, 255));
        letImagen.setText("IMAGEN");
        panelAgregarProductos.add(letImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        panelImagenVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelImagenVentas.add(letImagenVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 250));

        panelAgregarProductos.add(panelImagenVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 250, 250));

        btnBuscarProducto.setBackground(new java.awt.Color(48, 99, 99));
        btnBuscarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BUSCAR");
        btnBuscarProducto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        panelAgregarProductos.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 90, 30));

        btnAgregarProducto.setBackground(new java.awt.Color(48, 99, 99));
        btnAgregarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("AGREGAR");
        btnAgregarProducto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        panelAgregarProductos.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 90, 30));

        ComBoxPromocion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIN PROMOCIÓN", "CON PROMOCIÓN" }));
        panelAgregarProductos.add(ComBoxPromocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 140, 30));

        fondoPanel.add(panelAgregarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 720));

        letIDProducto1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letIDProducto1.setForeground(new java.awt.Color(255, 255, 255));
        letIDProducto1.setText("TOTAL VENTA");
        fondoPanel.add(letIDProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, 20));

        panelMetodoPago.setBackground(new java.awt.Color(122, 167, 167));
        panelMetodoPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letNIT.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letNIT.setForeground(new java.awt.Color(255, 255, 255));
        letNIT.setText("NIT");
        panelMetodoPago.add(letNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
        panelMetodoPago.add(txtNITVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 243, -1));

        letNombreVentas.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letNombreVentas.setForeground(new java.awt.Color(255, 255, 255));
        letNombreVentas.setText("NOMBRE");
        panelMetodoPago.add(letNombreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));
        panelMetodoPago.add(txtNombreVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 240, -1));

        letMetodoPago.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letMetodoPago.setForeground(new java.awt.Color(255, 255, 255));
        letMetodoPago.setText("MÉTODO DE PAGO");
        panelMetodoPago.add(letMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        comboMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelMetodoPago.add(comboMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 240, -1));

        btnBuscarNIT.setBackground(new java.awt.Color(48, 99, 99));
        btnBuscarNIT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letBuscarNIT.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letBuscarNIT.setForeground(new java.awt.Color(255, 255, 255));
        letBuscarNIT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letBuscarNIT.setText("BUSCAR");
        btnBuscarNIT.add(letBuscarNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        panelMetodoPago.add(btnBuscarNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 90, 30));

        fondoPanel.add(panelMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 720));

        letProductosAgregados.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letProductosAgregados.setForeground(new java.awt.Color(255, 255, 255));
        letProductosAgregados.setText("PRODUCTOS AGREGADOS");
        fondoPanel.add(letProductosAgregados, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        letTextoContinuar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letTextoContinuar.setForeground(new java.awt.Color(255, 255, 255));
        letTextoContinuar.setText("Continuar con los datos de compra");
        fondoPanel.add(letTextoContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, 20));

        btnVentasContinuar.setBackground(new java.awt.Color(96, 124, 124));
        btnVentasContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentasContinuar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letVentasContinuar.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letVentasContinuar.setForeground(new java.awt.Color(255, 255, 255));
        letVentasContinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letVentasContinuar.setText("CONTINUAR");
        btnVentasContinuar.add(letVentasContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        fondoPanel.add(btnVentasContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 610, 110, 30));

        panelProductosAgregados.setPreferredSize(new java.awt.Dimension(250, 250));
        panelProductosAgregados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductosAgregados.setViewportView(jTable1);

        panelProductosAgregados.add(tblProductosAgregados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 330));

        fondoPanel.add(panelProductosAgregados, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 390, 330));
        fondoPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 250, 30));

        letFondoVentas.setBackground(new java.awt.Color(122, 167, 167));
        letFondoVentas.setOpaque(true);
        fondoPanel.add(letFondoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 720));

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
    public javax.swing.JComboBox<String> ComBoxPromocion;
    public javax.swing.JPanel btnAgregarProducto;
    private javax.swing.JPanel btnBuscarNIT;
    public javax.swing.JPanel btnBuscarProducto;
    public javax.swing.JPanel btnVentasContinuar;
    private javax.swing.JComboBox<String> comboMetodoPago;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel letBuscarNIT;
    private javax.swing.JLabel letCantidadVenta;
    private javax.swing.JLabel letFondoVentas;
    private javax.swing.JLabel letIDProducto;
    private javax.swing.JLabel letIDProducto1;
    private javax.swing.JLabel letImagen;
    public javax.swing.JLabel letImagenVentas;
    private javax.swing.JLabel letMetodoPago;
    private javax.swing.JLabel letNIT;
    private javax.swing.JLabel letNombreProducto;
    private javax.swing.JLabel letNombreVentas;
    private javax.swing.JLabel letPrecio;
    private javax.swing.JLabel letProductosAgregados;
    private javax.swing.JLabel letTextoContinuar;
    private javax.swing.JLabel letTituloVentas;
    private javax.swing.JLabel letVentasContinuar;
    public javax.swing.JPanel panelAgregarProductos;
    private javax.swing.JPanel panelImagenVentas;
    public javax.swing.JPanel panelMetodoPago;
    private javax.swing.JPanel panelProductosAgregados;
    private javax.swing.JSeparator separadorDerecha;
    private javax.swing.JSeparator separadorIzquierda;
    private javax.swing.JScrollPane tblProductosAgregados;
    public javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtNITVentas;
    public javax.swing.JTextField txtNoCodigoBarras;
    public javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreVentas;
    public javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables

    public void setControlador(ControladorVentas controlador){
        btnVentasContinuar.addMouseListener(controlador);
        btnAgregarProducto.addMouseListener(controlador);
        btnBuscarProducto.addMouseListener(controlador);
        btnBuscarNIT.addMouseListener(controlador);
    }
}
