/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author ASUS
 */
import java.util.Random;
public class L4Q6 {

    public static void main(String[] args) {
        Random rand=new Random();
       
        int max=Integer.MAX_VALUE;
        
        int num=rand.nextInt(max);
        System.out.println("The integer:"+num);
        
        String number=Integer.toString(num);
        int digit=number.length();
        
        System.out.print("The number of digit:" +digit);
        
        
    }
}