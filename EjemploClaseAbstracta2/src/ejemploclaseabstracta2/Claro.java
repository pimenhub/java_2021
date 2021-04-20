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
public class Claro extends Trabajador {
    
    private String color;
    private int personas;
    private String direccion;

    
    public Claro() {
    }
    
    @Override
    public int comision() {
        int c;
        c = 500*12;
        return c;
    }
    
    
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
