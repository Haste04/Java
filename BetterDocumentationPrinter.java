/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    This program is the modified version of the program DocumentationPrinter that outputs lines that starts with 
    //, */ /*, and lines between those
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BetterDocumentationPrinter 
{
    public static void main(String[] args) 
    {
        boolean inBlockComment = false; //Local Declarations
        try (BufferedReader reader = new BufferedReader(new FileReader("Hello.java"))) 
        { //Reading the file
            String line;
            while ((line = reader.readLine()) != null) 
            {
                if (line.startsWith("//")) //Print if // is present
                {
                    System.out.println(line);
                } 
                else if (line.startsWith("/*")) //Print if /* is present */
                {
                    System.out.println(line);
                    inBlockComment = true;
                } 
                else if (line.startsWith("*/")) //Print if */ is present
                {
                    System.out.println(line);
                    inBlockComment = false;
                } 
                else 
                    System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading the file"); //Print error message if file fails to read
        }
    }
}