/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to echo to the monitor with one character per line
*/
import java.util.Scanner;
public class CharAt
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      String word;
      int i = 0; //Local Declaration
      
      System.out.println("Enter a string:"); //User Input
      word = scan.nextLine();
      System.out.printf("\n");

      do //Loop to output one character per line
      {
         System.out.println(word.charAt(i));
         i++;
      }while(i < word.length());
   }
}