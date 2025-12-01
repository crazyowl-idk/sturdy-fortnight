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
public class L3Q6 {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        
        System.out.print("Enter the radius of circle:");
        double radius=cs.nextDouble();
        
        System.out.print("Enter the x-point:");
        double x=cs.nextDouble();
        
        System.out.print("Enter the y-point:");
        double y=cs.nextDouble();
        
        if(x<=radius)
            if(y<=radius)
                System.out.printf("This coordinate (%s,%s) is inside the circle",x,y);
            else
                System.out.printf("This coordinate (%s,%s) is outside the circle",x,y);
        else
            System.out.printf("This coordinate (%s,%s) is outside the circle",x,y);
    }
}