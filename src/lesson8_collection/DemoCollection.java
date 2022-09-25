package lesson8_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);

        System.out.println("Lan 1:");
        System.out.println(list);
        System.out.println(set);
        
        Collections.shuffle(list);
        System.out.println("Lan 2:");
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println("Lan 3:");
        System.out.println(list);
        
        Collections.reverse(list);
        System.out.println("Lan 4:");
        System.out.println(list);
    }
}
