/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to Add another constructor to the HelloObject class that 
    takes a HelloObject object as a parameter
*/
import java.util.Scanner;

public class HelloObjectExercise4 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Greeting: "); //User Input greeting
        String userGreeting = scan.nextLine();

        HelloObjectExercise4 originalHello = new HelloObjectExercise4(userGreeting);
        HelloObjectExercise4 copyHello = new HelloObjectExercise4(originalHello); // Create a new HelloObject using the copy constructor
        originalHello.greeting(); // Print the greeting as many times as its length using the original object
        copyHello.greeting(); // Print the greeting as many times as its length using the copied object
    }
    private String greeting;
    public HelloObjectExercise4(String greeting) //Initialize the greeting
    {
        this.greeting = greeting;
    }
    public HelloObjectExercise4 (HelloObjectExercise4 init) // Copy constructor that initializes the greeting based on another HelloObject
    {
        this.greeting = new String(init.greeting); // Create a new String object
    }
    public void greeting() //Output the greeting
    {
        System.out.println(greeting);
    }
}