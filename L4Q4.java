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
public class L4Q4 {

    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        
        System.out.print("Enter the year:");
        int year=cs.nextInt();
        
        System.out.print("Enter the first day of the year[0 for Sunday,1 for Monday,…,6 for Saturday]:");
        int day=cs.nextInt();
        
        String days=switch(day){
            case 0->"Sunday";
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            default->"Invalid";
        };
        
        System.out.print(days);
        System.out.println();
        
        boolean leap=(year%4==0)||(year%100==0)||(year%400==0);
        int feb;
        
        if(leap==true)
            feb=29;
        else
            feb=28;
        
        int spacingMay=0;
        
        int firstdayMay=(day+31+feb+31+30)%7;
        
        System.out.println("Calendar of May "+year);
        System.out.println("S\tM\tT\tW\tT\tF\tS\t");
        while(spacingMay<firstdayMay){
            System.out.print("\t");
            spacingMay++;
        }
        
        for(int i=1;i<=31;i++){
            System.out.print(i+"\t");
            if((i+spacingMay)%7==0)
                System.out.println();
        }
        
        System.out.println();
        
        int firstdayAug=(day+31+feb+31+30+31+30+31)%7;
        int spacingAug=0;
        
        System.out.println("Calendar of August "+year);
        System.out.println("S\tM\tT\tW\tT\tF\tS\t");
        while(spacingAug<firstdayAug){
            System.out.print("\t");
            spacingAug++;
        }
        
        for(int j=1;j<=31;j++){
            System.out.print(j+"\t");
            if((j+spacingAug)%7==0)
                System.out.println();
        }
    }
}
