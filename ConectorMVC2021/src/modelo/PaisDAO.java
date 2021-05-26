/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jonathan Pimentel
 */
public class PaisDAO implements ConsultasDAO{

    @Override
    public void insertar(PaisVO p) {
        Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "INSERT INTO tbl_pais (nombre_pais, "
                    + "capital_pais, poblacion_pais) VALUES ( '"+p.getNombre_pais()
                    +"', '"+p.getCapital_pais()+"', "+p.getPoblacion_pais()+");";
            
            c.consultas_multiples(consulta);
            
        } catch (Exception e) {
            System.err.println("Mensaje Insertar "+e.getMessage());
        }
        c.desconectar();
    }
    
    @Override
    public void actualizar(PaisVO p) {
        Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "UPDATE tbl_pais SET nombre_pais ='"+p.getNombre_pais()+"', "
                    + "capital_pais ='"+p.getCapital_pais()+"', "
                    + "poblacion_pais="+p.getPoblacion_pais()+" WHERE id_pais  ="+p.getId_pais();
            c.consultas_multiples(consulta);
        } catch (Exception e) {
            System.err.println("Erro Actualizar "+e.getMessage());
        }
    }

    @Override
    public void eliminar(PaisVO p) {
        Conector c = new Conector();
        try {
            c.conectar();
            String consulta = "DELETE FROM tbl_pais WHERE id_pais ="+p.getId_pais()+";";
            c.consultas_multiples(consulta);
        } catch (Exception e) {
            System.err.println("Mensaje Eliminar "+e.getMessage());
        }
        c.desconectar();
    }

    @Override
    public ArrayList<PaisVO> consultarTabla() {
        Conector c = new Conector();
        ArrayList<PaisVO> info = new ArrayList<>();
        try {
            c.conectar();
            String consulta = "SELECT * FROM tbl_pais;";
            ResultSet rs = c.consulta_datos(consulta);
            while(rs.next()){
                PaisVO pvo = new PaisVO();
                pvo.setId_pais(rs.getInt(1));
                pvo.setNombre_pais(rs.getString(2));
                pvo.setCapital_pais(rs.getString(3));
                pvo.setPoblacion_pais(rs.getLong(4));
                info.add(pvo);
            }
            c.desconectar();
        } catch (Exception e) {
            System.err.println("Mensaje Mostrar Datos "+e.getMessage());
        }
        return info;
    }
    
    //Variable publica necesaria
    public JasperViewer jv;
    //Método para el reporte
    public void reporte(){
        Conector c = new Conector();
        try {
            c.conectar();
            //variable que encuentra el reporte
            JasperReport reporte;
            //ruta del reporte
            String ruta = "src\\reportes\\reportePaises.jasper";
            //asignacion de ruta
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint jp = JasperFillManager.fillReport(reporte, null, c.con);
            JasperViewer jv = new JasperViewer(jp);
            this.jv = jv;
            
        } catch (Exception e) {
            System.err.println("Mensaje Reporte "+e.getMessage());
        }
    }
    
}
