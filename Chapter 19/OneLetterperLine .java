import java.util.Scanner;
public class OneLetterperLine 
{
    public static void main (String[] args)
    {
        Scanner scan= new Scanner (System.in);
        String word;
        int times;
        int i = 0;

        System.out.printf("Enter a word: ");
        word = scan.nextLine();
        times = word.length();

        while (i <= times)
        {
            System.out.println(word.charAt(i));
            i++;
        }
    }
}
