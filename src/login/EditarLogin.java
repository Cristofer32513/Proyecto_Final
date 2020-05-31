package login;

import controlador.UsuarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class EditarLogin extends javax.swing.JDialog {

    public EditarLogin(java.awt.Frame proveedor, boolean modal, int id, String usuario, String contraseña) {
        super(proveedor, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.id = id;
        cajaUsuario.setText(usuario);
        CajaPassword.setText(contraseña);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cajaUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CajaPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar login");
        setMaximumSize(new java.awt.Dimension(385, 170));
        setMinimumSize(new java.awt.Dimension(385, 170));
        setPreferredSize(new java.awt.Dimension(385, 170));

        jPanel1.setMaximumSize(new java.awt.Dimension(370, 130));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 130));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 130));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnGuardar.setText("Actualizar");
        btnGuardar.setToolTipText("Actualiza el registro con los nuevos datos");
        btnGuardar.setNextFocusableComponent(btnCancelar);
        btnGuardar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Descartar accion");
        btnCancelar.setNextFocusableComponent(cajaUsuario);
        btnCancelar.setPreferredSize(new java.awt.Dimension(140, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cajaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaUsuario.setToolTipText("Nombre  del usuario");
        cajaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaUsuarioKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña:");

        CajaPassword.setToolTipText("Contraseña");
        CajaPassword.setPreferredSize(new java.awt.Dimension(111, 22));
        CajaPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CajaPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaUsuario)
                    .addComponent(CajaPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CajaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(verificarEstadoComponentes()){
            usuario = new Usuario(id, cajaUsuario.getText(), new String(CajaPassword.getPassword()));

            if(USUARIO_DAO.modificarUsuario(usuario))
                this.dispose();
            else
                JOptionPane.showMessageDialog(null, "Error al actulizar el Login del Empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Campo(s) vacio(s).", "Precaucion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cajaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaUsuarioKeyPressed
        if(evt.getKeyCode() == 10)
            btnGuardar.doClick();
    }//GEN-LAST:event_cajaUsuarioKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Se perderan los datos no guardados\n¿Desea continuar?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            this.dispose(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cajaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaUsuarioKeyTyped
        if (cajaUsuario.getText().length() == 45) 
            evt.consume();
        else
            sinCaracteresEspeciales(evt);
    }//GEN-LAST:event_cajaUsuarioKeyTyped

    private void CajaPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaPasswordKeyPressed
        if(evt.getKeyCode() == 10)
            btnGuardar.doClick();
    }//GEN-LAST:event_CajaPasswordKeyPressed

    private void CajaPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaPasswordKeyTyped
        if (new String(CajaPassword.getPassword()).length() == 45) 
            evt.consume();
        else
            sinCaracteresEspeciales(evt);
    }//GEN-LAST:event_CajaPasswordKeyTyped

    private void sinCaracteresEspeciales(KeyEvent evt) {
        char c = evt.getKeyChar();
        if( (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') )
            evt.consume();
    }
    
    private boolean verificarEstadoComponentes(){
        boolean bandera = true;

        if(cajaUsuario.getText().trim().equals(""))
            bandera = false;
        if(new String(CajaPassword.getPassword()).trim().equals(""))
            bandera = false;

        return bandera;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CajaPassword;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private int id;
    private Usuario usuario;
    final static UsuarioDAO USUARIO_DAO = new UsuarioDAO();
}