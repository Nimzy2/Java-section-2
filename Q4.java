/*
 Section 2 question 4
 *Name:Marion Kariuki
 *Reg No: 21/07779
*A program with one non-static method,two static methods and a constructor
 */
package q4;

import java.util.Scanner;
public class Q4 {
    
    public static void q4()
    {
     int num = 5;
    System.out.println(num);   
//non-static method that is called using a constructor
System.out.println("5 is the only prime to end with 5 in ones place"); 

    }
    
    // static method
    static int age = 20;
    
    

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Your age:" + age);
    q4();
    
    
        
       
    }
}
    
    
    
   

    
     
    
    
   
    

