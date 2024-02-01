/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final2024.newpackageControlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto_final2024.newpackageModelo.Administrador;
import proyecto_final2024.newpackageModelo.ModeloLogin;
import proyecto_final2024.newpackageVista.VentanaLogin;
import proyecto_final2024.newpackageVista.VistaPrincipal;

/**
 *
 * @author USER
 */
public class ControladorLogin {
     VentanaLogin login;
     public static String usuarios = "", contrasena = "";
     public static String usuariosaux, id;
             
    public ControladorLogin(VentanaLogin login) {
        this.login = login;
        this.login.setVisible(true);
        controlKey();
    }
    
    public void inicarControladorLogin(){
        login.getBtnInicarSesion().addActionListener(l-> iniciarSesion());
        login.getPswContrasena().addActionListener(l->iniciarSesion());
    }
    
    public void iniciarSesion(){
            
        usuarios = login.getTxtUsuario().getText();
        contrasena = hash.sha1(String.valueOf(login.getPswContrasena().getText()));
        
        ModeloLogin logins = new ModeloLogin();
        
        List<Administrador> lista = logins.administradores();
        
        if (lista.size() > 0) {
            VistaPrincipal principal = new VistaPrincipal();
            ControladorPaginaPrincipal control = new  ControladorPaginaPrincipal(principal);
            control.inicarControladorPrincipal();
            login.dispose();
            usuariosaux = lista.get(0).getUsuario();
            id = lista.get(0).getId_administrador();
        } else{
            JOptionPane.showMessageDialog(null,"Verifique su usuario o contraseña");
        }
    }
    public void controlKey() {
        login.getTxtUsuario().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.letras(login.getTxtUsuario(), 15); 
            }
        });
        login.getPswContrasena().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                Validar.contraseña(login.getPswContrasena(), 15); 
            }
        });


    }
  
}
