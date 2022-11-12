/*
 * Section 2 Question 2
*Name:Marion Kariuki
*Reg no: 21/07779
*A method that asks a lecturer to enter marks for 3 units,Java programming,networking
and maths.The method should compute the average marks for the 3 units
 */
package Section2;

import java.util.Scanner;
public class question2 {
    //declare the variable
    static int num1, num2, num3;

    
    public static void main(String[] args) {
        
        // Method calling
 // Method name
 average();
        
    }
 
   public static Void average() {
  
       //creating Scanner class object
   Scanner input = new Scanner(System.in);
 System.out.println("Enter java programming Marks:");
 num1 = input.nextInt();
 
 System.out.println("Enter Networking Marks:");
 num2 = input.nextInt();
 
 System.out.println("Enter Maths Marks:");
 num3 = input.nextInt();
 
 System.out.println(" Marks for Java Programming is:"+ num1);
 System.out.println(" Marks for Networking is:"+ num2);
 System.out.println(" Marks for Maths is:"+ num3);
 
 double average;
 
 //Calculate the average
 average=(num1+num2+num3)/3;
 System.out.println("The average is:" +average);
         return null;
   
}
}
 
    
    
    
    
    



