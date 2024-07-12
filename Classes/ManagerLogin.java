package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class ManagerLogin extends JFrame implements ActionListener {

    JLabel titleLabel, usernameLabel, passwordLabel;
    JTextField usernameTextField;
    JPasswordField passwordField;
    JButton loginButton;

    public ManagerLogin() {
        super(" Manager Login ");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Title
        titleLabel = new JLabel("Manager Login");
        titleLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        titleLabel.setBounds(120, 20, 200, 30);
        panel.add(titleLabel);

        // Username
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 80, 100, 20);
        panel.add(usernameLabel);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(150, 80, 200, 25);
        panel.add(usernameTextField);

        // Password
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 120, 100, 20);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 120, 200, 25);
        panel.add(passwordField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(150, 160, 100, 30);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        // Add panel to the frame
        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {
            String username = usernameTextField.getText();
            String password = new String(passwordField.getPassword());

            if (verifyManagerCredentials(username, password)) {
                // Manager login successful, open manager dashboard
                ManagerDashboard managerDashboard = new ManagerDashboard();
                this.setVisible(false);
                managerDashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
            }
        }
    }

    private boolean verifyManagerCredentials(String username, String password) {
		
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data\\manager data.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
		      
          		// Each line contains username and password separated by a space in that file
                String[] parts = line.split(" ");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } 
		
		catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static void main(String[] args) 
	{   ManagerLogin managerLogin = new ManagerLogin(); }
}
