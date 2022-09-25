package lesson8_collection;

import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Nokia", 500.00);
        map.put("Samsung", 600.00);
        map.put("iPhone", 900.00);
        map.put("Oppo", 200.00);

        for (String key : map.keySet()) {
            System.out.println(key + "-" + map.get(key));
        }
    }
}
