/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jonathan Pimentel
 */
public class TuitDAO implements ConsultasDAO{

    @Override
    public void insertar(TuitVO t) {
        Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "INSERT INTO tbl_tuit (titulo_tuit, "
                    + "descripcion_tuit, fecha_tuit) VALUES ( '"+t.getTituloT()
                    +"', '"+t.getDescripcionT()+"', '"+t.getFechaT()+"');";            
            c.consultas_multiples(consulta);            
        } catch (Exception e) {
            System.err.println("Mensaje Insertar "+e.getMessage());
        }
        c.desconectar();
    }
    
}
