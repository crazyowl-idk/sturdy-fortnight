/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class L4Q1 {

    public static void main(String[] args) {
       Scanner cs = new Scanner(System.in);
       
       System.out.print("Enter an integar:");
       int num=cs.nextInt();
       
       System.out.print("The factors are:");
       
       
       for(int i=1;i<=num;i++){
           if(num%i==0)
               System.out.print(" "+i+" ");
       }
       
    }
}
