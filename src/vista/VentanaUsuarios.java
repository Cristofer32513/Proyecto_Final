/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import categoria.Categoria;
import cliente.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/*import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;*/
import conexionBD.Conexion;
import controlador.ProductoDAO;
import empleado.Empleado;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import login.Login;
import venta.Venta;
import producto.ReporteProductos;
import producto.Producto;
import proveedor.Proveedor;

/**
 *
 * @author casas
 */
public class VentanaUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public VentanaUsuarios() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public VentanaUsuarios(int id) {
        initComponents();
        setLocationRelativeTo(null);      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnReporteTabla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnreporte = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnGrafica = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(815, 460));

        jToolBar1.setRollover(true);

        btnReporteTabla.setText("Ver Productos");
        btnReporteTabla.setFocusable(false);
        btnReporteTabla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteTabla.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteTablaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnReporteTabla);

        jPanel2.setPreferredSize(new java.awt.Dimension(25, 48));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel2);

        btnreporte.setText("Generar Reporte");
        btnreporte.setFocusable(false);
        btnreporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnreporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnreporte);

        jPanel3.setPreferredSize(new java.awt.Dimension(25, 48));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel3);

        btnGrafica.setText("Generar Grafica");
        btnGrafica.setFocusable(false);
        btnGrafica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrafica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGrafica);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jToolBar1.add(jPanel1);

        btnExit.setText("Salir");
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Proveedores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Categorias");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Productos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Ventas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pane.setMaximumSize(new java.awt.Dimension(880, 400));
        pane.setMinimumSize(new java.awt.Dimension(880, 400));
        pane.setPreferredSize(new java.awt.Dimension(880, 400));

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings({"Convert2Lambda", "SuspiciousIndentAfterControlStatement"})
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Esta seguro de que desea salir?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            this.dispose();
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Login_Usuario().setVisible(true);
                }
            });
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReporteTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteTablaActionPerformed
        describir = new ReporteProductos(null, true);
        describir.setVisible(true);
    }//GEN-LAST:event_btnReporteTablaActionPerformed

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        /*Conexion con = Conexion.getConexion();
        con.abrirConexion();
        try {
            @SuppressWarnings("UnusedAssignment")
            JasperReport reporte = null;
            String path = "src\\main\\java\\reportes\\reporte.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            @SuppressWarnings("static-access")
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, con.conexion);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(VentanaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btnreporteActionPerformed

    private void btnGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficaActionPerformed
        /*ProductoDAO prod = new ProductoDAO();
        prod.generarGrafico();*/
    }//GEN-LAST:event_btnGraficaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente cliente = new Cliente();
        cliente.setLocation(0,0);
        cliente.setSize(800, 400);
        pane.removeAll();  
        pane.add(cliente, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Proveedor prov = new Proveedor();
        prov.setLocation(0,0);
        prov.setSize(800, 400);
        pane.removeAll();
        pane.add(prov, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Categoria categoria = new Categoria();
        categoria.setLocation(0,0);
        categoria.setSize(800, 400);
        pane.removeAll();
        pane.add(categoria, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Producto prod = new Producto();
        prod.setLocation(0,0);
        prod.setSize(800, 400);
        pane.removeAll();
        pane.add(prod, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Venta venta = new Venta();
        venta.setLocation(0,0);
        venta.setSize(800, 400);
        pane.removeAll();
        pane.add(venta, BorderLayout.CENTER);
        pane.revalidate();
        pane.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void miEvento(javax.swing.event.ChangeEvent evt){
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGrafica;
    private javax.swing.JButton btnReporteTabla;
    private javax.swing.JButton btnreporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pane;
    // End of variables declaration//GEN-END:variables
    private ReporteProductos describir;
    private int id;
}
