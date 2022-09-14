package lesson2_demo_lt1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NguoiService service = new NguoiService();
        
        while (true)
        {
            MainClass.printMenu();
            int chon = Integer.parseInt(sc.nextLine());
            if (chon == 0) {
                return;
            }
            
            switch (chon) {
                case 1:
                    System.out.println("Nhập tên:");
                    String ten = sc.nextLine();
                    System.out.println("Chọn 1 - Nam, 0 - Nữ:");
                    int gt = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên:");
                    String diaChi = sc.nextLine();
                    Nguoi n = new Nguoi(ten, gt, diaChi);
                    service.insert(n);
                    break;
                case 2:
                    for (Nguoi ng : service.getDs()) {
                        System.out.println(ng.xuatThongTin());
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void printMenu()
    {
        System.out.println("\nNhập:");
        System.out.println("\n\t1. Thêm 1 đối tượng mới");
        System.out.println("\n\t2. Xuất danh sách");
        System.out.println("\n\t0. Dừng chương trình");
    }
}
