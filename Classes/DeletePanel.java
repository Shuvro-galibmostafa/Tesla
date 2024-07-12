package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeletePanel extends JFrame implements ActionListener {

    private JLabel l1, l2, l3, l4, l5;
    private JTextField t1;
    private JButton deleteBtn, backBtn;
    private JPasswordField pa1;
    private JPanel P1, P2;

    public DeletePanel() {
        super("Delete User");
        this.setSize(750, 510);
        setLocationRelativeTo(null);
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P1 = new JPanel();
        P1.setBounds(0, 0, 350, 500);
        P1.setLayout(null);

        P2 = new JPanel();
        P2.setBounds(350, 0, 350, 500);
        P2.setBackground(new Color(240, 240, 240));
        P2.setLayout(null);

        l1 = new JLabel("Delete User");
        l1.setFont(new Font("Serif", Font.PLAIN, 24));
        l1.setForeground(Color.red);
        l1.setBounds(470, 80, 500, 28);
        P2.add(l1);

        l2 = new JLabel("User name ");
        l2.setFont(new Font("Serif", Font.PLAIN, 17));
        l2.setForeground(Color.black);
        l2.setBounds(400, 140, 250, 20);
        P2.add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Serif", Font.PLAIN, 19));
        t1.setBounds(400, 170, 270, 27);
        P2.add(t1);

        l3 = new JLabel("Password ");
        l3.setFont(new Font("Serif", Font.PLAIN, 18));
        l3.setForeground(Color.black);
        l3.setBounds(400, 215, 250, 20);
        P2.add(l3);

        pa1 = new JPasswordField();
        pa1.setEchoChar('*');
        pa1.setFont(new Font("Serif", Font.PLAIN, 19));
        pa1.setBounds(400, 245, 270, 27);
        P2.add(pa1);

        deleteBtn = new JButton("Delete User");
        deleteBtn.setFont(new Font("Serif", Font.BOLD, 22));
        deleteBtn.setForeground(Color.white);
        deleteBtn.setBackground(new Color(102, 140, 208));
        deleteBtn.setBounds(400, 345, 270, 38);
        deleteBtn.addActionListener(this);
        deleteBtn.setFocusable(false);
        deleteBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(deleteBtn);

        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Serif", Font.BOLD, 14));
        backBtn.setForeground(Color.red);
        backBtn.setBackground(new Color(240, 240, 240));
        backBtn.setBorder(null);
        backBtn.setBounds(670, 9, 55, 20);
        backBtn.addActionListener(this);
        backBtn.setFocusable(false);
        backBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(backBtn);

        this.add(P1);
        this.add(P2);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == deleteBtn) {
        String userName = t1.getText();
        String password = new String(pa1.getPassword());
        boolean userFound = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data\\data.txt"));
            StringBuilder fileContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(userName) && line.contains(password)) {
                    
                    line = line.replaceAll("Name\\s*:\\s*" + userName, "Name        :  null");
                    line = line.replaceAll("Password\\s*:\\s*" + password, "Password  :  null");
                    userFound = true;  
                }
                fileContent.append(line).append("\n");
            }

            reader.close();

            FileWriter writer = new FileWriter("data\\data.txt");
            writer.write(fileContent.toString());
            writer.close();

            if (userFound) {
                JOptionPane.showMessageDialog(null, "User Deleted Successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "User not found.");
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error deleting user.");
        }
    } else if (ae.getSource() == backBtn) {
        
        Login loginPage = new Login();
        this.setVisible(false);
        loginPage.setVisible(true);
    }
}



    public static void main(String[] args) {
        DeletePanel deletePanel = new DeletePanel();
    }
}
