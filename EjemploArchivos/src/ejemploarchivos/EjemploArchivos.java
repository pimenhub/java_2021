package ejemploarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class EjemploArchivos {

    public static void main(String[] args) {
        // TODO code application logic here
        //Escritura y creación de un archivo de texto
        //FileWriter - Crear un archivo en una ruta indicada y lo apertura
        FileWriter fw;
        //PrintWrite - Permite agregar información al archivo
        PrintWriter pw;
        try {
            fw = new FileWriter("C:\\Users\\Jonathan Pimentel\\Desktop\\Ejemplo2.txt");
            pw = new PrintWriter(fw);
            
            pw.println("Esta es un prueba de creacion de un archivo");
            for (int i = 0; i < 20; i++) {
                pw.println("Linea "+i);
            }
            fw.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        
        
        
        //Lectura de un archivo de texto
        //File - encuentra el archivo en la ruta indicada
        File archivo;
        //FileReader - valida el archivo y lo apertura
        FileReader fr;
        //BufferedReader - lee la información del archivo hasta encontrar vacío
        BufferedReader br;

        try {
            archivo = new File("C:\\Users\\Jonathan Pimentel\\Desktop\\Ejemplo2.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String lineas;
            while((lineas = br.readLine())!=null){
                System.out.println(lineas);
            }
            
            
        } catch (Exception ex) {
                System.err.println(ex);
        } 
    }

}
