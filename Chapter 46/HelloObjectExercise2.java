/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to write out the the two greeting messages: a morning greeting and an evening greeting
*/
public class HelloObjectExercise2
{
    public static void main(String[] args) // Main method to test the class
    {
        HelloObjectExercise2 hello = new HelloObjectExercise2("Good morning World!", "Good evening World!");
        hello.printMorningGreeting(); //Print the morning message
        hello.printEveningGreeting(); //Print the evening message
    }
    private String morningGreeting;
    private String eveningGreeting;

    public HelloObjectExercise2(String morningGreeting, String eveningGreeting) // Constructor to initialize both greetings
    {
        this.morningGreeting = morningGreeting;
        this.eveningGreeting = eveningGreeting;
    }
    public void printMorningGreeting() //Output the morning greeting
    {
        System.out.println(morningGreeting);
    }
    public void printEveningGreeting() //Output the evening message
    { 
        System.out.println(eveningGreeting);
    }
}