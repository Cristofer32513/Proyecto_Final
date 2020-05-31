package venta;

import controlador.ProductoDAO;
import controlador.VentaDAO;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Venta;

public class AgregarVenta extends javax.swing.JDialog {

    public AgregarVenta(java.awt.Frame parent, boolean modal, int idEm) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.idEmp = idEm;
        this.id = 0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaNombreCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaidCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cajanombreProducto = new javax.swing.JTextField();
        cajaIdProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        spinnerCantidad = new javax.swing.JSpinner();
        btnBuscarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Producto");
        setMaximumSize(new java.awt.Dimension(490, 247));
        setMinimumSize(new java.awt.Dimension(490, 247));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(490, 245));
        jPanel1.setMinimumSize(new java.awt.Dimension(490, 245));

        cajaNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaNombreCliente.setToolTipText("Nombre del cliente");
        cajaNombreCliente.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("id Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nombre Cliente:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("id Producto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Nombre Producto:");

        cajaidCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaidCliente.setToolTipText("Id del cliente");
        cajaidCliente.setEnabled(false);
        cajaidCliente.setNextFocusableComponent(cajaNombreCliente);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Cantidad:");

        cajanombreProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajanombreProducto.setToolTipText("Nombre del producto");
        cajanombreProducto.setEnabled(false);

        cajaIdProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaIdProducto.setToolTipText("Id del producto");
        cajaIdProducto.setEnabled(false);

        btnBuscarProducto.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarProducto.setToolTipText("Buscar producto");
        btnBuscarProducto.setNextFocusableComponent(spinnerCantidad);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        spinnerCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
        spinnerCantidad.setToolTipText("Cantidad a comprar");
        spinnerCantidad.setMinimumSize(new java.awt.Dimension(95, 23));
        spinnerCantidad.setNextFocusableComponent(btnAgregar);

        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarCliente.setToolTipText("Buscar cliente");
        btnBuscarCliente.setNextFocusableComponent(btnBuscarProducto);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Descartar venta");
        btnCancelar.setNextFocusableComponent(btnBuscarCliente);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add2.png"))); // NOI18N
        btnAgregar.setText("Registrar");
        btnAgregar.setToolTipText("Registrar venta");
        btnAgregar.setNextFocusableComponent(btnCancelar);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(cajanombreProducto)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cajaidCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cajaNombreCliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cajaIdProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(60, 60, 60)
                        .addComponent(btnCancelar)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cajaidCliente)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaNombreCliente)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajaIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajanombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(verificarEstadoComponentes()){
            venta = new Venta(id, idEmp, Integer.parseInt(cajaidCliente.getText()), cajaNombreCliente.getText(), Integer.parseInt(cajaIdProducto.getText()), cajanombreProducto.getText(), (int)spinnerCantidad.getValue());
            if(VENTA_DAO.agregarVenta(venta)){
                VENTA_DAO.agregarTiene(venta.getIdProducto());
                VENTA_DAO.agregarEfectua(venta.getIdEmpleado());
                VENTA_DAO.agregarRealiza(venta.getIdCliente());
                JOptionPane.showMessageDialog(null, "Venta registrada correctamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else
                JOptionPane.showMessageDialog(null, "Error al registrar la Venta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Campo(s) vacio(s).", "Precaucion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Se perderan los datos no guardados\n¿Desea continuar?", "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            this.dispose(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        ConsultarProducto consultar = new ConsultarProducto(null, true);
        consultar.setVisible(true);
        cajaIdProducto.setText(String.valueOf(consultar.id));
        cajanombreProducto.setText(consultar.nombre);
        Producto prod;
        prod = PRODUCTODAO.buscarProducto(cajaIdProducto.getText());
        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, prod.getStock(), 1));
        consultar.dispose();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        ConsultarCliente consultar = new ConsultarCliente(null, true);
        consultar.setVisible(true);
        cajaidCliente.setText(String.valueOf(consultar.id));
        cajaNombreCliente.setText(consultar.nombre);
        consultar.dispose();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    public boolean verificarEstadoComponentes(){
        boolean bandera = true;

        if(cajaidCliente.getText().trim().equals(""))
            bandera = false;
        if(cajaNombreCliente.getText().trim().equals(""))
            bandera = false;
        if(cajaIdProducto.getText().trim().equals(""))
            bandera = false;
        if(cajanombreProducto.getText().trim().equals(""))
            bandera = false;
        if((int)spinnerCantidad.getValue() == 0)
            bandera = false;
        
        return bandera;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField cajaIdProducto;
    private javax.swing.JTextField cajaNombreCliente;
    private javax.swing.JTextField cajaidCliente;
    private javax.swing.JTextField cajanombreProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spinnerCantidad;
    // End of variables declaration//GEN-END:variables
    private Venta venta;
    private int id, idEmp=0;
    final static VentaDAO VENTA_DAO = new VentaDAO();
    final static ProductoDAO PRODUCTODAO = new ProductoDAO();
}