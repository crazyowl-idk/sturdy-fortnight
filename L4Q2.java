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
public class L4Q2 {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        
        System.out.print("Enter an integar:");
        int num=cs.nextInt();
        
        int sum=0;
        
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.printf("The sum is %d",sum);
    }
}
