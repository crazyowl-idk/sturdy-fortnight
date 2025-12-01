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
public class L3Q3 {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        
        System.out.print("Enter sales volume: RM");
        int salesVol=cs.nextInt();
        double com=0;
        
        if(salesVol<=100)
            com=0.05*salesVol;
        else if (salesVol<=500)
            com=(0.075*salesVol)+5;
        else if(salesVol<=1000)
            com=(0.1*salesVol)+5+30;
        else 
            com=(0.125*salesVol)+5+30+50;
        
        System.out.printf("The commission is RM%.2f",com);
    }
}
