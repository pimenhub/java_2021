/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclaseabstracta2;

/**
 *
 * @author Jonathan Pimentel
 */
public class Tigo extends Trabajador {
    
    public Tigo() {
        
    }
    public void a(){
        this.sueldoAnual();
        super.sueldoAnual();
    }
    @Override
    public int comision() {
        int c;
        c = 1000 + this.sueldo;
        return c;
    }
    public int sueldoAnual(){
        int total;
        total = this.sueldo * 6;
        return total;
    }
 
    
}
