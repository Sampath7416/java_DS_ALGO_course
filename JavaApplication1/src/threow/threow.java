/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threow;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author Dell
 */
class a {

    Scanner obj = new Scanner(System.in);

    void v() {

        int a = obj.nextInt();
        try {
            if (a >= 18) {
                System.out.println("You are elegible for vote ");
            } else {
                throw new NullPointerException("");
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

public class threow {
    public static void main(String args[]){
        
        a  o=new a();
        o.v();
    }

}
