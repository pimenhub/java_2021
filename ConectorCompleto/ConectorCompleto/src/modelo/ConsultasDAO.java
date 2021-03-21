/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author JAVA-MV
 */
public interface ConsultasDAO {
    
    public void insertar(PaisVO p);
    
    public ArrayList<PaisVO> consultarTabla();
    
    public ArrayList<PaisVO> consultarID(PaisVO pvo);
    
    public void modificar(PaisVO p);
   
}
