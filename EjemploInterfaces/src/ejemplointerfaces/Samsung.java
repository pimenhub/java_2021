
package ejemplointerfaces;


public class Samsung implements Smartphone{

    public Samsung() {
    }

    @Override
    public void marca() {
        System.out.println("Samsung s21");
    }

    @Override
    public void sistema() {
        System.out.println("Android");
    }

    @Override
    public void material() {
        System.out.println("Cristal y plastico");
    }

    

   
    
    
}
