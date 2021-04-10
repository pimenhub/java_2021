
package ejemploclaseabstracta;

import java.util.ArrayList;


public abstract class Instrumentos {
    
    
    public String material;
    public String tipo;
    
    public void genero(){
        System.out.println("Intrumento de Orquesta");
    }
    
    public abstract void sonido();
    public abstract void uso();
    
    
}
