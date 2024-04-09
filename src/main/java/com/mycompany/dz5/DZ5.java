/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dz5;



/**
 *
 * @author NicSt
 */
public class DZ5 {
   
    public static void main(String[] args) {
        System.out.println("Практическое задание - 1.14, Студент - Стрыгин Никита Владиславович, Группа - РИБО-03-22, Вариант - 1");
        MyThread myth1= new MyThread(1);
        MyThread myth2= new MyThread(2);
        MyThread myth3= new MyThread(3);
        
        Thread th1 = new Thread (myth1);
        Thread th2 = new Thread (myth2);
        Thread th3 = new Thread (myth3);
        th1.start();
        th2.start();
        th3.start();
    }
}
