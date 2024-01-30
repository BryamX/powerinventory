/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final2024.newpackageModelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto_final2024.newpackageControlador.controladorClientes;

/**
 *
 * @author elshi
 */
public class ModeloCliente extends Cliente{
    Conexion cpg = new Conexion();

    public ModeloCliente() {
    }

    public SQLException grabarcliente() {
        String sql;
        String sql2;

        sql = "INSERT INTO public.cliente (frecuencia, calificacion, id_persona)"
                + " VALUES ('" + getFecuencia()+ "', '" + getCalificacion()+ "', '" + controladorClientes.id_perC + "')";

        sql2 = "INSERT INTO public.persona (id_persona, cedula, nombres, apellidos, direccion, genero, telefono, fecha_nacimiento)"
                + " VALUES ('"+controladorClientes.id_perC +"', '" + getCedula() + "', '" + getNombres() + "', '" + getApellidos() + "', '" + getDireccion() + "', '" + getGenero() + "', '" + getTelefono() + "', '" + getFecha_nacimiento() + "')";

        cpg.accionDB(sql2);
        return cpg.accionDB(sql);

    }

    public static List<Cliente> listarClientes() {

        Conexion cpg = new Conexion();
        List<Cliente> listaAdministrador = new ArrayList<>();

        String sql;
        sql = "SELECT a.id_cliente, a.frecuencia, a.calificacion,a.id_persona,p.cedula,p.nombres,p.apellidos, p.direccion, p.genero, p.telefono,p.fecha_nacimiento FROM public.cliente a JOIN public.persona p ON a.id_persona = p.id_persona";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {

                Cliente admin = new Cliente();
                admin.setId_person(rs.getString("id_persona"));
                admin.setId_cliente(rs.getString("id_cliente"));
                admin.setCalificacion(rs.getInt("calificacion"));
                admin.setFecuencia(rs.getString("frecuencia"));
                admin.setCedula(rs.getString("cedula"));
                admin.setNombres(rs.getString("nombres"));
                admin.setApellidos(rs.getString("apellidos"));
                admin.setDireccion(rs.getString("direccion"));
                admin.setGenero(rs.getString("genero"));
                admin.setTelefono(rs.getString("telefono"));
                admin.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                

                listaAdministrador.add(admin);

            }

            rs.close();
            return listaAdministrador;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public SQLException eliminarclientes() {
        String sql;
        String sql2;
        sql = "DELETE FROM public.cliente where id_persona = '" + controladorClientes.id_perC + "'";
        sql2 = "DELETE FROM public.persona where id_persona = '" + controladorClientes.id_perC + "'";
        cpg.accionDB(sql);//DEVUELVO NULL SI ES CORRECTO.
        return cpg.accionDB(sql2);//DEVUELVO NULL SI ES CORRECTO.
    }

    public SQLException modificarCliente() {
        String sql;
        String sql2;
        sql = "UPDATE public.cliente SET frecuencia='" + getFecuencia()+ "', calificacion='" + getCalificacion()+ "' WHERE id_persona ='"+controladorClientes.id_perC+"' " ;
        
        sql2 = "UPDATE public.persona\n" +
"	SET  cedula='" + getCedula() + "', nombres='" + getNombres() + "', apellidos='" + getApellidos() + "', direccion='" + getDireccion() + "', genero= '" + getGenero() + "', telefono= '" + getTelefono() + "', fecha_nacimiento= '" + getFecha_nacimiento() + "' WHERE id_persona ='"+controladorClientes.id_perC+"' ";
        cpg.accionDB(sql2);
        return cpg.accionDB(sql);//DEVUELVO NULL SI ES CORRECTO.

    }

    public static List<Cliente> clienteBuscado() {

        Conexion cpg = new Conexion();
        List<Cliente> listaAdmin = new ArrayList<>();

        String sql;
        sql = "SELECT p.id_cliente, a.frecuencia, a.calificacion,a.id_persona,p.cedula, p.nombres,p.apellidos, p.direccion, p.genero, p.telefono,p.fecha_nacimiento FROM public.cliente a JOIN public.persona p ON a.id_persona = p.id_persona WHERE p.cedula like '"+controladorClientes.cliemnteBuscar+ "%'";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {
                Cliente admin = new Cliente();
                admin.setId_person(rs.getString("id_persona"));
                admin.setId_cliente(rs.getString("id_cliente"));
                admin.setCalificacion(rs.getInt("calificacion"));
                admin.setFecuencia(rs.getString("frecuencia"));
                admin.setCedula(rs.getString("cedula"));
                admin.setNombres(rs.getString("nombres"));
                admin.setApellidos(rs.getString("apellidos"));
                admin.setDireccion(rs.getString("direccion"));
                admin.setGenero(rs.getString("genero"));
                admin.setTelefono(rs.getString("telefono"));
                admin.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
                
                listaAdmin.add(admin);

            }
            rs.close();
            return listaAdmin;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "algo salio mal");
            Logger.getLogger(ModeloAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        
    public static String generarCodigoPersona(){
         Conexion cpg = new Conexion();
         
         String sql;
         sql = "SELECT max(id_persona)+1 as codigo FROM persona";
         ResultSet rs = cpg.consultaDB(sql);
        try {
            rs.next();
            String codigo;
            if (rs.getString("codigo") == null) {
                codigo = "1";
                 System.out.println(codigo);
            }else{
                codigo = rs.getString("codigo");
                System.out.println(codigo);
            }
            rs.close();
            return codigo;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
}
