
package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;


public class PaisDAO implements ConsultasDAO{

    @Override
    public void insertar(PaisVO p){
      Conector c = new Conector();
        try {
          c.conectar();
      c.consulta_multiples("INSERT INTO tbl_pais (nombre_pais,"
              + "capital_pais, poblacion_pais) VALUES ( '"+p.getNombre_pais()+"','"+p.getCapital_pais()+"',"+p.getPoblacion_pais()+");");                       
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    c.desconectar();
    }

    @Override
    public ArrayList<PaisVO> consultarTabla() {
        Conector c = new Conector();
        ArrayList<PaisVO> info = new ArrayList();
        try {
        c.conectar();
        ResultSet rs = c.consulta_obtener("SELECT * FROM tbl_pais;");
        while(rs.next()){
            PaisVO pvo = new PaisVO();
            pvo.setId(rs.getInt(1));
            pvo.setNombre_pais(rs.getString(2));
            pvo.setCapital_pais(rs.getString(3));
            pvo.setPoblacion_pais(rs.getLong(4));
            info.add(pvo);
        }
    
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return info;
    }
    
    
    @Override
    public ArrayList<PaisVO> consultarID(PaisVO pvo) {
        Conector c = new Conector();
        
        ArrayList<PaisVO> info = new ArrayList();
        try {
        c.conectar();
        ResultSet rs = c.consulta_obtener("SELECT * FROM tbl_pais WHERE nombre_pais LIKE '%"+pvo.getNombre_pais()+"%';");
        while(rs.next()){
            PaisVO pv = new PaisVO();
            pv.setId(rs.getInt(1));
            pv.setNombre_pais(rs.getString(2));
            pv.setCapital_pais(rs.getString(3));
            pv.setPoblacion_pais(rs.getLong(4));
            info.add(pv);
        }
    
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return info;
    }

    
    
    @Override
    public void modificar(PaisVO p) {
       Conector c = new Conector();
        try {
            c.conectar();
            c.consulta_multiples("UPDATE tbl_pais SET nombre_pais= '"+p.getNombre_pais()
                    + "', capital_pais='"+p.getCapital_pais()
                    + "' ,poblacion_pais="+p.getPoblacion_pais()
                    + " WHERE id ="+p.getId());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
       
    }

    

   
  
}
