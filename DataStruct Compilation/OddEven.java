import java.util.Scanner;

class OddEven
{
    private Scanner scan = new Scanner (System.in);
    public void runOddEvenMenu()
    {
        int[] number = new int[10];
        int[] even = new int[10];
        int[] odd = new int[10];
        int evenIndex = 0, oddIndex = 0;
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < number.length; i++)
        {
            System.out.println("Enter an integer:");
            number[i] = scan.nextInt();
            
            if (number[i] % 2 == 0)
                even[evenIndex++] = number[i];
            else
                odd[oddIndex++] = number[i];
        }
        System.out.println("Even\t\t\t\t\tOdd");
        for (int i = 0; i < number.length; i++)
        {
            if (i < evenIndex)
                System.out.print(even[i]);
                
            System.out.print("\t\t\t");
                
            if (i < oddIndex)
                System.out.println("\t\t" + odd[i]);
            else
                System.out.println();
        }
    }
}