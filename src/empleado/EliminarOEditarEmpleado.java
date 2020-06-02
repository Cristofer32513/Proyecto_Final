package empleado;

import controlador.EmpleadoDAO;
import java.awt.event.KeyEvent;
import modelo.Empleado;
import javax.swing.JOptionPane;

public class EliminarOEditarEmpleado extends javax.swing.JDialog {

    public EliminarOEditarEmpleado(java.awt.Frame proveedor, boolean modal, int id, String nombre, String primApe, String segApe, String cargo, String calle, String colo, String mun, String tel) {
        super(proveedor, modal);
        initComponents();
        setLocationRelativeTo(null);
        cajaidEmpleado.setText(String.valueOf(id));
        cajaNombre.setText(nombre);
        cajaPApellido.setText(primApe);
        cajaSApellido.setText(segApe);
        comboCargo.setSelectedItem(cargo);
        cajaCalle.setText(calle);
        cajaColonia.setText(colo);
        comboMunicipio.setSelectedItem(mun);
        cajaTelefono.setText(tel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cajaTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboMunicipio = new javax.swing.JComboBox<>();
        cajaColonia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cajaCalle = new javax.swing.JTextField();
        comboCargo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaPApellido = new javax.swing.JTextField();
        cajaSApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cajaidEmpleado = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar o editar empleado");
        setMinimumSize(new java.awt.Dimension(460, 350));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(490, 264));
        jPanel1.setMinimumSize(new java.awt.Dimension(490, 264));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 264));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar empleado");
        btnEliminar.setNextFocusableComponent(btnCancelar);
        btnEliminar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Descartar accion");
        btnCancelar.setNextFocusableComponent(cajaNombre);
        btnCancelar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cajaTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaTelefono.setToolTipText("Telefono del empleado");
        cajaTelefono.setNextFocusableComponent(btnEditar);
        cajaTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTelefonoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Municipio:");

        comboMunicipio.setEditable(true);
        comboMunicipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Municipio...", "Apozol", "Apulco", "Atolinga", "Benito Juarez", "Calera", "Canitas de Felipe Pescador", "Chalchihuites", "Concepción del Oro", "Cuauhtemoc", "El Plateado de Joaquin Amaro", "El Salvador", "Fresnillo", "Genaro Codina", "General Enrique Estrada", "General Francisco R. Murguia", "General Panfilo Natera", "Guadalupe", "Huanusco", "Jalpa", "Jerez", "Jimenez del Teul", "Juan Aldama", "Juchipila", "Loreto", "Luis Moya", "Mazapil", "Melchor Ocampo", "Mezquital del Oro", "Miguel Auza", "Momax", "Monte Escobedo", "Morelos", "Moyahua de Estrada", "Nochistlan de Mejia", "Noria de Angeles", "Ojocaliente", "Panuco", "Pinos", "Rio Grande", "Sain Alto", "Santa Maria de la Paz", "Sombrerete", "Susticacan", "Tabasco", "Tepechitlan", "Tepetongo", "Teul de Gonzalez Ortega", "Tlaltenango de Sanchez Roman", "Trancoso", "Trinidad Garcia de la Cadena", "Valparaiso", "Vetagrande", "Villa de Cos", "Villa Garcia", "Villa Gonzalez Ortega", "Villa Hidalgo", "Villanueva", "Zacatecas" }));
        comboMunicipio.setToolTipText("Municipio del empleado");
        comboMunicipio.setNextFocusableComponent(cajaTelefono);
        comboMunicipio.setPreferredSize(new java.awt.Dimension(6, 23));
        comboMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMunicipioKeyPressed(evt);
            }
        });

        cajaColonia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaColonia.setToolTipText("Colonia del empleado");
        cajaColonia.setNextFocusableComponent(comboMunicipio);
        cajaColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaColoniaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaColoniaKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Colonia:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Calle:");

        cajaCalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaCalle.setToolTipText("Calle del empleado");
        cajaCalle.setNextFocusableComponent(cajaColonia);
        cajaCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaCalleKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCalleKeyTyped(evt);
            }
        });

        comboCargo.setEditable(true);
        comboCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cargo ...", "Gerente", "Administrador", "Cajero", "Repartidor" }));
        comboCargo.setToolTipText("Cargo a desempeñar");
        comboCargo.setName(""); // NOI18N
        comboCargo.setNextFocusableComponent(cajaCalle);
        comboCargo.setPreferredSize(new java.awt.Dimension(6, 23));
        comboCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboCargoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Segundo Apellido:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Cargo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Primer Apellido:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombre.setToolTipText("Nombre del empleado");
        cajaNombre.setNextFocusableComponent(cajaPApellido);
        cajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombreKeyTyped(evt);
            }
        });

        cajaPApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaPApellido.setToolTipText("Primer apellido del empleado");
        cajaPApellido.setNextFocusableComponent(cajaSApellido);
        cajaPApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaPApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaPApellidoKeyTyped(evt);
            }
        });

        cajaSApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaSApellido.setToolTipText("Segundo apellido del empleado");
        cajaSApellido.setNextFocusableComponent(comboCargo);
        cajaSApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaSApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaSApellidoKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("id_Empleado:");

        cajaidEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaidEmpleado.setToolTipText("Id Empleado");
        cajaidEmpleado.setEnabled(false);

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnEditar.setText("Actualizar");
        btnEditar.setToolTipText("Actualizar registro con los nuevos datos");
        btnEditar.setNextFocusableComponent(btnEliminar);
        btnEditar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cajaPApellido)
                            .addComponent(cajaNombre)
                            .addComponent(cajaidEmpleado)
                            .addComponent(cajaSApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaCalle)
                            .addComponent(cajaColonia)
                            .addComponent(comboMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cajaTelefono))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaidEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaNombre)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaPApellido)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaSApellido)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaCalle)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaColonia)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(EMPLEADO_DAO.eliminarEmpleado(Integer.parseInt(cajaidEmpleado.getText())))
            this.dispose();
        else
            JOptionPane.showMessageDialog(null, "Error al eliminar el Empleado.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Se perderan los datos no guardados\n¿Desea continuar?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            this.dispose(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(verificarEstadoComponentes()){
            empleado = new Empleado(Integer.parseInt(cajaidEmpleado.getText()), cajaNombre.getText(), cajaPApellido.getText(), cajaSApellido.getText(), comboCargo.getSelectedItem().toString(), cajaCalle.getText(), cajaColonia.getText(), comboMunicipio.getSelectedItem().toString(), cajaTelefono.getText());

            if(EMPLEADO_DAO.modificarEmpleado(empleado))
                this.dispose();
            else
                JOptionPane.showMessageDialog(null, "Error al Actualizar los datos del Empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Campo(s) vacio(s).", "Precaucion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cajaNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_cajaNombreKeyPressed

    private void cajaPApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_cajaPApellidoKeyPressed

    private void cajaSApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaSApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_cajaSApellidoKeyPressed

    private void comboCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboCargoKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_comboCargoKeyPressed

    private void cajaCalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCalleKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_cajaCalleKeyPressed

    private void cajaColoniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaColoniaKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_cajaColoniaKeyPressed

    private void comboMunicipioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMunicipioKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_comboMunicipioKeyPressed

    private void cajaTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTelefonoKeyPressed
        if(evt.getKeyCode() == 10)
            btnEditar.doClick();
    }//GEN-LAST:event_cajaTelefonoKeyPressed

    private void cajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyTyped
        if (cajaPApellido.getText().length() == 45)
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaNombreKeyTyped

    private void cajaPApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPApellidoKeyTyped
        if (cajaPApellido.getText().length() == 45)
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaPApellidoKeyTyped

    private void cajaSApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaSApellidoKeyTyped
        if (cajaPApellido.getText().length() == 45)
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaSApellidoKeyTyped

    private void cajaColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaColoniaKeyTyped
        if (cajaPApellido.getText().length() == 45)
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaColoniaKeyTyped

    private void cajaCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCalleKeyTyped
        if (cajaCalle.getText().length() == 45)
            evt.consume();
        else
            sinCaracteresEspeciales(evt);
    }//GEN-LAST:event_cajaCalleKeyTyped

    private void cajaTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTelefonoKeyTyped
        if (cajaTelefono.getText().length() == 10)
            evt.consume();
        else
            soloNumeros(evt);
    }//GEN-LAST:event_cajaTelefonoKeyTyped

    private void soloLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if( (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_PERIOD)
            evt.consume();
    }
    
    private void soloNumeros(KeyEvent evt) {
        char c = evt.getKeyChar();
        if((c < '0' || c > '9'))
            evt.consume();
    }
    
    private void sinCaracteresEspeciales(KeyEvent evt) {
        char c = evt.getKeyChar();
        if( (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_PERIOD)
            evt.consume();
    }
    
    private boolean verificarEstadoComponentes(){
        boolean bandera = true;

        if(cajaNombre.getText().trim().equals(""))
            bandera = false;
        if(cajaPApellido.getText().trim().equals(""))
            bandera = false;
        if(cajaSApellido.getText().trim().equals(""))
            bandera = false;
        if(comboCargo.getSelectedIndex() == 0)
            bandera = false;
        if(cajaCalle.getText().trim().equals(""))
            bandera = false;
        if(cajaColonia.getText().trim().equals(""))
            bandera = false;
        if(comboMunicipio.getSelectedIndex() == 0)
            bandera = false;
        if(cajaTelefono.getText().length() != 10)
            bandera = false;
        
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField cajaCalle;
    private javax.swing.JTextField cajaColonia;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPApellido;
    private javax.swing.JTextField cajaSApellido;
    private javax.swing.JTextField cajaTelefono;
    private javax.swing.JTextField cajaidEmpleado;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JComboBox<String> comboMunicipio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private Empleado empleado;
    final static EmpleadoDAO EMPLEADO_DAO = new EmpleadoDAO();
}