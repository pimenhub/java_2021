
package ejemplofor;

import java.util.Scanner;


public class EjemploFor {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //  ValorInicial-ValorFinal-Pasos
//        for(int i = 0; i < 101; i++){
//            System.out.println("No. "+i);
//        }
//        System.out.println("------------------");
//        for(int i = 100; i >= 0; i--){
//            System.out.println("No. "+i);
//        }
    Scanner sc = new Scanner(System.in);
    int dato;
    int suma = 0;
    for(int i = 0; i < 15; i++){
        System.out.println("Ingresar el numero de la casilla "+(i+1));
        dato = sc.nextInt();//1
        suma = suma + dato;
    }
        System.out.println("La suma es "+suma);
    

    }
    
}
