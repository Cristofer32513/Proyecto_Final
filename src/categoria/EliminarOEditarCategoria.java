package categoria;

import controlador.CategoriaDAO;
import modelo.Categoria;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class EliminarOEditarCategoria extends javax.swing.JDialog {

    public EliminarOEditarCategoria(java.awt.Frame proveedor, boolean modal, int id, String nombre, String descripcion) {
        super(proveedor, modal);
        initComponents();
        setLocationRelativeTo(null);
        cajaIdCategoria.setText(String.valueOf(id));
        cajaNombre.setText(nombre);
        textAreaDescripcion.setText(descripcion);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        cajaIdCategoria = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar o editar categoria");
        setMaximumSize(new java.awt.Dimension(460, 265));
        setMinimumSize(new java.awt.Dimension(460, 265));
        setPreferredSize(new java.awt.Dimension(460, 265));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(452, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(452, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(452, 200));

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnEditar.setText("Actualizar");
        btnEditar.setToolTipText("Editar categoria");
        btnEditar.setNextFocusableComponent(btnEliminar);
        btnEditar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar accion");
        btnCancelar.setNextFocusableComponent(cajaNombre);
        btnCancelar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Descripcion:");

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombre.setToolTipText("Nombre de la categoria");
        cajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombreKeyTyped(evt);
            }
        });

        jScrollPane1.setMaximumSize(new java.awt.Dimension(200, 85));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 85));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 85));

        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAreaDescripcion.setLineWrap(true);
        textAreaDescripcion.setRows(5);
        textAreaDescripcion.setToolTipText("Descripcion de la categoria");
        textAreaDescripcion.setWrapStyleWord(true);
        textAreaDescripcion.setNextFocusableComponent(btnEditar);
        textAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaDescripcion);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("id Categoria:");

        cajaIdCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaIdCategoria.setToolTipText("Id de la categoria");
        cajaIdCategoria.setEnabled(false);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar categoria");
        btnEliminar.setNextFocusableComponent(btnCancelar);
        btnEliminar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(cajaIdCategoria)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cajaIdCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(verificarEstadoComponentes()){
            categoria = new Categoria(Integer.parseInt(cajaIdCategoria.getText()), cajaNombre.getText(), textAreaDescripcion.getText());

            if(CATEGORIA_DAO.modificarCategoria(categoria))
                this.dispose();
            else
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos de la Categoria.", "Error", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Campo(s) vacio(s).", "Precaucion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Se perderan los datos no guardados\n¿Desea continuar?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(CATEGORIA_DAO.eliminarCategoria(Integer.parseInt(cajaIdCategoria.getText())))
            this.dispose();
        else
            JOptionPane.showMessageDialog(null, "Error al elimnar la Categoria.", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void textAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescripcionKeyTyped
        if (textAreaDescripcion.getText().length() == 200)
            evt.consume();
    }//GEN-LAST:event_textAreaDescripcionKeyTyped

    private void textAreaDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescripcionKeyPressed
        if(evt.getKeyCode() == 10)
            btnEditar.doClick();
    }//GEN-LAST:event_textAreaDescripcionKeyPressed

    private void cajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyTyped
        if (cajaNombre.getText().length() == 45)
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaNombreKeyTyped

    private void cajaNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyPressed
        if(evt.getKeyCode() == 10)
            transferFocus();
    }//GEN-LAST:event_cajaNombreKeyPressed

    private void soloLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if( (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_PERIOD)
            evt.consume();
    }
    
    private boolean verificarEstadoComponentes(){
        boolean bandera = true;

        if(cajaNombre.getText().trim().equals(""))
            bandera = false;
        if(textAreaDescripcion.getText().trim().equals(""))
            bandera = false;
        
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField cajaIdCategoria;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaDescripcion;
    // End of variables declaration//GEN-END:variables
    private Categoria categoria;
    final static CategoriaDAO CATEGORIA_DAO = new CategoriaDAO();
}