package lesson11_file_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFileIOStream {
    public static void main(String[] args) {
        String filename = "demo_file_io";
        ghiFile(filename);
        docFile(filename);
    }
    
    public static void ghiFile(String filename)
    {
        try {
            // Mở file để ghi
            FileOutputStream fos = new FileOutputStream(filename);

            String txt = "Hello Poly";
            byte[] b = txt.getBytes();
            fos.write(b);

            // Đóng file
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename)
    {
        try {
            // Mở file để đọc
            FileInputStream fis = new FileInputStream(filename);
            
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                
                char c = (char) i;
                System.out.print(c);
            }
            
            System.out.println("");
                    
            // Đóng luồng sau khi đọc
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
