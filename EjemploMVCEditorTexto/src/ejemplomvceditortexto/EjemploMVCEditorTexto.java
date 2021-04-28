
package ejemplomvceditortexto;

import controlador.Controlador;
import modelo.Modelo;
import vista.Frm_Bloc;


public class EjemploMVCEditorTexto {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Frm_Bloc b = new Frm_Bloc();
        Modelo m = new Modelo();
        Controlador c = new Controlador(b, m);
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        
    }
    
}
