/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Dell
 */
class a{
    void run(){
        try{
        throw new ArithmeticException("A.E");
        }
        catch(ArithmeticException e){
           System.out.println("A.E  Caught");
        }
    }
}
public class Throws {
     public static void main(String args[]){
         a obj= new a();
         obj.run();
     }

 
}
