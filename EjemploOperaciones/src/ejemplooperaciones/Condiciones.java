
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
}
