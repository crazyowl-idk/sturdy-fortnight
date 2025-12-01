/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class L3Q5 {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        
        System.out.print("Enter value of a:");
        int a =cs.nextInt();
        System.out.print("Enter value of b:");
        int b =cs.nextInt();
        System.out.print("Enter value of c:");
        int c =cs.nextInt();
        System.out.print("Enter value of d:");
        int d =cs.nextInt();
        System.out.print("Enter value of e:");
        int e =cs.nextInt();
        System.out.print("Enter value of f:");
        int f =cs.nextInt();
        
     
        int num=a*d-b*c;
        
        if(num==0)
            System.out.println("The equation has no solution");
        else{
            int x=(e*d-b*f)/(a*d-b*c);
            int y=(a*f-e*c)/(a*d-b*c);
            System.out.printf("X = %s and Y = %s",x,y);
        }
            
        
    }
}
