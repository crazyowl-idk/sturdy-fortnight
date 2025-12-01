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
public class L3Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result=0;
        
        System.out.print("Enter two integar number:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        
        System.out.print("Enter the operand:");
        String operator=scanner.next();
        
        switch(operator){
            case"+"->result=num1+num2;
            case"-"->result=num1-num2;
            case"*"->result=num1*num2;
            case "/"-> result=num1/num2;
            default-> System.out.println("Invalid operator");
        }//no break needed for this form of switch
        
        
        System.out.printf("%d %s %d = %d",num1,operator,num2,result);                
        
        
        
    }
}

