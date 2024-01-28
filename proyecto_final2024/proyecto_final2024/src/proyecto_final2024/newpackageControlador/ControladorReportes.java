/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageControlador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import proyecto_final2024.newpackageModelo.ModeloReporte;
import proyecto_final2024.newpackageModelo.reporteVentasDelMes;
import proyecto_final2024.newpackageModelo.reportebarras;
import proyecto_final2024.newpackageVista.VistaReporte;

/**
 *
 * @author USER
 */
public class ControladorReportes {

    VistaReporte vista;

    public ControladorReportes(VistaReporte vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);

    }

    public void inicarControladorReportes() {
//        listarFacturas();
        reporteProductosMasVendidos();
        reporteVentasPorMeses();
    }

//    public void listarFacturas() {
//
//        List<reporteVentasDelMes> miListaAdmin = ModeloReporte.listarReporte();
//        DefaultTableModel mTabla;
//        mTabla = (DefaultTableModel) vista.getTbReporte().getModel();
//        mTabla.setNumRows(0);
//        miListaAdmin.stream().forEach(admin -> {
//            String[] rowData = {String.valueOf(admin.getFechaFactura()), String.valueOf(admin.getPrecio()), String.valueOf(admin.getCantidad())};
//            mTabla.addRow(rowData);
//        });
//
//        double sumaparcial = 0;
//        
//        for (int i = 0; i < miListaAdmin.size(); i++) {
//           sumaparcial += miListaAdmin.get(i).getCantidad() *  miListaAdmin.get(i).getPrecio();
//        }
//        System.out.println(sumaparcial);
//    }
    public void reporteProductosMasVendidos() {
        ArrayList<String> masvendidos = ModeloReporte.productosMasVendidos();
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue(masvendidos.get(0), Integer.parseInt(masvendidos.get(1)));
        datos.setValue(masvendidos.get(2), Integer.parseInt(masvendidos.get(3)));
        datos.setValue(masvendidos.get(4), Integer.parseInt(masvendidos.get(5)));
        datos.setValue(masvendidos.get(6), Integer.parseInt(masvendidos.get(7)));
        datos.setValue(masvendidos.get(8), Integer.parseInt(masvendidos.get(9)));

        JFreeChart grafico_circular = ChartFactory.createPieChart(
                "Top 5 productos mas vendidos",
                datos,
                true,
                true,
                false
        );

        ChartPanel panel = new ChartPanel(grafico_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(538, 270));

        vista.getPnlRpastel().setLayout(new BorderLayout());
        vista.getPnlRpastel().add(panel, BorderLayout.NORTH);
    }

    public void reporteVentasPorMeses() {
        List<reportebarras> masvendidos = ModeloReporte.ventasDeLosMeses();
        System.out.println(masvendidos.get(1));
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ModeloReporte.ventasDeLosMeses().size(); i++) {
            dataset.addValue(masvendidos.get(i).getVentasTotales(), "Ventas", masvendidos.get(i).getMes());

        }

        JFreeChart grafico_barras = ChartFactory.createBarChart(
                "Ventas por mes",
                "Ventas",
                "Cantidad vendida",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1414, 390));

        vista.getPnlVentaspormeses().setLayout(new BorderLayout());
        vista.getPnlVentaspormeses().add(panel, BorderLayout.NORTH);
    }

}
