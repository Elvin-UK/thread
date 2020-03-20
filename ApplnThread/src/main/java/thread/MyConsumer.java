/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;


/**
 *
 * @author User
 */
public class MyConsumer implements Runnable {

    
    @Override
    public void run(){
        System.out.println("i am started and waiting ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
         }
           Base.incA();
        
    }
   
}
