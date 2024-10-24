package Vistas;

import Controlador.ControladorClientes;
import Implementacion.ClienteImp;
import Modelo.ModeloClientes;

public class PanelClientes extends javax.swing.JPanel {

    /**
     * Creates new form PanelClientes
     */
    public PanelClientes() {
        initComponents();

        Modelo.ModeloClientes modelo = new ModeloClientes(this);
        Controlador.ControladorClientes controlador = new ControladorClientes(modelo);
        setControlador(controlador);
        
        ClienteImp implementacion = new ClienteImp();
        tblClientes.setModel(implementacion.modeloClientes());
//        tblClientes.getColumnModel().getColumn(0).setResizable(false);
//        tblClientes.getColumnModel().getColumn(1).setResizable(false);
//        tblClientes.getColumnModel().getColumn(2).setResizable(false);
//        tblClientes.getColumnModel().getColumn(3).setResizable(false);
        
        
        
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
        letTituloClientes = new javax.swing.JLabel();
        separadorDerecha = new javax.swing.JSeparator();
        separadorIzquierda = new javax.swing.JSeparator();
        lblNIT = new javax.swing.JLabel();
        letNombreCliente = new javax.swing.JLabel();
        letTelefono = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        letFondoClientes = new javax.swing.JLabel();

        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letTituloClientes.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        letTituloClientes.setForeground(new java.awt.Color(255, 255, 255));
        letTituloClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTituloClientes.setText("CLIENTES");
        fondoPanel.add(letTituloClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 70, 970, -1));

        separadorDerecha.setForeground(new java.awt.Color(255, 255, 255));
        separadorDerecha.setOpaque(true);
        fondoPanel.add(separadorDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 240, -1));

        separadorIzquierda.setForeground(new java.awt.Color(255, 255, 255));
        separadorIzquierda.setOpaque(true);
        fondoPanel.add(separadorIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 240, -1));

        lblNIT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNIT.setForeground(new java.awt.Color(255, 255, 255));
        lblNIT.setText("NIT");
        fondoPanel.add(lblNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        letNombreCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        letNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        letNombreCliente.setText("NOMBRE DE CLIENTE");
        fondoPanel.add(letNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        letTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        letTelefono.setForeground(new java.awt.Color(255, 255, 255));
        letTelefono.setText("TELÉFONO");
        fondoPanel.add(letTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        txtNit.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        fondoPanel.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, -1));

        txtNombreCliente.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        fondoPanel.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 320, -1));

        txtTelefono.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        fondoPanel.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 320, -1));

        btnAgregar.setBackground(new java.awt.Color(48, 99, 99));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AGREGAR");

        javax.swing.GroupLayout btnAgregarLayout = new javax.swing.GroupLayout(btnAgregar);
        btnAgregar.setLayout(btnAgregarLayout);
        btnAgregarLayout.setHorizontalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAgregarLayout.setVerticalGroup(
            btnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondoPanel.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, 40));

        btnActualizar.setBackground(new java.awt.Color(48, 99, 99));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ACTUALIZAR");

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondoPanel.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 100, 40));

        btnEliminar.setBackground(new java.awt.Color(48, 99, 99));

        lblEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEliminar.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("ELIMINAR");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondoPanel.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 100, 40));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(2).setResizable(false);
        }

        fondoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, 480));

        letFondoClientes.setBackground(new java.awt.Color(122, 167, 167));
        letFondoClientes.setOpaque(true);
        fondoPanel.add(letFondoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 720));

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
    public javax.swing.JPanel btnActualizar;
    public javax.swing.JPanel btnAgregar;
    public javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblNIT;
    private javax.swing.JLabel letFondoClientes;
    private javax.swing.JLabel letNombreCliente;
    private javax.swing.JLabel letTelefono;
    private javax.swing.JLabel letTituloClientes;
    private javax.swing.JSeparator separadorDerecha;
    private javax.swing.JSeparator separadorIzquierda;
    public javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void setControlador(ControladorClientes controlador) {
        btnAgregar.addMouseListener(controlador);
        btnActualizar.addMouseListener(controlador);
        btnEliminar.addMouseListener(controlador);

    }

}
