
package ejemploexpo4;

import java.util.Calendar;
import java.util.Date;



public class EjemploExpo4 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        //System.out.println(c.get);
        
        int d1 = 1;
        int m1 = 1;
        int y1 = 2018;
        int d2 = 1;
        int m2 = 1;
        int y2 = 2019;
        
        
        c.set(Calendar.DAY_OF_YEAR, d1);
        c.set(Calendar.MONTH, m1);
        c.set(Calendar.YEAR, y1);
        Date f1 = c.getTime();
        
        c.set(Calendar.DAY_OF_YEAR, d2);
        c.set(Calendar.MONTH, m2);
        c.set(Calendar.YEAR, y2);
        Date f2 = c.getTime();
        
        long dias;
        dias = f2.getTime() - f1.getTime();
        System.out.println(dias/1000/60/60/24);
    }
    
}
