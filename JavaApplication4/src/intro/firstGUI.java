/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dell
 */
public class firstGUI 
{
    public static void main(String args[])
    {
        abc obj= new abc();

    }
    
    
}
class abc extends JFrame
{
    public abc()
    {
        JLabel obj1= new JLabel("Hello world");
        JLabel obj2= new JLabel("welcome sampath");
        add(obj2);                                                //card layout
        //add(obj1);
       setVisible(true);
       setSize(600,600);
    }
    
}