package categoria;

import controlador.CategoriaDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Categoria;

public class AgregarCategoria extends javax.swing.JDialog {

    public AgregarCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar categoria");
        setIconImage(null);
        setMaximumSize(new java.awt.Dimension(375, 235));
        setMinimumSize(new java.awt.Dimension(375, 235));
        setPreferredSize(new java.awt.Dimension(375, 235));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(370, 235));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 235));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Descripcion:");

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombre.setToolTipText("Nombre de la categoria");
        cajaNombre.setNextFocusableComponent(textAreaDescripcion);
        cajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombreKeyTyped(evt);
            }
        });

        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAreaDescripcion.setLineWrap(true);
        textAreaDescripcion.setRows(5);
        textAreaDescripcion.setToolTipText("Descripcion de la categoria");
        textAreaDescripcion.setWrapStyleWord(true);
        textAreaDescripcion.setNextFocusableComponent(btnAgregar);
        textAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAreaDescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaDescripcion);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add2.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Agregar la categoria");
        btnAgregar.setNextFocusableComponent(btnCancelar);
        btnAgregar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Descartar ingreso de la categoria");
        btnCancelar.setNextFocusableComponent(cajaNombre);
        btnCancelar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaNombre)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Se perderan los datos no guardados\n¿Desea continuar?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(verificarEstadoComponentes()){
            categoria = new Categoria(1, cajaNombre.getText(), textAreaDescripcion.getText());

            if(CATEGORIA_DAO.agregarCategoria(categoria))
                this.dispose();
            else
                JOptionPane.showMessageDialog(null, "Error al agregar la Categoria.", "Error", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Campo(s) vacio(s).", "Precaucion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void textAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescripcionKeyTyped
        if (textAreaDescripcion.getText().length() == 200)
            evt.consume();
    }//GEN-LAST:event_textAreaDescripcionKeyTyped

    private void textAreaDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescripcionKeyPressed
        if(evt.getKeyCode() == 10)
            btnAgregar.doClick();
    }//GEN-LAST:event_textAreaDescripcionKeyPressed

    private void cajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyTyped
        if (cajaNombre.getText().length() == 45)
            evt.consume();
        else
            soloLetras(evt);
    }//GEN-LAST:event_cajaNombreKeyTyped

    private void cajaNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyPressed
        if(evt.getKeyCode() == 10 )
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaDescripcion;
    // End of variables declaration//GEN-END:variables
    private Categoria categoria;
    final static CategoriaDAO CATEGORIA_DAO = new CategoriaDAO();
}