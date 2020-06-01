package venta;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import modelo.ResultSetTableModel;

public class ConsultarProducto extends javax.swing.JDialog {

    public ConsultarProducto(java.awt.Frame parent, boolean modal) {
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
        radioMarca = new javax.swing.JRadioButton();
        radioProveedor = new javax.swing.JRadioButton();
        radioCategoria = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Buscar producto");
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
                "id Producto", "Nombre", "Marca", "Precio", "Stock", "id_Proveedor", "id_Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        radioNombre.setNextFocusableComponent(radioMarca);
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

        grupo.add(radioMarca);
        radioMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioMarca.setText("Marca");
        radioMarca.setNextFocusableComponent(radioProveedor);
        radioMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMarcaActionPerformed(evt);
            }
        });
        radioMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioMarcaKeyPressed(evt);
            }
        });

        grupo.add(radioProveedor);
        radioProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioProveedor.setText("Proveedor");
        radioProveedor.setNextFocusableComponent(radioCategoria);
        radioProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioProveedorActionPerformed(evt);
            }
        });
        radioProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioProveedorKeyPressed(evt);
            }
        });

        grupo.add(radioCategoria);
        radioCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCategoria.setText("Categoria");
        radioCategoria.setNextFocusableComponent(cajaTexto);
        radioCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCategoriaActionPerformed(evt);
            }
        });
        radioCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioCategoriaKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Productos");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radioNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCategoria)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiqueta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar)
                                .addGap(0, 319, Short.MAX_VALUE)))))
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
                    .addComponent(radioMarca)
                    .addComponent(radioProveedor)
                    .addComponent(radioCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTexto)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNombreActionPerformed
        cajaTexto.setToolTipText("Nombre del producto");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true);
    }//GEN-LAST:event_radioNombreActionPerformed

    private void radioMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMarcaActionPerformed
        cajaTexto.setToolTipText("Marca del producto");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true);
    }//GEN-LAST:event_radioMarcaActionPerformed

    private void radioProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioProveedorActionPerformed
        cajaTexto.setToolTipText("id del proveedor");
        ConsultarProveedor consultar = new ConsultarProveedor(null, true);
        consultar.setVisible(true);
        habilitarCampos(false, true);
        cajaTexto.setText(String.valueOf(consultar.id));
        consultar.dispose();
        buscar();
    }//GEN-LAST:event_radioProveedorActionPerformed

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
        habilitarCampos(false, false); 
    }
    
    private void buscar(){
        if(radioNombre.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Productos WHERE Nombre LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_producto");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioMarca.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Productos WHERE Marca LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_producto");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioProveedor.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Productos WHERE id_Proveedor = '"+cajaTexto.getText()+"' ORDER BY id_producto");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioCategoria.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Productos WHERE id_Categoria = '"+cajaTexto.getText()+"' ORDER BY id_producto");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
    }
    
    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
        try {
            id = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
            nombre = (String) tabla.getValueAt(tabla.getSelectedRow(), 1);
            this.dispose();
        } catch (NumberFormatException e) {}
    }//GEN-LAST:event_tablaMouseReleased

    private void radioCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCategoriaActionPerformed
        cajaTexto.setToolTipText("id de la categoria:");
        ConsultarCategoria consultar = new ConsultarCategoria(null, true);
        consultar.setVisible(true);
        habilitarCampos(false, true);
        cajaTexto.setText(String.valueOf(consultar.id));
        consultar.dispose();
        buscar();
    }//GEN-LAST:event_radioCategoriaActionPerformed

    private void radioNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioNombreKeyPressed
        if(evt.getKeyCode() == 10)
            radioNombre.doClick();
    }//GEN-LAST:event_radioNombreKeyPressed

    private void radioMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioMarcaKeyPressed
        if(evt.getKeyCode() == 10)
            radioMarca.doClick();
    }//GEN-LAST:event_radioMarcaKeyPressed

    private void radioProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioProveedorKeyPressed
        if(evt.getKeyCode() == 10)
            radioProveedor.doClick();
    }//GEN-LAST:event_radioProveedorKeyPressed

    private void radioCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioCategoriaKeyPressed
        if(evt.getKeyCode() == 10)
            radioCategoria.doClick();
    }//GEN-LAST:event_radioCategoriaKeyPressed

    private void cajaTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoKeyReleased
        buscar();
    }//GEN-LAST:event_cajaTextoKeyReleased

    private void habilitarCampos(boolean caja, boolean btnLim){
        cajaTexto.setEnabled(caja);
        cajaTexto.setText("");
        btnLimpiar.setEnabled(btnLim);          
    }
    
    private void soloLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if( (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_PERIOD)
            evt.consume();
    }
        
    private void actualizarTabla(String consulta){
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
    private javax.swing.JRadioButton radioCategoria;
    private javax.swing.JRadioButton radioMarca;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JRadioButton radioProveedor;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    public int id;
    public String nombre;
    final static String MOSTRAR_TODOS_LOS_DATOS = "SELECT * FROM Productos ORDER BY id_producto";
}