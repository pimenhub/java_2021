package ejemplowhile;

import java.util.Scanner;

public class EjemploWhile {

    public static void main(String[] args) {
        // TODO code application logic here
//        int w = 5;
//        while(w > 0){
//            System.out.println("Hola soy "+w);
//            w = 0;
//        }

        Scanner sc = new Scanner(System.in);
        int num;
        int cuadrado;
        System.out.println("Ingrese un numero");
        num = sc.nextInt();//3

//    while(num > 0){
//        cuadrado = num*num;
//        System.out.println(cuadrado);
//        
//        System.out.println("Ingrese un numero para conocer su cuadrado");
//        num = sc.nextInt();
//    }
        while (num != 0) {

            if (num > 0) {
                System.out.println("POSITIVO");
            } else {
                System.out.println("NEGATIVO");
            }
            System.out.println("Ingrese un numero");
            num = sc.nextInt();

        }
        System.out.println("Fin del WHILE");

    }

}
