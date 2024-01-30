/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final2024.newpackageVista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author elshi
 */
public class VistaEmpresa extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaAdministrador
     */
    public VistaEmpresa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDs = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        txtNombreEm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCREAR = new javax.swing.JButton();
        btnEDITAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnACTUALIZAR = new javax.swing.JButton();
        txtBUSCAR = new javax.swing.JTextField();
        btnBUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnIMPRIMIR = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(532, 320));
        jDialog1.setModal(true);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 57));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDs.setColumns(20);
        txtDs.setRows(5);
        jScrollPane2.setViewportView(txtDs);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 230, -1));

        btnGuardar.setText("Guardar");
        jPanel6.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));
        jPanel6.add(txtNombreEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 234, -1));

        jLabel2.setText("Nombre de la empresa");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 110, -1));

        jLabel3.setText("Descripcion de la empresa");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 532, 30));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1379, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(1454, 499));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCREAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnCREAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alineacion-central (1).png"))); // NOI18N
        btnCREAR.setText("CREAR");
        jPanel1.add(btnCREAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        btnEDITAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnEDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar (1).png"))); // NOI18N
        btnEDITAR.setText("EDITAR");
        jPanel1.add(btnEDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, -1, -1));

        btnELIMINAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/papelera-de-reciclaje (2).png"))); // NOI18N
        btnELIMINAR.setText("ELIMINAR");
        jPanel1.add(btnELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 130, -1, -1));

        btnACTUALIZAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnACTUALIZAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estado (1).png"))); // NOI18N
        btnACTUALIZAR.setText("ACTUALIZAR");
        jPanel1.add(btnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        txtBUSCAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtBUSCAR.setBorder(null);
        jPanel1.add(txtBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 147, 220, 20));

        btnBUSCAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnBUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar (6).png"))); // NOI18N
        btnBUSCAR.setText("BUSCAR");
        jPanel1.add(btnBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jTableAdmin.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Empresa", "Nombre de la empresa", "Descripcion de la empresa"
            }
        ));
        jScrollPane1.setViewportView(jTableAdmin);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1380, 240));

        jLabel10.setBackground(new java.awt.Color(51, 51, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 0));
        jLabel10.setText("EMPRESAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 286, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion (2).png"))); // NOI18N
        btnSalir.setBorder(null);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp Image 2024-01-21 at 10.41.50 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 510, 420));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 10));

        btnIMPRIMIR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estado (1).png"))); // NOI18N
        btnIMPRIMIR.setText("IMPRIMIR");
        jPanel1.add(btnIMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnACTUALIZAR() {
        return btnACTUALIZAR;
    }

    public JButton getBtnIMPRIMIR() {
        return btnIMPRIMIR;
    }

    public JButton getBtnBUSCAR() {
        return btnBUSCAR;
    }

    public JButton getBtnCREAR() {
        return btnCREAR;
    }

    public JButton getBtnEDITAR() {
        return btnEDITAR;
    }

    public JButton getBtnELIMINAR() {
        return btnELIMINAR;
    }

    public JTextArea getTxtDs() {
        return txtDs;
    }

    public JTextField getTxtNombreEm() {
        return txtNombreEm;
    }

    public JTextField getTxtBUSCAR() {
        return txtBUSCAR;
    }


    public JDialog getjDialog1() {
        return jDialog1;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JTable getjTableAdmin() {
        return jTableAdmin;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }
  
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnACTUALIZAR;
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnCREAR;
    private javax.swing.JButton btnEDITAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JTextField txtBUSCAR;
    private javax.swing.JTextArea txtDs;
    private javax.swing.JTextField txtNombreEm;
    // End of variables declaration//GEN-END:variables
}
