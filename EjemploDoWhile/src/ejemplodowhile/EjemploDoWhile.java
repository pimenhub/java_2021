package ejemplodowhile;

import java.util.Scanner;

public class EjemploDoWhile {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int dw;
        System.out.println("Introducir un numero");
        dw = sc.nextInt();
        do {
            if (dw >= 0 && dw <= 5) {
                System.out.println("Numero ingresado" + dw);
                System.out.println("Multiplicacion * 100 " + (dw * 100));
                System.out.println("Multiplicacion * 1000 " + (dw * 1000));
                
                System.out.println("Introducir un numero");
                dw = sc.nextInt();
            } else {
                System.out.println("Fuera de rango");
                
                System.out.println("Introducir un numero");
                dw = sc.nextInt();
            }
        } while (dw >= 0 && dw <= 5);
    }

}
