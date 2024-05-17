/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to ask for user's name and then writes it back with the first name as entered, 
    and the last name all in capital letters.
*/
import java.util.Scanner;
public class NameEcho
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String name, firstName, lastName; //Local Declarations
        
        System.out.printf("Enter your Name: "); //User input name
        name = scan.nextLine().trim();

        if (name.indexOf(" ") > 0)
        {
            firstName = name.substring(0, name.indexOf(" "));
            lastName = name.substring(name.indexOf(" "));
            System.out.println("\n" + firstName + lastName.toUpperCase()); //Print out first name as original and last name full caps
        }
        else    
            System.out.println(name);
    }
}