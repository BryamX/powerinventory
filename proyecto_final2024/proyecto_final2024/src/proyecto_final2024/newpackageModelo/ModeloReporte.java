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
}
