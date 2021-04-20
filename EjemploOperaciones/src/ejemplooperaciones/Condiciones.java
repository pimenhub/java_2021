package ejemplooperaciones;

import java.util.Scanner;

public class Condiciones {

    public int f;//2
    public int c;//2
    public int edad;
    Scanner sc = new Scanner(System.in);
    int[][] m;//solo se crea la matriz
    public Condiciones() {

    }
    
    
    public void mayorEdad() {
        if (edad > 17) {
            System.out.println("Mayor de Edad");
        } else {
            System.out.println("Menor de Edad");
        }
    }

    public int cicloFR() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a += i;
            //System.out.println(i);
        }
        //System.out.println(a);
        return a;
    }

    public void cicloFSin() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a = a + i;
        } 
        System.out.println(a);
    }
    
    public void matrizEjemplo(){//Esta matriz será llenada por el usuario
        //se inicia la matriz donde va a ser utilizado
        m = new int[f][c];
        for (int i = 0; i < f; i++) {//2
            for (int j = 0; j < c; j++) {//2
                System.out.println("Posicion "+i+" "+j);
                m[i][j] = sc.nextInt();
            }
        }
    }
    public void verMatriz(){
        for (int i = 0; i < f; i++) {//2
            for (int j = 0; j < c; j++) {//2
                System.out.print(m[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    

}
