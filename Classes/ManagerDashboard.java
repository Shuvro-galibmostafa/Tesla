package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ManagerDashboard extends JFrame implements ActionListener {

    JButton logoutButton;

    JPanel P1, P2, greenBorderPanel; // Added greenBorderPanel
    JLabel l1, l2, totalCarsLabel, pickupPointsLabel; // Added labels

    public ManagerDashboard() {
        super(" Manager Dashboard ");
        setSize(750, 510);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel 1
        P1 = new JPanel();
        P1.setBounds(0, 0, 750, 50);
        P1.setBackground(Color.black);
        P1.setLayout(null);

        l1 = new JLabel(" TESLA ");
        l1.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 38));
        l1.setForeground(Color.ORANGE);
        l1.setBounds(20, 6, 180, 35);
        P1.add(l1);

        l2 = new JLabel(" Comfort While Green ");
        l2.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 12));
        l2.setForeground(Color.orange);
        l2.setBounds(190, 27, 150, 15);
        P1.add(l2);

        // Logout Button
        logoutButton = new JButton("Logout");
        logoutButton.setFont(new Font("Serif", Font.BOLD, 12));
        logoutButton.setForeground(Color.red);
        logoutButton.setBackground(new Color(240, 240, 240));
        logoutButton.setBorder(null);
        logoutButton.setBounds(650, 10, 80, 25);
        logoutButton.addActionListener(this);
        logoutButton.setFocusable(false);
        logoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P1.add(logoutButton);

        // Add panel 1 to the frame
        add(P1);

        // Panel for green border
        greenBorderPanel = new JPanel();
        greenBorderPanel.setBounds(0, 50, 750, 3);
        greenBorderPanel.setBackground(new Color(175, 38, 85));
        add(greenBorderPanel);

        // Panel 2 for additional information
        P2 = new JPanel();
        P2.setBounds(20, 60, 200, 60);
        P2.setBackground(Color.black);
        P2.setLayout(new GridLayout(2, 1));

        // Labels for additional information
        totalCarsLabel = new JLabel("Total cars in showroom: 4");
        totalCarsLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        totalCarsLabel.setForeground(Color.white);
        P2.add(totalCarsLabel);

        pickupPointsLabel = new JLabel("Available Pickup points now: 3");
        pickupPointsLabel.setFont(new Font("Serif", Font.PLAIN, 28));
        pickupPointsLabel.setForeground(Color.white);
        P2.add(pickupPointsLabel);

        // Add panel 2 to the frame
        add(P2);

        // Set frame visibility
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == logoutButton) {
            Login login = new Login();
            this.setVisible(false);
            login.setVisible(true);
        }
    }

    public static void main(String[] args) {
        ManagerDashboard managerDashboard = new ManagerDashboard();
    }
}
