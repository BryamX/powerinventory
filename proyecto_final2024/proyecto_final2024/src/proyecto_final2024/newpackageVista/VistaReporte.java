/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageVista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class VistaReporte extends javax.swing.JFrame {

    /**
     * Creates new form VistaReporte
     */
    public VistaReporte() {
        initComponents();
        
        
        
      //codigo para el icono    
        setIconImage(getIconImage());
    }
    
    @Override
    public Image getIconImage() {
        
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("logo/lg.png"));
    
    return retValue;
    }

//    public JTable getTbReporte() {
//        return tbReporte;
//    }

    public JPanel getPnlRpastel() {
        return pnlRpastel;
    }

    public JPanel getPnlVentasMes() {
        return pnlVentasMes;
    }

    public JPanel getPnlVentaspormeses() {
        return pnlVentaspormeses;
    }

    public JMenuItem getMnsalir() {
        return mnsalir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        pnlVentasMes = new javax.swing.JPanel();
        pnlRpastel = new javax.swing.JPanel();
        pnlVentaspormeses = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnsalir = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlVentasMes.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pnlVentasMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 10, 645, 270));

        pnlRpastel.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pnlRpastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, 645, 270));

        pnlVentaspormeses.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlVentaspormesesLayout = new javax.swing.GroupLayout(pnlVentaspormeses);
        pnlVentaspormeses.setLayout(pnlVentaspormesesLayout);
        pnlVentaspormesesLayout.setHorizontalGroup(
            pnlVentaspormesesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlVentaspormesesLayout.setVerticalGroup(
            pnlVentaspormesesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(pnlVentaspormeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 298, 1414, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1510, 700));

        jMenu1.setText("Opciones");

        mnsalir.setText("Volver");
        jMenu1.add(mnsalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnsalir;
    private javax.swing.JPanel pnlRpastel;
    private javax.swing.JPanel pnlVentasMes;
    private javax.swing.JPanel pnlVentaspormeses;
    // End of variables declaration//GEN-END:variables
}
