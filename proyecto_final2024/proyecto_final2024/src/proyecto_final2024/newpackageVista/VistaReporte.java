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

    public JMenuItem getMnImprimir() {
        return mnImprimir;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        pnlVentasMes = new javax.swing.JPanel();
        pnlRpastel = new javax.swing.JPanel();
        pnlVentaspormeses = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnImprimir = new javax.swing.JMenuItem();
        mnsalir = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlVentasMes.setBackground(new java.awt.Color(255, 255, 255));

        pnlRpastel.setBackground(new java.awt.Color(255, 255, 255));

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

        jMenu1.setText("Opciones");

        mnImprimir.setText("Imprimir");
        jMenu1.add(mnImprimir);

        mnsalir.setText("Volver");
        jMenu1.add(mnsalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlVentaspormeses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlRpastel, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(pnlVentasMes, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlVentasMes, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(pnlRpastel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnlVentaspormeses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mnImprimir;
    private javax.swing.JMenuItem mnsalir;
    private javax.swing.JPanel pnlRpastel;
    private javax.swing.JPanel pnlVentasMes;
    private javax.swing.JPanel pnlVentaspormeses;
    // End of variables declaration//GEN-END:variables
}
