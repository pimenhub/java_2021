/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Jonathan Pimentel
 */
public class Modelo {

    public Modelo() {
    }
    
    private String texto;
    private String ruta;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public void guardarT(){
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(ruta+".txt");
            pw = new PrintWriter(fw);
            
            pw.println(this.texto);
            fw.close();
            
        } catch (Exception e) {
            this.captura(e);
        }
    }
    public void guardarSolo(){
        FileWriter fw;
        PrintWriter pw;
        try {
            fw = new FileWriter(ruta);
            pw = new PrintWriter(fw);
            
            pw.println(this.texto);
            fw.close();
            
        } catch (Exception e) {
            this.captura(e);
        }
    }
    public String abrirT(){
        File archivo;
        FileReader fr;
        BufferedReader br;
        texto = "";
        try {
            archivo = new File(this.ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String lineas;
            while((lineas = br.readLine())!= null){
                texto = texto + lineas + "\n";
                
            }
        } catch (Exception e) {
            this.captura(e);
        }
        return texto;
    }
   public Font negrita(){
       Font n;
       n = new Font("",Font.BOLD,12);
       return n;
   }
   public Font cursiva(){
       Font n;
       n = new Font("",Font.ITALIC,12);
       return n;
   }
   public Font normal(){
       Font n;
       n = new Font("",Font.PLAIN,12);
       return n;
   }
    private void captura(Exception e){
        System.err.println("Error");
    }

    
    
    
    
    
    
}
