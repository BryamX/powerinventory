/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageControlador;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import proyecto_final2024.newpackageModelo.ModeloReporte;
import proyecto_final2024.newpackageModelo.ReporteTresUltimosDias;
import proyecto_final2024.newpackageModelo.reportebarras;
import proyecto_final2024.newpackageVista.VistaBarradecarga;
import proyecto_final2024.newpackageVista.VistaReporte;

/**
 *
 * @author USER
 */
public class ControladorReportes {

    VistaReporte vista;

    public ControladorReportes(VistaReporte vista) {
        this.vista = vista;
        this.vista.setLocationRelativeTo(null);
    }

    public void inicarControladorReportes() {

//        listarFacturas();
        reporteProductosMasVendidos();
        reporteVentasPorMeses();
        reporteTresUltimosDias();
        vista.getMnsalir().addActionListener(l->salir());
    }

    public void reporteProductosMasVendidos() {
        ArrayList<String> masvendidos = ModeloReporte.productosMasVendidos();
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue(masvendidos.get(0), Integer.parseInt(masvendidos.get(1)));
        datos.setValue(masvendidos.get(2), Integer.parseInt(masvendidos.get(3)));
        datos.setValue(masvendidos.get(4), Integer.parseInt(masvendidos.get(5)));
        datos.setValue(masvendidos.get(6), Integer.parseInt(masvendidos.get(7)));
        datos.setValue(masvendidos.get(8), Integer.parseInt(masvendidos.get(9)));

        JFreeChart grafico_circular = ChartFactory.createPieChart(
                "Top 5 productos más vendidos",
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

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ModeloReporte.ventasDeLosMeses().size(); i++) {
            dataset.addValue(masvendidos.get(i).getVentasTotales(), "Ventas", masvendidos.get(i).getMes());
        }

// Crear el gráfico de líneas
        JFreeChart grafico_lineas = ChartFactory.createLineChart(
                "Volumen de ventas", // Título del gráfico
                "Mes", // Etiqueta del eje X
                "Ventas", // Etiqueta del eje Y
                dataset, // Conjunto de datos
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true, // Mostrar leyenda
                true, // Usar tooltips
                false // Usar URLs
        );
        CategoryPlot plot = (CategoryPlot) grafico_lineas.getPlot();
        CategoryItemRenderer renderer = plot.getRenderer();

// Configurar el grosor de la línea para todas las series
        if (renderer instanceof LineAndShapeRenderer) {
            LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) renderer;
            lineRenderer.setSeriesStroke(0, new BasicStroke(3.0f)); // Grosor de la línea: 2.0
        }

        ChartPanel panel = new ChartPanel(grafico_lineas);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(1414, 390));

        vista.getPnlVentaspormeses().setLayout(new BorderLayout());
        vista.getPnlVentaspormeses().add(panel, BorderLayout.NORTH);
    }

    public void reporteTresUltimosDias() {
        List<ReporteTresUltimosDias> masvendidos = ModeloReporte.ventasTresultimosdias();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ModeloReporte.ventasTresultimosdias().size(); i++) {
            dataset.addValue(masvendidos.get(i).getSuma(), "Ventas", masvendidos.get(i).getDia());
        }

// Crear el gráfico de barras
        JFreeChart grafico_barras = ChartFactory.createBarChart(
                "Ventas de los ultimos tres dias", // Título del gráfico
                "Día", // Etiqueta del eje X
                "Ventas", // Etiqueta del eje Y
                dataset, // Conjunto de datos
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true, // Mostrar leyenda
                true, // Usar tooltips
                false // Usar URLs
        );

        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(538, 270));

        vista.getPnlVentasMes().setLayout(new BorderLayout());
        vista.getPnlVentasMes().add(panel, BorderLayout.NORTH);
    }
    
    public void salir(){
        vista.dispose();
    }
    
    
}
