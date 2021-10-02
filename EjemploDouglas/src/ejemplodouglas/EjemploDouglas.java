/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodouglas;

/**
 *
 * @author Jonathan Pimentel
 */
public class EjemploDouglas {
    public int peso = 200;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //POO
        //Un objeto es la instancia de una clase
        Cliente cliente1 = new Cliente();
        Producto producto1 = new Producto();
        cliente1.nom = "Maria";
        cliente1.ape = "Ruiz";
        producto1.nombre = "paracetamol";        
        System.out.println(cliente1.nom+" "+cliente1.ape+" compra "+producto1.nombre);
        cliente1.comprar();
        System.out.println("----------------------------------------------------");
        Cliente cliente2 = new Cliente();
        Producto producto2 = new Producto();
        cliente2.nom = "Eva";
        producto2.nombre = "platos";
        System.out.println(cliente2.nom+" "+producto2.nombre);
        cliente2.comprar();
        producto2.advertencia();
        System.out.println("----------------------------------------------------");
        Cliente cliente3 = new Cliente();
        cliente3.nom = "Karla";
        System.out.println(cliente3.nom);
        cliente3.comprar();
        
        
        
        
        
        
        
        
        
        
//Variable
//--Tipo de Dato
//---String = Cadena de Texto
//---int = numero sin punto decimal
//---char = un caracter/codigo ascii - hexadecimal
//---double = numero con punto decimal
    //Tipo nombre   dato
//    String nombre = "Carlos";
//    int edad = 75;
//    char sexo = 'M';
//    double estatura = 1.85;
//    
//        System.out.println(nombre);
//        System.out.println(edad);         
//        System.out.println(nombre+" "+edad+" "+sexo+" "+estatura);


    }
    //Metodo
//    public void unirDatos(){
//    String nombre = "Carlos";
//    int edad = 75;
//    char sexo = 'M';
//    double estatura = 1.85;
//        System.out.println(nombre+edad+sexo+estatura+peso);
//}
    
}
