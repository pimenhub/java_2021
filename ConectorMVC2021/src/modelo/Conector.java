package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conector {
    //Declaracion de variables que se utilizaran en la conexion

    private String driver = "com.mysql.jdbc.Driver";
    private String servidor = "127.0.0.1";
    private String usuario = "root";
    private String password = "";
    private String bd = "bd_java_con1";
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
