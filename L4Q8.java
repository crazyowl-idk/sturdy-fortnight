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
public class L4Q8 {

    public static void main(String[] args) {
         
        Random rand=new Random();
        
        int n=rand.nextInt(100)+1;
        
        System.out.println("The first "+n+" prime number: ");
          
        int num=0;
        String primeNumbers="";
        
        for (int i = 1; i <= n; i++){  	    		 		  
         int factorcounter=0; 		  
         for(num=i; num>=1; num--)
         {
	    if(i%num==0)
	    {
		factorcounter = factorcounter + 1;
	    }
	 }
	 if (factorcounter ==2)//means it only divides by itself and 1
	 {
	    primeNumbers=primeNumbers+ i+ " ";
         }
    }
        System.out.print(primeNumbers);
    }
}
