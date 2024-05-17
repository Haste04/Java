/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to find all perfect numbers less than an upper limit entered by the user.
*/
import java.util.Scanner;
public class PerfectNumbers {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num; //Local Declarations
      
      System.out.print("Enter a number: "); //User Input Number
      num = scan.nextInt();
      
      if (PerfectNum(num))
         System.out.println(num + " is a Perfect Number"); //Print Output
      else
         System.out.println(num + " is not a Perfect Number"); //Print Output
   }
   public static boolean PerfectNum(int n) //Method to find the perfect number
   {
      int sum = 0;
      for (int num = 1 ; num < n ; num++) 
      {
         if (n % num == 0) 
            sum += num; 
      } 
      if (n == sum)
         return true;
      else
         return false;
   }
}