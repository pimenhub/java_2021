
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.Frm_Modificar;


public class ControladorModificar implements ActionListener, MouseListener, WindowListener{
    Frm_Modificar vista = new Frm_Modificar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorModificar(Frm_Modificar vista, PaisVO pvo, PaisDAO pdao) {
        this.vista = vista;
        this.pvo = pvo;
        this.pdao = pdao;
        
        vista.btnActualizar.addActionListener(this);
        vista.addWindowListener(this);
        vista.tblModificar.addMouseListener(this);
        
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
        vista.tblModificar.setModel(m);
    }
    
    private void agregarDato(){
        int seleccion;
        seleccion = vista.tblModificar.getSelectedRow();
        pvo.setId_pais((int) vista.tblModificar.getValueAt(seleccion, 0));
        vista.txtNombreModi.setText(String.valueOf(vista.tblModificar.getValueAt(seleccion, 1)));
        vista.txtCapitalModi.setText(String.valueOf(vista.tblModificar.getValueAt(seleccion, 2)));
        vista.txtPoblacionModi.setText(String.valueOf(vista.tblModificar.getValueAt(seleccion, 3)));
        
    }
    private void modificar(){
        pvo.getId_pais();
        pvo.setNombre_pais(vista.txtNombreModi.getText());
        pvo.setCapital_pais(vista.txtCapitalModi.getText());
        pvo.setPoblacion_pais(Long.parseLong(vista.txtPoblacionModi.getText()));
        pdao.actualizar(pvo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnActualizar){
            if(true){
            this.modificar();
            vista.jopModificar.showMessageDialog(null, "Registro Actualizado");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
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
