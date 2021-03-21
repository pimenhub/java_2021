package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("Ingrese un numero para saber el día de la semana");
        dia = sc.nextInt();
        //estructura switch
        switch (dia) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIÉRCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SÁBADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("Día no correcto");
                break;

        }
    }

}
