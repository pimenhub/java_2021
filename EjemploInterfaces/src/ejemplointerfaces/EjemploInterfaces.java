
package ejemplointerfaces;


public class EjemploInterfaces {

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------");
        Samsung s = new Samsung();
        s.marca();
        s.sistema();
        
        
        System.out.println("------------------");
        Apple a = new Apple();
        a.privacidad();
        a.marca();
        a.sistema();
        a.material();
        
        System.out.println("------------------");
        Huawei h = new Huawei();
        System.out.println(h.pass());
        h.marca();
        h.sistema();
        h.material();
    }
    
}
