package lesson1_oop;

public class MainClass {
    public static void main(String[] args) {
        Nguoi sv = new SinhVien("PH12345", "Ng Van A", 20);
        System.out.println(sv.xuatThongTin());
    }
}
