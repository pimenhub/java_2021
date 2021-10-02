/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuitsw;

import controlador.ControladorInsertar;
import java.awt.Color;
import modelo.Conector;
import modelo.TuitDAO;
import modelo.TuitVO;
import vista.FrmTuit;

/**
 *
 * @author Jonathan Pimentel
 */
public class TuitSW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmTuit frmT = new FrmTuit();
        TuitVO tvo = new TuitVO();
        TuitDAO tdao = new TuitDAO();
        Conector c = new Conector();
        c.conectar();
        ControladorInsertar ci = new ControladorInsertar(frmT, tvo, tdao);
        frmT.setVisible(true);
        frmT.setResizable(false);
        frmT.setLocationRelativeTo(null);
        frmT.getContentPane().setBackground(Color.WHITE);
    }

}
