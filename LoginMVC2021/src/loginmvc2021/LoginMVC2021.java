/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmvc2021;

import controlador.ControladorLogin;
import modelo.TipoUsuarioVO;
import modelo.UsuarioDAO;
import modelo.UsuarioVO;
import vista.FrmAdmin;
import vista.FrmCliente;
import vista.FrmLogin;


/**
 *
 * @author Jonathan Pimentel
 */
public class LoginMVC2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmLogin frmL = new FrmLogin();
        FrmAdmin frmA = new FrmAdmin();
        FrmCliente frmC = new FrmCliente();
        
        UsuarioDAO udao = new UsuarioDAO();
        UsuarioVO uvo = new UsuarioVO();
        TipoUsuarioVO tuvo = new TipoUsuarioVO();
        
        ControladorLogin cl = new ControladorLogin(frmL, frmA, frmC, udao, uvo, tuvo);
        
        frmL.setVisible(true);
        frmL.setLocationRelativeTo(null);
    }
    
}
