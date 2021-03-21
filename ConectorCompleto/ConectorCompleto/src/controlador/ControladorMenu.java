
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Frm_BuscarID;
import vista.Frm_Eliminar;
import vista.Frm_Insertar;
import vista.Frm_Menu;
import vista.Frm_Modificar;
import vista.Frm_Mostrar;

/**
 *
 * @author JAVA-MV
 */
public class ControladorMenu implements ActionListener {
    Frm_Menu vMe = new Frm_Menu();
    Frm_Insertar vI = new Frm_Insertar();
    Frm_Eliminar vE = new Frm_Eliminar();
    Frm_Mostrar vM = new Frm_Mostrar();
    Frm_Modificar vMo = new Frm_Modificar();
    Frm_BuscarID vbi = new Frm_BuscarID();

    public ControladorMenu(Frm_Menu vMe,Frm_Insertar vI, Frm_Eliminar vE, Frm_Mostrar vM, Frm_Modificar vMo, Frm_BuscarID vbi) {
    this.vMe = vMe;
    this.vI = vI;
    this.vE = vE;
    this.vM = vM;
    this.vMo = vMo;
    this.vbi = vbi;
    vMe.btnInsetar.addActionListener(this);
    vMe.btnEliminar.addActionListener(this);
    vMe.btnMostrar.addActionListener(this);
    vMe.btnModificar.addActionListener(this);
    vMe.btnBuscarID.addActionListener(this);
    
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vMe.btnInsetar){
        vI.setVisible(true);
        }
        if(e.getSource() == vMe.btnEliminar){
        vE.setVisible(true);
        }
        if(e.getSource() == vMe.btnMostrar){
        vM.setVisible(true);
        }
        if(e.getSource() == vMe.btnModificar){
        vMo.setVisible(true);
        }
       if(e.getSource() == vMe.btnBuscarID){
        vbi.setVisible(true);
        }
    }
    
}
