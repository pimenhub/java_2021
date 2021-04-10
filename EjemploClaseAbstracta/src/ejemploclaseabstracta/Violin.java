
package ejemploclaseabstracta;


public class Violin extends Instrumentos {
    
    public void violin(){
        System.out.println("Es un instrumento antiguo de sutil sonido");
    }
    
    @Override
    public void sonido() {
        System.out.println("sonido suave");
    }

    @Override
    public void uso() {
        System.out.println("Se debe utilizar con delicadeza");
    }
    
}
