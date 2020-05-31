package venta;

import controlador.VentaDAO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import modelo.ResultSetTableModel;

public class Venta extends javax.swing.JPanel {

    public Venta(int id) {
        initComponents();
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        idEmple = id;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        etiqueta = new javax.swing.JLabel();
        cajaTexto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnLimpiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        radioIdCliente = new javax.swing.JRadioButton();
        radioIdProducto = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));

        etiqueta.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Buscar:");

        cajaTexto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaTexto.setEnabled(false);
        cajaTexto.setNextFocusableComponent(btnLimpiar);
        cajaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaTextoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTextoKeyTyped(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clean.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.setNextFocusableComponent(btnAgregar);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id Venta", "id Cliente", "Nombre Cliente", "id Producto", "Nombre Producto", "Cantidad", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        grupo.add(radioIdCliente);
        radioIdCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioIdCliente.setText("id Cliente");
        radioIdCliente.setNextFocusableComponent(radioIdProducto);
        radioIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIdClienteActionPerformed(evt);
            }
        });
        radioIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioIdClienteKeyPressed(evt);
            }
        });

        grupo.add(radioIdProducto);
        radioIdProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioIdProducto.setText("id Producto");
        radioIdProducto.setNextFocusableComponent(cajaTexto);
        radioIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioIdProductoActionPerformed(evt);
            }
        });
        radioIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioIdProductoKeyPressed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setNextFocusableComponent(radioIdCliente);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ventas");
        jLabel6.setPreferredSize(new java.awt.Dimension(130, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(radioIdCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioIdProducto))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etiqueta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar)))
                        .addGap(0, 322, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioIdCliente)
                    .addComponent(radioIdProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIdClienteActionPerformed
        cajaTexto.setToolTipText("id del cliente");
        habilitarCampos(true, true);
        ConsultarCliente consultar = new ConsultarCliente(null, true);
        consultar.setVisible(true);
        cajaTexto.setText(String.valueOf(consultar.id));
        consultar.dispose();
        buscar();
    }//GEN-LAST:event_radioIdClienteActionPerformed

    private void radioIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioIdProductoActionPerformed
        cajaTexto.setToolTipText("id del producto");
        habilitarCampos(true, true);
        ConsultarProducto consultar = new ConsultarProducto(null, true);
        consultar.setVisible(true);
        cajaTexto.setText(String.valueOf(consultar.id));
        consultar.dispose();
        buscar();
    }//GEN-LAST:event_radioIdProductoActionPerformed

    private void cajaTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoKeyTyped
        if (cajaTexto.getText().length() == 45) 
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaTextoKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiar(){
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        grupo.clearSelection();
        cajaTexto.setText("");
        cajaTexto.setToolTipText("Buscar");
        habilitarCampos(false, true);
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar = new AgregarVenta(null, true, idEmple);
        agregar.setVisible(true);
        agregar.dispose();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void buscar(){
        if(radioIdCliente.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Ventas WHERE id_Cliente = '"+cajaTexto.getText()+"'");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioIdProducto.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Ventas WHERE id_Producto = '"+cajaTexto.getText()+"'");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
    }
    private void radioIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioIdClienteKeyPressed
        if(evt.getKeyCode() == 10)
            radioIdCliente.doClick();
    }//GEN-LAST:event_radioIdClienteKeyPressed

    private void radioIdProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioIdProductoKeyPressed
        if(evt.getKeyCode() == 10)
            radioIdProducto.doClick();
    }//GEN-LAST:event_radioIdProductoKeyPressed

    private void cajaTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoKeyReleased
        buscar();
    }//GEN-LAST:event_cajaTextoKeyReleased

    private void habilitarCampos(boolean btnLim, boolean btnAgr){
        cajaTexto.setText("");
        btnLimpiar.setEnabled(btnLim); 
        btnAgregar.setEnabled(btnAgr);      
    }
    
    private void soloLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if( (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_PERIOD)
            evt.consume();
    }
    
    private void actualizarTabla(String consulta){
        String controlador = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/Ferreteria?useTimezone=true&serverTimezone=UTC";
        ResultSetTableModel modeloDatos = null;

        try {
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        } catch (ClassNotFoundException | SQLException e) {}

        tabla.setModel(modeloDatos);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cajaTexto;
    private javax.swing.JLabel etiqueta;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radioIdCliente;
    private javax.swing.JRadioButton radioIdProducto;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private int idEmple;
    final static VentaDAO VENTA_DAO = new VentaDAO();
    final static String MOSTRAR_TODOS_LOS_DATOS = "SELECT * FROM Ventas";
    private AgregarVenta agregar;
}