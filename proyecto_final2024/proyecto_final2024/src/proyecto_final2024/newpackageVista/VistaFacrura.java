/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageVista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class VistaFacrura extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaFacrura
     */
    public VistaFacrura() {
        initComponents();
    }

    public JButton getBtnanadir() {
        return btnanadir;
    }

    public JButton getBtnAceptarFacturaBuscada() {
        return btnAceptarFacturaBuscada;
    }

    public JButton getBtnAceptarbCLIENTE() {
        return btnAceptarbCLIENTE;
    }

    public JButton getBtnaceptarProductos() {
        return btnaceptarProductos;
    }

    public JButton getBtnanular() {
        return btnanular;
    }

    public JButton getBtnbuscarFactura() {
        return btnbuscarFactura;
    }

    public JButton getBtnbuscarcliente() {
        return btnbuscarcliente;
    }

    public JButton getBtncancelar() {
        return btncancelar;
    }

    public JButton getBtnguardar() {
        return btnguardar;
    }

    public JButton getBtnimprimir() {
        return btnimprimir;
    }


    public JDialog getjDialogClientes() {
        return jDialogClientes;
    }

    public JDialog getjDialogFacturas() {
        return jDialogFacturas;
    }

    public JDialog getjDialogProductos() {
        return jDialogProductos;
    }


    public JButton getQuitar() {
        return quitar;
    }

    public JTable getTbClientes() {
        return tbClientes;
    }

    public JTable getTbFacturabuscada() {
        return tbFacturabuscada;
    }

    public JTable getTbProductos() {
        return tbProductos;
    }

    public JTable getTbdetallefactura() {
        return tbdetallefactura;
    }

    public JLabel getLblEstado() {
        return lblEstado;
    }

    public JDateChooser getDtFecha() {
        return dtFecha;
    }

    public JButton getBtnBuscarFactura() {
        return btnBuscarFactura;
    }

    public JButton getBtnListacompleta() {
        return btnListacompleta;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JDateChooser getFechaDesde() {
        return fechaDesde;
    }

    public JDateChooser getFechahasta() {
        return fechahasta;
    }

    
    public JTextField getTxtTotal() {
        return txtTotal;
    }

    public JTextField getTxtapellidocliente() {
        return txtapellidocliente;
    }

    public JTextField getTxtcantidadproducto() {
        return txtcantidadproducto;
    }

    public JTextField getTxtcedulacliente() {
        return txtcedulacliente;
    }

    public JLabel getTxtcodigoAdmin() {
        return txtcodigoAdmin;
    }

    public JTextField getTxtcodigoFactura() {
        return txtcodigoFactura;
    }

    public JTextField getTxtcodigocliente() {
        return txtcodigocliente;
    }

    public JTextField getTxtcodigoproducto() {
        return txtcodigoproducto;
    }


    public JTextField getTxtfiltrarProducto() {
        return txtfiltrarProducto;
    }

    public JTextField getTxtfiltroClientes() {
        return txtfiltroClientes;
    }

    public JTextField getTxtiva() {
        return txtiva;
    }

    public JLabel getTxtnombreAdmin() {
        return txtnombreAdmin;
    }

    public JTextField getTxtnombrecliente() {
        return txtnombrecliente;
    }

    public JLabel getLblNombreProducto() {
        return lblNombreProducto;
    }

    public JButton getBtnAbrirProductos() {
        return btnAbrirProductos;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogClientes = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        txtfiltroClientes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btnAceptarbCLIENTE = new javax.swing.JButton();
        jDialogProductos = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        txtfiltrarProducto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnaceptarProductos = new javax.swing.JButton();
        jDialogFacturas = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbFacturabuscada = new javax.swing.JTable();
        btnAceptarFacturaBuscada = new javax.swing.JButton();
        btnBuscarFactura = new javax.swing.JButton();
        btnListacompleta = new javax.swing.JButton();
        fechaDesde = new com.toedter.calendar.JDateChooser();
        fechahasta = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        txtcodigoAdmin = new javax.swing.JLabel();
        txtnombreAdmin = new javax.swing.JLabel();
        txtcodigoFactura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dtFecha = new com.toedter.calendar.JDateChooser();
        lbl = new javax.swing.JLabel();
        txtcodigoAdmin1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigocliente = new javax.swing.JTextField();
        txtnombrecliente = new javax.swing.JTextField();
        txtapellidocliente = new javax.swing.JTextField();
        txtcedulacliente = new javax.swing.JTextField();
        btnbuscarcliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtcodigoproducto = new javax.swing.JTextField();
        lblNombreProducto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcantidadproducto = new javax.swing.JTextField();
        btnanadir = new javax.swing.JButton();
        quitar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdetallefactura = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        btnanular = new javax.swing.JButton();
        btnbuscarFactura = new javax.swing.JButton();
        btnAbrirProductos = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buscar cliente:");

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Cedula"
            }
        ));
        jScrollPane1.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setMinWidth(50);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbClientes.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnAceptarbCLIENTE.setText("Aceptar");

        javax.swing.GroupLayout jDialogClientesLayout = new javax.swing.GroupLayout(jDialogClientes.getContentPane());
        jDialogClientes.getContentPane().setLayout(jDialogClientesLayout);
        jDialogClientesLayout.setHorizontalGroup(
            jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogClientesLayout.createSequentialGroup()
                .addGroup(jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialogClientesLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfiltroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDialogClientesLayout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(btnAceptarbCLIENTE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jDialogClientesLayout.setVerticalGroup(
            jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtfiltroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptarbCLIENTE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Productos");

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Precio"
            }
        ));
        jScrollPane3.setViewportView(tbProductos);
        if (tbProductos.getColumnModel().getColumnCount() > 0) {
            tbProductos.getColumnModel().getColumn(0).setMinWidth(50);
            tbProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbProductos.getColumnModel().getColumn(0).setMaxWidth(50);
            tbProductos.getColumnModel().getColumn(2).setMinWidth(50);
            tbProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbProductos.getColumnModel().getColumn(2).setMaxWidth(50);
            tbProductos.getColumnModel().getColumn(3).setMinWidth(50);
            tbProductos.getColumnModel().getColumn(3).setPreferredWidth(50);
            tbProductos.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        btnaceptarProductos.setText("Aceptar");

        javax.swing.GroupLayout jDialogProductosLayout = new javax.swing.GroupLayout(jDialogProductos.getContentPane());
        jDialogProductos.getContentPane().setLayout(jDialogProductosLayout);
        jDialogProductosLayout.setHorizontalGroup(
            jDialogProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogProductosLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfiltrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDialogProductosLayout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jDialogProductosLayout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(btnaceptarProductos)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jDialogProductosLayout.setVerticalGroup(
            jDialogProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtfiltrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnaceptarProductos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setText("Fecha desde");

        jLabel17.setText("Fecha hasta");

        tbFacturabuscada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Numero", "Fecha", "Estado", "Codigo cliente", "nombre", "apellido", "cedula"
            }
        ));
        jScrollPane4.setViewportView(tbFacturabuscada);

        btnAceptarFacturaBuscada.setText("Aceptar");

        btnBuscarFactura.setText("Buscar");

        btnListacompleta.setText("Lista completa");

        javax.swing.GroupLayout jDialogFacturasLayout = new javax.swing.GroupLayout(jDialogFacturas.getContentPane());
        jDialogFacturas.getContentPane().setLayout(jDialogFacturasLayout);
        jDialogFacturasLayout.setHorizontalGroup(
            jDialogFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogFacturasLayout.createSequentialGroup()
                .addGroup(jDialogFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogFacturasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(jDialogFacturasLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechahasta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarFactura)
                        .addGap(54, 54, 54)
                        .addComponent(btnListacompleta)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDialogFacturasLayout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(btnAceptarFacturaBuscada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogFacturasLayout.setVerticalGroup(
            jDialogFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogFacturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)
                        .addComponent(btnBuscarFactura)
                        .addComponent(btnListacompleta))
                    .addComponent(fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechahasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptarFacturaBuscada)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtcodigoAdmin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtcodigoAdmin.setText("1");

        txtnombreAdmin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtnombreAdmin.setText("Usuario");

        txtcodigoFactura.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("FECHA :");

        lblEstado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEstado.setText("PENDIENTE");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("ID FACTURA :");

        lbl.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl.setText("USUARIO :");

        txtcodigoAdmin1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtcodigoAdmin1.setText("CODIGO :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(lblEstado)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtcodigoAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(dtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblEstado)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreAdmin)
                    .addComponent(txtcodigoAdmin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl)
                    .addComponent(txtcodigoAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 530, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("CODIGO :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 14, 60, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 53, 70, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("APELLIDO :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 70, -1));

        jLabel4.setText("CEDULA :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 60, -1));

        txtcodigocliente.setEnabled(false);
        jPanel2.add(txtcodigocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 84, -1));

        txtnombrecliente.setEnabled(false);
        jPanel2.add(txtnombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 84, -1));

        txtapellidocliente.setEnabled(false);
        jPanel2.add(txtapellidocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 84, -1));

        txtcedulacliente.setEnabled(false);
        jPanel2.add(txtcedulacliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 84, -1));

        btnbuscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar (6).png"))); // NOI18N
        btnbuscarcliente.setBorder(null);
        jPanel2.add(btnbuscarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 880, 110));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("PRODUCTO");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));
        jPanel3.add(txtcodigoproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 136, -1));

        lblNombreProducto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblNombreProducto.setText("Nombre Producto");
        jPanel3.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 150, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("CANTIDAD");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 70, 20));
        jPanel3.add(txtcantidadproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 73, -1));

        btnanadir.setText("+");
        jPanel3.add(btnanadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        quitar.setText("-");
        jPanel3.add(quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        tbdetallefactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Nombre", "Precio", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tbdetallefactura);
        if (tbdetallefactura.getColumnModel().getColumnCount() > 0) {
            tbdetallefactura.getColumnModel().getColumn(0).setMinWidth(50);
            tbdetallefactura.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbdetallefactura.getColumnModel().getColumn(0).setMaxWidth(50);
            tbdetallefactura.getColumnModel().getColumn(2).setMinWidth(70);
            tbdetallefactura.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbdetallefactura.getColumnModel().getColumn(2).setMaxWidth(70);
            tbdetallefactura.getColumnModel().getColumn(3).setMinWidth(70);
            tbdetallefactura.getColumnModel().getColumn(3).setPreferredWidth(70);
            tbdetallefactura.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1380, 130));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Iva 12%");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, 30));

        txtiva.setEnabled(false);
        jPanel3.add(txtiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("TOTAL :");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, 30));

        txtTotal.setEnabled(false);
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, 30));

        btnguardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        jPanel3.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        btnimprimir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnimprimir.setText("Imprimir");
        jPanel3.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, 30));

        btnanular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnanular.setText("Anular");
        jPanel3.add(btnanular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 30));

        btnbuscarFactura.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnbuscarFactura.setText("Buscar");
        jPanel3.add(btnbuscarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, 30));

        btnAbrirProductos.setText("Abrir lista de productos");
        jPanel3.add(btnAbrirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 20));

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion (2).png"))); // NOI18N
        jPanel3.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 220, -1, 40));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        jPanel3.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1410, 300));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1350, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirProductos;
    private javax.swing.JButton btnAceptarFacturaBuscada;
    private javax.swing.JButton btnAceptarbCLIENTE;
    private javax.swing.JButton btnBuscarFactura;
    private javax.swing.JButton btnListacompleta;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnaceptarProductos;
    private javax.swing.JButton btnanadir;
    private javax.swing.JButton btnanular;
    private javax.swing.JButton btnbuscarFactura;
    private javax.swing.JButton btnbuscarcliente;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnimprimir;
    private com.toedter.calendar.JDateChooser dtFecha;
    private com.toedter.calendar.JDateChooser fechaDesde;
    private com.toedter.calendar.JDateChooser fechahasta;
    private javax.swing.JDialog jDialogClientes;
    private javax.swing.JDialog jDialogFacturas;
    private javax.swing.JDialog jDialogProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JButton quitar;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbFacturabuscada;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTable tbdetallefactura;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtapellidocliente;
    private javax.swing.JTextField txtcantidadproducto;
    private javax.swing.JTextField txtcedulacliente;
    private javax.swing.JLabel txtcodigoAdmin;
    private javax.swing.JLabel txtcodigoAdmin1;
    private javax.swing.JTextField txtcodigoFactura;
    private javax.swing.JTextField txtcodigocliente;
    private javax.swing.JTextField txtcodigoproducto;
    private javax.swing.JTextField txtfiltrarProducto;
    private javax.swing.JTextField txtfiltroClientes;
    private javax.swing.JTextField txtiva;
    private javax.swing.JLabel txtnombreAdmin;
    private javax.swing.JTextField txtnombrecliente;
    // End of variables declaration//GEN-END:variables
}
