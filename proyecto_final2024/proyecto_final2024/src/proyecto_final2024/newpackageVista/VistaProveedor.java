/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final2024.newpackageVista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author elshi
 */
public class VistaProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaAdministrador
     */
    public VistaProveedor() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dtFecha = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbIdEmpresa = new javax.swing.JComboBox<>();
        txttelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtidPer = new javax.swing.JTextField();
        cmbgenero = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        btnEDITAR = new javax.swing.JButton();
        btnCREAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnACTUALIZAR = new javax.swing.JButton();
        btnBUSCAR = new javax.swing.JButton();
        txtBUSCAR = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnIMPRIMIR = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(dtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 310, -1));

        btnGuardar.setText("Guardar");
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        jLabel7.setText("TELEFONO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 100, -1));

        jLabel8.setText("FECHA NACIMIENTO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 140, -1));

        jLabel9.setText("Codigo de la empresa");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 110, -1));

        cmbIdEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        jPanel1.add(cmbIdEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 145, -1));
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 220, -1));

        jLabel6.setText("GENERO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, -1));
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 220, -1));
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 220, -1));

        jLabel4.setText("APELLIDOS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, -1));

        jLabel5.setText("DIRECCION:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, -1));
        jPanel1.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 220, -1));
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 220, -1));

        jLabel2.setText("CEDULA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 110, -1));

        jLabel3.setText("NOMBRES:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 100, -1));

        jLabel14.setText("CEDULA:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, -1));
        jPanel1.add(txtidPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 220, -1));

        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino" }));
        jPanel1.add(cmbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 220, -1));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAdmin.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id proveedor", "Cedula", "Nombre", "Apellido", "Dirección", "Genero", "Telefono", "Fecha de nacimiento", "Empresa del proveedor"
            }
        ));
        jScrollPane1.setViewportView(jTableAdmin);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1405, 100));

        btnEDITAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnEDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar (1).png"))); // NOI18N
        btnEDITAR.setText("EDITAR");
        jPanel4.add(btnEDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, -1, -1));

        btnCREAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnCREAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alineacion-central (1).png"))); // NOI18N
        btnCREAR.setText("CREAR");
        jPanel4.add(btnCREAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, -1, -1));

        btnELIMINAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/papelera-de-reciclaje (2).png"))); // NOI18N
        btnELIMINAR.setText("ELIMINAR");
        jPanel4.add(btnELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 190, -1, -1));

        btnACTUALIZAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnACTUALIZAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estado (1).png"))); // NOI18N
        btnACTUALIZAR.setText("ACTUALIZAR");
        jPanel4.add(btnACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));

        btnBUSCAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnBUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar (6).png"))); // NOI18N
        btnBUSCAR.setText("BUSCAR");
        jPanel4.add(btnBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        txtBUSCAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtBUSCAR.setBorder(null);
        jPanel4.add(txtBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 197, 240, 20));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion (2).png"))); // NOI18N
        btnSalir.setBorder(null);
        jPanel4.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 20, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel10.setText("PROVEEDOR");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, 286, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp Image 2024-01-21 at 10.41.50 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 540, 420));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, -1));

        btnIMPRIMIR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/estado (1).png"))); // NOI18N
        btnIMPRIMIR.setText("IMPRIMIR");
        jPanel4.add(btnIMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public JDateChooser getdtfecha() {
        return dtFecha;
    }

    public JTable getjTableAdmin() {
        return jTableAdmin;
    }

    public JTextField getTxtBUSCAR() {
        return txtBUSCAR;
    }

    public JTextField getTxtapellidos() {
        return txtapellidos;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public JTextField getTxtdireccion() {
        return txtdireccion;
    }

    public JComboBox<String> getCmbgenero() {
        return cmbgenero;
    }

    public JTextField getTxtidPer() {
        return txtidPer;
    }

    
    public JTextField getTxtnombres() {
        return txtnombres;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }
    
    public JDialog getjDialog1() {
        return jDialog1;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public JComboBox<String> getCmbIdEmpresa() {
        return cmbIdEmpresa;
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
    private javax.swing.JComboBox<String> cmbIdEmpresa;
    private javax.swing.JComboBox<String> cmbgenero;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JTextField txtBUSCAR;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtidPer;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
