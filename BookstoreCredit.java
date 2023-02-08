/******************************************************************************
Programmer: Christian A. McDonald 
Date: 02/01/2023
Lab 1 
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/
import java.util.Scanner;
public class BookstoreCredit
{

   public static void main(String[] args)
   {
      Scanner inputDevice = new Scanner(System.in);
      String name = inputDevice.nextLine();
      float gpa = inputDevice.nextFloat();
      bookCredit(name, gpa);
   }
   public static void bookCredit(String name, float gpa)
   {
      int credit = (int)(gpa * 10);
      System.out.print(name + " with a gpa of " + gpa + " has earned a $" + credit + " credit.");
   }
}
   
      
