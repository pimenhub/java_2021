
package ejemploclaseabstracta;

import java.util.ArrayList;


public abstract class Instrumentos {
    
    
    public String material;
    public String tipo;
    public int s;
    
    public void genero(){
        int ss;
        ss = s *12;
    }
    
    public abstract void sonido();
    public abstract void uso();
    
    
}
