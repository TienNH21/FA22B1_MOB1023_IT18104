package Lesson12_MultiThreading;

public class MyThread implements Runnable {
    private String name;
    
    public MyThread(String name) {
        this.name = name;
    }
    
    public MyThread()
    {
        //
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                System.out.println(this.name + ":" + count);
                Thread.sleep(1000);
                count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
