
package ejemplomap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class EjemploMap {

    public static void main(String[] args) {
        // TODO code application logic here
        //Map
        //HashMap
        Map<Integer, String> mapH = new HashMap();
        mapH.put(101, "Llantas");
        mapH.put(102, "Motor");
        mapH.put(103, "Combustible");
        mapH.put(104, "Baúl");
        
        System.out.println(mapH.get(101));
        //Recorrido
        for (Map.Entry<Integer, String> mapHR : mapH.entrySet()) {
            Integer key = mapHR.getKey();
            String value = mapHR.getValue();
            System.out.println(key + " ---- "+ value);
        }
        //Métodos
        System.out.println(mapH.size());
        System.out.println(mapH.isEmpty());
        System.out.println(mapH.get(102));
        //mapH.clear();
        System.out.println(mapH.remove(104));
        System.out.println(mapH.containsKey(101));
        System.out.println(mapH.containsValue("combustible"));
        System.out.println(mapH.values());
        System.out.println("-----------*********------------");
        //TreeMap
        Map<Integer, String> mapT = new TreeMap();
        mapT.put(1, "CPU");
        mapT.put(2, "GPU");
        mapT.put(3, "Motherboard");
        for(Map.Entry<Integer, String> mapTR : mapT.entrySet()){
            Integer k = mapTR.getKey();
            String v = mapTR.getValue();
            System.out.println(k+"/"+v);
        }
        Map<String, String> map2 = new TreeMap();
        map2.put("GT", "Guatemala");
        map2.put("ES", "El Salvador");
        map2.put("CR", "Costa Rica");
        for (Map.Entry<String, String> p : map2.entrySet()) {
            String key = p.getKey();
            String value = p.getValue();
            System.out.println(key + " " + value);
        }
        
        //Métodos
        System.out.println(mapT.size());
        System.out.println(mapT.isEmpty());
        System.out.println(mapT.get(3));
//        mapT.clear();
        System.out.println(mapT.remove(2));
        System.out.println(mapT.containsKey(1));
        System.out.println(mapT.containsValue("CPU"));
        System.out.println(mapT.values());
    }
    
}
