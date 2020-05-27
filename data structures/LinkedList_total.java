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
//0  1   2   3 
//[1][2][3][4] 
class node {

    int data;
    node next;

    node() {
        data = 0;
        next = null;
    }
}

class linkedlist {

    node head;

    public node add(int ele) {
        node newnode = new node();//creation of node;
        newnode.data = ele;
        if (head == null) {
            head = newnode;//create a new node
        } else {
            node last = head; //last 
            while (last.next != null) {

                last = last.next;
                
            }
            last.next = newnode;
            return last.next;
        }
        return newnode;

    }

    public boolean find(int ele) {

        node l = head;
        while (l != null) {
            if (l.data == ele) {
                // System.out.println("TRue");

                return true;
            }

            l = l.next;
        }
        return false;

    }

    public void show(linkedlist obj) {
      //  node 
      node last = obj.head;
        if ( head== null) {
            System.out.println("BUDDY empty linkedlist");
        } else {
            while (last != null) {
                System.out.print(last.data + "-->");
                last = last.next;
            }
            System.out.println("null");
            //  System.out.println;
        }
    }

    public int length(node ref) {
        node pre = ref;
        int count = 0;
        while (pre != null) {

            count++;
            pre = pre.next;
        }

        return count;
    }

    public void insertionatposition(int pos, int ele, linkedlist ref) {

        int count = 0, len;
        node h = ref.head;
        len = ref.length(h);
        node newnode = new node();
        newnode.data = ele;
        node last = head;
        node curr;
        //0<0 aim:-3
        //0  1    2       3      4   5  0   1   2   3  4     0 1 2  3   4 
        //[][][prevoius][ new][next][]=>[]->[]->[]->[]->[]==>[][][][new][][]
        while (count < pos - 1) {
            last = last.next;
            count++;
        }
        //  count++;
        //curr//  now we
        curr = last.next;
        newnode.next = curr;
        last.next = newnode;

        /*
            
            
            
             0  1  2  3   4                 0  1 2  
   (step-1)  [0]->[1]->[2]->[4]->[5]    (step-2)   [0]->[1]->[2]->[4]->[5]         [0]->[1]->[2]  [4]->[5]
                                                                  /|\                         |   /|\
            [newnode='3']                                         [3]                         |-->[3]
            
            
            
            
            
            
            
            
            
            
            
            
         */
    }

    public node iab(int ele, linkedlist ref) {

        node nodee = new node();
        nodee.next = ref.head;
        head = nodee;
        head.data = ele;
        // head.next=nodee.next;

        //1)[12|null]->[head]
        //2)head->[12|null]
        
        return nodee;
    }

    public node insertnodeafter(int ele, node last) {   //head--
        // |
        // (step-1) [1|]->[2|]->[3|null]      (step-2)    [1|]->[2|]-->[3|null]        (step-3)             [1|]->[2|]  [3|null]
        //                                                                   /|\                                        \|/      \|/
//                          [4|null]                           [   4|    ]                                      [  4  |     ]

        //   node ls =new node();;
        if (last == null) {
            System.out.println("last node buddy");
        }
        node newnode = new node();

        newnode.next = last.next;
        last.next = newnode;
        newnode.data = ele;
        return newnode;

    }

    public void  delte(node del) {
        /*
       delnext   curr
         [1]
          |
          |next
         [2]---->[3]--[4]           [1]->[2]  [3]---->[4]  [1]-> [2] [3] [4]
     |  delete   rem;                     |---------/|\           |------/|\
    del
 
    
         */

        // sampath 
        node curr = del.next;
        del.next = curr.next;
        curr.next = null;
        

    }

    public void deleteat(int pos) {
        node pre = head;
        int count = 0;
        if (pos == 0) {
            System.out.println("zero" + pre.data);
            node curr = head;
            head = curr.next;
            curr.next = null;
            // System.out.println(""+head.data);
        } else {
            while (count < pos - 1) {//0<0
                pre = pre.next;
                count++;
            }
            node curr = pre.next;
            pre.next = curr.next;
            curr.next = null;
        }

    }

