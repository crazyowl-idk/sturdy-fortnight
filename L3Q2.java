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
public class L3Q2 {

    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt(5)+1;
        
        String output = switch(num){
            case 0->num+" is zero";
            case 1->num+" is one";
            case 2->num+" is two";
            case 3->num+" is three";
            case 4->num+" is four";
            case 5->num+" is five";
            default->"Invalid";
        };
        
       
      System.out.println(output);
    }
}