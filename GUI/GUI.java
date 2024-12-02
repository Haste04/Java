import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.*;

public class GUI 
{
    private JTextField userText;
    private JPasswordField passWordText;
    private JLabel successLabel;
    private JButton loginButton, registerButton;
    private Map<String, String> users = new HashMap<>();

    public GUI() 
    {
        JFrame frame = new JFrame("Nice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("thumb_720_450_1411_f.jpg");
        frame.setIconImage(image.getImage());

        JPanel panel = LoginPanel(frame.getWidth(), frame.getHeight());
        frame.add(panel);
        frame.setVisible(true);
    }

    private JPanel LoginPanel(int frameWidth, int frameHeight) 
    {
        JPanel panel = new JPanel(null); 
        panel.setBackground(Color.LIGHT_GRAY);

        int formWidth = 300; 
        int x = (frameWidth - formWidth) / 2; 
        int y = 100; 

        JLabel userName = new JLabel("Username:");
        userName.setBounds(x, y, 80, 25);
        panel.add(userName);

        userText = new JTextField(20);
        userText.setBounds(x + 100, y, 165, 25);
        panel.add(userText);

        JLabel passWord = new JLabel("Password:");
        passWord.setBounds(x, y + 40, 80, 25);
        panel.add(passWord);

        passWordText = new JPasswordField(20);
        passWordText.setBounds(x + 100, y + 40, 165, 25);
        panel.add(passWordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(x, y + 80, 100, 25);
        loginButton.addActionListener(this::Login);
        panel.add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(x + 120, y + 80, 100, 25);
        registerButton.addActionListener(this::Register);
        panel.add(registerButton);

        successLabel = new JLabel("");
        successLabel.setBounds(x, y + 120, 300, 25);
        panel.add(successLabel);

        JLabel note = new JLabel("Note: The username must be Haggai and the password must be 12345678");
        note.setHorizontalAlignment(SwingConstants.CENTER);
        note.setBounds(0, y + 160, frameWidth, 50); 
        panel.add(note);

        return panel;
    }

    private void Register(ActionEvent e)
    {
        String registerUser = userText.getText();
        String registerPass = new String(passWordText.getPassword());
        
        if(registerUser.isEmpty() || registerPass.isEmpty())
        {
            successLabel.setText("The username/password must not be empty");
            return;
        }
        if(registerPass.length() < 8)
        {
            successLabel.setText("The password must be at 8 characters");
            return;
        }
        if(users.containsKey(registerUser))
        {
            successLabel.setText("Username already exist");
            return;
        }

        users.put(registerUser, registerPass);
        successLabel.setText("Registered successfully");
    }

    // Handle login button click
    private void Login(ActionEvent e) 
    {
        String username = userText.getText();
        String password = new String(passWordText.getPassword()); // Convert char[] to String

        if (users.containsKey(username) && users.get(username).equals(password)) 
        {
            successLabel.setText("Login successful!");
            new Calculator();
        }
        else if (!users.containsKey(username))
            successLabel.setText("User doesn't exist");
        else
            successLabel.setText("Invalid username or password.");
    }
}    

class Calculator 
{
    private JTextField display;
    
    public Calculator() 
    {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        JPanel panel = new JPanel(null); 
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel);

        display = new JTextField();
        display.setBounds(50, 350, 300, 50);
        display.setHorizontalAlignment(JTextField.LEFT);
        display.setEditable(false);
        panel.add(display);

        String[] buttons = 
        {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        int x = 50, y = 90;
        for (int i = 0; i < buttons.length; i++) 
        {
            JButton button = new JButton(buttons[i]);
            button.setBounds(x, y, 60, 50);
            button.addActionListener(this::Calculations);
            panel.add(button);

            x += 70;
            if ((i + 1) % 4 == 0) 
            {
                x = 50;
                y += 60;
            }
        }

        frame.setVisible(true);
    }

    private void Calculations(ActionEvent e) 
    {
        String command = e.getActionCommand();
        String expression = display.getText();
    
        if ("0123456789".contains(command)) 
            display.setText(expression + command);
        else if ("C".equals(command)) 
            display.setText("");
        else if ("=".equals(command)) 
        {
            try 
            {
                double result = evaluateExpression(expression);
                display.setText(String.valueOf(result));
            } 
            catch (IllegalArgumentException ex) 
            {
                display.setText("Error");
            }
        } 
        else 
            display.setText(expression + " " + command + " ");
    }
    
    public static double evaluateExpression(String expression) 
    {
        List<String> postfix = toPostfix(expression);
        return evaluatePostfix(postfix);
    }
    
    private static List<String> toPostfix(String expression) 
    {
        List<String> output = new ArrayList<>();
        Stack<Character> operators = new Stack<>();
        StringBuilder numberBuffer = new StringBuilder();
    
        for (char c : expression.toCharArray()) 
        {
            if (Character.isWhitespace(c)) 
                continue; 
            if (Character.isDigit(c)) 
                numberBuffer.append(c); 
            else 
            {
                if (numberBuffer.length() > 0) 
                {
                    output.add(numberBuffer.toString());
                    numberBuffer.setLength(0); // Reset buffer after adding number
                }
    
                if (c == '(') 
                    operators.push(c);
                else if (c == ')') 
                {
                    while (!operators.isEmpty() && operators.peek() != '(') 
                        output.add(String.valueOf(operators.pop()));
                    if (operators.isEmpty() || operators.pop() != '(') 
                        throw new IllegalArgumentException("Mismatched parentheses");
                } 
                else if (isOperator(c)) 
                {
                    while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) 
                    {
                        output.add(String.valueOf(operators.pop()));
                    }
                    operators.push(c);
                } 
                else 
                    throw new IllegalArgumentException("Invalid character: " + c);
            }
        }
    
        if (numberBuffer.length() > 0)
            output.add(numberBuffer.toString()); // Add last number
        while (!operators.isEmpty()) 
            output.add(String.valueOf(operators.pop())); // Add remaining operators
        return output;
    }
    
    private static double evaluatePostfix(List<String> postfix) 
    {
        Stack<Double> stack = new Stack<>();
    
        for (String token : postfix) 
        {
            try 
            {
                stack.push(Double.parseDouble(token));
            } 
            catch (NumberFormatException e) 
            {
                double b = stack.pop(); 
                double a = stack.pop(); 
                stack.push(applyOperator(a, b, token.charAt(0))); 
            }
        }
        return stack.pop(); 
    }
    
    private static boolean isOperator(char c) 
    {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    
    private static int precedence(char operator) 
    {
        return (operator == '+' || operator == '-') ? 1 : 2;
    }
    
    private static double applyOperator(double a, double b, char operator) 
    {
        switch (operator)
        {
            case '+': return a + b; 
            case '-': return a - b; 
            case '*': return a * b; 
            case '/':
            {
                if (b == 0)
                    throw new IllegalArgumentException("Cannot divide by zero");   
                else
                    return a / b;
            }  
            default: throw new IllegalArgumentException("Unknown Operator"); 
        }
    }
}
