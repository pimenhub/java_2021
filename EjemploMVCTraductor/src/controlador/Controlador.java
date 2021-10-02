/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Frm_Traductor;

/**
 *
 * @author Jonathan Pimentel
 */
public class Controlador implements ActionListener{
    //creo los objetos
    Frm_Traductor vista = new Frm_Traductor();
    Modelo modelo = new Modelo();
    //reservo el espacio para esos objetos
    public Controlador(Frm_Traductor vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        
        vista.btnTraducir.addActionListener(this);
        vista.cmbPalabras.addActionListener(this);    
    
    }
    private void traductor(){
      modelo.setPalabra(vista.cmbPalabras.getSelectedItem().toString());
      
      vista.lblMostrar.setText(modelo.traducir());
      vista.jopMostrar.showMessageDialog(null, modelo.traducir());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnTraducir){
            this.traductor();
        }
    }
    
}
