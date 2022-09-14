package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        ServiceNongTraiVuiVe service = new ServiceNongTraiVuiVe();
        Cat c = new Cat();
        c.eat();
        c.diChuyen();
        c.tiengKeu();
        
        service.insert(c);
        
        Dog d = new Dog();
        service.insert(d);
        
        Fish f1 = new Fish();
        service.insert(f1);
    }
}
