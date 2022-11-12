/*
 * Section 2 question 3a
*Name: Marion Kariuki
*Leap year Program
*1. Century (100%=0 and 400%=0)
*2. Yearly (100%!=0 and 4%=0)
 */
package leapyear;

import java.util.Scanner;
public class Leapyear {

     static int year;
     
    public static void main(String[] args) {
          //Method Calling
   //Method Name
   leapyear();
    }
    
    public static void leapyear(){
   Scanner r = new Scanner(System.in);
   year=r.nextInt();
   // if else condition
   
   if (year%100==0 && year%400==0 || year%100!=0 && year%4==0)
   {
     System.out.println("Is  leap Year");
   }
   else
   {
       System.out.println("Not a leap Year");
   }
}
    
}
