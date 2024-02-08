/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageControlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import proyecto_final2024.newpackageModelo.ModeloFactura;
import proyecto_final2024.newpackageModelo.Producto;
import proyecto_final2024.newpackageModelo.Cliente;
import proyecto_final2024.newpackageModelo.Conexion;
import proyecto_final2024.newpackageModelo.buscadorFacturas;
import proyecto_final2024.newpackageModelo.cargarDetalledeFactura;
import proyecto_final2024.newpackageVista.VistaCliente;
import proyecto_final2024.newpackageVista.VistaFacrura;

/**
 *
 * @author USER
 */
public class ControladorFactura {

    VistaFacrura vista;
    Calendar calendario= new GregorianCalendar();
    Date fecha_actual=calendario.getTime();
    

    static public String cedigo, nombre, apellido, cedula;
    static public String codigobarras, nombreProducto, precio, cantidad;
    static public String codigoBuscar, idFactura;
    public static String idproductoV;
    public static int cantidadProductosV;

    //Sirve para la consulta cuando buscamos con el codigo de barras
    public static String cantidadBuscadaPorCodigoBarras;

    public static Integer cantidadProductos;

    public static float precioproductosV;

    //variables para el buscador de las facturas
    public static String id_factutaBuscada, fechaFacturaBuscada, facEstadoBuscada, id_clienteBuscado, nombresBuscado, apellidosBuscado, cedulaBuscado;
    public static String cedulaCienteBuscadofac;
    //variables para el escanner
    public Socket s;
    public ServerSocket ssk;
    public InputStreamReader isr;
    public BufferedReader br;
    public String mensaje;
    
    //Ruta de la imagen
    public String ruta = "/logo/logo.jpeg";

    public static java.sql.Date fechadesdeEnviar, fechahastaEnviar;

    public ControladorFactura(VistaFacrura vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setBorder(null);
        this.vista.setLocation(0, -23);
        fecha();
        controlKey();
       
          vista.getTbFacturabuscada().setDefaultEditor(Object.class, null);
           vista.getTbClientes().setDefaultEditor(Object.class, null);
           vista.getTbProductos().setDefaultEditor(Object.class, null);
           vista.getTbdetallefactura().setDefaultEditor(Object.class, null);
           
    }

    public void inicarControl() {
       vista.getFechaDesde().addPropertyChangeListener(new java.beans.PropertyChangeListener() {
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        if ("date".equals(evt.getPropertyName())) {
       
            Date fechaSeleccionada = (Date) evt.getNewValue();
            
            vista.getFechahasta().setMinSelectableDate(fechaSeleccionada);
        }
    }
});
        listarProveedores();
        leercodigodeBarras();
        vista.getTxtcodigoFactura().setText(ModeloFactura.generarCodigoFacrura());
        vista.getTxtnombreAdmin().setText(ControladorLogin.usuariosaux);
        vista.getTxtcodigoAdmin().setText(ControladorLogin.id);
        vista.getBtnNuevo().setEnabled(false);
        vista.getBtnanular().setEnabled(false);
        vista.getBtnenviar().setEnabled(false);

