import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GUI 
{
    private JLabel userName;
    private JTextField userText;
    private JPasswordField passWordText;
    private JLabel successLabel;
    private JLabel passWord;
    private JButton loginButton;

    public GUI() 
    {
        JFrame frame = new JFrame("Nice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("467476936_1230368371353113_5229458975563809730_n.jpg");
        frame.setIconImage(image.getImage());

        JPanel panel = createPanel();
        frame.add(panel);

        frame.setVisible(true);
    }

    private JPanel createPanel() 
    {
        JPanel panel = new JPanel(null); // Null layout for absolute positioning
        panel.setBackground(Color.LIGHT_GRAY);

        userName = new JLabel("Username:");
        userName.setBounds(10, 20, 80, 25);
        panel.add(userName);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Password label and text field
        passWord = new JLabel("Password:");
        passWord.setBounds(10, 50, 80, 25);
        panel.add(passWord);

        passWordText = new JPasswordField(20);
        passWordText.setBounds(100, 50, 165, 25);
        panel.add(passWordText);

        // Login button
        loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(this::Login);
        panel.add(loginButton);

        // Success message label
        successLabel = new JLabel("");
        successLabel.setBounds(10, 110, 300, 25);
        panel.add(successLabel);

        return panel;
    }

    // Handle login button click
    private void Login(ActionEvent e) 
    {
        String username = userText.getText();
        String password = new String(passWordText.getPassword()); // Convert char[] to String

        if (username.equals("Haggai") && password.equals("1234")) 
            successLabel.setText("Login successful!");
        else 
            successLabel.setText("Invalid username or password.");
    }
}

/*public class Main 
{
    public static void main(String[] args) 
    {
        GUI gui = new GUI();
    }
}
*/
