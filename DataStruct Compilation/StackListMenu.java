import java.util.Scanner;

public class StackListMenu
{
   private Scanner scan = new Scanner(System.in); 
   public void runStackListMenu()
   {
        StackList stack = new StackList();
        boolean condition = true;
            
        while(condition)
        {
            System.out.println("\nWelcome to the NodeList Menu");
            System.out.println("Please enter the option of your desired choice");
            System.out.println("[1] = Push");
            System.out.println("[2] = Pop");
            System.out.println("[3] = Peek");
            System.out.println("[4] = Display");
            System.out.println("[X] = Exit");
            String option = scan.next().toUpperCase().trim();
            scan.nextLine();
            
            switch(option)
            {
                case "1":
                    System.out.println("Please add data to the new node:  ");
                    String data = scan.nextLine().trim();
                    stack.push(data);
                    break;
                case "2":
                    stack.pop(); 
                    break;
                case "3":
                    System.out.println(stack.peek());
                    break;
                case "4":
                    stack.display();
                    break;
                case "X":
                    condition = false;
                    break;
                default:
                    System.out.println("Please input a valid option");       
            }
        } 
   }
} 

class StackList
{
    private StackNode top;
    private int count;

    public StackList()
    {
        count = 0;
        top = null;
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public int getCount()
    {
        return count;
    }

    public boolean push(String data)
    {
       StackNode node = new StackNode (data);
       node.tail = top;
       top = node;
       count++;
       return true;
    }
    
    public boolean pop()
    {
        if(!isEmpty())
        {
            top = top.tail;
            count--;
            return true;
        }
        return false;
    }

    public String peek()
    {
        if(!isEmpty())
        {
            return top.data;
        }
        return null;
    }

    public void display()
    {
        if (!isEmpty())
        {
            StackNode temporary = top;
            while (temporary != null)
            {
                System.out.println(temporary.data);
                temporary = temporary.tail;
            }
            System.out.println();
        }
        else
        {
            System.out.println("Stack is empty");
        }
    }

    public class StackNode
    {
        String data;
        StackNode tail;

        public StackNode(String data)
        {
            this.data = data;
            tail = null;
        }
    }
}