package lesson2_demo_lt1;

import java.util.ArrayList;

public class NguoiService {
    private ArrayList<Nguoi> ds;
    
    public NguoiService()
    {
        this.ds = new ArrayList<>();
    }

    public void insert(Nguoi n)
    {
        this.ds.add(n);
    }
    
    public void update(int viTri, Nguoi n)
    {
        this.ds.set(viTri, n);
    }
    
    public void delete(int viTri)
    {
        this.ds.remove(viTri);
    }

    public ArrayList<Nguoi> getDs() {
        return ds;
    }

    public void setDs(ArrayList<Nguoi> ds) {
        this.ds = ds;
    }
    
    
}
