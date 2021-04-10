/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexpo3;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jonathan Pimentel
 */
public class EjemploExpo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String n, a, t;
        int cod;
        Date f = new Date();
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
        
        FileWriter fw;
        PrintWriter pw;
        
        try {
            fw = new FileWriter("C:\\Users\\Jonathan Pimentel\\Desktop\\log.txt",true);
            pw = new PrintWriter(fw);
            System.out.println("Registro Laboral");
            System.out.println("Ingrese su nombre");
            n = sc.nextLine();
            pw.println("Nombre: "+n);
            System.out.println("Ingrese su apellido");
            a = sc.nextLine();
            pw.println("Apellido: "+a);
            System.out.println("Donde Trabaja");
            t = sc.nextLine();
            pw.println("Trabajo: "+t);
            System.out.println("Ingrese su Código");
            cod = sc.nextInt();
            pw.println("Código: "+cod);
            
            pw.println("Fecha y Hora de registro: "+fecha.format(f)+" "+ hora.format(f));
            pw.println("----------------------------------------------");
            fw.close();
            System.out.println("Información Registrada");
        } catch (Exception e) {
        }
        
        
    }
    
}
