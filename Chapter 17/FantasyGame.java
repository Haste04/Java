/* Haggai P. Estavilla  BSCS - 1A
   Date: March 19, 2024
   The purpose of this program is to ask for a name for the character and asks for the point value of for each of the three characteristics.
*/
import java.util.Scanner;
public class FantasyGame 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in); //Local Declarations
        byte strength, health, luck;
        String name;

        System.out.printf("Welcome to Yertle's Quest");
        System.out.println("\nEnter the name of your character:"); //User Input name
        name = scan.nextLine();
        System.out.println("Enter strength (1-10): "); //User Input strength
        strength = scan.nextByte();
        System.out.println("Enter health (1-10):"); //User Input health
        health = scan.nextByte();
        System.out.println("Enter luck (1-10):"); //User Input luck
        luck = scan.nextByte();

        if (strength + health + luck >= 15) //If the sum of the 3 characteristics is more than or equal to 15 then print the outputs
        {
            System.out.printf("You have give your character too many points!  Default values have been assigned:\n");
            System.out.printf(name + ", strength: 5, health: 5, luck: 5"); //Print default output
        }    
        else //If the sum of the 3 characteristics is less than 15 then print the output
            System.out.printf(name + ", Strength: " + strength + ", Health: " + health + ", Luck: " + luck); //Print Output
    }
}
