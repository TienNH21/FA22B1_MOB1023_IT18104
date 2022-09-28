package lesson8_collection;

import java.util.HashMap;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<String, Double> map = 
            new HashMap<>();
        
        map.put("iPhone14", 40000.0);
        map.put("Samsung", 24000.0);
        map.put("Nokia", 8000.0);
        map.put("Oppo", 7000.0);
        map.put("Nokia", 15000.0);
        
        System.out.println(map);
    }
}
