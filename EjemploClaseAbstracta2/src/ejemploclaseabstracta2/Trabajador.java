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
public abstract class Trabajador {
    public String nombre;
    public String apellido;
    public int edad;
    public String dire;
    public int sueldo;
    
    
    public int sueldoAnual(){
        int total;
        total = this.sueldo * 12;
        return total;
    }
    public abstract int comision();
          
    
}
