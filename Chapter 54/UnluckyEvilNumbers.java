/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to determine if any unlucky numbers are also evil.
*/
import java.util.Scanner;
public class UnluckyEvilNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        long upperLimit, i; //Local Declarations

        System.out.printf("Enter the upper limit: "); //user input upper limit
        upperLimit = scan.nextLong();

        for (i = 1; i <= upperLimit; i++) 
        {
            if (isUnlucky(i) && !isOdious(i)) 
                System.out.println(i + " is both unlucky and evil"); //Print Output
            else
                System.out.println("No unlucky numbers"); //Print Output
        }
    }
    public static boolean isUnlucky(long n) //Method to check if a number is unlucky
    {
        for (; n != 0; n /= 10) 
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
    public static boolean isOdious(long n) //Method to check if a number is an osidious
    {
        int sum = 0;
        for (; n != 0; n /= 2)
            sum += n % 2;
        return (sum % 2 != 0);
    }
}