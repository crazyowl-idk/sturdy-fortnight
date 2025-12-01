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
public class L2Q4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the  number of seconds:");
        int sec=scanner.nextInt();
        
        int hour=sec/3600;
        int hourRemain=sec%3600;
        int min=hourRemain/60;
        int secRemain=sec-(hour*3600)-(min*60);
        
        System.out.println(sec+" seconds is "+hour+" hours, "+min+" minutes and "+secRemain+" seconds");
    }
}
