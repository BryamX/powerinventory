/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final2024.newpackageVista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author elshi
 */
public class VistaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaAdministrador
     */
    public VistaCliente() {
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
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmbgenero = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtidPer = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        dtFecha = new com.toedter.calendar.JDateChooser();
        txttelefono = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfrecuencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        spnCalificacion = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCREAR = new javax.swing.JButton();
        btnEDITAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        txtBUSCAR = new javax.swing.JTextField();
        btnBUSCAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnIMPRIMIR = new javax.swing.JButton();

        jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Direccion:");
        jDialog1.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 232, 100, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbgenero.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino" }));
        jPanel4.add(cmbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 220, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setText("Codigo:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 110, -1));

        txtidPer.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtidPer.setEnabled(false);
        jPanel4.add(txtidPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 220, -1));

        txtdireccion.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 220, -1));

        txtcedula.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 220, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Cedula:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, -1));

        txtnombres.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 220, -1));
        jPanel4.add(dtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 220, 30));

        txttelefono.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 220, -1));

        txtapellidos.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jPanel4.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 220, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 100, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Genero:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 100, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setText("Telefono:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 100, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setText("Fecha de nacimiento:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 170, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setText("Frecuencia:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 100, -1));

        txtfrecuencia.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtfrecuencia.setEnabled(false);
        jPanel4.add(txtfrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 220, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setText("Calificacion:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 100, -1));

        spnCalificacion.setEnabled(false);
        jPanel4.add(spnCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 43, 29));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        jPanel4.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp Image 2024-01-21 at 10.41.50 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 510, 420));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo2.jpeg"))); // NOI18N
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 500, 590, 40));

        jDialog1.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 540));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1460, 472));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1454, 499));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCREAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnCREAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/alineacion-central (1).png"))); // NOI18N
        btnCREAR.setText("Crear");
        jPanel1.add(btnCREAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        btnEDITAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnEDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar (1).png"))); // NOI18N
        btnEDITAR.setText("Editar");
        jPanel1.add(btnEDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, -1, -1));

        btnELIMINAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnELIMINAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/papelera-de-reciclaje (2).png"))); // NOI18N
        btnELIMINAR.setText("Eliminar");
        jPanel1.add(btnELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 130, -1, -1));

        txtBUSCAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        txtBUSCAR.setBorder(null);
        jPanel1.add(txtBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, 20));

        btnBUSCAR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnBUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar (6).png"))); // NOI18N
        btnBUSCAR.setText("Buscar");
        jPanel1.add(btnBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jTableAdmin.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTableAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id cliente", "Cedual", "Nombres", "Apellidos", "Direccion", "Genero", "Telefono", "Fecha de nacimiento", "Frecuencia", "Calificacion", "Id persona"
            }
        ));
        jScrollPane1.setViewportView(jTableAdmin);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1390, 90));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion (2).png"))); // NOI18N
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("CLIENTE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 286, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WhatsApp Image 2024-01-21 at 10.41.50 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 520, 420));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, 10));

        btnIMPRIMIR.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        btnIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/impresora (2).png"))); // NOI18N
        btnIMPRIMIR.setText("Imprimir");
        jPanel1.add(btnIMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    public JButton getBtnBUSCAR() {
        return btnBUSCAR;
    }

    public JButton getBtnIMPRIMIR() {
        return btnIMPRIMIR;
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

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JDateChooser getDtFecha() {
        return dtFecha;
    }

    public JSpinner getSpnCalificacion() {
        return spnCalificacion;
    }

    public JTextField getTxtfrecuencia() {
        return txtfrecuencia;
    }
  
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBUSCAR;
    private javax.swing.JButton btnCREAR;
    private javax.swing.JButton btnEDITAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbgenero;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JSpinner spnCalificacion;
    private javax.swing.JTextField txtBUSCAR;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtfrecuencia;
    private javax.swing.JTextField txtidPer;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

    public Object getJCalendar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
