/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import static java.lang.Thread.MAX_PRIORITY;

/**
 *
 * @author Dell
 */

class thred extends Thread{

   @Override
   public  void run()
   {
    System.out.println("A");    
    }
}
interface  thread //extends Thread
{ // @Override
public  void run();

}
class mix extends thred implements thread,Runnable
{@Override
    public  void run()
    {System.out.println("B");    
        
    }
    
}

public class Threads 

{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          thred obj =new thred();
          thred obj1=new mix();
         Thread t=new Thread( obj1);
         
          //obj.start();
       //   for(int i=0;i<5;i++){
          t.start();
          
// TODO code application logic here
 //  obj1.setPriority(Thread.MAX_PRIORITY);
   
    }
    
    
}
