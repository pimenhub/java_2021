
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Eliminar;


public class ControladorEliminar implements MouseListener, WindowListener{
    Frm_Eliminar vista = new Frm_Eliminar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorEliminar(Frm_Eliminar vista, PaisVO pvo, PaisDAO pdao) {
        this.vista = vista;
        this.pvo = pvo;
        this.pdao = pdao;
        
        vista.addWindowListener(this);
        vista.tblEliminar.addMouseListener(this);
        
    }
    
    private void mostrar(){
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        m.setColumnCount(0);
        m.addColumn("Id");
        m.addColumn("Nombre del Pais");
        m.addColumn("Capital del Pais");
        m.addColumn("Población del Pais");
        
        for (PaisVO v: pdao.consultarTabla()) {
            m.addRow(new Object[]{v.getId_pais(), v.getNombre_pais(), 
                v.getCapital_pais(), v.getPoblacion_pais()});
        }
        vista.tblEliminar.setModel(m);
    }
    
    private void agregarDato(){
        int seleccion;
        seleccion = vista.tblEliminar.getSelectedRow();
        pvo.setId_pais((int) vista.tblEliminar.getValueAt(seleccion, 0));
        int dato = vista.jopEliminar.showConfirmDialog(null, 
                "En verdad desea eliminar a "+String.valueOf(vista.tblEliminar.getValueAt(seleccion, 1)),"",vista.jopEliminar.ERROR_MESSAGE);
        if(dato == vista.jopEliminar.YES_OPTION){
            this.eliminar();
            vista.jopEliminar.showMessageDialog(null, "Registro Eliminado");
        }
        else{
        }
    }
    private void eliminar() {
        pvo.getId_pais();
        pdao.eliminar(pvo);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount() == 2)
        this.agregarDato();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
//--------------------------------------------------------//
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
