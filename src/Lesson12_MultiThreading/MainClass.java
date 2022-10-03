/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12_MultiThreading;

/**
 *
 * @author tiennh
 */
public class MainClass {
    public static void main(String[] args) {
        Runnable r1 = new MyThread("Thread 1");
        Runnable r2 = new MyThread("Thread 2");
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
    }
}
