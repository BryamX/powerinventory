/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageModelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ModeloReporte {

    public static List<reporteVentasDelMes> listarReporte() {

        Conexion cpg = new Conexion();
        List<reporteVentasDelMes> listaFacturas = new ArrayList<>();

        String sql;
        sql = "select f.fecha_factura, d.precio, d.cantidad from factura f Join detallefactura d on f.idfactura = d.id_factura where cantidad = 3";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {

                reporteVentasDelMes reporte = new reporteVentasDelMes();
                reporte.setFechaFactura(rs.getDate("fecha_factura"));
                reporte.setPrecio(rs.getDouble("precio"));
                reporte.setCantidad(rs.getInt("cantidad"));

                listaFacturas.add(reporte);
            }

            rs.close();
            return listaFacturas;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static ArrayList<String> productosMasVendidos() {

        Conexion cpg = new Conexion();
        ArrayList<String> listaMasVendidos = new ArrayList<>();

        String sql;
        sql = "SELECT p.nombre_producto AS producto, SUM(v.cantidad) AS total_vendido\n"
                + "FROM producto p\n"
                + "JOIN detallefactura v ON p.codigo_barras = v.id_productos\n"
                + "GROUP BY p.nombre_producto\n"
                + "ORDER BY total_vendido DESC\n"
                + "LIMIT 5;";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {

                listaMasVendidos.add(rs.getString("producto"));
                listaMasVendidos.add(rs.getString("total_vendido"));
            }

            rs.close();
            return listaMasVendidos;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static ArrayList<reportebarras> ventasDeLosMeses() {

        Conexion cpg = new Conexion();
        ArrayList<reportebarras> listaVentasMeses = new ArrayList<>();

        String sql;
        sql = "SELECT \n"
                + "CASE EXTRACT(MONTH FROM f.fecha_factura)\n"
                + "WHEN 1 THEN 'Enero'\n"
                + "WHEN 2 THEN 'Febrero'\n"
                + "WHEN 3 THEN 'Marzo'\n"
                + "WHEN 4 THEN 'Abril'\n"
                + "WHEN 5 THEN 'Mayo'\n"
                + "WHEN 6 THEN 'Junio'\n"
                + "WHEN 7 THEN 'Julio'\n"
                + "WHEN 8 THEN 'Agosto'\n"
                + "WHEN 9 THEN 'Septiembre'\n"
                + "WHEN 10 THEN 'Octubre'\n"
                + "WHEN 11 THEN 'Noviembre'\n"
                + "WHEN 12 THEN 'Diciembre'\n"
                + "END AS mes,\n"
                + "CAST(SUM(d.precio * d.cantidad) AS DECIMAL(10, 2)) AS total_precio_cantidad_redondeado\n"
                + "FROM factura f\n"
                + "JOIN detallefactura d ON f.idfactura = d.id_factura\n"
                + "WHERE f.fac_estado <> 'Anulado'\n"
                + "GROUP BY EXTRACT(MONTH FROM f.fecha_factura)\n"
                + "ORDER BY EXTRACT(MONTH FROM f.fecha_factura);";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {
                reportebarras reporte = new reportebarras();
                reporte.setMes(rs.getString("mes"));
                reporte.setVentasTotales(rs.getDouble("total_precio_cantidad_redondeado"));

                listaVentasMeses.add(reporte);
            }

            rs.close();
            return listaVentasMeses;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static ArrayList<ReporteTresUltimosDias> ventasTresultimosdias() {

        Conexion cpg = new Conexion();
        ArrayList<ReporteTresUltimosDias> tresUltimosDias = new ArrayList<>();

        String sql;
        sql = "SELECT \n"
                + "CASE \n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 1 THEN 'Lunes'\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 2 THEN 'Martes'\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 3 THEN 'Miércoles'\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 4 THEN 'Jueves'\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 5 THEN 'Viernes'\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 6 THEN 'Sábado'\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 0 THEN 'Domingo'\n"
                + "END AS dia,\n"
                + "CAST(SUM(d.precio * d.cantidad) AS NUMERIC(10, 2)) AS total_precio_cantidad_redondeado\n"
                + "FROM factura f\n"
                + "JOIN detallefactura d ON f.idfactura = d.id_factura\n"
                + "WHERE f.fecha_factura >= DATE_TRUNC('day', CURRENT_DATE) - INTERVAL '2 days' -- Incluye el día actual y los dos días anteriores\n"
                + "AND f.fecha_factura < DATE_TRUNC('day', CURRENT_DATE) + INTERVAL '1 day' -- Excluye el día siguiente\n"
                + "GROUP BY EXTRACT(DOW FROM f.fecha_factura)\n"
                + "ORDER BY \n"
                + "CASE \n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 1 THEN 1\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 2 THEN 2\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 3 THEN 3\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 4 THEN 4\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 5 THEN 5\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 6 THEN 6\n"
                + "WHEN EXTRACT(DOW FROM f.fecha_factura) = 0 THEN 7\n"
                + "END;";
        ResultSet rs = cpg.consultaDB(sql);

        try {
            while (rs.next()) {
                ReporteTresUltimosDias reporte = new ReporteTresUltimosDias();
                reporte.setDia(rs.getString("dia"));
                reporte.setSuma(rs.getDouble("total_precio_cantidad_redondeado"));

                tresUltimosDias.add(reporte);
            }

            rs.close();
            return tresUltimosDias;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