        vista.getTxtcodigoproducto().addActionListener(l -> obtenerProduto());
        vista.getBtnAbrirProductos().addActionListener(l -> buscarProductos());
        vista.getBtnbuscarcliente().addActionListener(l -> buscarClientes());
        vista.getBtnAceptarbCLIENTE().addActionListener(l -> enviarDatosCliente());
        vista.getBtnaceptarProductos().addActionListener(l -> enviarcodigoProducto());
        vista.getBtnanadir().addActionListener(l -> añadirProductos());
        vista.getQuitar().addActionListener(l -> eliminarproducto());
        vista.getBtnguardar().addActionListener(l -> crearEncabeszado());
        vista.getBtncancelar().addActionListener(l -> salir());
        vista.getBtnbuscarFactura().addActionListener(l -> AbrirBuscadorfactura());
        vista.getBtnBuscarFactura().addActionListener(l -> botonbuscarFactura());
        vista.getBtnAceptarFacturaBuscada().addActionListener(l -> enviardatosoFactura());
        vista.getBtnNuevo().addActionListener(l -> nuevaFactura());
        vista.getBtnimprimir().addActionListener(l -> imprimirFactura());
        vista.getBtnListacompleta().addActionListener(l -> listaFacturas());
        vista.getBtnanular().addActionListener(l -> anularFactura());
        vista.getBtnCrearCliente().addActionListener(l -> crearCliente());
        vista.getBtnenviar().addActionListener(l -> enviarDatosCreados());
        vista.getBtnquitarCliente().addActionListener(l -> quitarCliente());

    }

    public void nuevaFactura() {
        vista.getBtnanular().setEnabled(true);
        vista.getBtnguardar().setEnabled(true);
        vista.getBtnbuscarcliente().setEnabled(true);
        vista.getBtnAbrirProductos().setEnabled(true);
        vista.getDtFecha().setEnabled(true);
        vista.getTxtcodigoproducto().setEnabled(true);
        vista.getTxtcantidadproducto().setEnabled(true);
        vista.getBtnanadir().setEnabled(true);
        vista.getQuitar().setEnabled(true);
        vista.getTxtcodigoFactura().setText(ModeloFactura.generarCodigoFacrura());
        vista.getTxtnombreAdmin().setText(ControladorLogin.usuariosaux);
        vista.getTxtcodigoAdmin().setText(ControladorLogin.id);
        vista.getTxtcodigocliente().setText("");
        vista.getTxtnombrecliente().setText("");
        vista.getTxtapellidocliente().setText("");
        vista.getTxtcedulacliente().setText("");
        vista.getTxtTotal().setText("");
        vista.getDtFecha().setDate(null);
        vista.getLblEstado().setText("PENDIENTE");
        DefaultTableModel model = (DefaultTableModel) vista.getTbdetallefactura().getModel();
        model.setRowCount(0);

    }

    public void AbrirBuscadorfactura() {
        vista.getBtnNuevo().setEnabled(true);
        vista.getBtnguardar().setEnabled(false);
        vista.getBtnbuscarcliente().setEnabled(false);
        vista.getBtnAbrirProductos().setEnabled(false);
        vista.getDtFecha().setEnabled(false);
        vista.getTxtcodigoproducto().setEnabled(false);
        vista.getTxtcantidadproducto().setEnabled(false);
        vista.getBtnanadir().setEnabled(false);
        vista.getQuitar().setEnabled(false);

        vista.getjDialogFacturas().setSize(900, 400);
        vista.getjDialogFacturas().setVisible(true);
        vista.getjDialogFacturas().setLocationRelativeTo(null);
        vista.getTbFacturabuscada().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = vista.getTbFacturabuscada().getSelectedRow();
                id_factutaBuscada = (vista.getTbFacturabuscada().getValueAt(i, 0).toString());
                fechaFacturaBuscada = (vista.getTbFacturabuscada().getValueAt(i, 1).toString());
                facEstadoBuscada = (vista.getTbFacturabuscada().getValueAt(i, 2).toString());
                id_clienteBuscado = (vista.getTbFacturabuscada().getValueAt(i, 3).toString());
                nombresBuscado = (vista.getTbFacturabuscada().getValueAt(i, 4).toString());
                apellidosBuscado = (vista.getTbFacturabuscada().getValueAt(i, 5).toString());
                cedulaBuscado = (vista.getTbFacturabuscada().getValueAt(i, 6).toString());
            }
        });
        listaFacturas();

    }

    public void listaFacturas() {
        List<buscadorFacturas> miListaPro = ModeloFactura.listafacturas();
        DefaultTableModel mTabla = (DefaultTableModel) vista.getTbFacturabuscada().getModel();
        mTabla.setRowCount(0);
        miListaPro.forEach(admin -> {
            String[] rowData = {
                String.valueOf(admin.getIdfactura()), String.valueOf(admin.getFecha()), admin.getEstado(), String.valueOf(admin.getIdcliente()), admin.getNombres(), admin.getApellidos(), admin.getCedula()
            };
            mTabla.addRow(rowData);
        });
    }

    public void botonbuscarFactura() {

        if (vista.getFechaDesde().getDate() == null || vista.getFechahasta().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Porfavor no deje campos vacios");
        } else {
            java.util.Date fehca = vista.getFechaDesde().getDate();
            long auxfecha = fehca.getTime();
            fechadesdeEnviar = new java.sql.Date(auxfecha);

            java.util.Date fechahasta = vista.getFechahasta().getDate();
            long auxfecha_hasta = fechahasta.getTime();
            fechahastaEnviar = new java.sql.Date(auxfecha_hasta);
            List<buscadorFacturas> miListaPro = ModeloFactura.Buscarfacturas();
            DefaultTableModel mTabla = (DefaultTableModel) vista.getTbFacturabuscada().getModel();
            mTabla.setRowCount(0);
            miListaPro.forEach(admin -> {
                String[] rowData = {
                    String.valueOf(admin.getIdfactura()), String.valueOf(admin.getFecha()), admin.getEstado(), String.valueOf(admin.getIdcliente()), admin.getNombres(), admin.getApellidos(), admin.getCedula()
                };
                mTabla.addRow(rowData);
            });
        }
    }

    //Envia los datos desde la busqueda que se hizo en la parte de buscar factura
    public void enviardatosoFactura() {
        vista.getBtnanular().setEnabled(true);
        int fila = vista.getTbFacturabuscada().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecione una factura");
        } else {
            try {
                vista.getTxtcodigoFactura().setText(id_factutaBuscada);
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyy-MM-dd");
                Date fechaFormat;
                fechaFormat = formatoFecha.parse(fechaFacturaBuscada);
                vista.getDtFecha().setDate(fechaFormat);
                vista.getLblEstado().setText(facEstadoBuscada);
                vista.getTxtcodigocliente().setText(id_clienteBuscado);
                vista.getTxtnombrecliente().setText(nombresBuscado);
                vista.getTxtapellidocliente().setText(apellidosBuscado);
                vista.getTxtcedulacliente().setText(cedulaBuscado);
                cargarDetalle();
                totales();
                vista.getjDialogFacturas().dispose();
            } catch (ParseException ex) {
                Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void cargarDetalle() {
        List<cargarDetalledeFactura> miListaPro = ModeloFactura.cargarDetalle();
        DefaultTableModel mTabla = (DefaultTableModel) vista.getTbdetallefactura().getModel();
        mTabla.setRowCount(0);
        miListaPro.stream().forEach(admin -> {
            vista.getTxtcodigoAdmin().setText(String.valueOf(admin.getId_Admin()));
            vista.getTxtnombreAdmin().setText(admin.getUsario());
            String[] rowData = {admin.getCodigo_barras(), admin.getNombreP(), String.valueOf(admin.getPrecio()), String.valueOf(admin.getCantidad())};
            mTabla.addRow(rowData);
        });
    }

    public void buscarClientes() {
        listarProveedores();
        vista.getjDialogClientes().setLocationRelativeTo(vista);
        vista.getjDialogClientes().setSize(798, 600);
        vista.getjDialogClientes().setVisible(true);
        vista.getjDialogClientes().setLocationRelativeTo(null);
        vista.getTbClientes().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = vista.getTbClientes().getSelectedRow();
                cedigo = (vista.getTbClientes().getValueAt(i, 0).toString());
                nombre = (vista.getTbClientes().getValueAt(i, 1).toString());
                apellido = (vista.getTbClientes().getValueAt(i, 2).toString());
                cedula = (vista.getTbClientes().getValueAt(i, 3).toString());
            }
        });
        vista.getTxtfiltroClientes().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cedulaCienteBuscadofac = "" + vista.getTxtfiltroClientes().getText();
                List<Cliente> miListaPro = ModeloFactura.clienteBuscado();
                DefaultTableModel mTabla = (DefaultTableModel) vista.getTbClientes().getModel();
                mTabla.setRowCount(0);
                miListaPro.forEach(admin -> {
                    String[] rowData = {
                        admin.getId_cliente(), admin.getNombres(), admin.getApellidos(), admin.getCedula()
                    };
                    mTabla.addRow(rowData);
                });
            }
        });
    }

    public void buscarProductos() {
        listarProductos();
        vista.getjDialogProductos().setLocationRelativeTo(vista);
        vista.getjDialogProductos().setSize(600, 600);
        vista.getjDialogProductos().setVisible(true);
        vista.getjDialogProductos().setLocationRelativeTo(null);
        vista.getTbProductos().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = vista.getTbProductos().getSelectedRow();
                codigobarras = (vista.getTbProductos().getValueAt(i, 0).toString());
                nombreProducto = (vista.getTbProductos().getValueAt(i, 1).toString());
                cantidad = (vista.getTbProductos().getValueAt(i, 2).toString());
                precio = (vista.getTbProductos().getValueAt(i, 3).toString());
            }
        });
        vista.getTxtfiltrarProducto().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                codigoBuscar = "" + vista.getTxtfiltrarProducto().getText();
                List<Producto> miListaPro = ModeloFactura.BuscarProducto();
                DefaultTableModel mTabla = (DefaultTableModel) vista.getTbProductos().getModel();
                mTabla.setRowCount(0);
                miListaPro.stream().forEach(admin -> {
                    String[] rowData = {admin.getId_producto(), admin.getNombre_producto(), String.valueOf(admin.getCantidad_en_bodega()), String.valueOf(admin.getPrecio_de_venta())};
                    mTabla.addRow(rowData);
                });
            }
        });
    }

    public void listarProveedores() {

        List<Cliente> miListaPro = ModeloFactura.listarClientes();
        DefaultTableModel mTabla = (DefaultTableModel) vista.getTbClientes().getModel();
        mTabla.setRowCount(0);
        miListaPro.stream().forEach(admin -> {
            String[] rowData = {admin.getId_cliente(), admin.getNombres(), admin.getApellidos(), admin.getCedula()};
            mTabla.addRow(rowData);
        });
    }

    public void listarProductos() {

        List<Producto> miListaPro = ModeloFactura.listaProductos();
        DefaultTableModel mTabla = (DefaultTableModel) vista.getTbProductos().getModel();
        mTabla.setRowCount(0);
        miListaPro.stream().forEach(admin -> {
            String[] rowData = {admin.getId_producto(), admin.getNombre_producto(), String.valueOf(admin.getCantidad_en_bodega()), String.valueOf(admin.getPrecio_de_venta())};
            mTabla.addRow(rowData);
        });
    }

    public void enviarDatosCliente() {

        if (vista.getTbClientes().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione un cliente");
        } else {
            vista.getTxtcodigocliente().setText(cedigo);
            vista.getTxtnombrecliente().setText(nombre);
            vista.getTxtapellidocliente().setText(apellido);
            vista.getTxtcedulacliente().setText(cedula);
            vista.getjDialogClientes().dispose();
        }
    }

    //Envia los campos del producto que se uso en el buscador
    public void enviarcodigoProducto() {
        vista.getTxtcodigoproducto().setText(codigobarras);
        vista.getLblNombreProducto().setText(nombreProducto);
        vista.getjDialogProductos().dispose();
    }

    //Envia los capos del producto buscado con el scanner
    public void obtenerProduto() {
        ModeloFactura.BuscarProducto(vista.getTxtcodigoproducto().getText());
        vista.getLblNombreProducto().setText(ModeloFactura.nombre);
    }

    //Añade los productos a la tabla del detalle de la factura
    public void añadirProductos() {
        cantidadBuscadaPorCodigoBarras = vista.getTxtcodigoproducto().getText();

        if (ModeloFactura.obtenercantidad() < Integer.parseInt(vista.getTxtcantidadproducto().getText())) {
            JOptionPane.showMessageDialog(null, "Productos insuficiente en stock");
            System.out.println("normal");
        } else {

            ModeloFactura.MandarProducto(vista.getTxtcodigoproducto().getText());
            DefaultTableModel mTabla = (DefaultTableModel) vista.getTbdetallefactura().getModel();
            mTabla.addRow(new Object[]{
                ModeloFactura.codigobarras,
                ModeloFactura.nombre,
                ModeloFactura.precio * Integer.parseInt(vista.getTxtcantidadproducto().getText()),
                vista.getTxtcantidadproducto().getText()
            });
            vista.getTbdetallefactura().setModel(mTabla);
            totales();
            vista.getTxtcantidadproducto().setText("");
            vista.getTxtcodigoproducto().setText("");
        }

    }

    //Elimina los productos del detalle de la factutura
    public void eliminarproducto() {
        DefaultTableModel mTabla = (DefaultTableModel) vista.getTbdetallefactura().getModel();
        int fila = vista.getTbdetallefactura().getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecione un producto para eliminar");
        } else {
            mTabla.removeRow(fila);
            
        }
        totales();
        int canfilas = vista.getTbdetallefactura().getRowCount();
        if (canfilas == 0) {
            vista.getTxtTotal().setText("");
            vista.getTxtiva().setText("");
            vista.getTxtsubtotal().setText("");
        }
    }

    //Calcula el total de la factura
    public void totales() {
        int canfilas = vista.getTbdetallefactura().getRowCount();
        double sumatotal = 0;
        for (int i = 0; i < canfilas; i++) {
            if (!vista.getTbdetallefactura().getValueAt(i, 2).equals("")) {
                sumatotal += Double.parseDouble(vista.getTbdetallefactura().getValueAt(i, 2).toString());
            }
            double sub = Math.ceil(sumatotal / 1.12 * 100) / 100;
            double iva = Math.ceil((sumatotal - sub) * 100) / 100;
            vista.getTxtiva().setText(String.valueOf(iva));
            vista.getTxtsubtotal().setText(String.valueOf(sub));
            vista.getTxtTotal().setText(String.valueOf(sumatotal));
        }
    }

    public void crearEncabeszado() {

        if (vista.getTxtcodigoFactura().getText().equals("") || vista.getTxtcodigocliente().getText().equals("") || vista.getTxtcodigoAdmin().getText().equals("")
                || vista.getDtFecha().getDate() == null || vista.getLblEstado().getText().equals("") || vista.getTbdetallefactura().getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos de la factura");
        } else {
            vista.getBtnAbrirProductos().setEnabled(false);
            vista.getDtFecha().setEnabled(false);
            vista.getTxtcodigoproducto().setEnabled(false);
            vista.getTxtcantidadproducto().setEnabled(false);
            vista.getBtnanadir().setEnabled(false);
            vista.getQuitar().setEnabled(false);
            vista.getBtnanular().setEnabled(true);
            vista.getLblEstado().setText("ACTIVA");
            vista.getBtnguardar().setEnabled(false);
            vista.getBtnNuevo().setEnabled(true);
            idFactura = vista.getTxtcodigoFactura().getText();
            String idCliente = vista.getTxtcodigocliente().getText();
            String idadmin = vista.getTxtcodigoAdmin().getText();
            Date fecha = vista.getDtFecha().getDate();
            long auxFecha = fecha.getTime();
            java.sql.Date fechaFinal = new java.sql.Date(auxFecha);
            String estado = vista.getLblEstado().getText();

            ModeloFactura fac = new ModeloFactura();
            fac.setIdFctura(idFactura);
            fac.setIdCliente(idCliente);
            fac.setIdAdministrador(idadmin);
            fac.setFechaFactura(fechaFinal);
            fac.setEstado(estado);

            if (fac.grabarEncabezadoFacura() == null) {
                JOptionPane.showMessageDialog(null, "Cabezera creada con exito");
                guardarDetalleFactura();
                descontarSto();
                aumentarCalificacion();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la cabezera");
            }
        }
    }

    public void guardarDetalleFactura() {
        ModeloFactura fac = new ModeloFactura();
        cantidadProductos = vista.getTbdetallefactura().getRowCount();
        for (int i = 0; i < vista.getTbdetallefactura().getRowCount(); i++) {
            idproductoV = vista.getTbdetallefactura().getValueAt(i, 0).toString();
            cantidadProductosV = Integer.parseInt(vista.getTbdetallefactura().getValueAt(i, 3).toString());
            precioproductosV = Float.valueOf(vista.getTbdetallefactura().getValueAt(i, 2).toString());

            if (fac.grabarDetalleFacura() == null) {
                JOptionPane.showMessageDialog(null, "Detalle creado con exito");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear el detalle");
            }

        }
    }

    public void descontarSto() {
        ModeloFactura fac = new ModeloFactura();
        if (fac.decontarStock() == null) {
            System.out.println("Stock descontado");
        } else {
            System.out.println("Error, el stock no se ha descontado");
        }
    }

    public void leercodigodeBarras() {
        // Crear un nuevo hilo utilizando una expresión lambda
        new Thread(() -> {
            try {
                System.out.println("entro");
                // Crear un ServerSocket que escuche en el puerto 8000
                ssk = new ServerSocket(8000);

                // Bucle que se ejecutará continuamente para aceptar conexiones entrantes
                while (true) {
                    // Esperar a que llegue una conexión y obtener un Socket para comunicarse con el cliente
                    s = ssk.accept();

                    // Crear un InputStreamReader para leer los datos que llegan a través del Socket
                    isr = new InputStreamReader(s.getInputStream());

                    // Crear un BufferedReader para leer líneas completas de texto del InputStreamReader
                    br = new BufferedReader(isr);

                    // Leer una línea de texto del BufferedReader, que representa un mensaje del cliente
                    mensaje = br.readLine();

                    // Imprimir el mensaje recibido en la consola
                    System.out.println(mensaje);

                    // Acceder al campo de texto llamado "txtcodigoproducto" en el objeto "vista" y verificar su contenido
                    if (vista.getTxtcodigoproducto().getText().equals("")) {
                        // Si el campo está vacío, establecer su texto con el mensaje recibido
                        vista.getTxtcodigoproducto().setText(mensaje);
                        // Asignar el mensaje a la variable "codigoBuscar"
                        codigoBuscar = vista.getTxtcodigoproducto().getText();
                    } else {
                        // Si el campo no está vacío, borrar su contenido actual
                        vista.getTxtcodigoproducto().setText("");
                        // Establecer su texto con el mensaje recibido
                        vista.getTxtcodigoproducto().setText(mensaje);
                        // Asignar el mensaje a la variable "codigoBuscar"
                        codigoBuscar = vista.getTxtcodigoproducto().getText();
                    }

                    // Imprimir un mensaje indicando que se ha procesado el mensaje recibido
                    System.out.println("salio");
                }

            } catch (IOException e) {
                // Capturar cualquier excepción de tipo IOException que pueda ocurrir durante la ejecución del servidor
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            }
        }).start(); // Iniciar el hilo

    }

    public void imprimirFactura() {
        if (vista.getTxtcodigoFactura().getText().equals("") || vista.getTxtcodigocliente().getText().equals("") || vista.getTxtcodigoAdmin().getText().equals("")
                || vista.getDtFecha().getDate() == null || vista.getLblEstado().getText().equals("") || vista.getTbdetallefactura().getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos de la factura");
        } else {
          
        Conexion conexion = new Conexion();
        Date fecha = vista.getDtFecha().getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFinalComoString = sdf.format(fecha);

        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject(
                    getClass().getResource("/proyecto_final2024/newpackagevista/reportes/factura.jasper"));
            
            Map<String, Object> parametros = new HashMap<>();
            
            parametros.put("logo", this.getClass().getResourceAsStream(ruta));
            parametros.put("subtotal", Double.parseDouble(vista.getTxtsubtotal().getText()));
            parametros.put("iva", Double.parseDouble(vista.getTxtiva().getText()));
            parametros.put("idFactutra", Integer.parseInt(vista.getTxtcodigoFactura().getText()));
            parametros.put("nombreoperario", vista.getTxtnombreAdmin().getText());
            parametros.put("idOperario", vista.getTxtcodigoAdmin().getText());
            parametros.put("nombrec", vista.getTxtnombrecliente().getText());
            parametros.put("apellidoc", vista.getTxtapellidocliente().getText());
            parametros.put("cedulac", vista.getTxtcedulacliente().getText());
            parametros.put("fechaemicion", fechaFinalComoString);

            JasperPrint jp = JasperFillManager.fillReport(
                    reporte,
                    parametros,
                    conexion.getCon()
            );
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    public void salir() {
        vista.dispose();
        try {
            ssk.close();
        } catch (IOException ex) {
            Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void anularFactura() {
        idFactura = vista.getTxtcodigoFactura().getText();
        if (vista.getLblEstado().getText().equals("ACTIVA")) {
            ModeloFactura fac = new ModeloFactura();
            if (fac.anularfac() == null) {
                aumentarStok();
                JOptionPane.showMessageDialog(null, "Factura anulada");
                vista.getLblEstado().setText("ANULADO");
            } else {
                System.out.println("Error! La factura no se pudo anular");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido anular la factura");
        }
    }

    public void aumentarStok() {
        ModeloFactura fac = new ModeloFactura();
        cantidadProductos = vista.getTbdetallefactura().getRowCount();
        for (int i = 0; i < vista.getTbdetallefactura().getRowCount(); i++) {
            idproductoV = vista.getTbdetallefactura().getValueAt(i, 0).toString();
            if (fac.aumentarStock() == null) {
                System.out.println("Stock anumentado");
            } else {
                System.out.println("Error, el stock no se ha anumentado");
            }
        }
    }

//    public static String idAumentarCalificacion;
    public void aumentarCalificacion() {
        cedigo = vista.getTxtcodigocliente().getText();
        ModeloFactura fac = new ModeloFactura();
        if (fac.aumentarCalificacion() == null) {
            System.out.println("La calificacion ha aumentado");
            if (fac.aumentarFrecuencia() == null) {
                System.out.println("Frecuencia actualizada");
            }
        }
    }

    public static String subirFrecuencia() {
        if (ModeloFactura.obtenerCalificacion() <= 5) {
            return "baja";
        } else if (ModeloFactura.obtenerCalificacion() <= 10) {
            return "media";
        } else {
            return "alta";
        }
    }

    public void crearCliente() {
        if (vista.getTxtcodigocliente().getText().equals("") || vista.getTxtnombrecliente().getText().equals("") || 
            vista.getTxtapellidocliente().getText().equals("") ||  vista.getTxtcedulacliente().getText().equals("")) {
            vista.getBtnenviar().setEnabled(true);
        VistaCliente cliente = new VistaCliente();
        controladorClientes crearClienteS = new controladorClientes(cliente);
        crearClienteS.iniciarControl2();
        }else{
            JOptionPane.showMessageDialog(null, "No se puede crear un cliente si ya haz seleccionado uno anterirmente");
        }
    }

    public void enviarDatosCreados() {
        vista.getTxtcodigocliente().setText(ModeloFactura.obtenerIdClienteCreado());
        vista.getTxtnombrecliente().setText(controladorClientes.nombreCFac);
        vista.getTxtapellidocliente().setText(controladorClientes.apellidoCFac);
        vista.getTxtcedulacliente().setText(controladorClientes.cedulaCFac);
    }
    
    public void quitarCliente(){
        if (vista.getTxtcodigocliente().getText().equals("") || vista.getTxtnombrecliente().getText().equals("") || 
            vista.getTxtapellidocliente().getText().equals("") ||  vista.getTxtcedulacliente().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aun no seleccionas ningun cliente");
        }else{
        vista.getTxtcodigocliente().setText("");
        vista.getTxtnombrecliente().setText("");
        vista.getTxtapellidocliente().setText("");
        vista.getTxtcedulacliente().setText("");
        }
    }
    
     public void controlKey() {
        vista.getTxtcantidadproducto().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtcantidadproducto(), 1000); 
            }
        });
     

    }
     public void fecha(){
         vista.getDtFecha().setDate(fecha_actual);
         vista.getDtFecha().setEnabled(false);
         
         
     }
     
    
}
