/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to repeatedly ask the user for a nonnegative integer and then says if it is unlucky or safe
*/
import java.util.Scanner;
public class UnluckyNumbers 
{
   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      long num = 0; //Local Declarations
    
      while (num >= 0) 
      { 
        System.out.print("\nEnter a number (Enter a negative number to exit): "); //User input integer
        num = scan.nextLong();

        if (Unlucky(num)) 
            System.out.println(num + " is unlucky"); //Print output unlucky
        else 
            System.out.println(num + " is safe"); //Print output safe
      }
   }
   public static boolean Unlucky(long n) //Method to determine if the number is lucky
   {      
      for ( ; n != 0 ; n /= 10) 
      {
        boolean unlucky1 = false;
        boolean unlucky3 = false;

        unlucky3 = n % 10 == 3;
            if (unlucky3) 
            {
               n /= 10;
               unlucky1 = n % 10 == 1;
               return unlucky1;
            }
      }
      return false;
   }
}