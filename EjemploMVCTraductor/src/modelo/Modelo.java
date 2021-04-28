/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jonathan Pimentel
 */
public class Modelo {
    public Modelo(){
        
    }
    
    private String palabra;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public String traducir(){
        String ingles;
        switch(palabra){
            case "Hola":
                ingles = "Hello";
                break;
                case "Agua":
                    ingles = "Water";
                break;
                case "Fuego":
                    ingles = "Fire";
                break;
                case "Perro":
                    ingles = "Dog";
                break;
                case "Gato":
                    ingles = "Cat";
                break;
                case "Pato":
                    ingles = "Duck";
                break;
                case "Arriba":
                    ingles = "Up";
                break;
                case "Abajo":
                    ingles = "Down";
                break;
                default:
                    ingles = "Palabra no elegida";
                    break;
        }
        return ingles;
    }
    
    
}
