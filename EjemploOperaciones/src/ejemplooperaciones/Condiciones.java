
package ejemplooperaciones;

public class Condiciones {
    public int edad;
    
    public Condiciones(){
        
    }
    public void mayorEdad(){
        if(edad > 17){
            System.out.println("Mayor de Edad");
        }
        else{
            System.out.println("Menor de Edad");
        }
    }
    public int cicloF(){
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a += i;
            //System.out.println(i);
        }
        //System.out.println(a);
        return a;
    }

   
    
    
}
