package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Location extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	   
	JButton b1,b2,b3,b4,b5,b6;

    private JPanel P1,P2,P3,P4,P5,P6;

	


    public Location()
    {
        super(" Location ");
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

        //3boxs
        P3 = new JPanel();
        P3.setBounds(45,110,650,100);
        P3.setBackground(new Color(244,204,204));
        P3.setBorder(BorderFactory.createLineBorder(Color.black));
        P3.setLayout(null);

        P4 = new JPanel();
        P4.setBounds(45,230,650,100);
        P4.setBackground(new Color(192,246,209));
        P4.setBorder(BorderFactory.createLineBorder(Color.black));
        P4.setLayout(null);

        P5 = new JPanel();
        P5.setBounds(45,350,650,100);
        P5.setBackground(new Color(196,192,252));
        P5.setBorder(BorderFactory.createLineBorder(Color.black));
        P5.setLayout(null);

       //background panel
        P6 = new JPanel();
        P6.setBounds(0,100,750,410);
        P6.setBackground(Color.black);
        P6.setBorder(BorderFactory.createLineBorder(Color.black));
        P6.setLayout(null);

        
      
    //panel 1 component

       l1 = new JLabel(" TESLA ");
       l1.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,36));
       l1.setForeground(Color.ORANGE);
       l1.setBounds(20,6,180,35);
       P1.add(l1);

       l2 = new JLabel(" Comfort While Green ");
       l2.setFont(new Font("Serif",Font.ITALIC | Font.BOLD,12));
       l2.setForeground(Color.ORANGE);
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

       b2 = new JButton("Upcomings");
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
	   b4.setFont(new Font("Serif",Font.PLAIN,18));
	   b4.setForeground(Color.black);
	   b4.setBackground(new Color(219,219,219));
	   b4.setBorder(null);
	   b4.setBounds(375,12,150,35);
	   b4.addActionListener(this);
	   b4.setFocusable(false);
       b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b4);



       b5 = new JButton("Location");
	   b5.setFont(new Font("Serif",Font.BOLD,18));
	   b5.setForeground(Color.red);
	   b5.setBackground(new Color(209,209,209));
	   b5.setBorder(null);
	   b5.setBounds(550,12,150,35);
	   b5.addActionListener(this);
	   b5.setFocusable(false);
       b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b5);



    //panel 3 component
       
       l2 = new JLabel("<html> Bakersfiled-Young Street <br/>  5206 Young St  <br/>  Bakersfield, CA 9331 </html>");
       l2.setFont(new Font("Serif",Font.ITALIC,20));
       l2.setForeground(Color.black);
       l2.setBounds(20,8,400,82);
       P3.add(l2);

      
       l3 = new JLabel("<html> Los Angeles - Century City <br/>10250 Santa Monica Blvd <br/> Los Angeles, CA 90067 </html>");
       l3.setFont(new Font("Serif",Font.ITALIC,20));
       l3.setForeground(Color.black);
       l3.setBounds(20,8,440,80);
       P4.add(l3);


       l4 = new JLabel("<html> Los Angeles-Centinela <br/> 5840 W Centinela Avenue <br/>  Los Angeles, CA 90045 </html>");
       l4.setFont(new Font("Serif",Font.ITALIC,20));
       l4.setForeground(Color.black);
       l4.setBounds(20,8,400,80);
       P5.add(l4);

        
        this.add(P1);
        this.add(P2);
        this.add(P3);
        this.add(P4);
        this.add(P5);
        this.add(P6);
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

        else if(ae.getSource()==b4)
		{
			Accesories ac = new Accesories();
			this.setVisible(false);
		    ac.setVisible(true);
		}
    }

    

    public static void main(String [] args)
	{
		Location l = new Location();
		
	}

}
