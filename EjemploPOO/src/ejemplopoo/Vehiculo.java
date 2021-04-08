
package ejemplopoo;


public class Vehiculo {
    public String marca;
    public int pasajeros;
    public int velocidad;

    public Vehiculo() {
    }
    public Vehiculo(int pasajeros){
    }
    
    public void arranca(){
        System.out.println("Arranca y hace ruido");
    }
    public void apagar(){
        System.out.println("Se apaga y hace silencio");
    }
}
