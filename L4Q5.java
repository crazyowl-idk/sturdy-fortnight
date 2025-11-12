/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author ASUS
 */
import java.util.Random;
public class L4Q5 {

    public static void main(String[] args) {
        Random rand=new Random();
        
        int sum1=0;
        int sum2=0;
        
        while(true){
            int num1;
            do {
            num1=rand.nextInt(6)+1;
            System.out.println("Roll dice for player 1:"+num1);
            sum1+=num1;
            } while(num1==6);
          
            int num2;
            do{
            num2=rand.nextInt(6)+1;
            System.out.println("Roll dice for player 2:"+num2);
            sum2+=num2;
            }while (num2==6);
           
            if (sum1 > 100 && sum2 > 100) {
              System.out.println("It's a tie!");
              break;
            }
            else if (sum1 > 100) {
              System.out.println("Player 1 wins with score " + sum1);
              break;
            }
              else if (sum2 > 100) {
              System.out.println("Player 2 wins with score " + sum2);
              break;
              }
        }
     
    }
}
