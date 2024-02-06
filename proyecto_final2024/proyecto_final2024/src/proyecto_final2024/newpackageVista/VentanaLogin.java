/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageVista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class VentanaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin() {
        initComponents();
        
        
        
      //codigo para el icono    
        setIconImage(getIconImage());
    }
    
    @Override
    public Image getIconImage() {
        
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("logo/lg.png"));
    
    return retValue;
    }

    public JPasswordField getPswContrasena() {
        return pswContrasena;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public JButton getBtnInicarSesion() {
        return btnInicarSesion;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pswContrasena = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInicarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 30)); // NOI18N
        jLabel2.setText("usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 30)); // NOI18N
        jLabel1.setText("contraseña:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 290, -1));

        pswContrasena.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        pswContrasena.setBorder(null);
        jPanel1.add(pswContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 368, 300, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 290, -1));

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 248, 310, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logopro1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 210, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 0, 357, 490));

        btnInicarSesion.setBackground(new java.awt.Color(36, 167, 195));
        btnInicarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInicarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnInicarSesion.setText("Ingresar");
        btnInicarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnInicarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 120, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setText("Iniciar sesiòn");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pswContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
