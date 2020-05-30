package cliente;

import controlador.ClienteDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Cliente;

public class AgregarCliente extends javax.swing.JDialog {

    public AgregarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaPApellido = new javax.swing.JTextField();
        cajaSApellido = new javax.swing.JTextField();
        cajaTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboMunicipio = new javax.swing.JComboBox<>();
        cajaColonia = new javax.swing.JTextField();
        cajaCalle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Cliente");
        setMaximumSize(new java.awt.Dimension(408, 325));
        setMinimumSize(new java.awt.Dimension(408, 325));
        setPreferredSize(new java.awt.Dimension(408, 325));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(395, 289));
        jPanel1.setMinimumSize(new java.awt.Dimension(395, 289));
        jPanel1.setPreferredSize(new java.awt.Dimension(395, 289));

        cajaPApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaPApellido.setToolTipText("Primer apellido del cliente");
        cajaPApellido.setNextFocusableComponent(cajaSApellido);
        cajaPApellido.setPreferredSize(new java.awt.Dimension(240, 23));
        cajaPApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaPApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaPApellidoKeyTyped(evt);
            }
        });

        cajaSApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaSApellido.setToolTipText("Segundo apellido del cliente");
        cajaSApellido.setNextFocusableComponent(cajaTelefono);
        cajaSApellido.setPreferredSize(new java.awt.Dimension(240, 23));
        cajaSApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaSApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaSApellidoKeyTyped(evt);
            }
        });

        cajaTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaTelefono.setToolTipText("Telefono del cliente");
        cajaTelefono.setNextFocusableComponent(cajaCalle);
        cajaTelefono.setPreferredSize(new java.awt.Dimension(240, 23));
        cajaTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTelefonoKeyTyped(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Agregar cliente");
        btnAgregar.setNextFocusableComponent(btnCancelar);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Descartar ingreso cliente");
        btnCancelar.setNextFocusableComponent(cajaNombre);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Primer Apellido:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Segundo Apellido:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Telefono:");

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombre.setToolTipText("Nombre del cliente");
        cajaNombre.setNextFocusableComponent(cajaPApellido);
        cajaNombre.setPreferredSize(new java.awt.Dimension(240, 23));
        cajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombreKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Calle:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Colonia:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Municipio:");

        comboMunicipio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Municipio...", "Apozol", "Apulco", "Atolinga", "Benito Juárez", "Calera", "Cañitas de Felipe Pescador", "Chalchihuites", "Concepción del Oro", "Cuauhtémoc", "El Plateado de Joaquín Amaro", "El Salvador", "Fresnillo", "Genaro Codina", "General Enrique Estrada", "General Francisco R. Murguía", "General Pánfilo Natera", "Guadalupe", "Huanusco", "Jalpa", "Jerez", "Jiménez del Teul", "Juan Aldama", "Juchipila", "Loreto", "Luis Moya", "Mazapil", "Melchor Ocampo", "Mezquital del Oro", "Miguel Auza", "Momax", "Monte Escobedo", "Morelos", "Moyahua de Estrada", "Nochistlán de Mejía", "Noria de Ángeles", "Ojocaliente", "Pánuco", "Pinos", "Río Grande", "Saín Alto", "Santa María de la Paz", "Sombrerete", "Susticacán", "Tabasco", "Tepechitlán", "Tepetongo", "Teúl de González Ortega", "Tlaltenango de Sánchez Román", "Trancoso", "Trinidad García de la Cadena", "Valparaíso", "Vetagrande", "Villa de Cos", "Villa García", "Villa González Ortega", "Villa Hidalgo ", "Villanueva", "Zacatecas" }));
        comboMunicipio.setToolTipText("Municipio del cliente");
        comboMunicipio.setNextFocusableComponent(btnAgregar);
        comboMunicipio.setPreferredSize(new java.awt.Dimension(240, 23));
        comboMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMunicipioKeyPressed(evt);
            }
        });

        cajaColonia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaColonia.setToolTipText("Clonia del cliente");
        cajaColonia.setNextFocusableComponent(comboMunicipio);
        cajaColonia.setPreferredSize(new java.awt.Dimension(240, 23));
        cajaColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaColoniaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaColoniaKeyTyped(evt);
            }
        });

        cajaCalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaCalle.setToolTipText("Calle del cliente");
        cajaCalle.setNextFocusableComponent(cajaColonia);
        cajaCalle.setPreferredSize(new java.awt.Dimension(240, 23));
        cajaCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaCalleKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCalleKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(cajaPApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaSApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaColonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboMunicipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaPApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaSApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaCalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaColonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboMunicipio, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaPApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            btnAgregar.doClick();
    }//GEN-LAST:event_cajaPApellidoKeyPressed

    private void cajaPApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPApellidoKeyTyped
        if (cajaPApellido.getText().length() == 45) 
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaPApellidoKeyTyped

    private void cajaSApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaSApellidoKeyPressed
        if(evt.getKeyCode() == 10)
            btnAgregar.doClick();
    }//GEN-LAST:event_cajaSApellidoKeyPressed

    private void cajaSApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaSApellidoKeyTyped
        if (cajaSApellido.getText().length() == 45) 
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaSApellidoKeyTyped

    private void cajaTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTelefonoKeyPressed
        if(evt.getKeyCode() == 10)
            btnAgregar.doClick();
    }//GEN-LAST:event_cajaTelefonoKeyPressed

    private void cajaTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTelefonoKeyTyped
        if (cajaTelefono.getText().length() == 10) 
            evt.consume();
        else
            soloNumeros(evt);
    }//GEN-LAST:event_cajaTelefonoKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(verificarEstadoComponentes()){
            cliente = new Cliente(0, cajaNombre.getText(), cajaPApellido.getText(), cajaSApellido.getText(), cajaTelefono.getText(), cajaCalle.getText(), cajaColonia.getText(), comboMunicipio.getSelectedItem().toString());

            if(CLIENTE_DAO.agregarCliente(cliente))
                this.dispose();
            else
                JOptionPane.showMessageDialog(null, "Error al agregar el Cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Aun existen campos vacios.", "Precaucion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Se perderan los datos no guardados\n¿Desea continuar?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            this.dispose(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cajaNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyPressed
        if(evt.getKeyCode() == 10 )
            btnAgregar.doClick();
    }//GEN-LAST:event_cajaNombreKeyPressed

    private void cajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyTyped
        if (cajaNombre.getText().length() == 45) 
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaNombreKeyTyped

    private void comboMunicipioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMunicipioKeyPressed
        if(evt.getKeyCode() == 10)
            btnAgregar.doClick();
    }//GEN-LAST:event_comboMunicipioKeyPressed

    private void cajaColoniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaColoniaKeyPressed
        if(evt.getKeyCode() == 10)
            btnAgregar.doClick();
    }//GEN-LAST:event_cajaColoniaKeyPressed

    private void cajaColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaColoniaKeyTyped
        if (cajaColonia.getText().length() == 45)
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaColoniaKeyTyped

    private void cajaCalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCalleKeyPressed
        if(evt.getKeyCode() == 10)
            btnAgregar.doClick();
    }//GEN-LAST:event_cajaCalleKeyPressed

    private void cajaCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCalleKeyTyped
        if (cajaCalle.getText().length() == 45)
            evt.consume();
        else
            sinCaracteresEspeciales(evt);
    }//GEN-LAST:event_cajaCalleKeyTyped

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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField cajaCalle;
    private javax.swing.JTextField cajaColonia;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPApellido;
    private javax.swing.JTextField cajaSApellido;
    private javax.swing.JTextField cajaTelefono;
    private javax.swing.JComboBox<String> comboMunicipio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private Cliente cliente;
    final static ClienteDAO CLIENTE_DAO = new ClienteDAO();
}