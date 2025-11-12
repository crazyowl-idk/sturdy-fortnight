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
public class L2Q1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter temperature in degree Fahrenheit:");
        double fahrenheit=scanner.nextDouble();
        
        double celsius=(fahrenheit-32)/1.8;
        System.out.print("Temperature in degree Celsius:");
        System.out.printf("%.2f",celsius);
    }
}