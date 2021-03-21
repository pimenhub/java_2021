/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasactividad1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Pimentel
 */
public class PruebasActividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar Variables
//        String nombre = "Hola";
//        int numero = 100;
//        
//        String sinDato;
//        int sinNumero;
//        
//        System.out.println(nombre + numero);
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese su nombre");
//        sinDato = sc.nextLine();
//        System.out.println("Ingrese un numero");
//        sinNumero = sc.nextInt();
//        System.out.println(sinDato + sinNumero);

        //Ejercicio de Estructuras de Control
        Scanner sc = new Scanner(System.in);
        int op;
        int dato1;
        int dato2;
        int suma = 0;

        System.out.println("Bievenidos");
        System.out.println("1. Estructura If");
        System.out.println("2. Estructura Else If");
        System.out.println("3. Estructura For");
        System.out.println("4. Estructura Switch Case");
        System.out.println("5. Estructura While");
        System.out.println("6. Estructura Do While");
        System.out.println("7. Mostrar Array");
        System.out.println("8. Mostrar Matriz");
        System.out.println("9. Mostrar ArrayList");
        System.out.println("0. Salir");
        op = sc.nextInt();

        while (op > 0 && op < 10) {
            switch (op) {
                case 1:
                    System.out.println("Ejercicio con If, por favor interactuar");
                    System.out.println("Mayor o Menor de Edad");
                    System.out.println("Ingrese su edad");
                    dato1 = sc.nextInt();
                    if (dato1 >= 18) {
                        System.out.println("Usted es Mayor de Edad");
                    } else {
                        System.out.println("Usted es Menor de Edad");
                    }
                    break;
                case 2:
                    System.out.println("Ejercicio con Else f, por favor interactuar");
                    System.out.println("Saber si un numero es Positivo o Negativo");
                    System.out.println("Ingresar Numero");
                    dato1 = sc.nextInt();
                    if (dato1 > 0) {
                        System.out.println("Positivo");
                    } else if (dato1 < 0) {
                        System.out.println("Negativo");
                    } else {
                        System.out.println(dato1 + " Neutro");
                    }
                    break;
                case 3:
                    System.out.println("Ejercicio con For, por favor interactuar");
                    System.out.println("Sumar 5 Numero");

                    for (int i = 0; i < 5; i++) {
                        System.out.println("Ingresar un numero");
                        dato1 = sc.nextInt();
                        suma = suma + dato1;
                    }
                    System.out.println("La suma es " + suma);

                    break;
                case 4:
                    System.out.println("Ejercicio con Switch, por favor interactuar");
                    System.out.println("Saber el nombre de un numero del 1 al 5");
                    System.out.println("Ingrese un numero entre 1 y 5");
                    dato2 = sc.nextInt();
                    switch (dato2) {
                        case 1:
                            System.out.println("UNO");
                            break;
                        case 2:
                            System.out.println("DOS");
                            break;
                        case 3:
                            System.out.println("TRES");
                            break;
                        case 4:
                            System.out.println("CUATRO");
                            break;
                        case 5:
                            System.out.println("CINCO");
                            break;
                        default:
                            System.out.println("Dato no Valido");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Ejercicio con While, por favor interactuar");
                    System.out.println("Ingrese numero para saber si es Postivo o Negativo"
                            + ", utilice 0 para salir");
                    System.out.println("Ingrese un numero");
                    dato2 = sc.nextInt();
                    while (dato2 != 0) {
                        if (dato2 > 0) {
                            System.out.println("POSITIVO");
                        } else {
                            System.out.println("NEGATIVO");
                        }
                        System.out.println("Ingrese un numero");
                        dato2 = sc.nextInt();
                    }
                    break;
                case 6:
                    System.out.println("Ejercicio con Do While, por favor interactuar");
                    System.out.println("Multiplicar un numero por 100");
                    System.out.println("Ingrese un numero");
                    dato1 = sc.nextInt();
                    do {
                        if (dato1 >= 0 && dato1 <= 3) {
                            System.out.println("Resultado " + dato1 * 100);
                            System.out.println("Ingrese un numero");
                            dato1 = sc.nextInt();
                        } else {
                            System.out.println("Fuera de Rango");
                            System.out.println("Ingrese un numero");
                            dato1 = sc.nextInt();
                        }
                    } while (dato1 >= 0 && dato1 <= 3);

                    break;
                case 7:
                    String[] frutas = new String[3];
                    frutas[0] = "Naranja";
                    frutas[1] = "Manzana";
                    frutas[2] = "Uva";
                    for (int i = 0; i < 3; i++) {
                        System.out.println(frutas[i]);
                    }
                    break;
                case 8:
                    String[][] carros = new String[3][3];
                    //fila 1
                    carros[0][0] = "Toyota";
                    carros[0][1] = "Mazda";
                    carros[0][2] = "Honda";
                    //fila 2
                    carros[1][0] = "Toyota";
                    carros[1][1] = "Mazda";
                    carros[1][2] = "Honda";
                    //fila 3
                    carros[2][0] = "Toyota";
                    carros[2][1] = "Mazda";
                    carros[2][2] = "Honda";

                    //Representa Filas
                    for (int i = 0; i < 3; i++) {
                        //Representa columnas
                        for (int j = 0; j < 3; j++) {
                            System.out.print(carros[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    break;
                case 9:
                    ArrayList<String> mascotas = new ArrayList<>();
                    mascotas.add("Perro");
                    mascotas.add("Perro");
                    mascotas.add("Perro");
                    mascotas.add("Perro");
                    mascotas.add("Perro");
                    mascotas.add("Perro");
                    mascotas.add("Perro");

                    for (String ma : mascotas) {
                        System.out.println(ma);
                    }
                    break;

            }
            System.out.println("-----------------------------");
            System.out.println("Bievenidos");
            System.out.println("1. Estructura If");
            System.out.println("2. Estructura Else If");
            System.out.println("3. Estructura For");
            System.out.println("4. Estructura Switch Case");
            System.out.println("5. Estructura While");
            System.out.println("6. Estructura Do While");
            System.out.println("7. Mostrar Array");
            System.out.println("8. Mostrar Matriz");
            System.out.println("9. Mostrar ArrayList");
            System.out.println("0. Salir");
            op = sc.nextInt();
        }

    }

}
