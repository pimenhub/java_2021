/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author JAVA-MV
 */
public class ControladorModificar implements ActionListener, MouseListener, WindowListener{

    Frm_Modificar fmo = new Frm_Modificar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    
    public ControladorModificar(Frm_Modificar fmo, PaisVO pvo, PaisDAO pdao){
    this.fmo = fmo;
    this.pvo = pvo;
    this.pdao = pdao;
    
    fmo.btnModificarInfo.addActionListener(this);
    fmo.addWindowListener(this);
    fmo.addMouseListener(this);
    fmo.tblModificar.addMouseListener(this);
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
    fmo.tblModificar.setModel(m);
    }
    
    private void agregarDatos(){
    int seleccion;
    seleccion = fmo.tblModificar.getSelectedRow();
    pvo.setId((int)fmo.tblModificar.getValueAt(seleccion, 0));
    fmo.txtNombreP.setText(String.valueOf(fmo.tblModificar.getValueAt(seleccion, 1)));
    fmo.txtCapitalP.setText(String.valueOf(fmo.tblModificar.getValueAt(seleccion, 2)));
    fmo.txtPoblacionP.setText(String.valueOf(fmo.tblModificar.getValueAt(seleccion, 3)));
    
    }
    private void modificar(){
     pvo.getId();
     pvo.setNombre_pais(fmo.txtNombreP.getText());
     pvo.setCapital_pais(fmo.txtCapitalP.getText());
     pvo.setPoblacion_pais(Integer.parseInt(fmo.txtPoblacionP.getText()));
     pdao.modificar(pvo);
     
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == fmo.btnModificarInfo){
        this.modificar();
        this.mostrar();
        
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.agregarDatos();
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
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
