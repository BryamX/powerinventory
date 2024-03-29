/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final2024.newpackageControlador;

import java.awt.event.ItemEvent;
import proyecto_final2024.newpackageControlador.controladorAdministrador;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
import proyecto_final2024.newpackageModelo.Conexion;
import proyecto_final2024.newpackageModelo.Empresa;
import proyecto_final2024.newpackageModelo.ModeloProveedor;
import proyecto_final2024.newpackageModelo.Proveedor;
import proyecto_final2024.newpackageVista.VistaPrincipal;
import proyecto_final2024.newpackageVista.VistaProveedor;

/**
 *
 * @author elshi
 */
public class controladorProveedor {

    VistaProveedor vista;

    static public String id_persona, nombresC, apellidosC, direccionC, generoC, telefonoC, fecha_nacimientoC, cedulaC;
    static public String empresa, idProveedor;
    static public String cedulaCienteBuscado;

    public controladorProveedor(VistaProveedor vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setBorder(null);
        this.vista.setLocation(0, -23);
        controlKey();
        desactivar();
        vista.getjTableAdmin().setDefaultEditor(Object.class, null);
    }

    public void inicarControladorCliente() {
        this.vista.getCmbgenero().addItemListener((ItemEvent e) -> {
            vista.getBtnGuardar().setEnabled(checkCamposLlenos());
        });
        this.vista.getCmbIdEmpresa().addItemListener((ItemEvent e) -> {
            vista.getBtnGuardar().setEnabled(checkCamposLlenos());
        });
       this.vista.getdtfecha().getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("date".equals(evt.getPropertyName())) {
            // Verificar si todos los campos están llenos para activar el botón guardar
            vista.getBtnGuardar().setEnabled(checkCamposLlenos());
        }
    }
});
        
        this.vista.getTxtcedula().addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent e) {
        
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }
});
     this.vista.getTxtnombres().addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent e) {
        
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }
});
     
      
      this.vista.getTxtapellidos().addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent e) {
        
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }
});
       this.vista.getTxtdireccion().addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent e) {
        
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }
});
        this.vista.getTxttelefono().addKeyListener(new KeyListener() {
    @Override
    public void keyTyped(KeyEvent e) {
        
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
        vista.getBtnGuardar().setEnabled(checkCamposLlenos());
    }
});
        vista.getjTableAdmin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Actualizar el estado del botón de editar
                actualizarEstadoBotonEditar();
            }
        });
        vista.getTxtidPer().setText(ModeloProveedor.generarCodigoPersona());
        listaEmpresas();
        listarProveedores();
        vista.getTxtBUSCAR().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                cedulaCienteBuscado = "" + vista.getTxtBUSCAR().getText();
                List<Proveedor> miListaPro = ModeloProveedor.ProveedorBuscadp();
                DefaultTableModel mTabla = (DefaultTableModel) vista.getjTableAdmin().getModel();
                mTabla.setRowCount(0);
                miListaPro.forEach(admin -> {
                    String[] rowData = {
                        admin.getId_proveedor(), admin.getCedula(), admin.getNombres(), admin.getApellidos(), admin.getDireccion(), admin.getGenero(), admin.getTelefono(), String.valueOf(admin.getFecha_nacimiento()), admin.getId_empresa(), admin.getid_persona()
                    };
                    mTabla.addRow(rowData);
                });
            }
        });
        vista.getjTableAdmin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = vista.getjTableAdmin().getSelectedRow();
                idProveedor = (vista.getjTableAdmin().getValueAt(i, 0).toString());
                cedulaC = (vista.getjTableAdmin().getValueAt(i, 1).toString());
                nombresC = (vista.getjTableAdmin().getValueAt(i, 2).toString());
                apellidosC = (vista.getjTableAdmin().getValueAt(i, 3).toString());
                direccionC = (vista.getjTableAdmin().getValueAt(i, 4).toString());
                generoC = (vista.getjTableAdmin().getValueAt(i, 5).toString());
                telefonoC = (vista.getjTableAdmin().getValueAt(i, 6).toString());
                fecha_nacimientoC = (vista.getjTableAdmin().getValueAt(i, 7).toString());
                empresa = (vista.getjTableAdmin().getValueAt(i, 8).toString());
                id_persona = (vista.getjTableAdmin().getValueAt(i, 9).toString());
            }
        });
        vista.getBtnCREAR().addActionListener(l -> abrirDialogo(true));
        vista.getBtnEDITAR().addActionListener(l -> abrirDialogo(false));
        vista.getBtnGuardar().addActionListener(l -> grabarProveedor());
        vista.getBtnELIMINAR().addActionListener(l -> eliminarPro());
        vista.getBtnSalir().addActionListener(l -> salir());
        vista.getBtnIMPRIMIR().addActionListener(l -> imprimirProveedor());
    }

    public void imprimirProveedor() {
        try {
            JasperReport proveedor = (JasperReport) JRLoader.loadObject(
                    getClass().getResource("/proyecto_final2024/newpackagevista/reportes/proveedor.jasper"));

            Conexion con = new Conexion();
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("titulo", "LISTADO DE PROVEEDORES");
            parametros.put("fecha", "29/01/2024");

//        parametros.put("marcar", 250d);
            JasperPrint jp = JasperFillManager.fillReport(proveedor, parametros, con.getCon());

            JasperViewer Jv = new JasperViewer(jp, false);
            Jv.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(controladorAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void abrirDialogo(boolean nuevo) {
        limpiar();
        if (nuevo) {
            vista.getjDialog1().setTitle("CREAR NUEVO Proveedor");
        } else if (!nuevo) {
            vista.getjDialog1().setTitle("EDITAR PERSONA");
            enviarDatos();
        }
        vista.getjDialog1().setLocationRelativeTo(vista);
        vista.getjDialog1().setSize(537, 580);
        vista.getjDialog1().setVisible(true);
        vista.getjDialog1().setLocationRelativeTo(null);
    }

    public void grabarProveedor() {

        if (vista.getjDialog1().getTitle().contentEquals("CREAR NUEVO Proveedor")) {
            id_persona = vista.getTxtidPer().getText();
            String cedula = vista.getTxtcedula().getText();
            String nombres = vista.getTxtnombres().getText();
            String apellidos = vista.getTxtapellidos().getText();
            String direccion = vista.getTxtdireccion().getText();
            String genero = vista.getCmbgenero().getSelectedItem().toString();
            String telefono = vista.getTxttelefono().getText();
            java.util.Date fehca = vista.getdtfecha().getDate();;
            long auxfecha_Nacimiento = fehca.getTime();
            java.sql.Date fecha = new java.sql.Date(auxfecha_Nacimiento);
            String idEmpresa = vista.getCmbIdEmpresa().getSelectedItem().toString();
            int codigo = 0;
            List<Empresa> listaEmpresas = ModeloProveedor.llenarEmpresas();
            for (int i = 0; i < listaEmpresas.size(); i++) {
                if (listaEmpresas.get(i).getNombre_empresa().equals(idEmpresa)) {
                    codigo = listaEmpresas.get(i).getId_empresa();
                    System.out.println(codigo);
                    i = listaEmpresas.size();
                }
            }

            ModeloProveedor per = new ModeloProveedor();

            per.setCedula(cedula);
            per.setNombres(nombres);
            per.setApellidos(apellidos);
            per.setDireccion(direccion);
            per.setGenero(genero);
            per.setTelefono(telefono);
            per.setFecha_nacimiento(fecha);
            per.setId_empresa(String.valueOf(codigo));

            if (per.grabarAdministrador() == null) {
                JOptionPane.showMessageDialog(null, "Proveedor creado con exito");
                listarProveedores();
                vista.getjDialog1().dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear al proveedor");
            }

        } else if (vista.getjDialog1().getTitle().contentEquals("EDITAR PERSONA")) {
            String cedula = vista.getTxtcedula().getText();
            String nombres = vista.getTxtnombres().getText();
            String apellidos = vista.getTxtapellidos().getText();
            String direccion = vista.getTxtdireccion().getText();
            String genero = vista.getCmbgenero().getSelectedItem().toString();
            String telefono = vista.getTxttelefono().getText();
            java.util.Date fehca = vista.getdtfecha().getDate();
            long auxfecha_Nacimiento = fehca.getTime();
            java.sql.Date fecha = new java.sql.Date(auxfecha_Nacimiento);
            String idEmpresa = vista.getCmbIdEmpresa().getSelectedItem().toString();
            int codigo = 0;
            List<Empresa> listaEmpresas = ModeloProveedor.llenarEmpresas();
            for (int i = 0; i < listaEmpresas.size(); i++) {
                if (listaEmpresas.get(i).getNombre_empresa().equals(idEmpresa)) {
                    codigo = listaEmpresas.get(i).getId_empresa();
                    System.out.println(codigo);
                    i = listaEmpresas.size();
                }
            }

            ModeloProveedor per = new ModeloProveedor();
            per.setCedula(cedula);
            per.setNombres(nombres);
            per.setApellidos(apellidos);
            per.setDireccion(direccion);
            per.setGenero(genero);
            per.setTelefono(telefono);
            per.setFecha_nacimiento(fecha);
            per.setId_empresa(String.valueOf(codigo));

            if (per.modificarProveedor() == null) {
                JOptionPane.showMessageDialog(null, "Proveedor modificado con exito");
                listarProveedores();
                vista.getjDialog1().dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar al proveedor");
            }
        }
    }

    public void listarProveedores() {

        List<Proveedor> miListaAdmin = ModeloProveedor.listarProveedor();
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vista.getjTableAdmin().getModel();
        mTabla.setNumRows(0);
        miListaAdmin.stream().forEach(admin -> {
            String[] rowData = {admin.getId_proveedor(), admin.getCedula(), admin.getNombres(), admin.getApellidos(), admin.getDireccion(), admin.getGenero(), admin.getTelefono(), String.valueOf(admin.getFecha_nacimiento()), admin.getId_empresa(), admin.getid_persona()};
            mTabla.addRow(rowData);
        });
    }

    public void listaEmpresas() {
        List<Empresa> listaEmpresas = ModeloProveedor.llenarEmpresas();
        for (int i = 0; i < listaEmpresas.size(); i++) {
            vista.getCmbIdEmpresa().addItem(listaEmpresas.get(i).getNombre_empresa());
        }
    }

    public void enviarDatos() {
        try {
            vista.getTxtcedula().setText(cedulaC);
            vista.getTxtnombres().setText(nombresC);
            vista.getTxtapellidos().setText(apellidosC);
            vista.getTxtdireccion().setText(direccionC);
            vista.getCmbgenero().setSelectedItem(generoC);
            vista.getTxttelefono().setText(telefonoC);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyy-MM-dd");
            Date fechaFormat = formatoFecha.parse(fecha_nacimientoC);
            vista.getdtfecha().setDate(fechaFormat);
            vista.getCmbIdEmpresa().setSelectedItem(empresa);
            vista.getTxtidPer().setText(id_persona);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(controladorAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limpiar() {
        vista.getTxtcedula().setText("");
        vista.getTxtnombres().setText("");
        vista.getTxtapellidos().setText("");
        vista.getTxtdireccion().setText("");
        vista.getCmbgenero().setSelectedIndex(0);
        vista.getTxttelefono().setText("");
        vista.getdtfecha().setDate(null);
        vista.getCmbIdEmpresa().setSelectedItem("");
        vista.getTxtidPer().setText(ModeloProveedor.generarCodigoPersona());
    }

    public void eliminarPro() {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este proveedor?", "Confirmación de eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            ModeloProveedor proveedor = new ModeloProveedor();
            if (proveedor.eliminarPro() == null) {
                JOptionPane.showMessageDialog(null, "Proveedor eliminado con éxito");
                listarProveedores();
                desactivar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el proveedor");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación de eliminación cancelada");
        }
    }

    public void salir() {
        vista.dispose();
    }

    public void controlKey() {
        vista.getTxtcedula().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxtcedula(), 10);
            }
        });
        vista.getTxtnombres().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espacios(vista.getTxtnombres(), 30);
            }
        });
        vista.getTxtapellidos().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espacios(vista.getTxtapellidos(),30);
            }
        });
        vista.getTxtdireccion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.letras_espacios(vista.getTxtdireccion(), 80);
            }
        });
        vista.getTxttelefono().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Validar.numero(vista.getTxttelefono(), 10);
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
    private boolean checkCamposLlenos() {
        return !vista.getTxtcedula().getText().isEmpty() &&
           !vista.getTxtnombres().getText().isEmpty() &&
           !vista.getTxtapellidos().getText().isEmpty() &&
           !vista.getTxtdireccion().getText().isEmpty() &&
           !vista.getTxttelefono().getText().isEmpty() 
                &&
                vista.getCmbgenero().getSelectedItem() != null &&
                  vista.getCmbIdEmpresa().getSelectedItem() !=null &&
           vista.getdtfecha().getDate()!= null ;
              
                
                
                
}
}
