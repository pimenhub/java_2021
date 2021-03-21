
package ejemploarray;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EjemploArray {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de un array forma 1
//        int[] num = new int[4];
//        num[0] = 7;
//        num[1] = 10;
//        num[2] = 9;
//        num[3] = 66;
//        for (int i = 0; i < 4; i++) {
//           System.out.println(num[i]);
//        }
//        System.out.println("------------");
//        //Declaracion forma 2
//        int[] n = {1,2,3,4,5,6,7,8};
//        
//        
//        System.out.println(n[2]);
//        System.out.println(n.length);
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]);
//        }
//        
//        short[] edad = new short[3];
//        edad[0] = 25;
//        edad[1] = 35;
//        edad[2] = 45;
//        
//        short[] naturales = {1,2,3,4,5,6,7,8,9};
//        Scanner sc = new Scanner(System.in);
//        //Dimensio
//        int dimension;
//        //parseo parse
//        
//        dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimensión del arreglo"));
//        int[] elementos = new int[dimension];
//        System.out.println("Momento de llenar el arreglo");
//        for (int i = 0; i < dimension; i++) {
//            System.out.println("Ingrese dato en la posicion "+i);
//            elementos[i] = sc.nextInt();
//        }
//        System.out.println("Datos ingresados");
//        for (int i = 0; i < dimension; i++) {
//            System.out.println(elementos[i]);
//        }

        String[] nombres = new String[6];
        nombres[0] = "Pedro";
        nombres[1] = "Karla";
        nombres[2] = "Alan";
        nombres[3] = "María";
        nombres[4] = "Elan";
        nombres[5] = "Juan";
        
        for(String n: nombres){
            System.out.println(n);
        }

    }
    
}