    public linkedlist  reverse( ) {
       
        /*
        
       head                           head                                                pre  curr
        |                               |                                                 |    |
       [1|]->[2|]->[3|null]   --->     [1|]--null  [2|]-->[3|]->null    ---->     null---[1]  [2]--->[3]
        |     |                         |            |                                        |
     curr    next                       curr     nextnode                                    nextnode
        
        
                       pre  cur                                                         pre   curr
                       |    |                                                           |     |
      null----[1]<----[2]  [3]-->null     --->                   null---[1]<---[2]<----[3]  null  ==> out of while return linkedlist
                            |                                                                 |
                            next                                                              next
        
        
        
        
         */
        linkedlist p =new  linkedlist();
        node curr =head;
       
        node pre = null;
        node post=null;
        while (curr != null) {
          post=curr.next;
          curr.next=pre;
          pre=curr;
          curr=post;
        }
        p.head=pre;
     return p;
    }
    
    public node middle(linkedlist obj){
         node last=obj.head;
        int ele=obj.length(last)-1;
       
        int mid=ele/2;int count=0;
       /// System.out.println(mid);
       while(last!=null){
         
       //    System.out.println(""+count);
           if(count==mid){
        
                return last;
           //break;
       }
           last=last.next;
           ++count;
       }
        
       return last; 
    }
    public linkedlist removeduplicates(linkedlist obj)
    {  /*
            n1      n2   n1     n2   n1   n2
     1)   [1]-->[1]-->[2]-->[2]-->[3]-->[3]-->null
                 n1+ n2         n1+ n2        n1+ n2
        2) []---------->[2]--------->[3]----->null
        
        
        n1                n2
        --->         ------>
         
        node.next=(node.next).next
        n1+n2
        ---------------->
        
        */
        
        
        linkedlist p =new linkedlist();
       
        node last=obj.head;
       node last_next;//=last.next;
       
    p.head=last;
        //p.add(last.data);
    // p.add(last.data);
         //
     // node last_next=last.next;
        while(last.next!=null && last!=null){
     //  last_next=last.next;     
    if(last.data==last.next.data)
    {
     
        last.next=last.next.next;
    }
    else{
        //p.add(last_next.data);
  //      p.add(last_next.data);
        last=last.next;
  
    }
        }
        return p;
         
        
        
        
    }

    
    public void sort(linkedlist ref)
    {
        node last=ref.head;
        node curr;
        while(last!=null ){
        curr=last;
        while(curr!=null){
     
           if(curr.data<last.data)
           {
               int t=curr.data;
               
            curr.data=last.data;
            last.data=t;
       //    last=last.next;   
               
           }
           curr=curr.next;
        }
        
           last=last.next;
        }
        
        }
    public void insertatsort(int ele,linkedlist ref)
    {
       /*
        
        [1]->[2]->[4]->[55]
            [3]
        
      
        */
        
        
        
        linkedlist obj=new linkedlist();
        node last=ref.head; node curr =new node();
        curr.data=ele;
     node newn=new node();
           while(last.data<=ele)
           { newn=last;
               last=last.next;
           }
           curr.next=newn.next;
           newn.next=curr;
           
       //   obj.insertnodeafter(ele, );
    }
    public void deleteelment(int ele,linkedlist ref){
       node last =ref.head;
       node curr=new node();
        while(last.data<ele)
        {    curr=last;
            last=last.next;
        }
     curr.next=last.next;
     last=curr.next;
        
    }
    
}

public class ds2 {

    public static void main(String[] args) {

        linkedlist obj = new linkedlist();
        node last;//= obj.head;
     obj.add(1);
      obj.add(7);
      obj.add(6);
      obj.add(2);
       obj.add(4);
       
         obj.show(obj);
         obj.sort(obj);
         obj.show(obj);
         obj.insertatsort(3, obj);
         obj.insertatsort(5,obj);
         
         obj.show(obj);
        obj.deleteelment(5, obj);
        obj.show(obj);
     //linkedlist obj1=  obj.reverse();
        //obj.show(obj1);
      // node  currentnode=obj.middle(obj1);
     //   System.out.println(currentnode.data);
        
        // node f=obj.find(4);

        //    System.out.println(obj.length(obj));
    }

}
