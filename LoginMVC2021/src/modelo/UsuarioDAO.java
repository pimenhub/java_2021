/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Jonathan Pimentel
 */
public class UsuarioDAO implements ConsultasDAO {

    @Override
    public ArrayList<UsuarioVO> login(String nick, String pass) {
        Conector c = new Conector();
        ArrayList<UsuarioVO> info = new ArrayList<>();
        try {
            c.conectar();
            String consulta = "SELECT u.nick_usuario, u.contrasenia_usuario, u.id_tipoUsuario_fk "
                    +"FROM tbl_usuario u "
                    +"WHERE u.nick_usuario ='"+nick+"' AND u.contrasenia_usuario ='"+pass+"';";
            ResultSet rs = c.consulta_datos(consulta);
            while(rs.next()){
                UsuarioVO uvo = new UsuarioVO();
                uvo.setNickU(rs.getString(1));
                uvo.setContraseniaU(rs.getString(2));
                uvo.setTipoUsuarioU(rs.getInt(3));
                info.add(uvo);
            }
            c.desconectar();
        } catch (Exception e) {
            System.err.println("Mensaje Mostrar Datos "+e.getMessage());
        }
        return info;
    }
    
}
