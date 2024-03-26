/* Haggai P. Estavilla  BSCS - 1A
   Date: March 12, 2024
   The purpose of this program is to determine the price of a movie ticket
*/
import java.util.Scanner;
public class MidnightMadness 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        byte age;
        short time;

        System.out.printf("Please input your age: "); //User Input Age
        age = scan.nextByte();
        System.out.printf("Please input the time on a 24-hour format: "); //User Input time on a 24-hour formar
        time = scan.nextShort();

        if (time > 2200) //if time is greater than 2200 (10 pm)
        {
            if (age <= 13) //If age is at least 13 or lower then true otherwise false
                System.out.printf("No children are allowed to purchase tickets after this time!"); //Print Output
            else //False Branch
                System.out.printf("The price of your ticket is $4.00"); //Print Output
        }
        else if (time < 1700) //If time is less than 1700 (5 pm)
        {
            if (age <= 13) //If age is at least 13 or lower then true otherwise false
                System.out.printf("The children's matinee price is $2.00"); //Print Output
            else //False Branch
                System.out.printf("The adult's matinee price is $5.00"); //Print Output
        }
        else //If time is not less than 1700 (5 pm) and not greater than 2200 (10 pm) 
        {
            if (age <= 13) //If age is at least 13 or lower then true otherwise false
                System.out.printf("The normal's children's ticket price is $4.00"); //Print Output
            else //False Branch
                System.out.printf("The normal adult ticket price is $8.00"); //Print Output
        }
    }
}