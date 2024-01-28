package proyecto_final2024.newpackageControlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import proyecto_final2024.newpackageVista.VistaBarradecarga;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author USER
 */
public class ControladorCarga {
    
    VistaBarradecarga vista;

    public ControladorCarga(VistaBarradecarga vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        ProcesoDeCarga();
    }
    
    public void ProcesoDeCarga() {
        Timer mTimer = new Timer(15, (ActionEvent e) -> {
            vista.getPsgCarga().setValue(vista.getPsgCarga().getValue() + 1);
             vista.getPsgCarga().setBackground(Color.cyan);
             vista.getPsgCarga().setStringPainted(true);
             vista.getPsgCarga().setString("Cargando reportes..." +  vista.getPsgCarga().getValue() + "%");
        });

        mTimer.start();
    }
}
