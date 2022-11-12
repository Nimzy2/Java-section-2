/*
 * Section 2 question 3b
*Name: Marion Kariuki
Reg No: 21/07779

*A program to calculate the area a of a triangle and have three non-static metods
one method should ask to enter the base and height of a triangle
other method should compute the area of a rectangle
other method should output the calculted area of a triangle and display it to the user
 */
package methods;

import java.util.Scanner;
public class Calculate_area {
    
    static double AreaofRectangle(double length, double width)
 {
     return length * width;
 }  
        public static double AreaofTriangle(double base, double height)
        {
            return (base * height)/2;
        }             
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
  System.out.println("Enter the length of rectangle");
  double length= sc.nextDouble();
  System.out.println("Enter the width of rectangle");
  double width= sc.nextDouble();
  // getting length and width of a Rectangle
 
 
  System.out.println("Enter the base of Triangle");
  double base= sc.nextDouble();
  System.out.println("Enter the height of Triangle");
  double height= sc.nextDouble();
  //Gettiing base and height of Triangle
 
double areaofRectangle = AreaofRectangle(length, width);
System.out.println("The area of Rectangle is:" +areaofRectangle);
//Calculates the Area of the Rectangle

double areaofTriangle = AreaofTriangle(base, height);
System.out.println("Area of a Triangle is:" +areaofTriangle);
//Calculates the Area of the Triangle
        
    }
    
}
