package lesson2_interface;

import java.util.ArrayList;

public class ServiceNongTraiVuiVe {
    private ArrayList<Animal> listAnimal;
    
    public ServiceNongTraiVuiVe()
    {
        this.listAnimal = new ArrayList<>();
    }
    
    public void insert(Animal a)
    {
        this.listAnimal.add(a);
    }
    
    public void update(int viTri, Animal a)
    {
        this.listAnimal.set(viTri, a);
    }
    
    public void delete(int viTri)
    {
        this.listAnimal.remove(viTri);
    }

    public ArrayList<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(ArrayList<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }
    
    
}
