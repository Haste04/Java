/* Haggai P. Estavilla  BSCS - 1A
   Date: March 5, 2024
   The purpose of this program is to ask a user for their birth year encoded as two digits (like "62") and for the 
   current year, also encoded as two digits (like "99"). The program is to correctly write out the users age in years.
*/
import java.util.Scanner;
public class Y2KProblemDetector
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      int birthYear, currentYear, age; //Local Declarations
      
      System.out.printf("Year of Birth: "); //User Input year of birth
      birthYear = scan.nextInt();
      System.out.printf("Current Year : "); //User Input current year
      currentYear = scan.nextInt();
      
      if (currentYear < birthYear) //If the current year is less than the birth year then true otherwise false
      { //True Branch
         birthYear = 100 - birthYear; //Formulas if the current and birth year is not in the same century
         age = currentYear + birthYear;
         System.out.printf("Your Age: " + age); //Print output
      }
      else
      { //False Branch
         age = currentYear - birthYear; //Formula if the current and birth year is in the same century
         System.out.printf("Your age: " + age); //Print output
      }
   }   
}      
