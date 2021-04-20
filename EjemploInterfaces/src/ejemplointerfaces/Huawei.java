
package ejemplointerfaces;


public class Huawei implements Smartphone{
    
    public Huawei() {
    }
    public int pass(){
        int p;
        int n = 18;
        int l = 25;
        p = n + l;
        return p;
    }
    @Override
    public void marca() {
        System.out.println("Huawei Mate 30");
    }

    @Override
    public void sistema() {
        System.out.println("HarmonyOS");
    }

    @Override
    public void material() {
        System.out.println("Cristal y aluminio");
    }

   
    
}
