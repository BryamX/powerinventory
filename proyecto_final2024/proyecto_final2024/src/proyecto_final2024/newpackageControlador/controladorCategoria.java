/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final2024.newpackageControlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
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
import proyecto_final2024.newpackageModelo.Categoria;
import proyecto_final2024.newpackageModelo.Conexion;
import proyecto_final2024.newpackageModelo.ModeloCategoriaP;
import proyecto_final2024.newpackageVista.VistaCategoria;

/**
 *
 * @author elshi
 */
public class controladorCategoria {

    VistaCategoria vista;

    static public String id_cat, nombre_cat, descripcion_cat;
    static public String idBuscara;

    public controladorCategoria(VistaCategoria vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setBorder(null);
        this.vista.setLocation(0, -23);
        controlKey();
         desactivar();
             vista.getTblcategorias().setDefaultEditor(Object.class, null);
    }
    
    
    public void iniciarcontroladorCategoria(){
        listarCategoria();
        vista.getTxtnombre().addKeyListener(new KeyAdapter() {
    @Override
    public void keyReleased(KeyEvent e) {
        vista.getBtnaceptar().setEnabled(checkCamposLlenos());
    }
});

vista.getTxtdescripcion().addKeyListener(new KeyAdapter() {
    @Override
    public void keyReleased(KeyEvent e) {
        vista.getBtnaceptar().setEnabled(checkCamposLlenos());
    }
});
         vista.getTblcategorias().addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        // Actualizar el estado del botón de editar
        actualizarEstadoBotonEditar();
    }
});
        
         vista.getTxtbuscar().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                idBuscara = "" + vista.getTxtbuscar().getText();
                System.out.println(idBuscara);
                List<Categoria> miListaPro = ModeloCategoriaP.buscarCategoria();
                DefaultTableModel mTabla = (DefaultTableModel) vista.getTblcategorias().getModel();
                mTabla.setRowCount(0);
                miListaPro.forEach(admin -> {
                    String[] rowData = {String.valueOf(admin.getId_categoria()), admin.getNombre_categoria(), admin.getDescripcion_categoria()};
                    mTabla.addRow(rowData);
                });
            }
        });
        vista.getTblcategorias().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = vista.getTblcategorias().getSelectedRow();
                id_cat = vista.getTblcategorias().getValueAt(i, 0).toString();
                System.out.println(id_cat);
                nombre_cat = (vista.getTblcategorias().getValueAt(i, 1).toString());
                descripcion_cat = (vista.getTblcategorias().getValueAt(i, 2).toString());

            }
        });
        
        vista.getBtnCrear().addActionListener(l -> abrirDialogo(true));
        vista.getBtnModificar().addActionListener(l -> abrirDialogo(false));
        vista.getBtnaceptar().addActionListener(l -> crearModificarCategoria());
        vista.getBtnEliminar().addActionListener(l -> eliminarCategoria());
        vista.getBtnImprimir().addActionListener(l->imprimirCategorias());
        vista.getBtnSalir().addActionListener(l -> salir());
    }

    private void abrirDialogo(boolean nuevo) {
        limpiar();
        if (nuevo) {
            vista.getjDialog1().setTitle("CREAR CATEGORIA");
        } else if (!nuevo) {
            vista.getjDialog1().setTitle("EDITAR CATEGORIA");
            enviarDatos();
        }
        vista.getjDialog1().setLocationRelativeTo(vista);
        vista.getjDialog1().setSize(543, 542);
        vista.getjDialog1().setVisible(true);
        vista.getjDialog1().setLocationRelativeTo(null);
    }

    public void enviarDatos() {
        vista.getTxtidcategoria().setText(id_cat);
        vista.getTxtnombre().setText(nombre_cat);
        vista.getTxtdescripcion().setText(descripcion_cat);
    }



    public void crearModificarCategoria() {

        if (vista.getjDialog1().getTitle().contentEquals("CREAR CATEGORIA")) {
            String id = vista.getTxtidcategoria().getText();
            String nombre = vista.getTxtnombre().getText();
            String descripcion = vista.getTxtdescripcion().getText();

            ModeloCategoriaP cat = new ModeloCategoriaP();
            cat.setNombre_categoria(nombre);
            cat.setDescripcion_categoria(descripcion);

            if (cat.crearCategoria() == null) {
                limpiar();
                JOptionPane.showMessageDialog(null, "Categoria creada con exito");
                listarCategoria();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear categoria");
            }

        } else if (vista.getjDialog1().getTitle().contentEquals("EDITAR CATEGORIA")) {
            String id = vista.getTxtidcategoria().getText();
            String nombre = vista.getTxtnombre().getText();
            String descripcion = vista.getTxtdescripcion().getText();
            int codigo = 0;
            List<Categoria> listaCatego = ModeloCategoriaP.listaCategorias();
            for (int i = 0; i < listaCatego.size(); i++) {
                if (listaCatego.get(i).getNombre_categoria().equals(id)) {
                    codigo = listaCatego.get(i).getId_categoria();
                    System.out.println(codigo);
                    i = listaCatego.size();
                }
            }

            ModeloCategoriaP cat = new ModeloCategoriaP();
            cat.setNombre_categoria(nombre);
            cat.setDescripcion_categoria(descripcion);

            if (cat.modificarCategoria() == null) {
                JOptionPane.showMessageDialog(null, "Categoria modificada con exito");
                listarCategoria();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la categoria");
            }
        }
    }

    public void listarCategoria() {
        List<Categoria> miListaAdmin = ModeloCategoriaP.listaCategorias();
        DefaultTableModel mTabla;
        mTabla = (DefaultTableModel) vista.getTblcategorias().getModel();
        mTabla.setNumRows(0);
        miListaAdmin.stream().forEach(cat -> {
            String[] rowData = {String.valueOf(cat.getId_categoria()), cat.getNombre_categoria(), cat.getDescripcion_categoria()};
            mTabla.addRow(rowData);
        });
    }

    public void limpiar() {
        vista.getTxtidcategoria().setText("");
        vista.getTxtnombre().setText("");
        vista.getTxtdescripcion().setText("");
    }

