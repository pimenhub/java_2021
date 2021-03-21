
package ejemploscanner;

import java.util.Scanner;



public class EjemploScanner {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciar clase
        Scanner teclado = new Scanner(System.in);
        //declarar variables
        int n1;
        int n2;
        int suma;
        int resta;
        
        System.out.println("Bienvenido, Operaciones Suma y Resta");
        System.out.println("Ingrese el primer numero:");
        //obtener datos de tipo int por medio de scanner para
        //asignarselo a n1
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        //obtener datos de tipo int por medio de scanner para
        //asignarselo a n2
        n2 = teclado.nextInt();
        System.out.println("Resultados");
        //operaciones
        suma = n1 + n2;
        resta = n1 - n2;
        //resultados
        System.out.println("La suma de los dos numeros ingresados es: "+suma);
        System.out.println("La resta de los dos numeros ingresados es: "+resta);
        
        
    }
    
}
