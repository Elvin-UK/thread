/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Main;

import thread.Base;
import thread.MyConsumer;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) throws InterruptedException  {

        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(new MyConsumer());
           
        }

        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }
        Thread.sleep(5000);
        System.out.println(Base.getA());
    }
}
