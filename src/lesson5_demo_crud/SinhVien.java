package lesson5_demo_crud;

import lesson2_demo_lt1.Nguoi;

public class SinhVien extends Nguoi {
    private String maSv;
    private String cNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String cNganh, String hoTen, int gioiTinh, String diaChi) {
        super(hoTen, gioiTinh, diaChi);
        this.maSv = maSv;
        this.cNganh = cNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getcNganh() {
        return cNganh;
    }

    public void setcNganh(String cNganh) {
        this.cNganh = cNganh;
    }
    
    
}
