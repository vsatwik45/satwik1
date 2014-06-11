package training;

import java.util.Scanner;

class compare
{
   public static void main(String args[])
   {
      String s1, s2;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter first string");
      s1 = in.nextLine();
 
      System.out.println("Enter second string");
      s2 = in.nextLine();
      /**
       * put this logic to seperate public  static method,  so this logic can be used by any other class 
       * as an string utility, compare two string size
       */
      if ( s1.compareTo(s2) > 0 )
         System.out.println("First string is greater than second.");
      else if ( s1.compareTo(s2) < 0 )
         System.out.println("First string is smaller than second.");
      else   
         System.out.println("Both strings are equal.");
   }
  
}
