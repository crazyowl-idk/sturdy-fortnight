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
public class L4Q7 {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double p=cs.nextDouble();
        
        System.out.print("Enter interest in %: ");
        double i=cs.nextDouble();
        
        System.out.print("Enter total number of month(s): ");
        int n=cs.nextInt();
        
        double monthlyPayment;
        double interest;
        double principal;
        
        double balance=p;
        double totalInterest=0;
        monthlyPayment=(p*(i/(12*100)))/(1-Math.pow((1+(i/(12*100))),-n));
        
        System.out.printf("%-6s%-10s%-10s%-10s%-10s%-10s\n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        for(int j=1;j<=n;j++){
         interest=balance/12*(i/100);
         principal=monthlyPayment-interest;
         balance-=principal;
         totalInterest+=interest;
          System.out.printf("%-6d%-10.2f%-10.2f%-10.2f%-10.2f%-10.2f\n",j,monthlyPayment,principal,interest,balance,totalInterest);
        }
       
        
    }
}
