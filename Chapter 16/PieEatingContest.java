/* Haggai P. Estavilla  BSCS - 1A
   Date: March 5, 2024
   The purpose of this program is to ask for a contestant's weight and then says if the contestant is allowed in the contest.
*/
import java.util.Scanner;
public class PieEatingContest 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int weight; //Local Declaration
        
        System.out.printf("What is the contestant's weight: "); //User input Contestant's Weight
        weight = scan.nextInt();

        if (weight >= 220 && weight <= 280) //True Branch
            System.out.printf("The contestant is allowed in the contest"); //Print Output
        else //False Branch
            System.out.printf("Sadly your are not eligible to join the contest "); //Print Output
    }
}