
package ejemplomvc;

import controlador.Controlador;
import modelo.ModeloLogica;
import vista.Frm_Operaciones;


public class EjemploMVC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Frm_Operaciones op = new Frm_Operaciones();
        ModeloLogica  ml = new ModeloLogica();
        Controlador c = new Controlador(op, ml);
        op.setVisible(true);
    }
    
}
