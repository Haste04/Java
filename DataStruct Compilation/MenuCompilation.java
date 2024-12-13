import java.util.Scanner;

public class MenuCompilation 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        QueueNodeMenu queueNodeMenu = new QueueNodeMenu();
        QueueArrayMenu queueArrayMenu = new QueueArrayMenu();
        NodeListMenu nodeListMenu = new NodeListMenu();
        InfixToPostFixMenu fixMenu = new InfixToPostFixMenu();
        SumAndProduct sumAndProductMenu = new SumAndProduct();
        OddEven oddEvenMenu = new OddEven();                    
        StackArrayMenu stackArrayMenu = new StackArrayMenu();
        StackListMenu stackListMenu = new StackListMenu();
        NoDuplicate noDuplicateMenu = new NoDuplicate();
        LargestSmallest largestSmallestMenu = new LargestSmallest();

        while(flag)
        {
            System.out.println("\nWelcome to the Compilation of all the programs that are assigned to us in Data Structures");
            System.out.println("Please enter the option of your desired choice of program");
            System.out.println("[1]  = Queue Node");
            System.out.println("[2]  = Queue Array");
            System.out.println("[3]  = Node List");
            System.out.println("[4]  = Infix to Postfix");
            System.out.println("[5]  = Sum and Product");
            System.out.println("[6]  = Odd and Even");
            System.out.println("[7]  = Stack Array");
            System.out.println("[8]  = StackNode or StackList");
            System.out.println("[9]  = No Duplicate");
            System.out.println("[10] = LargestSmallest");
            System.out.println("[X]  = Exit");
            String option = scan.nextLine().trim().toUpperCase();

            switch(option)
            {
                case "1":
                    queueNodeMenu.runQueueNodeMenu();
                    break;
                case "2":
                    queueArrayMenu.runQueueArrayMenu();
                    break;
                case "3":
                    nodeListMenu.runNodeListMenu();
                    break;
                case "4":
                    fixMenu.runInfixtoPostMenu();
                    break;
                case "5":
                    sumAndProductMenu.runSumAndProduct();
                    break;
                case "6":
                    oddEvenMenu.runOddEvenMenu();
                    break;
                case "7":
                    stackArrayMenu.runStackArrayMenu();
                    break;
                case "8":
                    stackListMenu.runStackListMenu();
                    break;
                case "9":
                    noDuplicateMenu.runNoDuplicateMenu();
                    break;
                case "10":
                    largestSmallestMenu.runLargestSmallestMenu();
                    break;
                case "X":
                    flag = false;
                    break;
                default:
                    System.out.println("Please input the correct symbol!");;
            }
        }
    }
}
