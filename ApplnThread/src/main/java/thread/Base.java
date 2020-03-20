/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author User
 */
public class Base {

    private static int a=0;

    public static int getA() {
        return a;
    }
 
    public synchronized static void incA(){
        a++;
    }
    
    

}
