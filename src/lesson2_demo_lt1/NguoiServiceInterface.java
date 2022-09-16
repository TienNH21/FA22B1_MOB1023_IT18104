/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2_demo_lt1;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public interface NguoiServiceInterface {
    public void insert(Nguoi nguoi);
    public void update(int viTri, Nguoi nguoi);
    public void delete(int viTri);
    public void setDs(ArrayList<Nguoi> ds);
    public ArrayList<Nguoi> getDs();
}
