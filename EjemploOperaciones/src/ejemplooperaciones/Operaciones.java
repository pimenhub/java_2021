
package ejemplooperaciones;


public class Operaciones {
    public double d1;
    public double d2;
    
    
    public Operaciones(){
        //vacío
    }
    //Métodos de operaciones Aritméticas
    //suma
    public int suma(){
        int suma;
        suma = (int) (d1 + d2);
        return suma;
    }
    //resta
    public int resta(int a, int b){
        int resta;
        resta = a - b;
        return resta;
    }
    //multiplicacion
    public int multi(){
        int multi;
        multi = (int) (d1 * d2);//6.0
        return multi;//6
    }
    //division
    public double division(){
        double division;
        division = d1 / d2;
        return division;
    }

   

    
    
}