//    public void eliminarCategoria() {
//        ModeloCategoriaP cat = new ModeloCategoriaP();
//        if (cat.eliminarCategoria() == null) {
//            JOptionPane.showMessageDialog(null, "Categoria eliminada con exito");
//            listarCategoria();
//        } else {
//            JOptionPane.showMessageDialog(null, "Categoria no eliminada");
//        }
//    }
    public void eliminarCategoria() {
        int i = vista.getTblcategorias().getSelectedRow();;
        if (i >= 0) {
            String id = vista.getTblcategorias().getValueAt(i, 0).toString();
            ModeloCategoriaP categoria = new ModeloCategoriaP();
            categoria.setId_categoria(Integer.valueOf(id));
            int opcion = JOptionPane.showConfirmDialog(vista,
                    "¿Estás seguro que deseas eliminar esta categoria?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                if (categoria.eliminarCategoria()== null) {
                    JOptionPane.showMessageDialog(vista, "Categoria eliminada exitosamente");
                    listarCategoria();
                    desactivar();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al eliminar producto");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Primero elige una fila");
        }
    }

    public void salir(){
        vista.dispose();
    }
    public void controlKey() {
        vista.getTxtnombre().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espacios(vista.getTxtnombre(), 15); 
            }
        });
        vista.getTxtdescripcion().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras_espaciosAREA(vista.getTxtdescripcion(), 100); 
            }
        });

    }
    public void imprimirCategorias() {
            
            try {
                Conexion connection = new Conexion();
                JasperReport reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/proyecto_final2024/newpackagevista/reportes/reporteCategorias.jasper"));
                JasperPrint jp = JasperFillManager.fillReport(reporte, null, connection.getCon());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(controladorCategoria.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
      private void activar() {
           vista.getBtnModificar().setEnabled(true);
        
    }
        private void desactivar() {
           vista.getBtnModificar().setEnabled(false);
           vista.getBtnaceptar().setEnabled(false);
        
    }
        private void actualizarEstadoBotonEditar() {
        
            activar();
        }
        private boolean checkCamposLlenos() {
    return !vista.getTxtnombre().getText().isEmpty() &&
           !vista.getTxtdescripcion().getText().isEmpty();
}
    
    
}
