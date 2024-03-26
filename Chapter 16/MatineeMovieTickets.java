/* Haggai P. Estavilla  BSCS - 1A
   Date: March 12, 2024
   The purpose of this program is to determine the price of a movie ticket
*/
import java.util.Scanner;
public class MatineeMovieTickets 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        byte age;
        short time; 

        System.out.printf("Please input your age: "); //User Input age
        age = scan.nextByte();
        System.out.printf("Please input the time on a 24-hour format: "); //User Input time on a 24 hour format
        time = scan.nextShort();

        if (age <= 13) //If age is less than or equal to 13
        {
            if (time < 1700) //If time is less than 1700 (5 pm)
                System.out.printf("The children's matinee price is $2.00"); //Print Output
            else //False Branch
                System.out.printf("The normal's children's ticket price is $4.00"); //Print Output
        }
        else //False Branch
        {
            if (time < 1700) //If time is less than 1700 (5 pm)
                System.out.printf("The adult's matinee price is $5.00"); //Print Output
            else
                System.out.printf("The normal adult ticket price is $8.00"); //Print Output
        }
    }
}