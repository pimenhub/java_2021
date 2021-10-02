/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TuitDAO;
import modelo.TuitVO;
import vista.FrmTuit;

/**
 *
 * @author Jonathan Pimentel
 */
public class ControladorInsertar implements ActionListener{
    FrmTuit frmT = new FrmTuit();
    TuitVO tvo = new TuitVO();
    TuitDAO tdao = new TuitDAO();

    public ControladorInsertar(FrmTuit frmT, TuitVO tvo, TuitDAO tdao) {
        this.frmT = frmT;
        this.tvo = tvo;
        this.tdao = tdao;
        
        frmT.btnEnviar.addActionListener(this);
        frmT.btnCancelar.addActionListener(this);
    }

    
    private void insertar(){
            tvo.setTituloT(frmT.txtTitulo.getText());
            tvo.setDescripcionT(frmT.txaDescripcion.getText());
            Calendar c = Calendar.getInstance();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechaFormato = formatoFecha.format(c.getTime());
            tvo.setFechaT(fechaFormato);
            
            tdao.insertar(tvo);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frmT.btnEnviar){
            this.insertar();
            frmT.jopEnviado.showMessageDialog(frmT, "Tuit Enviado");
            frmT.txtTitulo.setText("");
            frmT.txaDescripcion.setText("");
        }
        if(e.getSource() == frmT.btnCancelar){
            System.exit(0);
        }
    }
    
    
    
    
}
