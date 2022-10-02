package lesson2_demo_lt1;

import java.io.Serializable;

public class Nguoi implements Serializable {
    private String hoTen;
    private int gioiTinh;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public String xuatThongTin()
    {
        return this.hoTen + " | " + this.diaChi + " | " +
            (this.gioiTinh == 1 ? "Nam" : "Nữ");
    }
}
