/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final2024.newpackageControlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_final2024.newpackageModelo.Cliente;
import proyecto_final2024.newpackageModelo.ModeloAdministrador;
import proyecto_final2024.newpackageModelo.ModeloCliente;
import proyecto_final2024.newpackageVista.VistaCliente;

/**
 *
 * @author elshi
 */
public class controladorClientes {
    private VistaCliente vista;

    static public String id_perC, cedulaCC, nombresCC, apellidosCC, direccionCC, generoCC, telefonoCC, fecha_nacimientoCC;
    static public String id_cliente,frecuencia;
    static public int calificacion;
    static public String idPersonaBuscar;
    private FileInputStream Pep;

    public static String cliemnteBuscar = "";

    public controladorClientes(VistaCliente vista) {
        this.vista = vista;
        vista.setVisible(true);
        this.vista.setBorder(null);
        this.vista.setLocation(0, -23);
        controlKey();
    }

    public void iniciaControl() {
        listarAdministrador();
        vista.getTxtidPer().setText(ModeloCliente.generarCodigoPersona());
        vista.getTxtBUSCAR().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cliemnteBuscar = "" + vista.getTxtBUSCAR().getText();
                List<Cliente> miListaclientes = ModeloCliente.clienteBuscado();
                DefaultTableModel mTabla = (DefaultTableModel) vista.getjTableAdmin().getModel();
                mTabla.setRowCount(0);
                miListaclientes.forEach(admin -> {
                    String[] rowData = {
                        admin.getId_cliente(), admin.getCedula(), admin.getNombres(), admin.getApellidos(), admin.getDireccion(), admin.getGenero(), admin.getTelefono(), String.valueOf(admin.getFecha_nacimiento()), admin.getFecuencia(), String.valueOf(admin.getCalificacion()),admin.getId_person()
                    };
                    mTabla.addRow(rowData);
                });
            }
        });

        vista.getjTableAdmin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = vista.getjTableAdmin().getSelectedRow();
                id_cliente = (vista.getjTableAdmin().getValueAt(i, 0).toString());
                cedulaCC = (vista.getjTableAdmin().getValueAt(i, 1).toString());
                nombresCC = (vista.getjTableAdmin().getValueAt(i, 2).toString());
                apellidosCC = (vista.getjTableAdmin().getValueAt(i, 3).toString());
                direccionCC = (vista.getjTableAdmin().getValueAt(i, 4).toString());
                generoCC = (vista.getjTableAdmin().getValueAt(i, 5).toString());
                telefonoCC = (vista.getjTableAdmin().getValueAt(i, 6).toString());
                fecha_nacimientoCC = (vista.getjTableAdmin().getValueAt(i, 7).toString());
                frecuencia = (vista.getjTableAdmin().getValueAt(i, 8).toString());
                calificacion = (Integer.valueOf( vista.getjTableAdmin().getValueAt(i, 9).toString()));
                id_perC =(vista.getjTableAdmin().getValueAt(i, 10).toString());
            }
        });

        vista.getBtnACTUALIZAR().addActionListener(l -> listarAdministrador());
        vista.getBtnCREAR().addActionListener(l -> abrirDialogo(true));
        vista.getBtnEDITAR().addActionListener(l -> abrirDialogo(false));
        vista.getBtnGuardar().addActionListener(l -> grabarAdministrador());
        vista.getBtnELIMINAR().addActionListener(l -> eliminarAdmin());
        vista.getBtnSalir().addActionListener(l -> salir());

    }

    public void listarAdministrador() {

        List<Cliente> miListaclientes = ModeloCliente.listarClientes();
        DefaultTableModel mTabla = (DefaultTableModel) vista.getjTableAdmin().getModel();
        mTabla.setRowCount(0);
        miListaclientes.stream().forEach(admin -> {
            String[] rowData = { admin.getId_cliente(), admin.getCedula(), admin.getNombres(), admin.getApellidos(), admin.getDireccion(), admin.getGenero(), admin.getTelefono(), String.valueOf(admin.getFecha_nacimiento()), admin.getFecuencia(), String.valueOf(admin.getCalificacion())
                  ,admin.getId_person()  };
            mTabla.addRow(rowData);
        });

    }

    private void abrirDialogo(boolean nuevo) {
        limpiarCampos();
        if (nuevo) {
            vista.getjDialog1().setTitle("CREAR NUEVO ADMINISTRADOR");
        } else if (!nuevo) {
            vista.getjDialog1().setTitle("EDITAR PERSONA");
            enviarDatos();
        }
        vista.getjDialog1().setLocationRelativeTo(vista);
        vista.getjDialog1().setSize(600, 600);
        vista.getjDialog1().setVisible(true);
        vista.getjDialog1().setLocationRelativeTo(null);
    }

    public void enviarDatos() {
        try {
            vista.getTxtcedula().setText(cedulaCC);
            vista.getTxtnombres().setText(nombresCC);
            vista.getTxtapellidos().setText(apellidosCC);
            vista.getTxtdireccion().setText(direccionCC);
            vista.getCmbgenero().setSelectedItem(generoCC);
            vista.getTxttelefono().setText(telefonoCC);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyy-MM-dd");
            Date fechaFormat = formatoFecha.parse(fecha_nacimientoCC);
            vista.getdtfecha().setDate(fechaFormat);
            vista.getTxtfrecuencia().setText(frecuencia);
            vista.getSpnCalificacion().setValue(calificacion);
            vista.getTxtidPer().setText(id_perC);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(controladorAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void grabarAdministrador() {
        
        if (vista.getjDialog1().getTitle().contentEquals("CREAR NUEVO ADMINISTRADOR")) {
            String cedula = vista.getTxtcedula().getText();
            String nombres = vista.getTxtnombres().getText();
            String apellidos = vista.getTxtapellidos().getText();
            String direccion = vista.getTxtdireccion().getText();
            String genero = vista.getCmbgenero().getSelectedItem().toString();
            String telefono = vista.getTxttelefono().getText();
            java.util.Date fehca = vista.getdtfecha().getDate();;
            long auxfecha_Nacimiento = fehca.getTime();
            java.sql.Date fecha = new java.sql.Date(auxfecha_Nacimiento);
            String freciencia = vista.getTxtfrecuencia().getText();
            int calificacionC = (int) vista.getSpnCalificacion().getValue();
            id_perC = vista.getTxtidPer().getText();

            ModeloCliente per = new ModeloCliente();
            per.setId_person(id_perC);
            per.setCedula(cedula);
            per.setNombres(nombres);
            per.setApellidos(apellidos);
            per.setDireccion(direccion);
            per.setGenero(genero);
            per.setTelefono(telefono);
            per.setFecha_nacimiento(fecha);
            per.setFecuencia(freciencia);
            per.setCalificacion(calificacionC);

            if (per.grabarcliente()== null) {
                JOptionPane.showMessageDialog(null, "Cliente creado con exito");
                listarAdministrador();
                vista.getjDialog1().dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear el Cliente");
            }

        } else if (vista.getjDialog1().getTitle().contentEquals("EDITAR PERSONA")) {
            String cedula = vista.getTxtcedula().getText();
            String nombres = vista.getTxtnombres().getText();
            String apellidos = vista.getTxtapellidos().getText();
            String direccion = vista.getTxtdireccion().getText();
            String genero =  vista.getCmbgenero().getSelectedItem().toString();
            String telefono = vista.getTxttelefono().getText();
            java.util.Date fehca = vista.getdtfecha().getDate();;
            long auxfecha_Nacimiento = fehca.getTime();
            java.sql.Date fecha = new java.sql.Date(auxfecha_Nacimiento);
            String freciencia = vista.getTxtfrecuencia().getText();
            int calificacions = (int) vista.getSpnCalificacion().getValue();

           ModeloCliente per = new ModeloCliente();
            per.setCedula(cedula);
            per.setNombres(nombres);
            per.setApellidos(apellidos);
            per.setDireccion(direccion);
            per.setGenero(genero);
            per.setTelefono(telefono);
            per.setFecha_nacimiento(fecha);
            per.setFecuencia(freciencia);
            per.setCalificacion(calificacions);

            if (per.modificarCliente()== null) {
                JOptionPane.showMessageDialog(null, "Cliente modificado con exito");
                listarAdministrador();
                vista.getjDialog1().dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modiciar al cliente");
            }
        }
    }

    public void limpiarCampos() {
            vista.getTxtcedula().setText("");
            vista.getTxtnombres().setText("");
            vista.getTxtapellidos().setText("");
            vista.getTxtdireccion().setText("");
            vista.getCmbgenero().setSelectedIndex(0);
            vista.getTxttelefono().setText("");
            vista.getdtfecha().setDate(null);
            vista.getTxtfrecuencia().setText("");
            vista.getSpnCalificacion().setValue(0);
             vista.getTxtidPer().setText(ModeloAdministrador.generarCodigoPersonas());
    }

    public void eliminarAdmin() {
        ModeloCliente admin = new ModeloCliente();
        if (admin.eliminarclientes()== null) {
            JOptionPane.showMessageDialog(null, "Cliente eliminada con exito");
            listarAdministrador();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no eliminada");
        }
    }
    
    public void salir(){
        vista.dispose();
    }
    public void controlKey() {
        vista.getTxtcedula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxtcedula(), 10); 
            }
        });
        vista.getTxtnombres().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espacios(vista.getTxtnombres(), 20); 
            }
        });
        vista.getTxtapellidos().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espacios(vista.getTxtnombres(), 20); 
            }
        });
        vista.getTxtdireccion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espacios(vista.getTxtdireccion(), 80); 
            }
        });
        vista.getTxttelefono().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.numero(vista.getTxttelefono(), 10); 
            }
        });
        


    }
    
}
