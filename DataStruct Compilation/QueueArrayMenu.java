import java.util.InputMismatchException;
import java.util.Scanner;

class QueueArrayMenu 
{
    private Scanner scan = new Scanner(System.in);
    public void runQueueArrayMenu()
    {
        int size = 10;
        String choice, item;
        boolean loop = true, errorCheck = true;
      
        while(errorCheck)
        {
            try
            {
                System.out.printf("Enter size: ");
                size = scan.nextInt();
                errorCheck = false;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Please input a valid number");
                scan.nextLine();
            }
        }
        scan.nextLine();
        QueueArray qa = new QueueArray(size);
        
        if (size <= 0)
            System.out.println("You have inputted size that is less than or equal to 0 therefore the size will be switched to 10");
        
        while (loop)
        {
            System.out.println("\n--Queue Array Menu--");
            System.out.println("1] Enqueue an item");
            System.out.println("2] Dequeue an item");
            System.out.println("3] See the front of the queue");
            System.out.println("4] Display Queueu Items");
            System.out.println("X] Exit");
            
            choice = scan.nextLine().trim().toUpperCase();
            
            switch(choice)
            {
                case "1":
                  System.out.println("\nEnter item value: ");
                  item = scan.nextLine().trim();
                  if (qa.enqueue(item))
                     System.out.println("Enqueued Item Successfully");
                  else
                     System.out.println("Sorry, stack is full");
                  break;
                
                case "2":
                  qa.dequeue();
                  System.out.println("Item Dequeued Successfully");
                  break;
                
                case "3":
                  System.out.println("Item in the front: " + qa.front());
                  break;
                
                case "4":
                  System.out.println("Display Queue:");
                  qa.display();
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

class QueueArray
{
   private Object[] items;
   private int count;
   
   public QueueArray(int size)
   {
      items = new Object[size > 0? size : 10];
      count = 0;
   }
   
   public QueueArray()
   {
      this(10);
   }
   
   public boolean isEmpty()
   {
      return count == 0;
   }
   
   public boolean isFull()
   {  
      return count == items.length;
   }
   
   public boolean enqueue(Object val)
   {
      if (!isFull())
      {
         items[count++] = val;
         return true;
      }
      return false;
   }
   
   public boolean dequeue()
   {
      if(!isEmpty())
      {
         for(int i = 1; i < count; i++)
         {
            items[i-1] = items[i];
         }
         items[count - 1] = null;
         count--;
         return true;
      }
      return false;
   }
   
   public Object front()
   {
      if(!isEmpty())
      {
         return items[0];
      }
      return null;
   }
   
   public void display()
   {
      if(!isEmpty())
      {
         for(int i = 0; i < count; i++)
         {
            System.out.println("[" + items[i] + "]");
         }
         System.out.println();
      }
      else
         System.out.println("Queue is empty...");
   }
}