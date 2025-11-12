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
public class L4Q3 {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);

      
        double sum=0;
        double average;
        double sd;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int count=0;
        double num_sd;
        double sum_sd=0;
                
        while (true) {
            System.out.print("Enter a score[negative score to quit]:");
            int num=cs.nextInt();
            
            if(num<0)
                break;
            else{
            sum+=num;
            count++;
            num_sd=Math.pow(num,2);
            sum_sd+=num_sd;
                    
            if(num>max)
                max=num;
            
            if(num<min)
                min=num;
            }
        }
      
       average=sum/count;
       
       System.out.printf("Sum:%.2f\n",sum);
       System.out.printf("Minimum Score: %d\n",min);
       System.out.printf("Maximum Score:%d\n",max);
       System.out.printf("Average Score:%.2f\n",average);
       
       sd=Math.sqrt((sum_sd- (Math.pow(sum,2)/count))/(count-1));
       
       System.out.printf("Standard Deviatiom:%.3f\n",sd);
   
    }
}
