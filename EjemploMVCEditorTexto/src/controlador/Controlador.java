/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Frm_Bloc;

/**
 *
 * @author Jonathan Pimentel
 */
public class Controlador implements ActionListener {

    Frm_Bloc vista = new Frm_Bloc();
    Modelo modelo = new Modelo();

    public Controlador(Frm_Bloc vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.jmbArchivo.addActionListener(this);
        vista.miGuardar.addActionListener(this);
        vista.miAbrir.addActionListener(this);
        vista.miMay.addActionListener(this);
        vista.miMin.addActionListener(this);
        vista.miNe.addActionListener(this);
        vista.miGuardarComo.addActionListener(this);
        vista.miNuevo.addActionListener(this);
        vista.miNor.addActionListener(this);
        vista.miCur.addActionListener(this);

    }

    private void abrir() {

        int s = vista.jfcEmergente.showOpenDialog(null);
        if (s != vista.jfcEmergente.CANCEL_OPTION) {
            modelo.setRuta(vista.jfcEmergente.getSelectedFile().toString());
            vista.txtArea.setText(modelo.abrirT());
        }
    }

    private void guardarComo() {
        int s = vista.jfcEmergente.showSaveDialog(null);
        if (s != vista.jfcEmergente.CANCEL_OPTION) {
            modelo.setTexto(vista.txtArea.getText());
            modelo.setRuta(vista.jfcEmergente.getSelectedFile().toString());
            modelo.guardarT();
        }
    }

    private void guardar() {

        try {
            modelo.setTexto(vista.txtArea.getText());
            modelo.setRuta(vista.jfcEmergente.getSelectedFile().toString());
            modelo.guardarSolo();
        } catch (Exception e) {
            vista.jopMensaje.showMessageDialog(null, "Aun no ha guardado el Archivo en una Ubicacion");
        }

    }
    private void nuevo() {

        try {
            vista.txtArea.setText("");
            modelo.setRuta(vista.jfcEmergente.getSelectedFile().toString());
        } catch (Exception e) {
            vista.jopMensaje.showMessageDialog(null, "Aun no ha guardado el Archivo en una Ubicacion");
        }

    }

    private void may() {
        vista.txtArea.setText(vista.txtArea.getText().toUpperCase());
    }

    private void min() {
        vista.txtArea.setText(vista.txtArea.getText().toLowerCase());
    }

    private void negrita() {

        vista.txtArea.setFont(modelo.negrita());
    }
    private void normal() {

        vista.txtArea.setFont(modelo.normal());
    }
    private void cursiva() {

        vista.txtArea.setFont(modelo.cursiva());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.miNuevo) {
            this.nuevo();
        }
        if (e.getSource() == vista.miAbrir) {
            this.abrir();
        }
        if (e.getSource() == vista.miGuardar) {
            this.guardar();
        }
        if (e.getSource() == vista.miGuardarComo) {
            this.guardarComo();
        }
        if (e.getSource() == vista.miMay) {
            this.may();
        }
        if (e.getSource() == vista.miMin) {
            this.min();
        }
        if (e.getSource() == vista.miNe) {
            this.negrita();
        }
        if (e.getSource() == vista.miNor) {
            this.normal();
        }
        if (e.getSource() == vista.miCur) {
            this.cursiva();
        }
    }

}
