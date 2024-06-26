/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to read in lines and outputs only those lines that start with //
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocumentationPrinter 
{
    public static void main(String[] args) 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("Hello.java"))) 
        { //Read file
            String line;
            while ((line = reader.readLine()) != null) 
            {
                if (line.startsWith("//")) //Print if // is present
                    System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading the file"); //Print error message if file fails to read
        }
    }
}