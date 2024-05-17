/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to ask the user for a proposed password until the user enters an acceptable password.
    When the user enters an acceptable password, the program writes a message and exits.
*/
import java.util.Scanner;
public class PasswordChecker 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String password;
        boolean loop = true, lowerCase, upperCase, digit;
        char character; //Local Declarations

        while (loop) //Loop will stop if the password is acceptable
        {
            System.out.println("Enter your password:");
            password = scan.nextLine();
            
            lowerCase = upperCase = digit = false;;
            
            if (password.length() < 7) //Program will loop because program is not acceptable
            {
                loop = false;
                System.out.println("That password is not acceptable.\n"); //Print Output
            }
            else 
            {
               for (int i = 0; i < password.length(); i++) 
               {
                  character = password.charAt(i);
                  if (Character.isLowerCase(character)) 
                     lowerCase = true;
                  if (Character.isUpperCase(character)) 
                     upperCase = true;
                  if (Character.isDigit(character)) 
                     digit = true;
               }

               if (!lowerCase || !upperCase || !digit) 
                  System.out.println("That password is not acceptable.\n"); //Print output
               else 
               {
                  loop = false;
                  System.out.println("Acceptable password.\n"); //Print Output
               }      
            }   
        }
    }
}