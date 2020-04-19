/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
import java.util.Scanner;
class u extends Exception{
    
}
public class user {
    public static void main(String args[])

    {
        try{
            Scanner obj=new Scanner(System.in);
            int a = obj.nextInt();
            if(a>0)
            {
                
                u obj1=new u();
                throw obj1;
            }
            }
        catch( u e)
        {
            System.out.println("e"+e);
        }
    }
  
}
