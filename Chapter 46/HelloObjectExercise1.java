/*  Haggai P. Estavilla BSCS - 1A
    Date: May 13, 2024
    The purpose of this program is to write out the greeting as may times as there are characters in the greeting
*/
public class HelloObjectExercise1 
{
    public static void main(String[] args) 
    {
        HelloObjectExercise1 hello = new HelloObjectExercise1("Hello"); // Initialize with the greeting
        hello.printGreeting(); //Print the greeting
    }
    private String greeting;
    public HelloObjectExercise1(String greeting) //Initialize the greeting
    {
        this.greeting = greeting;
    }
    public void printGreeting() //Print the greeting as many times as there are characters in the greeting
    {
        int i;
        for (i = 0; i < greeting.length(); i++) 
            System.out.println(greeting);
    }
}
