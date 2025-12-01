/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author ASUS
 */
import java.util.Random;
public class L2Q5 {

    public static void main(String[] args) {
       Random rand=new Random();
       
       int num=rand.nextInt(10001);
       int digit;
       int sum=0;
       
       System.out.println("The random number is "+num);
       
       while(num>0){
           digit=num%10;
           System.out.println(digit);
           num/=10;
           sum+=digit; 
       }
       
       System.out.println("The sum of digits in number is "+sum);
       
    }
}