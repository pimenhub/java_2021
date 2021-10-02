/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Jonathan Pimentel
 */
public class Conector {
    //Declaracion de variables que se utilizaran en la conexion
//AZURE
//    private String driver = "com.mysql.jdbc.Driver";
//    private String servidor = "intecapmysql2021.mysql.database.azure.com";
//    private String usuario = "admin2021@intecapmysql2021";
//    private String password = "Intecap2021";
//    private String bd = "bd_tuits";
//    private String cadena;
    
//INSTANCIA DE GOOGLE CLOUD    
    private String driver = "com.mysql.jdbc.Driver";
    private String servidor = "34.135.204.225";
    private String usuario = "userg";
    private String password = "2021";
    private String bd = "bd_tuits";
    private String cadena;

    //Declarar el objeto que me permite realizar una conexion
    Connection con;

    //Declarar el objeto que permiter realizar consultas SQL insert, update, delete
    Statement st;

    //Metodo para conectar    
    public void conectar() {
        this.cadena = "jdbc:mysql://" + this.servidor + "/" + this.bd;
        try {
            Class.forName(this.driver).newInstance();
            this.con = DriverManager.getConnection(this.cadena, this.usuario, this.password);
        } catch (Exception e) {
            System.err.println("Mensaje 1: " + e.getMessage());
        }
    }

    //Metodo para desconectar
    public void desconectar() {
        try {
            this.con.close();
        } catch (Exception e) {
            System.err.println("Mensaje 2: " + e.getMessage());
        }
    }

    //Metodo para realizar diversar consultas como, insert, update, delete
    public int consultas_multiples(String consulta) {//"insert into"
        int resultado;
        try {
            this.conectar();
            //con.setAutoCommit(false);
            this.st = this.con.createStatement();
            resultado = this.st.executeUpdate(consulta);
            //con.commit();
        } catch (Exception e) {
            System.err.println("Mensaje 3: " + e.getMessage());
            return 0;
        } finally {
            this.desconectar();
        }
        return resultado;
    }
    
    //Metodo para obtener datas de una tabla en base de datos, select
    public ResultSet consulta_datos(String consulta){
        try {
            this.conectar();
            ResultSet resultado = null;
            this.st = this.con.createStatement();
            resultado = st.executeQuery(consulta);
            return resultado;
        } catch (Exception e) {
            System.err.println("Mensaje 4: "+e.getMessage());
        }
        return null;
    }
}
