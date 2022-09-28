package lesson8_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(4);
        list.add(3);
        
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(3);
        
        System.out.println(list);
        System.out.println(set);
        System.out.println("--------------------");
        
        Collections.shuffle(list);
        System.out.println(list);
        
        System.out.println("--------------------");
        Collections.sort(list);
        System.out.println(list);
        
        System.out.println("--------------------");
        Collections.reverse(list);
        System.out.println(list);
        
    }
}
