
package vista;

import controlador.UsuarioDAO;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.JPlaceholderPasswordField;
import modelo.JPlaceholderTextField;
import modelo.Usuario;

public class Login_Usuario extends javax.swing.JFrame {

    public Login_Usuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /*
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaUsuario = new javax.swing.JTextField();
        cajaPass = new javax.swing.JPasswordField();
        imagen = new javax.swing.JLabel();
        imageUser = new javax.swing.JLabel();
        imagePass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        cajaUsuario.setBackground(new java.awt.Color(240, 240, 240));
        cajaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaUsuario.setToolTipText("");
        cajaUsuario.setNextFocusableComponent(cajaPass);
        cajaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaUsuarioKeyReleased(evt);
            }
        });

        cajaPass.setBackground(new java.awt.Color(240, 240, 240));
        cajaPass.setMaximumSize(new java.awt.Dimension(200, 30));
        cajaPass.setMinimumSize(new java.awt.Dimension(200, 30));
        cajaPass.setNextFocusableComponent(cajaUsuario);
        cajaPass.setPreferredSize(new java.awt.Dimension(200, 30));
        cajaPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaPassKeyPressed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N

        imageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contact.png"))); // NOI18N

        imagePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageUser)
                    .addComponent(imagePass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(imagen))
                    .addComponent(cajaUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePass))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    */
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaUsuario = new JPlaceholderTextField("Usuario...");
        cajaPass = new JPlaceholderPasswordField("Contraseña...");
        imagen = new javax.swing.JLabel();
        imageUser = new javax.swing.JLabel();
        imagePass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        cajaUsuario.setBackground(new java.awt.Color(240, 240, 240));
        cajaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaUsuario.setToolTipText("");
        cajaUsuario.setNextFocusableComponent(cajaPass);
        cajaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cajaUsuarioKeyReleased(evt);
            }
        });

        cajaPass.setBackground(new java.awt.Color(240, 240, 240));
        cajaPass.setMaximumSize(new java.awt.Dimension(200, 30));
        cajaPass.setMinimumSize(new java.awt.Dimension(200, 30));
        cajaPass.setNextFocusableComponent(cajaUsuario);
        cajaPass.setPreferredSize(new java.awt.Dimension(200, 30));
        cajaPass.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaPassKeyPressed(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N

        imageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contact.png"))); // NOI18N

        imagePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageUser)
                    .addComponent(imagePass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(imagen))
                    .addComponent(cajaUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagePass))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>
    
    private void cajaPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaPassKeyPressed
        if(evt.getKeyCode() == 10)
            entrar();
    }//GEN-LAST:event_cajaPassKeyPressed

    private void cajaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaUsuarioKeyReleased
        if(evt.getKeyCode() == 10)
            cajaUsuario.transferFocus();
    }//GEN-LAST:event_cajaUsuarioKeyReleased

    private void entrar () {
        user = cajaUsuario.getText();
        if(verificarEstadoComponentes()) {
             usua = USUARIO_DAO.buscarUsuario(user, pass);
            if(usua != null){
                
                if(usua.getUsuario().equals("Admin")){
                    System.out.println("ventana administradora");
                }
                else{
                    System.out.println("ventana empleado");
                    SwingUtilities.invokeLater(() -> {
                        new Prueba().setVisible(true);
                    });
                }   
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Usuario y/o contraseña incorrecta.", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Aun existen campos vacios.", "Cuidado!!!", JOptionPane.WARNING_MESSAGE);
    }    
    
    public boolean verificarEstadoComponentes() {
        boolean bandera = true;

        if(cajaUsuario.getText().equals("Usuario..."))
            bandera = false;
        pass = new String(cajaPass.getPassword());
        if(pass.equals(""))
            bandera = false;

        return bandera;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        SwingUtilities.invokeLater(() -> {
            new Login_Usuario().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cajaPass;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel imagePass;
    private javax.swing.JLabel imageUser;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    String user = "";
    String pass = "";
    Usuario usua = null;
    final static UsuarioDAO USUARIO_DAO = new UsuarioDAO();
}