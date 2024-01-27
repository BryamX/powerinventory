package proyecto_final2024.newpackageModelo;

import proyecto_final2024.newpackageControlador.ControladorFactura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static proyecto_final2024.newpackageControlador.ControladorFactura.cedigo;
import proyecto_final2024.newpackageControlador.controladorClientes;

public class ModeloFactura extends Factura {

    Conexion cpg = new Conexion();

    static public String nombre, codigobarras;
    static public String idAdminMandar, usuarioAdminMandar;
    static public float precio;

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

    public static List<Cliente> clienteBuscado() {

        Conexion cpg = new Conexion();
        List<Cliente> listaAdmin = new ArrayList<>();

        String sql;
        sql = "SELECT a.id_cliente, a.frecuencia, a.calificacion,a.id_persona,p.cedula, p.nombres,p.apellidos, p.direccion, p.genero, p.telefono,p.fecha_nacimiento FROM public.cliente a JOIN public.persona p ON a.id_persona = p.id_persona WHERE p.cedula like '" + controladorClientes.cliemnteBuscar + "%'";
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

    public static List<Empresa> llenarEmpresas() {
        Conexion cpg = new Conexion();
        List<Empresa> listaProveedor = new ArrayList<>();

        String sql;
        sql = "SELECT id_empresa, nombre_empresa, descripcio_empresa FROM public.empresa";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            while (rs.next()) {
                Empresa provee = new Empresa();

                provee.setId_empresa(rs.getInt("id_empresa"));
                provee.setNombre_empresa(rs.getString("nombre_empresa"));
                provee.setDescripcion_empresa(rs.getString("descripcio_empresa"));
                listaProveedor.add(provee);
            }

            rs.close();
            return listaProveedor;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void BuscarProducto(String texto) {
        Conexion cpg = new Conexion();

        String sql;
        sql = "SELECT codigo_barras, nombre_producto, id_proveedor, descripcion_producto, cantidad_en_bodega, disponibilidad, "
                + "id_categoria, precio_de_compra, precio_de_venta FROM producto WHERE codigo_barras='" + texto + "'";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            rs.next();
            if (rs.getRow() == 0) {
                JOptionPane.showMessageDialog(null, "El producto no existe");
            } else {
                nombre = rs.getString("nombre_producto");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Producto> BuscarProducto() {
        Conexion cpg = new Conexion();
        List<Producto> listaProductos = new ArrayList<>();

        String sql;
        sql = "SELECT codigo_barras, nombre_producto, id_proveedor, descripcion_producto, cantidad_en_bodega, disponibilidad, "
                + "id_categoria, precio_de_compra, precio_de_venta FROM producto WHERE codigo_barras LIKE '" + ControladorFactura.codigoBuscar + "%' or codigo_barras LIKE '" + ControladorFactura.codigoBuscar + "%' or nombre_producto LIKE '" + ControladorFactura.codigoBuscar + "%'";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            while (rs.next()) {
                Producto Miproducto = new Producto();
                Miproducto.setId_producto(rs.getString("codigo_barras"));
                Miproducto.setNombre_producto(rs.getString("nombre_producto"));
                Miproducto.setDescripcion_producto(rs.getString("descripcion_producto"));
                Miproducto.setDisponibilidad(rs.getString("disponibilidad"));
                Miproducto.setCantidad_en_bodega(Integer.valueOf(rs.getString("cantidad_en_bodega")));

                Miproducto.setId_categoria(rs.getString("id_categoria"));
                Miproducto.setId_proveedor(rs.getString("id_proveedor"));

                Miproducto.setPrecio_de_compra(Float.valueOf(rs.getString("precio_de_compra")));
                Miproducto.setPrecio_de_venta(Float.valueOf(rs.getString("precio_de_venta")));

                listaProductos.add(Miproducto);

            }
            rs.close();
            return listaProductos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static List<Producto> listaProductos() {
        Conexion cpg = new Conexion();
        List<Producto> listaProductos = new ArrayList<>();

        String sql;
        sql = "SELECT codigo_barras, nombre_producto, id_proveedor, descripcion_producto, cantidad_en_bodega, disponibilidad, "
                + "id_categoria, precio_de_compra, precio_de_venta FROM producto";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {
                Producto Miproducto = new Producto();
                Miproducto.setId_producto(rs.getString("codigo_barras"));
                Miproducto.setNombre_producto(rs.getString("nombre_producto"));
                Miproducto.setDescripcion_producto(rs.getString("descripcion_producto"));
                Miproducto.setDisponibilidad(rs.getString("disponibilidad"));
                Miproducto.setCantidad_en_bodega(Integer.valueOf(rs.getString("cantidad_en_bodega")));

                Miproducto.setId_categoria(rs.getString("id_categoria"));
                Miproducto.setId_proveedor(rs.getString("id_proveedor"));

                Miproducto.setPrecio_de_compra(Float.valueOf(rs.getString("precio_de_compra")));
                Miproducto.setPrecio_de_venta(Float.valueOf(rs.getString("precio_de_venta")));

                listaProductos.add(Miproducto);

            }
            rs.close();
            return listaProductos;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static void MandarProducto(String texto) {
        Conexion cpg = new Conexion();

        String sql;
        sql = "SELECT codigo_barras, nombre_producto, precio_de_venta FROM producto WHERE codigo_barras='" + texto + "'";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            rs.next();
            if (rs.getRow() == 0) {
                JOptionPane.showMessageDialog(null, "El producto no existe");
            } else {
                nombre = rs.getString("nombre_producto");
                codigobarras = rs.getString("codigo_barras");
                precio = rs.getFloat("precio_de_venta");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public SQLException grabarEncabezadoFacura() {
        String sql;
        sql = "INSERT INTO public.factura(\n"
                + "idfactura, id_administrador, fecha_factura, fac_estado,id_cliente)\n"
                + "	VALUES ( '" + getIdFctura() + "', '" + getIdAdministrador() + "', '" + getFechaFactura() + "', '" + getEstado() + "','" + getIdCliente() + "')";
        return cpg.accionDB(sql);
    }

    public SQLException grabarDetalleFacura() {
        String sql = "";

        Integer cantidadProductos = ControladorFactura.cantidadProductos;
        for (int i = 0; i < cantidadProductos; i++) {
            sql = "INSERT INTO public.detallefactura(id_productos, cantidad, precio,id_factura) VALUES ('" + ControladorFactura.idproductoV + "', '" + ControladorFactura.cantidadProductosV + "','" + ControladorFactura.precioproductosV + "', '" + ControladorFactura.idFactura + "')";
        }
        return cpg.accionDB(sql);
    }

    public static String generarCodigoFacrura() {
        Conexion cpg = new Conexion();

        String sql;
        sql = "SELECT max(idfactura)+1 as codigo FROM factura";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            rs.next();
            String codigoFactura = rs.getString("codigo");
            System.out.println(codigoFactura);
            rs.close();
            return codigoFactura;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public SQLException decontarStock() {
        String sql = "";
        Integer cantidadProductos = ControladorFactura.cantidadProductos;
        for (int i = 0; i < cantidadProductos; i++) {
            sql = "UPDATE public.producto SET  cantidad_en_bodega= cantidad_en_bodega -'" + ControladorFactura.cantidadProductosV + "' where codigo_barras = '" + ControladorFactura.idproductoV + "'";
        }
        return cpg.accionDB(sql);
    }

    public SQLException aumentarStock() {
        String sql = "";
        Integer cantidadProductos = ControladorFactura.cantidadProductos;
        for (int i = 0; i < cantidadProductos; i++) {
            sql = "UPDATE public.producto SET  cantidad_en_bodega= cantidad_en_bodega +'" + ControladorFactura.cantidadProductosV + "' where codigo_barras = '" + ControladorFactura.idproductoV + "'";
        }
        return cpg.accionDB(sql);
    }

    public static List<buscadorFacturas> Buscarfacturas() {
        Conexion cpg = new Conexion();
        List<buscadorFacturas> listaFacturas = new ArrayList<>();

        String sql;
        sql = "SELECT f.idfactura, f.fecha_factura, f.fac_estado, c.id_cliente, p.nombres, p.apellidos, p.cedula\n"
                + "FROM cliente c\n"
                + "JOIN persona p ON c.id_persona = p.id_persona\n"
                + "JOIN factura f ON c.id_cliente = f.id_cliente\n"
                + "WHERE f.fecha_factura BETWEEN '" + ControladorFactura.fechadesdeEnviar + "' and '" + ControladorFactura.fechahastaEnviar + "'";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            while (rs.next()) {
                buscadorFacturas bus = new buscadorFacturas();
                bus.setIdfactura(rs.getInt("idfactura"));
                bus.setFecha(rs.getDate("fecha_factura"));
                bus.setEstado(rs.getString("fac_estado"));
                bus.setIdcliente(rs.getInt("id_cliente"));
                bus.setNombres(rs.getString("nombres"));
                bus.setApellidos(rs.getString("apellidos"));
                bus.setCedula(rs.getString("cedula"));
                listaFacturas.add(bus);
            }
            rs.close();
            return listaFacturas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static List<buscadorFacturas> listafacturas() {
        Conexion cpg = new Conexion();
        List<buscadorFacturas> listaFacturas = new ArrayList<>();

        String sql;
        sql = "SELECT f.idfactura, f.fecha_factura, f.fac_estado, c.id_cliente, p.nombres, p.apellidos, p.cedula\n"
                + "FROM cliente c\n"
                + "JOIN persona p ON c.id_persona = p.id_persona\n"
                + "JOIN factura f ON c.id_cliente = f.id_cliente";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            while (rs.next()) {
                buscadorFacturas bus = new buscadorFacturas();
                bus.setIdfactura(rs.getInt("idfactura"));
                bus.setFecha(rs.getDate("fecha_factura"));
                bus.setEstado(rs.getString("fac_estado"));
                bus.setIdcliente(rs.getInt("id_cliente"));
                bus.setNombres(rs.getString("nombres"));
                bus.setApellidos(rs.getString("apellidos"));
                bus.setCedula(rs.getString("cedula"));
                listaFacturas.add(bus);
            }
            rs.close();
            return listaFacturas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static List<cargarDetalledeFactura> cargarDetalle() {
        Conexion cpg = new Conexion();
        List<cargarDetalledeFactura> listadetalle = new ArrayList<>();

        String sql;
        sql = "SELECT DISTINCT p.codigo_barras, p.nombre_producto, d.precio, d.cantidad, f.id_administrador, a.usuario\n"
                + "FROM detallefactura d\n"
                + "JOIN factura f on d.id_factura = d.id_factura\n"
                + "JOIN administrador a on a.id_administrador = f.id_administrador\n"
                + "JOIN producto p ON p.codigo_barras = CAST(d.id_productos AS VARCHAR)\n"
                + "WHERE d.id_factura = '" + ControladorFactura.id_factutaBuscada + "'";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {
                cargarDetalledeFactura encabezado = new cargarDetalledeFactura();
                encabezado.setCodigo_barras(rs.getString("codigo_barras"));
                encabezado.setNombreP(rs.getString("nombre_producto"));
                encabezado.setPrecio(rs.getDouble("precio"));
                encabezado.setCantidad(rs.getInt("cantidad"));
                encabezado.setId_Admin(rs.getInt("id_administrador"));
                encabezado.setUsario(rs.getString("usuario"));
                listadetalle.add(encabezado);

            }
            rs.close();
            return listadetalle;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPersona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public SQLException anularfac() {
        String sql;
        sql = "UPDATE public.factura SET fac_estado='Anulado' WHERE idfactura ='" + ControladorFactura.idFactura + "' ";
        return cpg.accionDB(sql);//DEVUELVO NULL SI ES CORRECTO.
    }

    public static int obtenercantidad() {
        Conexion cpg = new Conexion();

        String sql;
        sql = "SELECT cantidad_en_bodega FROM producto where codigo_barras = '" + ControladorFactura.cantidadBuscadaPorCodigoBarras + "'";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            rs.next();
            int codigoFactura = Integer.parseInt(rs.getString("cantidad_en_bodega"));
            System.out.println(codigoFactura);
            rs.close();
            return codigoFactura;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public SQLException aumentarCalificacion() {
        String sql = "";
        sql = "UPDATE public.cliente SET  calificacion= calificacion +'1' where id_cliente = '" + ControladorFactura.cedigo + "'";
        return cpg.accionDB(sql);
    }
    
    public static int obtenerCalificacion() {
        Conexion cpg = new Conexion();

        String sql;
        sql = "SELECT calificacion FROM cliente where id_cliente = '" + ControladorFactura.cedigo + "'";
        ResultSet rs = cpg.consultaDB(sql);
        try {
            rs.next();
            int codigoFactura = Integer.parseInt(rs.getString("calificacion"));
            System.out.println(codigoFactura);
            rs.close();
            return codigoFactura;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public SQLException aumentarFrecuencia() {
        String sql = "";
        sql = "UPDATE public.cliente SET  frecuencia= '"+ControladorFactura.subirFrecuencia()+"'where id_cliente = '" + ControladorFactura.cedigo + "'";
        return cpg.accionDB(sql);
    }
}
