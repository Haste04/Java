/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to write out the greeting that is printed by the object is given by the user
*/
import java.util.Scanner;
public class HelloObjectExercise3 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String greeting; //Local Declarations

        System.out.println("Enter Greeting: "); //User Input greeting
        greeting = scan.nextLine();
        HelloObjectExercise3 hello = new HelloObjectExercise3(greeting);
        hello.printGreeting(); // Print the greeting as many times as its length
    }
    private String greeting;
    public HelloObjectExercise3(String greeting) //Initialize the greeting
    {
        this.greeting = greeting;
    }
    public void printGreeting() //Output the greeting
    {
        System.out.println("\n" + greeting);
    }
}