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

    public node find(int ele, linkedlist ref) {

        node las = new node();
        node l = ref.head;
        while (l != null) {
            if (l.data == ele) {
                las.next = l;

                return las;
            }
        }
        return las;

    }

    public void show(linkedlist ref) {
        node last = ref.head;
        if (ref.head == null) {
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

    public int length(linkedlist ref) {
        node pre = ref.head;
        int count = 0;
        while (pre != null) {

            count++;
            pre = pre.next;
        }

        return count;
    }

    public void insertionatposition(int pos, int ele, linkedlist ref) {

        int count = 0, len;
        len = ref.length(ref);
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

    public void iab(int ele, linkedlist ref) {

        node nodee = new node();
        nodee.next = ref.head;
        head = nodee;
        head.data = ele;
        // head.next=nodee.next;

        //1)[12|null]->[head]
        //2)head->[12|null]
    }

    public void insertnodeafter(int ele, node last) {   //head--
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

    }

    public void delte(node del) {
        /*
       delnext   curr
         [1]
          |
          |next
         [2]---->[3]--[4]           [1]->[2]  [3]---->[4]  [1]-> [2] [3] [4]
     |  delete   rem;                     |---------/|\           |------/|\
    del
 
    
         */
 node curr=del.next;
 del.next=curr.next;
 curr.next=null;
        
    }
    
    
    void deleteat(int pos){
        node pre=head;
        int count=0;
        if(pos==0){
         System.out.println("zero"+pre.data);
         node curr=head;
         head=curr.next;
         curr.next=null;
           // System.out.println(""+head.data);
        }
        else{
        while(count<pos-1){//0<0
            pre=pre.next;
            count++;
        }
        node curr=pre.next;
        pre.next=curr.next;
        curr.next=null;
        }
        
    }

}

public class ds2 {

    public static void main(String[] args) {

        linkedlist obj = new linkedlist();
        obj.add(1);

       // obj.iab(0, obj);
         obj.add(2);
      //  obj.insertnodeafter(4, last);
     //   obj.insertionatposition(3, 03, obj);
         obj.add(3);
       /// node afte = lastq.next;
     //   obj.delte(last);
        obj.add(4);
        obj.add(5);
        
        obj.show(obj);
        System.out.println("");
        obj.deleteat(4);
        
        obj.show(obj);
        System.out.println(obj.length(obj));

    }

}
