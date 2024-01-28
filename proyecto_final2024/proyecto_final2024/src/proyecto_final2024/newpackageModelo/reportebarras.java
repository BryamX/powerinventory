/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageModelo;

/**
 *
 * @author USER
 */
public class reportebarras {
    
    double ventasTotales;
    String mes;

    public reportebarras() {
    }

    public reportebarras(double ventasTotales, String mes) {
        this.ventasTotales = ventasTotales;
        this.mes = mes;
    }

    public double getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
}
