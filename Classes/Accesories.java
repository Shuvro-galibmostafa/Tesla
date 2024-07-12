package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Accesories extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	   
	JButton b1,b2,b3,b4,b5,b6;

    private JPanel P1,P2,P3,P4,P5;



    public Accesories()
    {
        super(" Accesories ");
        this.setSize(750,510);
        setLocationRelativeTo(null);
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    // panels
       
        P1 = new JPanel();
        P1.setBounds(0,0,750,50);
        P1.setBackground(Color.black);
        P1.setBorder(BorderFactory.createLineBorder(Color.black));
        P1.setLayout(null);

        P2 = new JPanel();
        P2.setBounds(0,40,750,50);
        P2.setBackground(new Color(219,219,219));
        P2.setBorder(BorderFactory.createLineBorder(Color.black));
        P2.setLayout(null);

        P3 = new JPanel();
        P3.setBounds(0,90,245,410);
        P3.setBackground(Color.black);
        P3.setBorder(BorderFactory.createLineBorder(Color.black));
        P3.setLayout(null);

        P4 = new JPanel();
        P4.setBounds(245,90,245,410);
        P4.setBackground(Color.black);
        P4.setBorder(BorderFactory.createLineBorder(Color.black));
        P4.setLayout(null);

        P5 = new JPanel();
        P5.setBounds(490,90,260,410);
        P5.setBackground(Color.black);
        P5.setBorder(BorderFactory.createLineBorder(Color.black));
        P5.setLayout(null);


    //panel 1 component

       l1 = new JLabel(" TESLA ");
       l1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,38));
       l1.setForeground(Color.ORANGE);
       l1.setBounds(20,6,180,35);
       P1.add(l1);

       l2 = new JLabel(" Comfort While Green ");
       l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,12));
       l2.setForeground(Color.orange);
       l2.setBounds(190,27,150,15);
       P1.add(l2);


       b1 = new JButton(new ImageIcon(getClass().getResource("/image/logo.png")));
	   b1.setBorder(null);
	   b1.setBounds(685,9,34,32);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
       b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P1.add(b1);   

   
     
    //panel 2 component

       b2 = new JButton("Upcoming");
	   b2.setFont(new Font("Serif",Font.PLAIN,18));
	   b2.setForeground(Color.black);
	   b2.setBackground(new Color(219,219,219));
	   b2.setBorder(null);
	   b2.setBounds(25,12,150,35);
	   b2.addActionListener(this);
	   b2.setFocusable(false);
       b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b2);



       b3 = new JButton("Cars");
	   b3.setFont(new Font("Serif",Font.PLAIN,18));
	   b3.setForeground(Color.black);
	   b3.setBackground(new Color(219,219,219));
	   b3.setBorder(null);
	   b3.setBounds(200,12,150,35);
	   b3.addActionListener(this);
	   b3.setFocusable(false);
       b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b3);
    


       b4 = new JButton("Accesories");
	   b4.setFont(new Font("Serif",Font.BOLD,18));
	   b4.setForeground(Color.red);
	   b4.setBackground(new Color(209,209,209));
	   b4.setBorder(null);
	   b4.setBounds(375,12,150,35);
	   b4.addActionListener(this);
	   b4.setFocusable(false);
       b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b4);



       b5 = new JButton("Location");
	   b5.setFont(new Font("Serif",Font.PLAIN,18));
	   b5.setForeground(Color.black);
	   b5.setBackground(new Color(219,219,219));
	   b5.setBorder(null);
	   b5.setBounds(550,12,150,35);
	   b5.addActionListener(this);
	   b5.setFocusable(false);
       b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b5);


   
    //panel 3 content

       l2 = new JLabel(new ImageIcon(getClass().getResource("/image/tkey.png")));
	   l2.setBounds(16,10,220,280);
	   P3.add(l2); 
       
      
       l3 = new JLabel(new ImageIcon(getClass().getResource("/image/tchrg.png")));
	   l3.setBounds(12,10,220,280);
	   P4.add(l3);

    
       l4 = new JLabel(new ImageIcon(getClass().getResource("/image/air.png")));
	   l4.setBounds(495,100,220,280);
	   P5.add(l4);
       
 
       l5 = new JLabel(" Tesla Key ");
       l5.setFont(new Font("Serif",Font.BOLD,22));
	   l5.setForeground(Color.ORANGE);
	   l5.setBounds(70,240,210,140);
	   P3.add(l5); 
       
      
       l6 = new JLabel(" Wall Charger ");
       l6.setFont(new Font("Serif",Font.BOLD,22));
	   l6.setForeground(Color.ORANGE);
	   l6.setBounds(55,242,210,140);
	   P4.add(l6);

    
       l7 = new JLabel(" Air Freshner ");
       l7.setFont(new Font("Serif",Font.BOLD,22));
	   l7.setForeground(Color.ORANGE);
	   l7.setBounds(540,332,210,140);
	   P5.add(l7);


       l8 = new JLabel("Price : $175 / Each");
       l8.setFont(new Font("Serif",Font.BOLD,22));
	   l8.setForeground(Color.ORANGE);
	   l8.setBounds(35,260,210,180);
	   P3.add(l8); 
       
      
       l9 = new JLabel("Price : $475 / Each");
       l9.setFont(new Font("Serif",Font.BOLD,22));
	   l9.setForeground(Color.ORANGE);
	   l9.setBounds(38,280,210,140);
	   P4.add(l9);

    
       l10 = new JLabel("Price :  $14 / Each");
       l10.setFont(new Font("Serif",Font.BOLD,21));
	   l10.setForeground(Color.ORANGE);
	   l10.setBounds(530,370,210,140);
	   P5.add(l10);

        
        this.add(P1);
        this.add(P2);
        this.add(P3);
        this.add(P4);
        this.add(P5);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1)
		{
			userinfo u = new userinfo();
			this.setVisible(false);
		    u.setVisible(true);
		}

		else if(ae.getSource()==b2)
		{
			Upcoming up = new Upcoming();
			this.setVisible(false);
		    up.setVisible(true);
		}

        else if(ae.getSource()==b3)
		{
			Cars c = new Cars();
			this.setVisible(false);
		    c.setVisible(true);
		}

        else if(ae.getSource()==b5)
		{
			Location l = new Location();
			this.setVisible(false);
		    l.setVisible(true);
		}


    }


    public static void main(String [] args)
	{
		Accesories ac = new Accesories();
		
	}

}