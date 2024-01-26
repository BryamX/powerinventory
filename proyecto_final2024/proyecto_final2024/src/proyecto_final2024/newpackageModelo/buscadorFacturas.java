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
public class buscadorFacturas {
    
    int idfactura;
    Date fecha;
    String estado;
    int idcliente;
    String nombres;
    String apellidos;
    String cedula;

    public buscadorFacturas() {
    }

    public buscadorFacturas(int idfactura, Date fecha, String estado, int idcliente, String nombres, String apellidos, String cedula) {
        this.idfactura = idfactura;
        this.fecha = fecha;
        this.estado = estado;
        this.idcliente = idcliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
