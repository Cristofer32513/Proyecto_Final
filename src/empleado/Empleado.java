package empleado;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JTextField;
import modelo.ResultSetTableModel;

public class Empleado extends javax.swing.JPanel {

    public Empleado() {
        initComponents();
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
        btnAgregar = new javax.swing.JButton();
        radioCargo = new javax.swing.JRadioButton();
        radioCalle = new javax.swing.JRadioButton();
        radioColonia = new javax.swing.JRadioButton();
        radioMunicipio = new javax.swing.JRadioButton();
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
        btnLimpiar.setToolTipText("Limpiar area de busqueda");
        btnLimpiar.setEnabled(false);
        btnLimpiar.setNextFocusableComponent(btnAgregar);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id Empleado", "Nombre", "Primer Apellido", "Segundo Apellido", "Cargo", "Calle", "Colonia", "Municipio", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
        radioSApellido.setNextFocusableComponent(radioCargo);
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

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Agregar nuevo empleado");
        btnAgregar.setNextFocusableComponent(radioNombre);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        grupo.add(radioCargo);
        radioCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCargo.setText("Cargo");
        radioCargo.setNextFocusableComponent(radioCalle);
        radioCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCargoActionPerformed(evt);
            }
        });
        radioCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioCargoKeyPressed(evt);
            }
        });

        grupo.add(radioCalle);
        radioCalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioCalle.setText("Calle");
        radioCalle.setNextFocusableComponent(radioColonia);
        radioCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCalleActionPerformed(evt);
            }
        });
        radioCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioCalleKeyPressed(evt);
            }
        });

        grupo.add(radioColonia);
        radioColonia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioColonia.setText("Colonia");
        radioColonia.setNextFocusableComponent(radioMunicipio);
        radioColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioColoniaActionPerformed(evt);
            }
        });
        radioColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioColoniaKeyPressed(evt);
            }
        });

        grupo.add(radioMunicipio);
        radioMunicipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioMunicipio.setText("Municipio");
        radioMunicipio.setNextFocusableComponent(cajaTexto);
        radioMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMunicipioActionPerformed(evt);
            }
        });
        radioMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                radioMunicipioKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Empleados");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(radioNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioPApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioSApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCalle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioColonia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioMunicipio)
                .addContainerGap(195, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
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
                    .addComponent(radioSApellido)
                    .addComponent(radioCargo)
                    .addComponent(radioCalle)
                    .addComponent(radioColonia)
                    .addComponent(radioMunicipio))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etiqueta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaTexto)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNombreActionPerformed
        cajaTexto.setToolTipText("Nombre del empleado");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true, true);
    }//GEN-LAST:event_radioNombreActionPerformed

    private void radioPApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPApellidoActionPerformed
        cajaTexto.setToolTipText("Primer apellido del empleado");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true, true);
    }//GEN-LAST:event_radioPApellidoActionPerformed

    private void radioSApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSApellidoActionPerformed
        cajaTexto.setToolTipText("Segundo apellido del empleado");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true, true);
    }//GEN-LAST:event_radioSApellidoActionPerformed

    private void cajaTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoKeyTyped
        verificarEntradaTexto(cajaTexto, evt);
    }//GEN-LAST:event_cajaTextoKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiar(){
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        grupo.clearSelection();
        cajaTexto.setText("");
        cajaTexto.setToolTipText("Buscar");
        habilitarCampos(false, false, true);
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar = new AgregarEmpleado(null, true);
        agregar.setVisible(true);
        agregar.dispose();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void buscar(){
        if(radioNombre.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Empleados WHERE nombre LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_empleado");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioPApellido.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Empleados WHERE Primer_Apellido LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_empleado");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioSApellido.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Empleados WHERE Segundo_Apellido LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_empleado");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioCargo.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Empleados WHERE Cargo Like '%"+cajaTexto.getText()+"%' ORDER BY id_empleado");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioCalle.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Empleados WHERE Calle LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_empleado");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioColonia.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Empleados WHERE Colonia LIKE '%"+cajaTexto.getText()+"%' ORDER BY id_empleado");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
        else if(radioMunicipio.isSelected()){
            if(!cajaTexto.getText().equals(""))
                actualizarTabla("SELECT * FROM Empleados WHERE Municipio Like '%"+cajaTexto.getText()+"%' ORDER BY id_empleado");
            else
                actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        }
    }
    
    private void tablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseReleased
        try {
            id = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
            nom = (String) tabla.getValueAt(tabla.getSelectedRow(), 1);
            pA = (String) tabla.getValueAt(tabla.getSelectedRow(), 2);
            sA = (String) tabla.getValueAt(tabla.getSelectedRow(), 3);
            car = (String) tabla.getValueAt(tabla.getSelectedRow(), 4);
            call = (String) tabla.getValueAt(tabla.getSelectedRow(), 5);
            col = (String) tabla.getValueAt(tabla.getSelectedRow(), 6);
            mun = (String) tabla.getValueAt(tabla.getSelectedRow(), 7);
            tel = (String) tabla.getValueAt(tabla.getSelectedRow(), 8);

            eliminar = new EliminarOEditarEmpleado(null, true, id, nom, pA, sA, car, call, col, mun, tel);
            eliminar.setVisible(true);
            eliminar.dispose();
            limpiar();
            
            habilitarCampos(cajaTexto.isEnabled(), btnLimpiar.isEnabled(), true);
        } catch (NumberFormatException e) {}
    }//GEN-LAST:event_tablaMouseReleased

    private void radioCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCargoActionPerformed
        cajaTexto.setToolTipText("Cargo a desempeñar");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true, true);
    }//GEN-LAST:event_radioCargoActionPerformed

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

    private void radioCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioCargoKeyPressed
        if(evt.getKeyCode() == 10)
            radioCargo.doClick();
    }//GEN-LAST:event_radioCargoKeyPressed

    private void cajaTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTextoKeyReleased
        buscar();
    }//GEN-LAST:event_cajaTextoKeyReleased

    private void radioCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCalleActionPerformed
        cajaTexto.setToolTipText("Calle del empleado");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true, true);
    }//GEN-LAST:event_radioCalleActionPerformed

    private void radioCalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioCalleKeyPressed
        if(evt.getKeyCode() == 10)
            radioCalle.doClick();
    }//GEN-LAST:event_radioCalleKeyPressed

    private void radioColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioColoniaActionPerformed
        cajaTexto.setToolTipText("Colonia del empleado");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true, true);
    }//GEN-LAST:event_radioColoniaActionPerformed

    private void radioColoniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioColoniaKeyPressed
        if(evt.getKeyCode() == 10)
            radioColonia.doClick();
    }//GEN-LAST:event_radioColoniaKeyPressed

    private void radioMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMunicipioActionPerformed
        cajaTexto.setToolTipText("Municipio del empleado");
        actualizarTabla(MOSTRAR_TODOS_LOS_DATOS);
        habilitarCampos(true, true, true);
    }//GEN-LAST:event_radioMunicipioActionPerformed

    private void radioMunicipioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_radioMunicipioKeyPressed
        if(evt.getKeyCode() == 10)
            radioMunicipio.doClick();
    }//GEN-LAST:event_radioMunicipioKeyPressed

    private void habilitarCampos(boolean caja, boolean btnLim, boolean btnAgr){
        cajaTexto.setEnabled(caja);
        cajaTexto.setText("");
        btnLimpiar.setEnabled(btnLim); 
        btnAgregar.setEnabled(btnAgr);           
    }
    
    private void verificarEntradaTexto(JTextField txtF, KeyEvent e){
        if (txtF.getText().length() == 45) 
            e.consume();			
        else
            if(!Character.isLetter(e.getKeyChar()) && e.getKeyChar() != KeyEvent.VK_SPACE && e.getKeyChar() != KeyEvent.VK_PERIOD)
                e.consume();
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
    private javax.swing.JRadioButton radioCalle;
    private javax.swing.JRadioButton radioCargo;
    private javax.swing.JRadioButton radioColonia;
    private javax.swing.JRadioButton radioMunicipio;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JRadioButton radioPApellido;
    private javax.swing.JRadioButton radioSApellido;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
    private String nom, pA, sA, car, call, col, mun, tel;
    private int id;
    final static String MOSTRAR_TODOS_LOS_DATOS = "SELECT * FROM Empleados ORDER BY id_empleado";
    private AgregarEmpleado agregar;
    private EliminarOEditarEmpleado eliminar;
}