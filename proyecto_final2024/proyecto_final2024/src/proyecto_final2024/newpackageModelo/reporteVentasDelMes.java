/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageModelo;

import java.util.Date;

/**
 *
 * @author USER
 */
public class reporteVentasDelMes {
    
    Date fechaFactura;
    double precio;
    int cantidad;

    public reporteVentasDelMes() {
    }

    public reporteVentasDelMes(Date fechaFactura, double precio, int cantidad) {
        this.fechaFactura = fechaFactura;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
