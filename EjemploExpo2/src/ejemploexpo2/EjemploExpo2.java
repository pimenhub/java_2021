
package ejemploexpo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class EjemploExpo2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter("C:\\Users\\Jonathan Pimentel\\Desktop\\tabla.txt");
            pw = new PrintWriter(fw);
            try {
                System.out.println("Ingrese un numero para mostrar su tabla");
                n = sc.nextInt();
                for (int i = 0; i < 11; i++) {
                    pw.println(n+" x "+i+" = "+(n*i));
                }
                
            } catch (Exception nf) {
                System.err.println(nf);
            }
           fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        
        File archivo;
        FileReader fr;
        BufferedReader br;
        
        try {
            archivo = new File("C:\\Users\\Jonathan Pimentel\\Desktop\\tabla.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String lineas;
            
            while((lineas = br.readLine())!= null){
                System.out.println(lineas);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch(IOException e){
            System.err.println(e);
        }
        
    }
    
}
