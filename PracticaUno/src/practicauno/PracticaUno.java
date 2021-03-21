//Paquete
package practicauno;

//Clase
public class PracticaUno {
    
    //Método
    public static void main(String[] args) {
        //Muestra el resultado que se desee en consola
//        System.out.println("Manos a la obra");
//        System.out.println("En la práctica 1");
//        
//        //Declaracion de variables
//        //Tipo Nombre Valor
//        int n1 = 10;
//        int n2 = 5;
//        int n3;
//        int n4 = 99;
//        
//        String nombre;
//        String apellido = "Perez";
//        
//        System.out.println(apellido);
//        System.out.println("Mi apellido es " + apellido);
//        System.out.println(n4);
//        
//        //Ejercicio
//        
//        byte edad = 55;
//        short sodas = 25500;
//        int personas = 100000000;
//        long china = 123456789123456789l;
//        float estatura = 18.25f;
//        double numero = 145.123d;
//        char letra = 'A';
//        char ascii = 64;
//        boolean pregunta = true;
//        
//        System.out.println(edad);
//        System.out.println(sodas);
//        System.out.println(personas);
//        System.out.println(china);
//        System.out.println(estatura);
//        System.out.println(numero);
//        System.out.println(letra);
//        System.out.println(ascii);
//        System.out.println(pregunta);
        
        //Ejercicio Operadores Aritmeticos
        //Suma
//        int num1 = 10;
//        int num2 = 15;
//        int suma;
//        suma = num1 + num2;
//        System.out.println("El resultado de la suma es " + suma);
//        //Resta
////        int num3 = 30;
////        int num4 = 15;
//        int resta;
//        resta = num1 - num2;
//        System.out.println("El resultado de la resta es " + resta);
        
        //Ejemplos String
        
        String cadena1 = "Carrera";
        String cadena2 = "de";
        String cadena3 = "Programacion";
        String cadena4 = "Java y Android";
        //Union
        System.out.println(cadena1 + " " + cadena2 + " " + cadena3 + " " +
                cadena4 + " " + "de " + 5 + " a " + 9);         
         
        //Conteo de caracteres
        System.out.println("Cadena 1 tiene "+cadena1.length()+" Caracteres");
        System.out.println("Cadena 4 tiene "+cadena4.length()+" Caracteres");
        
        //Remplazar
        System.out.println(cadena3.replace("cio","ció"));
        //Extraer
        System.out.println(cadena4.substring(7));
        System.out.println(cadena4.substring(0, 4));
        //Comparar cadenas de texto
        System.out.println(cadena1.equals(cadena4));
        //Mayusculas
        System.out.println(cadena4.toUpperCase());
        //Minusculas
        System.out.println(cadena3.toLowerCase());
        
        
    }

    
}
