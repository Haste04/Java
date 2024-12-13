import java.util.*;

class StackArrayMenu
{
   private Scanner scan = new Scanner(System.in); 
   public void runStackArrayMenu()
   {
      int size;
      String choice, pushItem;
      boolean loop = true;
      
      System.out.printf("Enter size: ");
      size = scan.nextInt();
      scan.nextLine();
      StackArray sa = new StackArray(size);
      
      if (size <= 0)
        System.out.println("You have inputted size that is less than or equal to 0 therefore the size will be switched to 10");
      
      while (loop)
      {
         System.out.println("\n--Stack Array Menu--");
         System.out.println("1] Push an item");
         System.out.println("2] Pop");
         System.out.println("3] Peek");
         System.out.println("4] Display Stack");
         System.out.println("X] Exit ");
         
         choice = scan.nextLine().trim().toUpperCase();
         
         switch(choice)
         {
            case "1":
               System.out.println("Enter item value: ");
               pushItem = scan.nextLine().trim();
               if (sa.push(pushItem))
                  System.out.println("Pushed Item Successfully");
               else
                  System.out.println("Sorry, stack is full");
               break;
               
            case "2":
               sa.pop();
               System.out.println("Item Popped Successfully");
               break;
               
            case "3":
               System.out.println("Item peeked: " + sa.peek());
               break;
               
            case "4":
               System.out.println("Display Stack:");
               sa.display();
               break;
               
            case "X":
               System.out.println("Exiting the Program...");
               loop = false;
               break;
               
            default:
               System.out.println("Error, please input the correct symbol. Please try again");
         }
      }
   }   
}

class StackArray
{
   private String[] s;
   private int count;
   
   public StackArray(int size)
   {
      s =new String[size];
      count = 0;
   }
   
   public StackArray()
   {
      this(10);
   }
   
   public boolean isEmpty()
   {
      return count == 0;
   }
   
   public boolean isFull()
   {  
      return count == s.length;
   }
   
   public boolean push(String val)
   {
      if (!isFull())
      {
         s[count++] = val;
         return true;
      }
      return false;
   }
   
   public boolean pop()
   {
      if(!isEmpty())
      {
         s[count - 1] = null;
         count--;
         return true;
      }
      return false;
   }
   
   public String peek()
   {
      if(!isEmpty())
      {
         return s[count - 1];
      }
      return null;
   }
   
   public void display()
   {
      if(!isEmpty())
      {
         for(int i = count - 1; i >= 0; i--)
         {
            System.out.println("[" + s[i] + "]");
         }
         System.out.println();
      }
      else
         System.out.println("Stack is empty...");
   }
}