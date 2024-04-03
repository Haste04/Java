import java.util.Scanner;
public class GradingSystem
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        byte options;
        float quizGrade, labGrade, examGrade, totalGrade;
        boolean conditions = true;
        char response;
         
        while (true)
        {
            System.out.println("GRADING SYSTEM");
            System.out.println("Options:");
            System.out.println("[1] Compute Midterm Grade");
            System.out.println("[2] Compute Final Grade");
            System.out.println("[3] Quit App");
            System.out.println("Press 1 or 2 or 3: ");
            options = scan.nextByte();
               
            switch (options)
            {
                case 1:
                    System.out.printf("Enter your Quiz Grade: ");
                    quizGrade = scan.nextFloat();
                    System.out.printf("Enter your Labworks Grade: ");
                    labGrade = scan.nextFloat();
                    System.out.printf("Enter your Midterm Exam Grade: ");
                    examGrade = scan.nextFloat();
                    
                    totalGrade = (float) (quizGrade * 0.20f) + (labGrade * 0.40f) + (examGrade * 0.40f); 
                    System.out.println("Midterm Grade: " + Math.floor(totalGrade * 10) / 10);

                    if (totalGrade <= 3.0)
                        System.out.println("PASSED");
                    else
                        System.out.println("FAILED");
                        break;
                case 2:
                    System.out.printf("Enter your Quiz Grade: ");
                    quizGrade = scan.nextFloat();
                    System.out.printf("Enter your Labworks Grade: ");
                    labGrade = scan.nextFloat();
                    System.out.printf("Enter your Fianl Exam Grade: ");
                    examGrade = scan.nextFloat();
                
                    totalGrade = (float) (quizGrade * 0.20f) + (labGrade * 0.40f) + (examGrade * 0.40f); 
                    System.out.println("Final Grade: " + Math.floor(totalGrade * 10) / 10);

                    if (totalGrade <= 3.0)
                        System.out.println("PASSED");
                    else
                        System.out.println("FAILED");
                    break;
                case 3:
                    System.out.println("Quitting App...");
                    System.exit(0);
                default:
                    break;
            }
            conditions = false;
            while (conditions == false)
            {
                System.out.println("Do you want to continue the app [Y = Yes / N = No)");
                response = scan.next().charAt(0);

                switch (Character.toUpperCase(response)) //Switch to know if the user wants to continue or not
                {
                    case 'Y': //'Y' will continue the program
                        conditions = true;
                        break;
                    case 'N': //'N' will exit the program
                        System.out.println("Quitting App...");
                        System.exit(0);
                    default: //Other symbols will loop the program back in order for you to put the correct symbol
                        System.out.printf("Invalid Response. Please try again\n");
                        break;
                }
            }    
        }        
    }
}
