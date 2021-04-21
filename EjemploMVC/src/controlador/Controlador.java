
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloLogica;
import vista.Frm_Operaciones;


public class Controlador implements ActionListener{
    Frm_Operaciones vista = new Frm_Operaciones();
    ModeloLogica modelo = new ModeloLogica();
    
    public Controlador(Frm_Operaciones vista, ModeloLogica modelo){
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista.btnSumar.addActionListener(this);
        this.vista.btnRestar.addActionListener(this);
    }
    
    private void sum(){
        modelo.setN1(Integer.parseInt(vista.txtNum1.getText()));
        modelo.setN2(Integer.parseInt(vista.txtNum2.getText()));
        vista.jopResultado.showMessageDialog(null, modelo.suma());
    }
    private void res(){
        modelo.setN1(Integer.parseInt(vista.txtNum1.getText()));
        modelo.setN2(Integer.parseInt(vista.txtNum2.getText()));
        vista.jopResultado.showMessageDialog(null, modelo.resta());
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == vista.btnSumar){
          this.sum();
      }
      if(e.getSource() == vista.btnRestar){
          this.res();
      }
      
    }
    
}
