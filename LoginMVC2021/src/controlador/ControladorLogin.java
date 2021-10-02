/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
public class ControladorLogin implements ActionListener {

    FrmLogin frmL = new FrmLogin();
    FrmAdmin frmA = new FrmAdmin();
    FrmCliente frmC = new FrmCliente();
    UsuarioDAO udao = new UsuarioDAO();
    UsuarioVO uvo = new UsuarioVO();
    TipoUsuarioVO tuvo = new TipoUsuarioVO();

    public ControladorLogin(FrmLogin frmL, FrmAdmin frmA, FrmCliente frmC,
            UsuarioDAO udao, UsuarioVO uvo, TipoUsuarioVO tuvo) {
        this.frmL = frmL;
        this.frmA = frmA;
        this.frmC = frmC;
        this.udao = udao;
        this.uvo = uvo;
        this.tuvo = tuvo;

        frmL.btnIngresarLogin.addActionListener(this);
    }

    private void login() {
        String nick;
        String pass;
        nick = frmL.txtNick.getText();
        pass = frmL.txtPass.getText();
        //Se establece un array para recibir los datos
        ArrayList<UsuarioVO> datos;
        datos = udao.login(nick, pass);
        //Se recorre el array para validar los datos
        if (!nick.isEmpty() && !pass.isEmpty()) {
            //Se valida si la consulta no encontro el dato
            if (!datos.isEmpty()) {
                for (UsuarioVO d : datos) {
                    if (nick.equals(d.getNickU()) && pass.equals(d.getContraseniaU())) {
                        if (d.getTipoUsuarioU() == 1) {
                            frmA.setVisible(true);
                            frmA.setLocationRelativeTo(null);
                            frmL.dispose();
                        }
                        if (d.getTipoUsuarioU() == 2) {
                            frmC.setVisible(true);
                            frmC.setLocationRelativeTo(null);
                            frmL.dispose();
                        }
                    }
                }
            } else {
                frmL.jopValidacion.showMessageDialog(null, "Usuario o Contrasenia Erroneos, Intentar de nuevo");
            }
        } else {
            frmL.jopValidacion.showMessageDialog(null, "Usuario o Contrasenia No Ingresados");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmL.btnIngresarLogin) {
            this.login();
        }
    }

}
