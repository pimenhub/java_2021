/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jonathan Pimentel
 */
public interface ConsultasDAO {
    public ArrayList<UsuarioVO> login(String nick, String pass);
}
