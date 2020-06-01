package venta;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import modelo.ResultSetTableModel;

public class ConsultarProveedor extends javax.swing.JDialog {

    public ConsultarProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
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
        radioNombre = new javax.swing.JRadioButton();
        radioPApellido = new javax.swing.JRadioButton();
        radioSApellido = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Buscar proveedor");
        setMinimumSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        etiqueta.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Buscar:");

        cajaTexto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaTexto.setToolTipText("Buscar");
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
        btnLimpiar.setToolTipText("Limpiar area de busqueda");
        btnLimpiar.setEnabled(false);
        btnLimpiar.setNextFocusableComponent(radioNombre);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id Proveedor", "Nombre", "Primer Apellido", "Segundo Apellido", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        grupo.add(radioNombre);
        radioNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioNombre.setText("Nombre");
        radioNombre.setNextFocusableComponent(radioPApellido);
        radioNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNombreActionPerformed(evt);
            }
        });
        radioNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioNombreKeyPressed(evt);
            }
        });

        grupo.add(radioPApellido);
        radioPApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioPApellido.setText("Primer Apellido");
        radioPApellido.setNextFocusableComponent(radioSApellido);
        radioPApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPApellidoActionPerformed(evt);
            }
        });
        radioPApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioPApellidoKeyPressed(evt);
            }
        });

        grupo.add(radioSApellido);
        radioSApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioSApellido.setText("Segundo Apellido");
        radioSApellido.setNextFocusableComponent(cajaTexto);
        radioSApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSApellidoActionPerformed(evt);
            }
        });
        radioSApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioSApellidoKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Proveedores");
        jLabel6.setPreferredSize(new java.awt.Dimension(130, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioPApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioSApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiqueta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar)))
                        .addGap(0, 319, Short.MAX_VALUE)))
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
                    .addComponent(radioNombre)
                    .addComponent(radioPApellido)
                    .addComponent(radioSApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTexto)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNombreActionPerformed
        cajaTexto.setToolTipText("Nombre del proveedor");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true);
    }//GEN-LAST:event_radioNombreActionPerformed

    private void radioPApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPApellidoActionPerformed
        cajaTexto.setToolTipText("Primer apellido del proveedor");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true);
    }//GEN-LAST:event_radioPApellidoActionPerformed

    private void radioSApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSApellidoActionPerformed
        cajaTexto.setToolTipText("Segundo apellido del proveedor");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true);
    }//GEN-LAST:event_radioSApellidoActionPerformed

    private void cajaTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoKeyTyped
        if (cajaTexto.getText().length() == 45) 
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaTextoKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        grupo.clearSelection();
        cajaTexto.setToolTipText("Buscar");
        habilitarCampos(false, false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void buscar(){
        if(radioNombre.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Proveedores WHERE nombre LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_proveedor");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioPApellido.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Proveedores WHERE Primer_Apellido LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_proveedor");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioSApellido.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Proveedores WHERE Segundo_Apellido LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_proveedor");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
    }
    
    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
        try {
            id = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
            this.dispose();
        } catch (NumberFormatException e) {}
    }//GEN-LAST:event_tablaMouseReleased

    private void radioNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioNombreKeyPressed
        if(evt.getKeyCode() == 10)
            radioNombre.doClick();
    }//GEN-LAST:event_radioNombreKeyPressed

    private void radioPApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioPApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            radioPApellido.doClick();
    }//GEN-LAST:event_radioPApellidoKeyPressed

    private void radioSApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioSApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            radioSApellido.doClick();
    }//GEN-LAST:event_radioSApellidoKeyPressed

    private void cajaTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoKeyReleased
        buscar();
    }//GEN-LAST:event_cajaTextoKeyReleased

    public void habilitarCampos(boolean caja, boolean btnLim){
        cajaTexto.setEnabled(caja);
        cajaTexto.setText("");
        btnLimpiar.setEnabled(btnLim);      
    }
    
    public void soloLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if( (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_PERIOD)
            evt.consume();
    }
    
    public final void actualizarTabla(String consulta){
        String controlador = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/Ferreteria";
        ResultSetTableModel modeloDatos = null;

        try {
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        } catch (ClassNotFoundException | SQLException e) {}

        tabla.setModel(modeloDatos);
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField cajaTexto;
    private javax.swing.JLabel etiqueta;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JRadioButton radioPApellido;
    private javax.swing.JRadioButton radioSApellido;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    public int id;
    final static String MOSTRAR_TODOS_LOS_DATOS = "SELECT * FROM Proveedores ORDER BY id_proveedor";
}