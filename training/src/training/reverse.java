package training;
import java.util.*;

class reverse
{
   public static void main(String args[])
   {
      String s1, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string");
      s1 = in.nextLine();
      /**
       * As i said,  create String utility class put these logic to there.  
       */
      int length = s1.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + s1.charAt(i);
 
      System.out.println("Reverse string: "+reverse);
   }
}

