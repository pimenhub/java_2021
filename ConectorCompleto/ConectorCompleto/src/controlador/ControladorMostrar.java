
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Mostrar;


public class ControladorMostrar implements ActionListener, WindowListener {

    Frm_Mostrar fm = new Frm_Mostrar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    
    public ControladorMostrar(Frm_Mostrar fm, PaisVO pvo, PaisDAO pdao){
    
        this.fm = fm;
        this.pvo = pvo;
        this.pdao = pdao;
        
        
        fm.addWindowListener(this);
        fm.btnAcualizar.addActionListener(this);

    }
    
    private void mostrar(){
    DefaultTableModel m = new DefaultTableModel();
    m.setColumnCount(0);
    m.addColumn("Id");
    m.addColumn("Nombre del País");
    m.addColumn("Capital del País");
    m.addColumn("Población");
    
        for (PaisVO v : this.pdao.consultarTabla()) {
            m.addRow(new Object[]{v.getId(),v.getNombre_pais(),v.getCapital_pais(),v.getPoblacion_pais()});
        }
    fm.tblMostrar.setModel(m);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == fm.btnAcualizar){
           this.mostrar();
       }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
