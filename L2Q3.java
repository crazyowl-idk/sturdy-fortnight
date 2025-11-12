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
public class L2Q3 {

    public static void main(String[] args) {
        Random rand=new Random();
        int max=50;
        int min=10;
        int sum=0;
        double average=0;
        
        for(int i=0;i<3;i++){
            int num=rand.nextInt(max-min+1)+min;
            System.out.println(num);
            sum +=num;
            average=num/3;
        }
       System.out.println("Sum of three numbers:"+sum);
       System.out.print("Average of three numbers:");
       System.out.printf("%.2f",average);
    }
}
