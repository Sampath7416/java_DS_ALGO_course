/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authorell
 */

 interface a{
    
  void dis();
}
interface b{
    
    void dis(int a);
}
class c implements a,b{
    @Override
     public void dis(){
        System.out.println("-------one__________");
    }
 
     
    @Override
       public void dis(int n){
        System.out.println("-------two__________");
    }
}
public class intjj{
   public static void main(String args[]){
       c o=new c();
      // c o=new c();
       o.dis();
       o.dis(8);
}
}
