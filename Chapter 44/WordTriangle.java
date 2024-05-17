/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to ask the user for a word, and then writes out that word once per line but for each 
    line replace the first character of the word with a space and remove the last character of the word.
*/
import java.util.Scanner;
public class WordTriangle 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String word;
        int i = 0, j = 0; //Local Declarations

        System.out.printf("Enter a word --> "); //User Input word 
        word = scan.nextLine();

        for (i = 0; i < word.length() / 2 + 1; i++) //Nested loop 
        {
            for (j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println(word.substring(i, word.length()- i)); //Print Output
        }
    }
}