/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageVista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

/**
 *
 * @author USER
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        
        
      //codigo para el icono    
        setIconImage(getIconImage());
    }
    
    @Override
    public Image getIconImage() {
        
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("logo/lg.png"));
    
    return retValue;
    }

    public JButton getBtnProveedores() {
        return btnProveedores;
    }

    public JDesktopPane getDktPrincipal() {
        return dktPrincipal;
    }

    public JButton getBtnAdmin() {
        return btnAdmin;
    }

    public JButton getBtnCategoria() {
        return btnCategoria;
    }

    public JButton getBtnEmpresa() {
        return btnEmpresa;
    }

    public JButton getBtnProducos() {
        return btnProducos;
    }

    public JButton getBtnFactura() {
        return btnFactura;
    }

    public JButton getBtnCliente() {
        return btnCliente;
    }

    public JMenuItem getMnReporte() {
        return mnReporte;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProveedores = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnProducos = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        dktPrincipal = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProveedores.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/conexion.png"))); // NOI18N
        btnProveedores.setText("Proveedor");
        btnProveedores.setToolTipText("Ventana de proveedores");
        btnProveedores.setFocusable(false);
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        btnAdmin.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/blogger.png"))); // NOI18N
        btnAdmin.setText("Administrador");
        btnAdmin.setToolTipText("Ventana de administradores");
        btnAdmin.setFocusable(false);
        btnAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, 40));

        btnProducos.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnProducos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/caja.png"))); // NOI18N
        btnProducos.setText("Productos");
        btnProducos.setToolTipText("Ventana de componentes de carros");
        btnProducos.setFocusable(false);
        btnProducos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProducos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnProducos, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        btnCliente.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/grupo.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setToolTipText("Ventana cliente");
        btnCliente.setFocusable(false);
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 40));

        btnFactura.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cuenta.png"))); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.setToolTipText("Crear factura");
        btnFactura.setFocusable(false);
        btnFactura.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 60, -1, -1));

        btnCategoria.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/carpeta.png"))); // NOI18N
        btnCategoria.setText("Categoria");
        btnCategoria.setToolTipText("Ventana de categoria");
        btnCategoria.setFocusable(false);
        btnCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 170, 40));

        btnEmpresa.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edificio.png"))); // NOI18N
        btnEmpresa.setText("Empresas");
        btnEmpresa.setToolTipText("Ventana de empresas");
        btnEmpresa.setFocusable(false);
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(btnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp Image 2024-01-21 at 9.48.54 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 130));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 51));
        jToolBar1.setRollover(true);
        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 130));

        dktPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dktPrincipal.setPreferredSize(new java.awt.Dimension(1462, 1462));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp Image 2024-01-21 at 10.41.50 PM.jpeg"))); // NOI18N

        dktPrincipal.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dktPrincipalLayout = new javax.swing.GroupLayout(dktPrincipal);
        dktPrincipal.setLayout(dktPrincipalLayout);
        dktPrincipalLayout.setHorizontalGroup(
            dktPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dktPrincipalLayout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(454, 454, 454))
        );
        dktPrincipalLayout.setVerticalGroup(
            dktPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        getContentPane().add(dktPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1430, 430));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1430, 50));

        jMenu2.setText("Opciones extra");

        mnReporte.setText("Reportes");
        jMenu2.add(mnReporte);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnProducos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JDesktopPane dktPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnReporte;
    // End of variables declaration//GEN-END:variables
}
