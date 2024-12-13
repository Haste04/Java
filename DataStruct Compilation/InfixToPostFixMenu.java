import java.util.Scanner;

class InfixToPostFixMenu 
{
    public Scanner scan = new Scanner(System.in);
    public void runInfixtoPostMenu()
    { 
        String expression = "";
        boolean condition = true;
            
        while(condition)
        {
            System.out.println("\nWelcome to the Infix to Postfix App");
            System.out.println("Please enter the option of your desired choice");
            System.out.println("[1] = Conversion");
            System.out.println("[2] = Evaluate");
            System.out.println("[3] = Exit");
            char option = scan.next().charAt(0);
            scan.nextLine();
            
            switch(option)
            {
                case '1':
                    System.out.println("Please input an expression:");
                    expression = scan.nextLine();
                    InfixToPostfix ip = new InfixToPostfix(expression);
                    System.out.println("Conversion: " + ip.convert());
                    break;
                case '2':
                    System.out.println("Please input an expression:");
                    expression = scan.nextLine();
                    InfixToPostfix ipEval = new InfixToPostfix(expression);
                    Evaluate evaluate = new Evaluate(ipEval.convert());
                    System.out.println("Evaluation: " + evaluate.getResult());
                    break;
                case '3':
                    condition = false;
                    break;
                default:
                    System.out.println("Please input a valid option");       
            }
        }
    }
}

class InfixToPostfix
{
   private String infix;
   
   public InfixToPostfix(String i)
   {
        infix = i;
   }
   
   private int getPrec(char o)
   {
      if (o == '*' || o == '/')
         return 2;
      if (o == '+' || o == '-')
         return 1;
      return -1;
   }
   
   public String convert()
   {
      StackList s = new StackList();
      String result = "";
      
      for(int i = 0; i < infix.length(); i++)
      {
         char c = infix.charAt(i);
         
         if (Character.isDigit(c))
            result += c;
         else if (c == '(')
            s.push(c + "");
         else if (c == ')')
         {
            while(!s.isEmpty() && !s.peek().equals("("))
            {
               result += s.peek();
               s.pop();
            }
            s.pop();
         } 
         else
         {
            while(!s.isEmpty() && (getPrec(c) <= getPrec(s.peek().charAt(0))))
            {
               result += s.peek();
               s.pop();
            }
            s.push(c + "");
         }  
      }
      
      while(!s.isEmpty())
      {
        result += s.peek();
        s.pop();
      }
      
      return result;
    }
}

class Evaluate
{
   private String postfix;
   
   public Evaluate(String p)
   {
      postfix = p;
   }
   
   public double getResult()
   {
      StackList s = new StackList();
      double ans = 0;
      
      for(int i = 0; i < postfix.length(); i++)
      {
         char ch = postfix.charAt(i);
         
         if (Character.isDigit(ch))
            s.push(ch + "");
          
         else
         {
            double val2 = Double.parseDouble(s.peek());
            s.pop();
            double val1 = Double.parseDouble(s.peek());
            s.pop();
            
            switch(ch)
            {
               case '*':
                  ans = val1 * val2;
                  break;
                  
               case '/':
                  ans = val1 / val2;
                  break;
                  
               case '+':
                  ans = val1 + val2;
                  break;
                  
               case '-':
                  ans = val1 - val2;
                  break;
            }
            s.push(ans + "");
         }
      }
      return Double.parseDouble(s.peek());
   }
}