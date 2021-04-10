
package ejemplointerfaces;


public class Apple implements Smartphone{

    public Apple() {
    }
    
    
    public void privacidad(){
        System.out.println("Seguridad de alto nivel");
    }
    
    
    @Override
    public void marca() {
        System.out.println("Iphone 11");
    }

    @Override
    public void sistema() {
        System.out.println("IOS");
    }

    @Override
    public void material() {
        System.out.println("Cristal y oro");
    }

    
    
}
