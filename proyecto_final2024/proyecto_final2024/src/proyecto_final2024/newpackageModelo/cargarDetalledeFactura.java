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
public class cargarDetalledeFactura {
    
    String codigo_barras;
    String nombreP;
    double precio;
    int cantidad;
    int id_Admin;
    String usario;

    public cargarDetalledeFactura() {
    }

    public cargarDetalledeFactura(String codigo_barras, String nombreP, double precio, int cantidad, int id_Admin, String usario) {
        this.codigo_barras = codigo_barras;
        this.nombreP = nombreP;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id_Admin = id_Admin;
        this.usario = usario;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
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

    public int getId_Admin() {
        return id_Admin;
    }

    public void setId_Admin(int id_Admin) {
        this.id_Admin = id_Admin;
    }

    public String getUsario() {
        return usario;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }
    
    
    
}
