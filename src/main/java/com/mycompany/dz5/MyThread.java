/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dz5;



/**
 *
 * @author NicSt
 */
public class MyThread implements Runnable{
    private int id;
    private static Object lock = new Object();
    private static int currentThread = 1;

    public MyThread(int id) {
        this.id = id;
    }
    
    @Override
    public void run(){
        while(true){
            synchronized(lock){
                while (currentThread!=id){
                    try{
                        lock.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName());
                currentThread=(currentThread%3)+1;
                lock.notifyAll();
            }
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
