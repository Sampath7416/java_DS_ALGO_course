
import java.util.*;

class Codechef

{
    

public static void main (String[] args) 
{
    Scanner sc =new Scanner(System.in);
    if(!(sc.hasNext())){
        return ;
    }
    int t=sc.nextInt();
    for(int i=t;i>=1;i--)
    {
        String s=sc.next();
        Codechef.apply(s);
        
    }

}


static void apply(String s)
{
    
     
        ArrayList<Character> obj =new ArrayList<>();
        ArrayList<Character> obj1 =new ArrayList<>();
      
    
          String pre,pos;
          if(s.length()%2==0)
         {      pre=s.substring(0,s.length()/2);
        
        pos=s.substring(s.length()/2,s.length());
          
      }
          else{
              
                pre=s.substring(0,s.length()/2);
        
        pos=s.substring(s.length()/2+1,s.length());
             // 
          }
        
     
         
          if(pre.length()==pos.length())
          {
              char a[]=pre.toCharArray();
              char b[]=pos.toCharArray();
              for(int i=0;i<a.length;i++){
                  obj.add(a[i]);
                  
              }
             Collections.sort(obj);
           for(int i=0;i<b.length;i++){
                  obj1.add(b[i]);
                  
              }
           Collections.sort(obj1);
              System.out.println(obj+" "+obj1);
           
           
     
 
 if(obj.equals(obj1))
 {
     System.out.println("YES");
 }
 else{
     
     System.out.println("NO");
 }
     
          }}
    
}
    
