/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;

/**
 *
 * @author ASUS
 */
import java.util.Random;
public class L3Q4 {

    public static void main(String[] args) {
        Random random=new Random();
        int num1;
        int num2;
        int sum1=0;
        int sum2=0;
        
        for (int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                num1=random.nextInt(6)+1;
                System.out.println("Player 1:"+num1);
                sum1+=num1;
            }
            num2=random.nextInt(6)+1;
            System.out.println("Player 2:"+num2);
            sum2+=num2;
        }
        System.out.printf("Mark for player 1 = %d\n",sum1);
        System.out.printf("Mark for player 2 = %d\n",sum2);
        
         if (sum1 > sum2) 
            System.out.println("Player 1 wins!");
         else if (sum2 > sum1) 
            System.out.println("Player 2 wins!");
         else 
            System.out.println("It's a tie!");
         
    }
}

