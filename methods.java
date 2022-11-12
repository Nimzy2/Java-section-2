/*
 * Section 2 Question 1
*Name: Marion Kariuki
*Reg NO: 21/07779
*A Program that asks a user to enter three numbers using if statement determine
the largest and smallest number
  
 */
package java_methods;

import java.util.Scanner;
public class methods {

     

public static void main(String[] args) {
        // Method calling
   // Method Name
   
   largestandsmallest();
  
    }
    
    public static void largestandsmallest(){
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter first number");
    int num1=sc1.nextInt();
    System.out.println("Enter second number");
    int num2=sc1.nextInt();
    System.out.println("Enter third number");
    int num3=sc1.nextInt();
    
//if conditon
    if(num1>num2 && num1>num3){
        System.out.println(num1 + " " + "is largest number");
        }
    else if (num2>num3 && num2>num1)
    {
        System.out.println(num2 + " " + "is largest number");
    }
    else
    {
        System.out.println(num3 + " " + "is largest number");
    }
    
     //if conditon
    if(num1<num2 && num1<num3){
        System.out.println(num1 + " " + "is smallest number");
        }
    else if (num2<num3 && num2<num1)
    {
        System.out.println(num2 + " " + "is smallest number");
    }
    else
    {
        System.out.println(num3 + " " + "is smallest number");
        
        
    }
}
}
