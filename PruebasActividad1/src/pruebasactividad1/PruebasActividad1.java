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
        ArrayList<Integer> num1 = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int op;
        int dato;
        int pos;
        System.out.println("Menú de ArrayList");
        System.out.println("1 Agregar");
        System.out.println("2 Buscar");
        System.out.println("3 Modificar");
        System.out.println("4 Eliminar");
        System.out.println("5 Insertar en Posicion");
        System.out.println("6 Mostrar el Arreglo");
        System.out.println("7 Salir");
        System.out.println("Elija una opción");
        op = sc.nextInt();
        while (op > 0 && op < 7) {
            switch (op) {

                case 1:
                    System.out.println("Ingrese un elemento numerico para el Array");
                    dato = sc.nextInt();
                    num1.add(dato);
                    System.out.println("Arreglo Actual");
                    for (int i = 0; i < num1.size(); i++) {
                        System.out.println("Posicion "+i+" Dato "+num1.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Ingrese un elemento numerico a buscar en el Array");
                    dato = sc.nextInt();

                    if (dato < num1.size()) {
                        System.out.println("El elemento en la posicion elegida es " + num1.get(dato));
                        
                    } else {
                        System.out.println("Dato no existente");
                    }
                    break;
                case 3:
                    System.out.println("Arreglo Actual");
                    for (int i = 0; i < num1.size(); i++) {
                        System.out.println("Posicion "+i+" Dato "+num1.get(i));
                    }
                    System.out.println("Ingrese la posicion que desea modificar");
                    pos = sc.nextInt();

                    if (pos < num1.size()) {
                        System.out.println("Agrege el dato nuevo");
                        dato = sc.nextInt();
                        System.out.println("Dato agregado "+dato);
                        num1.set(pos, dato);
                        System.out.println("Arreglo Actual");
                    for (int i = 0; i < num1.size(); i++) {
                        System.out.println("Posicion "+i+" Dato "+num1.get(i));
                    }
                    } else {
                        System.out.println("Dato no existente");
                    }
                    
                    break;
                case 4:
                    System.out.println("Arreglo Actual");
                    for (int i = 0; i < num1.size(); i++) {
                        System.out.println("Posicion "+i+" Dato "+num1.get(i));
                    }
                    System.out.println("Ingrese la posicion del elemento a eliminar");
                    pos = sc.nextInt();
                    System.out.println("Dato Elminado "+num1.remove(pos));
                    System.out.println("Array Actual");
                    System.out.println("Arreglo Actual");
                    for (int i = 0; i < num1.size(); i++) {
                        System.out.println("Posicion "+i+" Dato "+num1.get(i));
                    }
                    break;
                    case 6:
                    System.out.println("Arreglo Actual");
                    for (int i = 0; i < num1.size(); i++) {
                        System.out.println("Posicion "+i+" Dato "+num1.get(i));
                    }
                    System.out.println("Ingrese la posicion del elemento a eliminar");
                    pos = sc.nextInt();
                    System.out.println("Dato Elminado "+num1.remove(pos));
                    System.out.println("Array Actual");
                    System.out.println("Arreglo Actual");
                    for (int i = 0; i < num1.size(); i++) {
                        System.out.println("Posicion "+i+" Dato "+num1.get(i));
                    }
                    break;
                        
            }
            System.out.println("Menú de ArrayList");
            System.out.println("1 Agregar");
            System.out.println("2 Buscar");
            System.out.println("3 Modificar");
            System.out.println("4 Eliminar");
            System.out.println("5 Insertar en Posicion");
            System.out.println("6 Mostrar el Arreglo");
            System.out.println("7 Salir");
            System.out.println("Elija una opción");
            op = sc.nextInt();
        }
    }
        
}
