package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Upcoming extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JButton b1, b2, b3, b4, b5, b6, preOrderButton;
    JPanel P1, P2, P3;

    public Upcoming() {
        super(" Upcoming Cars ");
        this.setSize(750, 510);
        setLocationRelativeTo(null);
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panels

        P1 = new JPanel();
        P1.setBounds(0, 0, 750, 50);
        P1.setBackground(Color.black);
        P1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1.setLayout(null);

        P2 = new JPanel();
        P2.setBounds(0, 40, 750, 50);
        P2.setBackground(new Color(219, 219, 219));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

        P3 = new JPanel();
        P3.setBounds(0, 100, 750, 400);
        P3.setBackground(Color.black);
        P3.setLayout(null);

        // panel 1 component

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

        b1 = new JButton(new ImageIcon(getClass().getResource("/image/logo.png")));
        b1.setBorder(null);
        b1.setBounds(685, 9, 34, 32);
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P1.add(b1);

        // "Pre-Order" Button
		
        preOrderButton = new JButton("Pre-Order");
        preOrderButton.setFont(new Font("Serif", Font.ITALIC, 18));
        preOrderButton.setForeground(Color.black); // Black text
        preOrderButton.setBackground(Color.ORANGE); // Glittering golden background for Pre-Order button
        preOrderButton.setBounds(500, 6, 150, 38);
        preOrderButton.addActionListener(this);
        preOrderButton.setFocusable(false);
        preOrderButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P1.add(preOrderButton);

        // panel 2 component

        b2 = new JButton("Upcoming");
        b2.setFont(new Font("Serif", Font.BOLD, 18));
        b2.setForeground(Color.red);
        b2.setBackground(new Color(209, 209, 209));
        b2.setBorder(null);
        b2.setBounds(25, 12, 150, 35);
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b2);

        b3 = new JButton("Cars");
        b3.setFont(new Font("Serif", Font.PLAIN, 18));
        b3.setForeground(Color.black);
        b3.setBackground(new Color(219, 219, 219));
        b3.setBorder(null);
        b3.setBounds(200, 12, 150, 35);
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b3);

        b4 = new JButton("Accessories");
        b4.setFont(new Font("Serif", Font.PLAIN, 18));
        b4.setForeground(Color.black);
        b4.setBackground(new Color(219, 219, 219));
        b4.setBorder(null);
        b4.setBounds(375, 12, 150, 35);
        b4.addActionListener(this);
        b4.setFocusable(false);
        b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b4);

        b5 = new JButton("Location");
        b5.setFont(new Font("Serif", Font.PLAIN, 18));
        b5.setForeground(Color.black);
        b5.setBackground(new Color(219, 219, 219));
        b5.setBorder(null);
        b5.setBounds(550, 12, 150, 35);
        b5.addActionListener(this);
        b5.setFocusable(false);
        b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b5);

        // panel 3 component

        l2 = new JLabel("The New Tesla Cyber Truck is On the Way!!");
        l2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
        l2.setForeground(Color.white);
        l2.setBounds(160, 95, 600, 28);
        P3.add(l2);

        b6 = new JButton("ORDER NOW!");
        b6.setFont(new Font("Serif", Font.PLAIN, 25));
        b6.setForeground(Color.white);
        b6.setBackground(new Color(123, 102, 255));
        b6.setBounds(250, 425, 250, 38);
        b6.addActionListener(this);
        b6.setFocusable(false);
        b6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P3.add(b6);

        l3 = new JLabel(new ImageIcon(getClass().getResource("/image/ct.png")));
        l3.setBounds(0, 135, 730, 300);
        P3.add(l3);

        this.add(P1);
        this.add(P2);
        this.add(P3);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            userinfo u = new userinfo();
            this.setVisible(false);
            u.setVisible(true);
        } else if (ae.getSource() == b3) {
            Cars c = new Cars();
            this.setVisible(false);
            c.setVisible(true);
        } else if (ae.getSource() == b4) {
            Accesories ac = new Accesories();
            this.setVisible(false);
            ac.setVisible(true);
        } else if (ae.getSource() == b5) {
            Location l = new Location();
            this.setVisible(false);
            l.setVisible(true);
        } else if (ae.getSource() == b6) {
            Buycar bc = new Buycar();
            this.setVisible(false);
            bc.setVisible(true);
        } else if (ae.getSource() == preOrderButton) {
            PreOrder preOrder = new PreOrder();
            this.setVisible(false);
            preOrder.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Upcoming up = new Upcoming();
    }
}
