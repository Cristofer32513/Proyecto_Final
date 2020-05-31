package vista;

import categoria.Categoria;
import cliente.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import conexionBD.Conexion;
import java.awt.BorderLayout;
import venta.Venta;
import producto.ReporteProductos;
import producto.Producto;
import proveedor.Proveedor;

public class VentanaUsuarios extends javax.swing.JFrame {
    
    public VentanaUsuarios(int id) {
        initComponents();
        setLocationRelativeTo(null);
        this.id = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        BtnCategorias = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnVentas1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pane = new javax.swing.JPanel();
        bienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(971, 400));
        setMinimumSize(new java.awt.Dimension(971, 400));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        btnClientes.setBackground(new java.awt.Color(51, 51, 51));
        btnClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setPreferredSize(new java.awt.Dimension(115, 35));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedores.setBackground(new java.awt.Color(51, 51, 51));
        btnProveedores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedores.png"))); // NOI18N
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedores.setPreferredSize(new java.awt.Dimension(115, 35));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        BtnCategorias.setBackground(new java.awt.Color(51, 51, 51));
        BtnCategorias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categorias.png"))); // NOI18N
        BtnCategorias.setText("CATEGORIAS");
        BtnCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnCategorias.setPreferredSize(new java.awt.Dimension(115, 35));
        BtnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCategoriasActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(51, 51, 51));
        btnProductos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductos.setPreferredSize(new java.awt.Dimension(115, 35));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(51, 51, 51));
        btnVentas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.setPreferredSize(new java.awt.Dimension(115, 35));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Designed by Cristofer");

        btnInicio.setBackground(new java.awt.Color(51, 51, 51));
        btnInicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setPreferredSize(new java.awt.Dimension(115, 35));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnVentas1.setBackground(new java.awt.Color(51, 51, 51));
        btnVentas1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnVentas1.setText("SALIR");
        btnVentas1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas1.setPreferredSize(new java.awt.Dimension(115, 35));
        btnVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas1ActionPerformed(evt);
            }
        });

        jButton1.setText("reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pane.setMaximumSize(new java.awt.Dimension(880, 400));
        pane.setMinimumSize(new java.awt.Dimension(880, 400));
        pane.setPreferredSize(new java.awt.Dimension(880, 400));

        bienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bienvenido.png"))); // NOI18N

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLayout.createSequentialGroup()
                .addComponent(bienvenido)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Cliente cliente = new Cliente();
        cliente.setLocation(0,0);
        cliente.setSize(800, 400);
        pane.removeAll();  
        pane.add(cliente, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Proveedor prov = new Proveedor();
        prov.setLocation(0,0);
        prov.setSize(800, 400);
        pane.removeAll();
        pane.add(prov, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void BtnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCategoriasActionPerformed
        Categoria categoria = new Categoria();
        categoria.setLocation(0,0);
        categoria.setSize(800, 400);
        pane.removeAll();
        pane.add(categoria, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_BtnCategoriasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Producto prod = new Producto();
        prod.setLocation(0,0);
        prod.setSize(800, 400);
        pane.removeAll();
        pane.add(prod, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Venta venta = new Venta(this.id);
        venta.setLocation(0,0);
        venta.setSize(800, 400);
        pane.removeAll();
        pane.add(venta, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        pane.removeAll();
        pane.add(bienvenido, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas1ActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Esta seguro de que desea salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.dispose();
            SwingUtilities.invokeLater(() -> {
                new Login_Usuario().setVisible(true);
            });
        }
    }//GEN-LAST:event_btnVentas1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conexion con = Conexion.getConexion();
        con.abrirConexion();
        try {
            @SuppressWarnings("UnusedAssignment")
            JasperReport reporte = null;
            String path = "src\\reportes\\reporte.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            @SuppressWarnings("static-access")
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con.conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(VentanaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCategorias;
    private javax.swing.JLabel bienvenido;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnVentas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel pane;
    // End of variables declaration//GEN-END:variables
    private ReporteProductos describir;
    private int id;
}
