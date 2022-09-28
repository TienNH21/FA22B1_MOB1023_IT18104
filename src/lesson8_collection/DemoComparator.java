package lesson8_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import lesson5_demo_crud.SinhVien;

public class DemoComparator {
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        list.add(new SinhVien("PH3", "TKTW", "H", 0, "DN"));
        list.add(new SinhVien("PH5", "PTPM", "A", 1, "DN"));
        list.add(new SinhVien("PH4", "LTMT", "D", 0, "DN"));
        list.add(new SinhVien("PH1", "PTPM", "B", 1, "DN"));
        list.add(new SinhVien("PH2", "TKTW", "E", 1, "DN"));
        
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
