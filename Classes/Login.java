package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.*;

public class Login extends JFrame implements ActionListener{

    private JLabel l1, l2, l3, l4, l5;
    private JTextField t1;
    private JButton b1, b2, managerLoginBtn, deleteBtn;
    private JPasswordField pa1;
    private JPanel P1, P2;
    private JCheckBox c1;
	

    public Login ()
    {
        super("Login");
		this.setSize(750,510);
		setLocationRelativeTo(null);
		setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    //creating two panel
	
        P1 = new JPanel();
        P1.setBounds(0,0,350,500);
        P1.setLayout(null);


		P2 = new JPanel();
        P2.setBounds(350,0,350,500);
        P2.setBackground(new Color(240,240,240));
        P2.setLayout(null);


    //lebels
	
        l1 = new JLabel("Don't have an account?");
		l1.setFont(new Font("Serif",Font.PLAIN,14));
		l1.setForeground(Color.black);
		l1.setBounds(530,13,150,15);
		P2.add(l1);

        l2 = new JLabel("Account Login");
		l2.setFont(new Font("Serif",Font.PLAIN,24));
		l2.setForeground(Color.red);
		l2.setBounds(470,80,500,28);
		P2.add(l2);

      
    //mobile number
        l3 = new JLabel("User name ");
        l3.setFont(new Font("Serif",Font.PLAIN,17));
        l3.setForeground(Color.black);
        l3.setBounds(400,140,250,20);
        P2.add(l3);
    
        t1 = new JTextField();
		t1.setFont(new Font("Serif",Font.PLAIN,19));
        t1.setBounds(400,170,270,27);
        P2.add(t1);
        


    //password
       l4 = new JLabel("Password ");
	   l4.setFont(new Font("Serif",Font.PLAIN,18));
	   l4.setForeground(Color.black);
	   l4.setBounds(400,215,250,20);
	   P2.add(l4);
			
	   pa1 = new JPasswordField();
	   pa1.setEchoChar('*');
	   pa1.setFont(new Font("Serif",Font.PLAIN,19));
	   pa1.setBounds(400,245,270,27);
	   P2.add(pa1);


    //button
	   b1 = new JButton("Register");
	   b1.setFont(new Font("Serif",Font.BOLD,14));
	   b1.setForeground(Color.red);
	   b1.setBackground(new Color(240,240,240));
	   b1.setBorder(null);
	   b1.setBounds(670,9,55,20);
	   b1.addActionListener(this);
	   b1.setFocusable(false);
	   b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b1);


	   b2 = new JButton("Login");
	   b2.setFont(new Font("Serif",Font.BOLD,22));
	   b2.setForeground(Color.white);
	   b2.setBackground(new Color(102,140,208));
	   b2.setBounds(400,345,270,38);
	   b2.addActionListener(this); 
	   b2.setFocusable(false);
	   b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(b2);


       c1 = new JCheckBox("Show password");
	   c1.setFont(new Font("Serif",Font.PLAIN,16));
	   c1.setForeground(Color.black);
	   c1.setBackground(new Color(240,240,240));
	   c1.setBounds(398,280,270,38);
	   c1.addActionListener(this); 
	   c1.setFocusable(false);
	   c1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   P2.add(c1);


    // Manager Login button
       managerLoginBtn = new JButton("Manager Login");
       managerLoginBtn.setFont(new Font("Serif", Font.BOLD, 10));
       managerLoginBtn.setForeground(Color.red);
       managerLoginBtn.setBackground(new Color(240, 240, 240));
       managerLoginBtn.setBorder(null);
       managerLoginBtn.setBounds(640, 450, 100, 20);
       managerLoginBtn.addActionListener(this);
       managerLoginBtn.setFocusable(false);
       managerLoginBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       P2.add(managerLoginBtn);
	   
    // User Delete 
	
	    deleteBtn = new JButton("Delete User");
        deleteBtn.setFont(new Font("Serif", Font.BOLD, 10));
        deleteBtn.setForeground(Color.red);
        deleteBtn.setBackground(new Color(240, 240, 240));
        deleteBtn.setBorder(null);
        deleteBtn.setBounds(550, 450, 90, 20);
        deleteBtn.addActionListener(this);
        deleteBtn.setFocusable(false);
        deleteBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(deleteBtn);
    //image
	
	   l5 = new JLabel(new ImageIcon(getClass().getResource("/image/limage.png")));
	   l5.setBounds(0,0,350,500);
	   P1.add(l5);

       this.add(P1);
	   this.add(P2);
       setVisible(true);
	   
    }


	public void actionPerformed(ActionEvent ae)
	{

    //register button
		if(ae.getSource()==b1)
		{
			Registration r = new Registration();
			this.setVisible(false);
		    r.setVisible(true);
		}


    //checking if all info is provied or not

		else if(ae.getSource()==b2)
		{
			if(t1.getText().length() <=0 || pa1.getText().length() <=0){
				JOptionPane.showMessageDialog(this,"Fill all information");

			}

		    else {

				try {
					String userNameS = "Name        :  "+t1.getText();
					String passwordS = "Password  :  "+pa1.getText();

					BufferedReader reader = new BufferedReader(new FileReader("data\\data.txt"));

					int totalLines = 0;
					
					while (reader.readLine() != null)
					totalLines++;
					reader.close();

					for (int i = 0; i <= totalLines; i++) {
						String line = Files.readAllLines(Paths.get("data\\data.txt")).get(i);

						if (line.equals(userNameS)) {
							String line2 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 1));

							if (line2.equals(passwordS)) {

								JOptionPane.showMessageDialog(null, "Login Successful.");

								Upcoming up = new Upcoming();
								this.setVisible(false);
								up.setVisible(true);



							  String line3 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 2));
							  String line4 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 3));
							  String line5 = Files.readAllLines(Paths.get("data\\data.txt")).get((i + 4));

								BufferedWriter writer = new BufferedWriter(new FileWriter("data\\login data.txt"));
				            	writer.write("" + line);
				            	writer.write("\n" + line2);
				            	writer.write("\n" + line3);
				            	writer.write("\n" + line4);
				            	writer.write("\n" + line5);
					            writer.close();

								

								break;
							}
						}
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Wrong User Name or Password!");
				    }
		
		    }
     	}


        else if (ae.getSource() == managerLoginBtn) {
            ManagerLogin managerLogin = new ManagerLogin();
            this.setVisible(false);
            managerLogin.setVisible(true);
        }  
		
		else if (ae.getSource() == deleteBtn) {
            DeletePanel deletePanel = new DeletePanel();
            this.setVisible(false);
		    deletePanel.setVisible(true); 
		}

	    // showing password
		else if(c1.isSelected()){
			pa1.setEchoChar((char)0);
		  }
		else{
			pa1.setEchoChar('*');

		}

	}
	public static void main(String [] args)
	{
		Login L = new Login();
		
	}
	  
}