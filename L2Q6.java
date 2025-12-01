/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class L2Q6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the amount of warer in gram: ");
        int m=scanner.nextInt();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double tempa=scanner.nextDouble();
        double temp1=(tempa-32)*5/9;
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double tempb=scanner.nextDouble();
        double temp2=(tempb-32)*5/9;
        
        double q=(m/1000)*(temp2-temp1)*4184;
        System.out.printf("The energy needed is %e\n ",q);
        
        
    }
}