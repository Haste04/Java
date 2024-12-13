/*    Haggai P. Estavilla  BSCS - 2A
      Date: October 5, 2024
*/
import java.util.Scanner;

public class NodeListMenu
{
   private Scanner scan = new Scanner(System.in); 
   public void runNodeListMenu ()
   {
        boolean condition = true;
        NodeList stack = new NodeList();
            
        while(condition)
        {
            System.out.println("\nWelcome to the NodeList Menu");
            System.out.println("Please enter the option of your desired choice");
            System.out.println("[1] = Add");
            System.out.println("[2] = Delete");
            System.out.println("[3] = Display");
            System.out.println("[X] = Exit");
            String option = scan.next().toUpperCase().trim();
            scan.nextLine();
            
            switch(option)
            {
                case "1":
                    System.out.println("Please add data to the new node:  ");
                    String data = scan.nextLine().trim();
                    stack.add(data);
                    break;
                case "2":
                    System.out.println("Please input the index of the node to be deleted");
                    int index = scan.nextInt();
                    stack.delete(index); 
                    break;
                case "3":
                    System.out.println("Node List:");
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

class NodeList 
{
    private Node top;   
    private int count;

    public NodeList() 
    {
        top = null;
        count = 0;
    }

    private class Node 
    {
        String data;  
        Node tail;    

        public Node(String data) 
        {
            this.data = data;
            this.tail = null;
        }
    }

    public int getCount() 
    {
        return count;
    }

    public boolean isEmpty() 
    {
        return count == 0;
    }

    public void add(String data) 
    {
        Node newNode = new Node(data);
        newNode.tail = top;
        top = newNode;
        count++;
    }

    public boolean delete(int location) 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty, cannot delete.");
            return false;
        }
        if (location < 0 || location >= count) 
        {
            System.out.println("Invalid location: " + location);
            return false;
        }

        Node previous = null;
        Node current = top;

        for (int i = 0; i < location; i++) 
        {
            previous = current;
            current = current.tail;
        }

        if (previous == null) 
            top = top.tail;
        else 
            previous.tail = current.tail;

        count--;
        return true;
    }

    public void display() 
    {
        if (isEmpty()) 
            System.out.println("Stack is empty");
        else 
        {
            System.out.println("Stack size: " + count);
            int index = 0;
    
            for (Node current = top; current != null; current = current.tail) 
            {
                System.out.println(current.data + " Index = " + index);
                index++;
            }
        }
    }

}