package ejemplooperaciones;

import java.util.Scanner;

public class EjemploOperaciones {

    public static void main(String[] args) {
        //Instancia de la clase Operaciones
        Operaciones ope = new Operaciones();
        //Instancia de la clase Condiciones
        Condiciones con = new Condiciones();
      
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("***Menú***");
        System.out.println("Operaciones Aritmeticas");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");
        System.out.println("Condiciones");
        System.out.println("5 Estructura If");
        System.out.println("Elija una opción");
        op = sc.nextInt();

        while (op > 0 && op < 7) {
            switch (op) {
                case 1:
                    System.out.println("Sumar");
                    System.out.println("Ingrese el primer numero");
                    ope.d1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    ope.d2 = sc.nextInt();
                    System.out.println("El resultado de la suma es " + ope.suma());
                    break;
                case 2:
                    System.out.println("Restar");
//                    System.out.println("Ingrese el primer numero");
//                    ope.d1 = sc.nextInt();
//                    System.out.println("Ingrese el segundo numero");
//                    ope.d2 = sc.nextInt();
                    System.out.println("El resulta de la resta es " + ope.resta(5, 2));
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    System.out.println("Ingrese el primer numero");
                    ope.d1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    ope.d2 = sc.nextInt();
                    System.out.println("El resulta de la multiplicacion es " + ope.multi());
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println("Ingrese el primer numero");
                    ope.d1 = sc.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    ope.d2 = sc.nextInt();
                    System.out.println("El resulta de la division es " + ope.division());
                    break;
                case 5:
                    System.out.println("Conocer si eres Mayor de Edad");
                    System.out.println("Ingresa tu edad");
                    con.edad = sc.nextInt();
                    con.mayorEdad();
                case 6:
                    System.out.println("*-*-*-*-*-*");
                    System.out.println(con.cicloF());
                    break;
            }
            System.out.println("***Menú***");
            System.out.println("Operaciones Aritmeticas");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 Multiplicacion");
            System.out.println("4 Division");
            System.out.println("Condiciones");
            System.out.println("5 Estructura If");
            System.out.println("Elija una opción");
            op = sc.nextInt();
        }

    }

}
