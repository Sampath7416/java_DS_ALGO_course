/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class array {
   private int count;
   private char list[];
    
    public array(int len){
       list=new char[len];
    }
    public void insert(char ele){
        if(list.length==count){
           char[] temp=new char[count*2];
           for(int i=0;i<count;i++){
               temp[i]=list[i];
           }
          list= temp;
        }
     list[count++]=ele;
    }
    
    void remove(int index){
       if(index<0||index>=count){
           throw new IllegalArgumentException();
       }
       for(int i=index;i<count;i++){
           list[i]=list[i+1];
           
       }
       count--;
        
        
    }
    public void print(){
        for(int i=0;i<count;i++){
            System.out.print(list[i]);
        }
    }
    
}
