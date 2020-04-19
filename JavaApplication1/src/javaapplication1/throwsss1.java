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
     void runn()throws ArithmeticException
     {
         System.out.println("throws A.E");
         throw new ArithmeticException();
         
     }
}
public class throwsss1 {
 public static void main(String args[]){
     a obj =new a();
     try{
       obj.runn();
     }
     
     finally{
         System.out.println("THIS IS FINALLY BLOCK");
     }
 }
}
