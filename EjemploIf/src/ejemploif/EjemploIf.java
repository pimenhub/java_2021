
package ejemploif;

import java.util.Scanner;

public class EjemploIf {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Positivo o Negativo");
        System.out.println("Ingresar un numero:");
        num1 = sc.nextInt();
//        System.out.println("Ingresar segundo numero:");
//        num2 = sc.nextInt();
        //Saber si los numero son iguales
//        if(num1 == num2){
//            System.out.println(num1 +" es igual a "+num2);
//        }
//        else{
//            System.out.println(num1 + " NO es igual a "+num2);
//        }
        //Validar si un numero es negativo, positivo o cero
//        if(num1 > 0){
//            System.out.println("Es Positivo");
//        }
//        else if(num1 == 0){
//            System.out.println("Es Neutro");
//        }
//        else{
//            System.out.println("Es Negativo");
//        }
        //Cual de los numeros es mayor
//        if(num1 > num2){
//            System.out.println(num1+" es mayor a "+num2);
//        }
//        else if(num1 == num2){
//            System.out.println("Son iguales");
//        }
//        else{
//            System.out.println(num2+" es mayor a "+num1);
//        }
        if(num1 == 0){//10
            System.out.println("CERO");
        }
        else if(num1 == 1){
            System.out.println("UNO");
        }
        else if(num1 == 2){
            System.out.println("DOS");
        }
        else if(num1 == 3){
            System.out.println("TRES");
        }
        else if(num1 == 4){
            System.out.println("CUARTO");
        }
        else if(num1 == 5){
            System.out.println("CINCO");
        }
        else{
            System.out.println("DATO FUERA DE RANGO");
        }
    }
    
}
