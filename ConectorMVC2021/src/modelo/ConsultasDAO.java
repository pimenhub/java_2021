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
    public void insertar(PaisVO p);
    public void actualizar(PaisVO p);
    public void eliminar(PaisVO p);
    public ArrayList<PaisVO> consultarTabla();
}
