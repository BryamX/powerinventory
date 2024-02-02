/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final2024.newpackageControlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import proyecto_final2024.newpackageModelo.ModeloAdministrador;
import proyecto_final2024.newpackageVista.VistaAdministrador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import proyecto_final2024.newpackageControlador.Validar;
import proyecto_final2024.newpackageModelo.Administrador;
import proyecto_final2024.newpackageModelo.Conexion;

/**
 *
 * @author elshi
 */
public class controladorAdministrador {

    private VistaAdministrador vista;

    static public String idper2,cedula2, id2, nombres2, apellidos2, direccion2, genero2, telefono2, fecha_nacimiento2;
    static public String id_admin2, usuario2, contraseña2;
    static public String idPersonaBuscar;
    private FileInputStream Pep;

    public static String adminBuscar = "";

    public controladorAdministrador(VistaAdministrador vista) {
        this.vista = vista;
        vista.setVisible(true);
        this.vista.setBorder(null);
        this.vista.setLocation(0, -23);
        controlKey();
         desactivar();
             vista.getjTableAdmin().setDefaultEditor(Object.class, null);
    }

    public void iniciaControl() {
        vista.getjTableAdmin().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Actualizar el estado del botón de editar
        actualizarEstadoBotonEditar();
    }
});
        vista.getTxtid_persona().setText(ModeloAdministrador.generarCodigoPersonas());
        listarAdministrador();
        vista.getTxtBUSCAR().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                adminBuscar = "" + vista.getTxtBUSCAR().getText();
                List<Administrador> miListaAdmin = ModeloAdministrador.administradorBuscado();
                DefaultTableModel mTabla = (DefaultTableModel) vista.getjTableAdmin().getModel();
                mTabla.setRowCount(0);
                miListaAdmin.forEach(admin -> {
                    String[] rowData = {
                        admin.getId_administrador(), admin.getCedula(), admin.getNombres(), admin.getApellidos(), admin.getDireccion(), admin.getGenero(), admin.getTelefono(), String.valueOf(admin.getFecha_nacimiento()), admin.getUsuario(), admin.getContraseña(),admin.getIdPersona()
                    };
                    mTabla.addRow(rowData);
                });
            }
        });

        vista.getjTableAdmin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = vista.getjTableAdmin().getSelectedRow();
                id_admin2 = (vista.getjTableAdmin().getValueAt(i, 0).toString());
                cedula2 = (vista.getjTableAdmin().getValueAt(i, 1).toString());
                nombres2 = (vista.getjTableAdmin().getValueAt(i, 2).toString());
                apellidos2 = (vista.getjTableAdmin().getValueAt(i, 3).toString());
                direccion2 = (vista.getjTableAdmin().getValueAt(i, 4).toString());
                genero2 = (vista.getjTableAdmin().getValueAt(i, 5).toString());
                telefono2 = (vista.getjTableAdmin().getValueAt(i, 6).toString());
                fecha_nacimiento2 = (vista.getjTableAdmin().getValueAt(i, 7).toString());
                usuario2 = (vista.getjTableAdmin().getValueAt(i, 8).toString());
                contraseña2 = (vista.getjTableAdmin().getValueAt(i, 9).toString());
                idper2 = (vista.getjTableAdmin().getValueAt(i, 10).toString());
            }
        });

        vista.getBtnACTUALIZAR().addActionListener(l -> listarAdministrador());
        vista.getBtnCREAR().addActionListener(l -> abrirDialogo(true));
        vista.getBtnEDITAR().addActionListener(l -> abrirDialogo(false));
        vista.getBtnGuardar().addActionListener(l -> grabarAdministrador());
        vista.getBtnELIMINAR().addActionListener(l -> eliminarAdmin());
        vista.getBtnSalir().addActionListener(l -> salir());
        vista.getBtnIMPRIMIR().addActionListener(l -> imprimirAdmin());
    }
    
    
    public void imprimirAdmin(){
        try {
            JasperReport administrador = (JasperReport) JRLoader.loadObject(
                    getClass().getResource("/proyecto_final2024/newpackagevista/reportes/administrador.jasper"));
       
        Conexion con = new Conexion();
        Map<String, Object> parametros = new HashMap <String, Object>();
        parametros.put("fecha", "29/01/2024" );
        parametros.put("titulo", "LISTADO DE ADMINISTRADORES" );
//        parametros.put("marcar", 250d);
        JasperPrint jp = JasperFillManager.fillReport(administrador, parametros, con.getCon());

        JasperViewer Jv = new JasperViewer(jp, false);
        Jv.setVisible(true);
        
        
        
        } catch (JRException ex) {
            Logger.getLogger(controladorAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarAdministrador() {

        List<Administrador> miListaAdmin = ModeloAdministrador.listarAdministrador();
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vista.getjTableAdmin().getModel();
        mTabla.setNumRows(0);
        miListaAdmin.stream().forEach(admin -> {
            String[] rowData = {admin.getId_administrador(), admin.getCedula(), admin.getNombres(), admin.getApellidos(), admin.getDireccion(), admin.getGenero(), admin.getTelefono(), String.valueOf(admin.getFecha_nacimiento()), admin.getUsuario(), admin.getContraseña(),admin.getIdPersona()};
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
            vista.getTxtcedula().setText(cedula2);
            vista.getTxtnombres().setText(nombres2);
            vista.getTxtapellidos().setText(apellidos2);
            vista.getTxtdireccion().setText(direccion2);
            vista.getCmbgenero().setSelectedItem(genero2);
            vista.getTxttelefono().setText(telefono2);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyy-MM-dd");
            Date fechaFormat = formatoFecha.parse(fecha_nacimiento2);
            vista.getdtfecha().setDate(fechaFormat);
            vista.getTxtid_persona().setText(idper2);
            vista.getTxtusuario().setText(usuario2);
            vista.getpwContrasena().setText(contraseña2);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(controladorAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void grabarAdministrador() {
        
        if (vista.getjDialog1().getTitle().contentEquals("CREAR NUEVO ADMINISTRADOR")) {
            idper2 = vista.getTxtid_persona().getText();
            String cedula = vista.getTxtcedula().getText();
            String nombres = vista.getTxtnombres().getText();
            String apellidos = vista.getTxtapellidos().getText();
            String direccion = vista.getTxtdireccion().getText();
            String genero = vista.getCmbgenero().getSelectedItem().toString();
            String telefono = vista.getTxttelefono().getText();
            java.util.Date fehca = vista.getdtfecha().getDate();;
            long auxfecha_Nacimiento = fehca.getTime();
            java.sql.Date fecha = new java.sql.Date(auxfecha_Nacimiento);
            String usuario = vista.getTxtusuario().getText();
            String contrasena = String.valueOf(vista.getpwContrasena().getPassword());

            
            ModeloAdministrador per = new ModeloAdministrador();
            per.setCedula(cedula);
            per.setNombres(nombres);
            per.setApellidos(apellidos);
            per.setDireccion(direccion);
            per.setGenero(genero);
            per.setTelefono(telefono);
            per.setFecha_nacimiento(fecha);
            per.setUsuario(usuario);
            per.setContraseña(hash.sha1(contrasena));

            if (per.grabarAdministrador() == null) {
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
            String genero = vista.getCmbgenero().getSelectedItem().toString();
            String telefono = vista.getTxttelefono().getText();
            java.util.Date fehca = vista.getdtfecha().getDate();;
            long auxfecha_Nacimiento = fehca.getTime();
            java.sql.Date fecha = new java.sql.Date(auxfecha_Nacimiento);
            String usuario = vista.getTxtusuario().getText();
            String contrasena = vista.getpwContrasena().getText();

            ModeloAdministrador per = new ModeloAdministrador();
            per.setCedula(cedula);
            per.setNombres(nombres);
            per.setApellidos(apellidos);
            per.setDireccion(direccion);
            per.setGenero(genero);
            per.setTelefono(telefono);
            per.setFecha_nacimiento(fecha);
            per.setUsuario(usuario);
            per.setContraseña(hash.sha1(contrasena));

            if (per.modificarPersona() == null) {
                JOptionPane.showMessageDialog(null, "Administrador modificado con exito");
                listarAdministrador();
                vista.getjDialog1().dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modiciar al administrador");
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
            vista.getTxtusuario().setText("");
            vista.getpwContrasena().setText("");
            vista.getTxtid_persona().setText(ModeloAdministrador.generarCodigoPersonas());
   }

    public void eliminarAdmin() {
        ModeloAdministrador admin = new ModeloAdministrador();
        if (admin.eliminarAdministrador()== null) {
            JOptionPane.showMessageDialog(null, "administrador eliminada con exito");
            listarAdministrador();
        } else {
            JOptionPane.showMessageDialog(null, "administrador no eliminada");
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
                Validar.letras_espacios(vista.getTxtnombres(), 30); 
               
            }
        });
        vista.getTxtapellidos().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espacios(vista.getTxtapellidos(), 30); 
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
        vista.getTxtusuario().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(vista.getTxtusuario(), 20); 
            }
        });
        vista.getpwContrasena().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.contraseña(vista.getpwContrasena(), 20); 
            }
        });


    }
      private void activar() {
           vista.getBtnEDITAR().setEnabled(true);
        
    }
        private void desactivar() {
           vista.getBtnEDITAR().setEnabled(false);
        
    }
        private void actualizarEstadoBotonEditar() {
        
            activar();
        }
}
