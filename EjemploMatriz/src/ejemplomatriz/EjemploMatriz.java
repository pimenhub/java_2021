
package ejemplomatriz;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EjemploMatriz {

  
    public static void main(String[] args) {
        // TODO code application logic here
        //Tipo - Nombre -           Filas y Columnas        
//        String[][] frutas = new String[2][4];
//        // ----- Fila 1
//        frutas[0][0] = "Uva";
//        frutas[0][1] = "Manzana";
//        frutas[0][2] = "Naranja";
//        frutas[0][3] = "Limón";
//        
//        /// ----- Fila 2
//        frutas[1][0] = "Mango";
//        frutas[1][1] = "Sandía";
//        frutas[1][2] = "Banano";
//        frutas[1][3] = "Platano";
//        
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(frutas[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        
//        //System.out.println(frutas[0][2]);
//        
        int[][] edades = new int[2][2];
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 9;
        edades[1][1] = 11;
//        //System.out.println(edades[1][0]);
//        //Filas
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            //Columnas
            for (int j = 0; j < 2; j++) {
                System.out.print(edades[i][j]+"  ");
                sum = sum + edades[i][j];
            }
            System.out.println("");
        }
        JOptionPane.showMessageDialog(null, sum);
//        Scanner sc = new Scanner(System.in);
//        int[][] letras = new int[3][2];
//        for (int i = 0; i < letras.length; i++) {
//            for (int j = 0; j < letras[i].length; j++) {
//                System.out.println("Ingrese el caracter en la posicion "+ i +" "+j);
//                letras[i][j] = sc.nextInt();
//                //     0 0 = 11
//                //     0 1 = 22
//            }
//        }
        

    }
    
}
