/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomvctraductor;

import controlador.Controlador;
import modelo.Modelo;
import vista.Frm_Traductor;

/**
 *
 * @author Jonathan Pimentel
 */
public class EjemploMVCTraductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frm_Traductor t = new Frm_Traductor();
        Modelo m = new Modelo();
        Controlador c = new Controlador(t,m);
        t.setVisible(true);
        t.setLocationRelativeTo(null);
        
    }
    
}
