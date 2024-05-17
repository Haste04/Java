/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to ask asks for the user's name and then writes that name to the monitor with 
    either "Ms." or "Mr." in front, depending if the name is for a female or male.
*/
import java.util.Scanner;
public class TitleApplier
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      String name;
      boolean loop = true; //Local Declarations
      
      while (loop == true)
      {
         System.out.println("Enter a name:"); //User Input Name
         name = scan.nextLine();
         
         if (name.length() == 0) //Program will exit if the user hits "enter"
            System.exit(0);
         //Condition to determine if the name needs to have a "Ms." or "Mr."   
         if (name.toLowerCase().startsWith("fred") || name.toLowerCase().startsWith("elroy") || name.toLowerCase().startsWith("graham"))
            System.out.println("Mr. " + name.toUpperCase().substring(0,1) + name.substring(1) + "\n");
         else if (name.toLowerCase().startsWith("amy") || name.toLowerCase().startsWith("buffy") || name.toLowerCase().startsWith("cathy"))
            System.out.println("Ms. " + name.toUpperCase().substring(0,1) + name.substring(1) + "\n");
         else
            System.out.println(name.toUpperCase().substring(0,1) + name.substring(1) + "\n");
      }
   }
}