package lesson1_oop;

public class Nguoi {
    private String ten;
    private int tuoi;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public String xuatThongTin()
    {
        return this.ten + " - " + this.tuoi;
    }
}
