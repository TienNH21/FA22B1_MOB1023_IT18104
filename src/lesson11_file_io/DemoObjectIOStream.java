package lesson11_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import lesson5_demo_crud.SinhVien;

public class DemoObjectIOStream {
    public static void main(String[] args) {
        String filename = "demo_object_io";
        ghiFile(filename);
        docFile(filename);
    }
    
    public static void ghiFile(String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            SinhVien sv = new SinhVien("PH1", "PTPM", "A", 1, "HN");

            oos.writeObject(sv);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);

            SinhVien sv = (SinhVien) ois.readObject();
            System.out.println(sv.getHoTen());

            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
