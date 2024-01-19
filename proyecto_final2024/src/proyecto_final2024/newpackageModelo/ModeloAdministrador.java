package proyecto_final2024.newpackageModelo;

import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto_final2024.newpackageControlador.controladorAdministrador;

/**
 *
 * @author elshi
 */
public class ModeloAdministrador extends Administrador {

    Conexion cpg = new Conexion();

    public ModeloAdministrador() {
    }

    public SQLException grabarAdministrador() {
        String sql;
        String sql2;

        sql = "INSERT INTO public.administrador (usuario, contrasena, id_persona)"
                + " VALUES ('" + getUsuario() + "', '" + getContraseña() + "', '" + controladorAdministrador.idper2 + "')";

        sql2 = "INSERT INTO public.persona (id_persona,cedula, nombres, apellidos, direccion, genero, telefono, fecha_nacimiento)"
                + " VALUES ( '" + controladorAdministrador.idper2 + "', '" + getCedula() + "', '" + getNombres() + "', '" + getApellidos() + "', '" + getDireccion() + "', '" + getGenero() + "', '" + getTelefono() + "', '" + getFecha_nacimiento() + "')";

        cpg.accionDB(sql2);
        return cpg.accionDB(sql);

    }

    public static List<Administrador> listarAdministrador() {

        Conexion cpg = new Conexion();
        List<Administrador> listaAdministrador = new ArrayList<Administrador>();

        String sql;
        sql = "SELECT a.id_administrador, a.usuario, a.contrasena,a.id_persona, p.cedula, p.nombres,p.apellidos, p.direccion, p.genero, p.telefono,p.fecha_nacimiento FROM public.administrador a JOIN public.persona p ON a.id_persona = p.id_persona";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {

                Administrador admin = new Administrador();
                admin.setIdPersona(rs.getString("id_persona"));
                admin.setId_administrador(rs.getString("id_administrador"));
                admin.setUsuario(rs.getString("usuario"));
                admin.setContraseña(rs.getString("contrasena"));
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

    public SQLException eliminarAdministrador() {
        String sql;
        String sql2;
        sql = "DELETE FROM public.administrador where id_persona = '" + controladorAdministrador.idper2 + "'";
        sql2 = "DELETE FROM public.persona where id_persona = '" + controladorAdministrador.idper2 + "'";
        cpg.accionDB(sql);//DEVUELVO NULL SI ES CORRECTO.
        return cpg.accionDB(sql2);//DEVUELVO NULL SI ES CORRECTO.
    }

    public SQLException modificarPersona() {
        String sql;
        String sql2;
        sql = "UPDATE public.administrador SET usuario='" + getUsuario() + "', contrasena='" + getContraseña() + "' WHERE id_persona ='" + controladorAdministrador.idper2 + "' ";

        sql2 = "UPDATE public.persona\n"
                + "	SET  cedula='" + getCedula() + "', nombres='" + getNombres() + "', apellidos='" + getApellidos() + "', direccion='" + getDireccion() + "', genero= '" + getGenero() + "', telefono= '" + getTelefono() + "', fecha_nacimiento= '" + getFecha_nacimiento() + "' WHERE id_persona ='" + controladorAdministrador.idper2 + "' ";
        cpg.accionDB(sql2);
        return cpg.accionDB(sql);//DEVUELVO NULL SI ES CORRECTO.

    }

    public static List<Administrador> administradorBuscado() {

        Conexion cpg = new Conexion();
        List<Administrador> listaAdmin = new ArrayList<Administrador>();

        String sql;
        sql = "SELECT a.id_administrador, a.usuario, a.contrasena, a.id_persona, p.nombres,p.apellidos, p.direccion, p.genero, p.telefono,p.fecha_nacimiento FROM public.administrador a JOIN public.persona p ON a.id_persona = p.id_persona WHERE p.cedula like '" + controladorAdministrador.adminBuscar + "%'";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {
                Administrador admin = new Administrador();
                admin.setIdPersona(rs.getString("id_persona"));
                admin.setId_administrador(rs.getString("id_administrador"));
                admin.setUsuario(rs.getString("usuario"));
                admin.setContraseña(rs.getString("contrasena"));
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

    public static String generarCodigoPersonas() {
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
            } else {
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
