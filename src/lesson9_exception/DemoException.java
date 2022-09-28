/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9_exception;

/**
 *
 * @author tiennh
 */
public class DemoException {
    public static void main(String[] args) {
        String[] a = { "1", "3", "8", null, "9","abc" };
        
        for (int i = 0; i < 10; i++) {
            try {
                int i1 = Integer.parseInt(a[i]);
                System.out.println(i1);
                System.out.println("Thành công");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Kết thúc");
    }
}
