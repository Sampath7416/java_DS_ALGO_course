/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sampath Raja Raghupathi creation and insertion and print.. 18/5/2020.
 */
//head ->[1]->[2]->[3]->[4]->[5/null]
//[head]->[1|add][2|add][3|add][4|add][5|add][6|null]

class node{
    int data;
    node next;
}
class linkedlist
{
    node head;
    void add(int ele,linkedlist ref)
    {node newnode =new node();//creation of node;
        newnode.data=ele;
        if(ref.head==null){
            ref.head=newnode;//create a new node
        }
      
        else
        {
            node last =ref.head; //last 
            while(last.next!=null){
                
                last=last.next;
            }
            last.next=newnode;
            
        }
        
    }
    
    void show(linkedlist ref){
        node last=ref.head;
        if(ref.head==null){
            System.out.println("BUDDY empty linkedlist");
        }
        else{
            while(last!=null)
            {
                System.out.println(last.data);   
                last=last.next;
            }
        }
    }
    
    
}

public class ds2 {

    public static void main(String[] args) {

        linkedlist obj = new linkedlist();
      obj.show(obj);
        obj.add(1, obj);
        obj.add(2,obj);
        obj.add(3,obj);
        obj.add(4,obj);
        obj.add(5,obj);
        obj.add(6,obj);
        obj.show(obj);
       

    }

}
