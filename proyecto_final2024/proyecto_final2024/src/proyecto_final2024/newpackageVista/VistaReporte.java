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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnAno2022 = new javax.swing.JMenu();
        mnEnero1 = new javax.swing.JMenuItem();
        mnFebrero1 = new javax.swing.JMenuItem();
        mnMarzo1 = new javax.swing.JMenuItem();
        mnAbril1 = new javax.swing.JMenuItem();
        mnMayo1 = new javax.swing.JMenuItem();
        mnJunio1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        mnAgosto1 = new javax.swing.JMenuItem();
        mnSeptiembre1 = new javax.swing.JMenuItem();
        mnOctubre1 = new javax.swing.JMenuItem();
        mnNoviembre1 = new javax.swing.JMenuItem();
        mnDiciembre1 = new javax.swing.JMenuItem();
        mnAno2023 = new javax.swing.JMenu();
        mnEnero = new javax.swing.JMenuItem();
        mnFebrero = new javax.swing.JMenuItem();
        mnMarzo = new javax.swing.JMenuItem();
        mnAbril = new javax.swing.JMenuItem();
        mnMayo = new javax.swing.JMenuItem();
        mnJunio = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        mnAgosto = new javax.swing.JMenuItem();
        mnSeptiembre = new javax.swing.JMenuItem();
        mnOctubre = new javax.swing.JMenuItem();
        mnNoviembre = new javax.swing.JMenuItem();
        mnDiciembre = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnsalir = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jMenu3.setText("Cambiar año y mes");

        mnAno2022.setText("Año 2022");

        mnEnero1.setText("Enero");
        mnAno2022.add(mnEnero1);

        mnFebrero1.setText("Febrero");
        mnAno2022.add(mnFebrero1);

        mnMarzo1.setText("Marzo");
        mnAno2022.add(mnMarzo1);

        mnAbril1.setText("Abril");
        mnAno2022.add(mnAbril1);

        mnMayo1.setText("Mayo");
        mnAno2022.add(mnMayo1);

        mnJunio1.setText("Junio");
        mnAno2022.add(mnJunio1);

        jMenuItem8.setText("Julio");
        mnAno2022.add(jMenuItem8);

        mnAgosto1.setText("Agosto");
        mnAno2022.add(mnAgosto1);

        mnSeptiembre1.setText("Septiembre");
        mnAno2022.add(mnSeptiembre1);

        mnOctubre1.setText("Octubre");
        mnAno2022.add(mnOctubre1);

        mnNoviembre1.setText("Noviembre");
        mnAno2022.add(mnNoviembre1);

        mnDiciembre1.setText("Diciembre");
        mnAno2022.add(mnDiciembre1);

        jMenu3.add(mnAno2022);

        mnAno2023.setText("Año 2023");

        mnEnero.setText("Enero");
        mnAno2023.add(mnEnero);

        mnFebrero.setText("Febrero");
        mnAno2023.add(mnFebrero);

        mnMarzo.setText("Marzo");
        mnAno2023.add(mnMarzo);

        mnAbril.setText("Abril");
        mnAno2023.add(mnAbril);

        mnMayo.setText("Mayo");
        mnAno2023.add(mnMayo);

        mnJunio.setText("Junio");
        mnAno2023.add(mnJunio);

        jMenuItem7.setText("Julio");
        mnAno2023.add(jMenuItem7);

        mnAgosto.setText("Agosto");
        mnAno2023.add(mnAgosto);

        mnSeptiembre.setText("Septiembre");
        mnAno2023.add(mnSeptiembre);

        mnOctubre.setText("Octubre");
        mnAno2023.add(mnOctubre);

        mnNoviembre.setText("Noviembre");
        mnAno2023.add(mnNoviembre);

        mnDiciembre.setText("Diciembre");
        mnAno2023.add(mnDiciembre);

        jMenu3.add(mnAno2023);

        jMenu1.add(jMenu3);

        jMenuItem1.setText("Mas vendidos");
        jMenu1.add(jMenuItem1);

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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem mnAbril;
    private javax.swing.JMenuItem mnAbril1;
    private javax.swing.JMenuItem mnAgosto;
    private javax.swing.JMenuItem mnAgosto1;
    private javax.swing.JMenu mnAno2022;
    private javax.swing.JMenu mnAno2023;
    private javax.swing.JMenuItem mnDiciembre;
    private javax.swing.JMenuItem mnDiciembre1;
    private javax.swing.JMenuItem mnEnero;
    private javax.swing.JMenuItem mnEnero1;
    private javax.swing.JMenuItem mnFebrero;
    private javax.swing.JMenuItem mnFebrero1;
    private javax.swing.JMenuItem mnJunio;
    private javax.swing.JMenuItem mnJunio1;
    private javax.swing.JMenuItem mnMarzo;
    private javax.swing.JMenuItem mnMarzo1;
    private javax.swing.JMenuItem mnMayo;
    private javax.swing.JMenuItem mnMayo1;
    private javax.swing.JMenuItem mnNoviembre;
    private javax.swing.JMenuItem mnNoviembre1;
    private javax.swing.JMenuItem mnOctubre;
    private javax.swing.JMenuItem mnOctubre1;
    private javax.swing.JMenuItem mnSeptiembre;
    private javax.swing.JMenuItem mnSeptiembre1;
    private javax.swing.JMenuItem mnsalir;
    private javax.swing.JPanel pnlRpastel;
    private javax.swing.JPanel pnlVentasMes;
    private javax.swing.JPanel pnlVentaspormeses;
    // End of variables declaration//GEN-END:variables
}
