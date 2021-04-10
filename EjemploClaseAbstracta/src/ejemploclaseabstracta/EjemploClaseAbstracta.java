
package ejemploclaseabstracta;


public class EjemploClaseAbstracta {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instancia de una clase normal
        Violin v = new Violin();
        System.out.println(v.material = "Madera");
        System.out.println(v.tipo = "Cuerdas");
        v.genero();
        v.sonido();
        v.uso();
        v.violin();
        
        //instancia de una clase abstracta
        Instrumentos i = new Violin();
        i.material = "Madera";
        i.tipo = "Cuerdas";
        i.genero();
        i.sonido();
        i.uso();
        
               
    }
    
}
