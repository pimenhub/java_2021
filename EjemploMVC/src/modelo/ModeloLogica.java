
package modelo;

public class ModeloLogica {
    
    public ModeloLogica(){
    }
    
    private int n1;
    private int n2;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    //Lógica funcional
    
    public int suma(){
        int s;
        s = this.n1 + this.n2;
        return s;
    }
    
    public int resta(){
        int r;
        r = this.n1 - this.n2;
        return r;
    }
    
    
    
}
