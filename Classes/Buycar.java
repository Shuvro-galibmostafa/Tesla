package Classes;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buycar extends JFrame implements ActionListener {

	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;

	JButton b1, b2, b3, b4;

	JPanel P1, P2, P3, P4;

	JComboBox c1, c2, c3, c4, c5, c6;

	public Buycar() {
		super(" Buy Your Car ");
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
		P2.setBounds(0, 50, 750, 460);
		P2.setBackground(new Color(250, 241, 228));
		P2.setBorder(BorderFactory.createLineBorder(Color.black));
		P2.setLayout(null);

		P3 = new JPanel();
		P3.setBounds(0, 50, 750, 460);
		P3.setBackground(new Color(216, 228, 250));
		P3.setBorder(BorderFactory.createLineBorder(Color.black));
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

	// panel 2 components

		// buttons
		
		b1 = new JButton("Continue");
		b1.setFont(new Font("Serif", Font.BOLD, 26));
		b1.setBounds(550, 410, 160, 38);
		b1.setBackground(new Color(193, 242, 176));
		b1.addActionListener(this);
		b1.setFocusable(false);
		b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		P2.add(b1);

		b2 = new JButton("Back");
		b2.setFont(new Font("Serif", Font.BOLD, 22));
		b2.setBounds(30, 415, 100, 34);
		b2.setBackground(Color.ORANGE);
		b2.addActionListener(this);
		b2.setFocusable(false);
		b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		P2.add(b2);

		// Upper label
		l3 = new JLabel(" Choose The Correct Combination ");
		l3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		l3.setForeground(Color.darkGray);
		l3.setOpaque(true);
		l3.setBackground(new Color(173, 185, 245));
		l3.setBorder(BorderFactory.createLineBorder(Color.black));
		l3.setBounds(200, 70, 350, 37);
		P2.add(l3);

		// Car model selection
		l4 = new JLabel("Select Model : ");
		l4.setFont(new Font("Serif", Font.BOLD, 18));
		l4.setForeground(Color.black);
		l4.setBounds(25, 150, 125, 20);
		P2.add(l4);

		String car[] = { "Model 3", "Model S", "Model X", "Model Y" };
		c1 = new JComboBox(car);
		c1.addActionListener(this);
		c1.setBounds(150, 150, 200, 28);
		P2.add(c1);

		// Branch selection
		l5 = new JLabel("Select Branch : ");
		l5.setFont(new Font("Serif", Font.BOLD, 18));
		l5.setForeground(Color.black);
		l5.setBounds(25, 230, 140, 20);
		P2.add(l5);

		String branch[] = { "Young Street, Bakersfiled", "Century City, LA", "Centinela, LA" };
		c2 = new JComboBox(branch);
		c2.addActionListener(this);
		c2.setBounds(150, 230, 200, 28);
		P2.add(c2);

		// Order type selection 
		l6 = new JLabel("Order Type : ");
		l6.setFont(new Font("Serif", Font.BOLD, 18));
		l6.setForeground(Color.black);
		l6.setBounds(390, 150, 125, 20);
		P2.add(l6);

		String review[] = { "Home Delivery", "Pick-Up" };
		c3 = new JComboBox(review);
		c3.addActionListener(this);
		c3.setBounds(510, 150, 200, 28);
		P2.add(c3);

		// Accesories selection
		l7 = new JLabel("Accesories : ");
		l7.setFont(new Font("Serif", Font.BOLD, 18));
		l7.setForeground(Color.black);
		l7.setBounds(390, 230, 125, 20);
		P2.add(l7);

		String seattype[] = { "Tesla Key", "Wall Charger", "Air Freshner" };
		c4 = new JComboBox(seattype);
		c4.addActionListener(this);
		c4.setBounds(510, 230, 200, 28);
		P2.add(c4);

		// Accesories quantity selection
		l8 = new JLabel("Quantity : ");
		l8.setFont(new Font("Serif", Font.BOLD, 17));
		l8.setForeground(Color.black);
		l8.setBounds(390, 310, 125, 20);
		P2.add(l8);

		String seatno[] = { "01", "02", "03", "04", "05" };
		c5 = new JComboBox(seatno);
		c5.addActionListener(this);
		c5.setBounds(510, 310, 200, 28);
		P2.add(c5);


		// Total cost
		l10 = new JLabel("Total cost : ");
		l10.setFont(new Font("Serif", Font.BOLD, 18));
		l10.setForeground(Color.black);
		l10.setBounds(240, 385, 125, 20);
		P2.add(l10);

		l11 = new JLabel();
		l11.setFont(new Font("Serif", Font.BOLD, 19));
		l11.setOpaque(true);
		l11.setBackground(Color.white);
		l11.setForeground(Color.black);
		l11.setBounds(350, 385, 75, 28);
		P2.add(l11);

	// panel 3 component

		// button
		b3 = new JButton("Back");
		b3.setFont(new Font("Serif", Font.BOLD, 22));
		b3.setBounds(30, 415, 100, 34);
		b3.setBackground(Color.white);
		b3.addActionListener(this);
		b3.setFocusable(false);
		b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		P3.add(b3);

		b4 = new JButton("Confirm");
		b4.setFont(new Font("Serif", Font.BOLD, 26));
		b4.setBounds(560, 410, 140, 38);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		b4.setFocusable(false);
		b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		P3.add(b4);

		// Show order information panel
		P4 = new JPanel();
		P4.setBounds(190, 130, 360, 290);
		P4.setBackground(Color.pink);
		P4.setLayout(null);

		// label
		l18 = new JLabel("Order Information :");
		l18.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36));
		l18.setBounds(220, 70, 350, 30);
		P3.add(l18);

		// panel 4 component

		// Model Info
		l12 = new JLabel();
		l12.setFont(new Font("Serif", Font.BOLD, 17));
		l12.setBounds(10, 20, 350, 20);
		P4.add(l12);

		// Branch Info
		l13 = new JLabel();
		l13.setFont(new Font("Serif", Font.BOLD, 17));
		l13.setBounds(10, 70, 350, 20);
		P4.add(l13);

		// Order Type Info
		l14 = new JLabel();
		l14.setFont(new Font("Serif", Font.BOLD, 17));
		l14.setBounds(10, 120, 300, 20);
		P4.add(l14);

		// Accesories Info
		l15 = new JLabel();
		l15.setFont(new Font("Serif", Font.BOLD, 17));
		l15.setBounds(10, 170, 300, 22);
		P4.add(l15);

		// Quantity Info
		l16 = new JLabel();
		l16.setFont(new Font("Serif", Font.BOLD, 17));
		l16.setBounds(10, 220, 300, 20);
		P4.add(l16);

		// Total Price Info
		l17 = new JLabel();
		l17.setFont(new Font("Serif", Font.BOLD, 17));
		l17.setBounds(10, 320, 300, 20);
		P4.add(l17);

		this.add(P1);
		this.add(P2);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {

		// function for price calculation
		
		if ((c1.getSelectedIndex() == 0) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 0)) {
			int a = 38990;
			int b = 175;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 0) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 1)) {
			int a = 38990;
			int b = 175;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 0) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 0)) {
			int a = 38990;
			int b = 475;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 0) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 1)) {
			int a = 38990;
			int b = 475;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 0) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 0)) {
			int a = 38990;
			int b = 14;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 0) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 1)) {
			int a = 38990;
			int b = 14;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 1) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 0)) {
			int a = 74990;
			int b = 175 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 1) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 1)) {
			int a = 74990;
			int b = 175 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 1) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 0)) {
			int a = 74990;
			int b = 475 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 1) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 1)) {
			int a = 74990;
			int b = 475 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 1) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 0)) {
			int a = 74990;
			int b = 14 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 1) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 1)) {
			int a = 74990;
			int b = 14 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}

		if ((c1.getSelectedIndex() == 2) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 0)) {
			int a = 94990;
			int b = 175 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 2) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 1)) {
			int a = 94990;
			int b = 175 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 2) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 0)) {
			int a = 94990;
			int b = 475 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 2) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 1)) {
			int a = 94990;
			int b = 475 ;
			int c = c5.getSelectedIndex();
			int d = 0 ; 
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 2) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 0)) {
			int a = 94990;
			int b = 14 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 2) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 1)) {
			int a = 94990;
			int b = 14 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 3) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 0)) {
			int a = 52490 ;
			int b = 175 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 3) && (c4.getSelectedIndex() == 0) && (c3.getSelectedIndex() == 1)) {
			int a = 52490 ;
			int b = 175 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 3) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 0)) {
			int a = 52490 ;
			int b = 475 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 3) && (c4.getSelectedIndex() == 1) && (c3.getSelectedIndex() == 1)){
			int a = 52490 ;
			int b = 475 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 3) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 0)) {
			int a = 52490 ;
			int b = 14 ;
			int c = c5.getSelectedIndex();
			int d = 200 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		if ((c1.getSelectedIndex() == 3) && (c4.getSelectedIndex() == 2) && (c3.getSelectedIndex() == 1)) {
			int a = 52490 ;
			int b = 14 ;
			int c = c5.getSelectedIndex();
			int d = 0 ;
			int sum = a + d + (b * (c + 1));

			l11.setText(" " + String.valueOf(sum) + " $");
		}
		
		

		// buttom function

		// continue button
		
		if (ae.getSource() == b1) {

			this.add(P4);
			this.add(P3);
			P2.setVisible(false);
			P3.setVisible(true);

		}

		// back button to main menu
		
		else if (ae.getSource() == b2) {
			Upcoming up = new Upcoming();
			this.setVisible(false);
			up.setVisible(true); 
		}

		// back button to buy car
		
		else if (ae.getSource() == b3) {
			P2.setVisible(true);
			P3.setVisible(false);
		}

		// confirm button

		else if (ae.getSource() == b4) {
			payment p = new payment();
			this.setVisible(false);
			p.setVisible(true);
		}

		// Car info data display
		
		l12.setText("Select Model             :   " + c1.getSelectedItem());

		l13.setText("Select Branch           :   " + c2.getSelectedItem());

		l14.setText("Order Type               :   " + c3.getSelectedItem());

		l15.setText("Accesories               :   " + c4.getSelectedItem());

		l16.setText("Quantity                    :   " + c5.getSelectedItem());

		l17.setText("Total Price                 :  " + l11.getText());

	}

	public static void main(String[] args) {
		Buycar bc = new Buycar();

	}

}
