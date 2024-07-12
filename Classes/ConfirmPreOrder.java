package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmPreOrder extends JFrame implements ActionListener {

    private JLabel label;
    private JButton noButton, yesButton;
    private String uniqueID;

    public ConfirmPreOrder(String uniqueID) {
        super("Confirm Pre-Order");
        this.setSize(750, 300);
        setLocationRelativeTo(null);
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 750, 300);
        panel.setLayout(null);
        panel.setBackground(Color.white);

        label = new JLabel("Are you sure you want to order Tesla Cybertruck 2024?");
        label.setFont(new Font("Serif", Font.BOLD, 24));
        label.setForeground(Color.BLUE);
        label.setBounds(50, 50, 650, 30);
        panel.add(label);

        noButton = new JButton("No");
        noButton.setFont(new Font("Serif", Font.BOLD, 23));
        noButton.setForeground(Color.white);
        noButton.setBackground(Color.red);
        noButton.setBorder(null);
        noButton.setBounds(200, 150, 100, 36);
        noButton.addActionListener(this);
        noButton.setFocusable(false);
        noButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(noButton);

        yesButton = new JButton("Yes");
        yesButton.setFont(new Font("Serif", Font.BOLD, 23));
        yesButton.setForeground(Color.white);
        yesButton.setBackground(new Color(102, 140, 208));
        yesButton.setBounds(450, 150, 100, 36);
        yesButton.addActionListener(this);
        yesButton.setFocusable(false);
        yesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(yesButton);

        this.add(panel);

        this.uniqueID = uniqueID;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == noButton) {
            JOptionPane.showMessageDialog(this, "Do check out the offers at our website!");
            PreOrder po = new PreOrder();
            this.setVisible(false);
            po.setVisible(true);
        } else if (ae.getSource() == yesButton) {
            JOptionPane.showMessageDialog(this, "Congratulations, Your Pre-Order is Confirmed. You'll get an Email soon.\nYour unique ID is: " + uniqueID);

            Upcoming up = new Upcoming();
            this.setVisible(false);
            up.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConfirmPreOrder cpo = new ConfirmPreOrder("123456");
            cpo.setVisible(true);
        });
    }
}
