package lesson8_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import lesson5_demo_crud.SinhVien;

public class DemoComparator {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        
        list.add(new SinhVien("PH1", "PTPM", "A", 1, "HN"));
        list.add(new SinhVien("PH3", "TKTW", "B", 0, "HN"));
        list.add(new SinhVien("PH2", "LTMT", "C", 1, "HN"));
        
        Comparator<SinhVien> c = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv1.getMaSv().compareTo(sv2.getMaSv());
            }
        };
        
        Collections.sort(list, c);
        
        for (SinhVien sv : list) {
            System.out.println(sv.getMaSv());
        }
    }
}
