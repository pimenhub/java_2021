
package controlador;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Mostrar;


public class ControladorMostrar implements WindowListener{
    
    Frm_Mostrar vista = new Frm_Mostrar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorMostrar(Frm_Mostrar vista, PaisVO pvo, PaisDAO pdao) {
        this.vista = vista;
        this.pvo = pvo;
        this.pdao = pdao;
        
        vista.addWindowListener(this);
    }
    
    private void mostrar(){
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("Id");
        m.addColumn("Nombre del País");
        m.addColumn("Capital del País");
        m.addColumn("Población");
        
        for (PaisVO pvo : pdao.consultarTabla()) {
            m.addRow(new Object[]{pvo.getId_pais(),pvo.getNombre_pais(),
                pvo.getCapital_pais(),pvo.getPoblacion_pais()});
        }
        vista.tblMostrar.setModel(m);
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
        this.mostrar();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
