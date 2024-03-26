import java.util.Scanner;
public class AverageAndStandardDeviation 
{
    public static void main (String[] args)
    {
        Scanner scan= new Scanner (System.in);
        int n;
        double avg, avg2, avgSquare, SD, num;
        double sum = 0.0;
        double sum2 = 0.0;
        int i = 1;

        System.out.println("Enter N:");
        n = scan.nextInt();
     
        while (i <= n)
        {
            System.out.println("Please input number:");
            num = scan.nextDouble();
            sum += num;
            num *= num;
            sum2 += num;
            ++i;
        }

        avg = sum / n;
        avg2 = avg * avg;
        avgSquare = sum2 / avg2;
        SD = Math.sqrt(avgSquare - avg2);

        System.out.printf("\nAverage = " + avg);
        System.out.printf("\nStandard Deviation = " + SD);
    }
}
