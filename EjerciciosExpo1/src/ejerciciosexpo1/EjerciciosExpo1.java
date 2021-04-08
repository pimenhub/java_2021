package ejerciciosexpo1;

import java.util.Scanner;

public class EjerciciosExpo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        double a;
        double b;
        System.out.println("--*Menú*--");
        System.out.println("1 Maximo");
        System.out.println("2 Minimo");
        System.out.println("3 Raiz Cuadrada");
        System.out.println("4 Raiz Cubica");
        System.out.println("5 Potencia");
        op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Saber numero Maximo");
                System.out.println("Ingresar primer numero");
                a = sc.nextDouble();
                System.out.println("Ingresar segundo numero");
                b = sc.nextDouble();
                System.out.println("El numero maximo es "+Math.max(a, b));
                break;
            case 2:
                System.out.println("Saber numero Minimo");
                System.out.println("Ingresar primer numero");
                a = sc.nextDouble();
                System.out.println("Ingresar segundo numero");
                b = sc.nextDouble();
                System.out.println("El numero minimo es "+Math.min(a, b));
                break;
            case 3:
                System.out.println("Saber raiz cuadrada");
                System.out.println("Ingresar primer numero");
                a = sc.nextDouble();
                System.out.println("Raiz cuadrada "+Math.sqrt(a));
                break;
            case 4:
                System.out.println("Saber raiz cúbica");
                System.out.println("Ingresar primer numero");
                a = sc.nextDouble();
                System.out.println("Raiz cubica "+Math.cbrt(a));
                break;
            case 5:
                System.out.println("Saber resulta de potencia");
                System.out.println("Ingresar numero base");
                a = sc.nextDouble();
                System.out.println("Ingresar numero potencia");
                b = sc.nextDouble();
                System.out.println("Resultado "+Math.pow(a, b));
                break;
            default:
                System.out.println("Dato no valido");
                break;
        }

    }

}
