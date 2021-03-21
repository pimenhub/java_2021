
package ejemploarraylist;

import java.util.ArrayList;

public class EjemploArrayList {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //--- ArrayList
        ArrayList<String> array1 = new ArrayList<>();
        //ingresar datos sin posición
        array1.add("Perro");
        array1.add("Gato");
        array1.add("Hamster");
        array1.add("Tortuga"); 
        array1.add("Tortuga"); 
        //ingresar datos con posición
        array1.add(0,"Zanahoria");
        array1.add(2, "Cebolla");
        array1.add(4, "Tomate");
        
        //Recorrer
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i));
        }
        System.out.println("///////-------------////////");
        for(String datos: array1){
            System.out.println(datos);
        }
        
        
        System.out.println("///////-------------////////");
        //obtener un dato
        System.out.println(array1.get(3));
        System.out.println(array1.get(4));
        System.out.println(array1.get(5));
        //remover
        System.out.println("Elemento removido "+array1.remove("Tortuga"));
        
        //Sustituir
        System.out.println(array1.set(1, "Rana"));
        System.out.println("-----------------------");
        System.out.println(array1.get(1));
        //Comprobar
        System.out.println(array1.contains("Perro"));
        System.out.println(array1.indexOf("Tortuga"));
        System.out.println(array1.lastIndexOf("Tortuga"));
        //
        for(String datos: array1){
            System.out.println(datos);
        }
        System.out.println("Tamaño "+array1.size());
        //verificar el contenido
        System.out.println(array1.isEmpty());
        //Limpiar
        array1.clear();
        System.out.println(array1.isEmpty());
        //Conocer tamaño                
        System.out.println("Tamaño "+array1.size());
    }
    
}
