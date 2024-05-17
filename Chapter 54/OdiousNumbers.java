/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to repeatedly ask the user for a nonnegative integer and then says if it is odious or evil
*/
import java.util.Scanner;
public class OdiousNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        long number; //Local Declarations

        while (true) 
        {
            System.out.print("Enter a nonnegative integer (or a negative integer to exit): "); //User Input Integer
            number = scan.nextLong();

            if (number < 0) 
            {
                System.out.println("Exiting program."); //If number is a negative the program will end
                System.exit(0);
            }
            if (isOdious(number)) 
                System.out.println(number + " is an odious number.\n"); //Print odious number
            else 
                System.out.println(number + " is an evil number.\n"); //Print evil number
        }
    }
    public static boolean isOdious(long number) //Method to count the number of 1s in the binary representation of a number
    {
        int count = 0;
        while (number > 0) 
        {
            if (number % 2 == 1) 
                count++;
            number = number / 2;
        }
        return count % 2 == 1;
    }
}
