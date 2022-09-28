package lesson9_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoFormatDate {
    public static void main(String[] args) {
        String s = "28/09/2022";
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/MM/YYYY");
        
        try {
            Date d = sdf.parse(s);
            System.out.println("Thành công");
        } catch (ParseException e) {
            System.out.println("Sai định dạng ngày tháng");
            e.printStackTrace();
        }
        
        try {
            print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void print() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
