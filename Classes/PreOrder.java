package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PreOrder extends JFrame implements ActionListener {

    private JLabel l1, l2, l3, l4, l6, l7, l8;

    private JButton b1, b2, b3;

    private JPanel P1, P2;

    private JComboBox<String> c1, c3;

    private JTextArea textArea;

    private JTextField phoneField;

    public PreOrder() {

        super("Pre-Order");
        this.setSize(750, 510);
        setLocationRelativeTo(null);
        setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel1 contents

        P1 = new JPanel();
        P1.setBounds(0, 0, 750, 50);
        P1.setLayout(null);
        P1.setBackground(Color.black);

        l1 = new JLabel(" TESLA ");
        l1.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
        l1.setForeground(Color.ORANGE);
        l1.setBounds(20, 6, 180, 35);
        P1.add(l1);

        l2 = new JLabel(" Comfort While Green ");
        l2.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 12));
        l2.setForeground(Color.orange);
        l2.setBounds(132, 23, 150, 15);
        P1.add(l2);

        b1 = new JButton(new ImageIcon(getClass().getResource("/image/logo.png")));
        b1.setBounds(685, 9, 34, 32);
        b1.setBorder(null);
        b1.addActionListener(this);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P1.add(b1);

        P2 = new JPanel();
        P2.setBounds(0, 0, 750, 500);
        P2.setLayout(null);
        P2.setBackground(Color.white);

        b2 = new JButton("Back");
        b2.setFont(new Font("Serif", Font.BOLD, 23));
        b2.setForeground(Color.white);
        b2.setBackground(Color.red);
        b2.setBorder(null);
        b2.setBounds(15, 425, 88, 36);
        b2.addActionListener(this);
        b2.setFocusable(false);
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b2);

        b3 = new JButton("Continue");
        b3.setFont(new Font("Serif", Font.BOLD, 23));
        b3.setForeground(Color.white);
        b3.setBackground(new Color(102, 140, 208));
        b3.setBounds(560, 425, 160, 36);
        b3.addActionListener(this);
        b3.setFocusable(false);
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        P2.add(b3);

        l3 = new JLabel(" Please Fill-Up All The Information ");
        l3.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
        l3.setForeground(Color.BLUE);
        l3.setBounds(200, 70, 400, 37);
        P2.add(l3);

        // Car model selection

        l4 = new JLabel("Select Model : ");
        l4.setFont(new Font("Serif", Font.BOLD, 18));
        l4.setForeground(Color.RED);
        l4.setBounds(25, 150, 125, 20);
        P2.add(l4);

        String car[] = {"Tesla CyberTruck"};
        c1 = new JComboBox<>(car);
        c1.addActionListener(this);
        c1.setBounds(150, 150, 200, 28);
        P2.add(c1);

        // Order type selection

        l6 = new JLabel("Range : ");
        l6.setFont(new Font("Serif", Font.BOLD, 18));
        l6.setForeground(new Color(67, 118, 108));
        l6.setBounds(390, 150, 125, 20);
        P2.add(l6);

        String review[] = {"1000 Kilometer", "2000 Kilometer"};
        c3 = new JComboBox<>(review);
        c3.addActionListener(this);
        c3.setBounds(510, 150, 200, 28);
        P2.add(c3);

        // Address

        l7 = new JLabel("Full Address : ");
        l7.setFont(new Font("Serif", Font.BOLD, 18));
        l7.setForeground(new Color(73, 16, 139));
        l7.setBounds(25, 230, 125, 20);
        P2.add(l7);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(150, 230, 560, 80);
        P2.add(scrollPane);

        // Phone

        l8 = new JLabel("Phone : ");
        l8.setFont(new Font("Serif", Font.BOLD, 17));
        l8.setForeground(Color.black);
        l8.setBounds(25, 330, 125, 20);
        P2.add(l8);

        phoneField = new JTextField();
        phoneField.setBounds(150, 330, 200, 28);
        P2.add(phoneField);

        this.add(P1);
        this.add(P2);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            userinfo u = new userinfo();
            this.setVisible(false);
            u.setVisible(true);
        } else if (ae.getSource() == b3) {
            String uniqueID = saveAddressToFile();
            if (uniqueID != null) {
            ConfirmPreOrder cpo = new ConfirmPreOrder(uniqueID);
            this.setVisible(false);
            cpo.setVisible(true);
            }

        } else if (ae.getSource() == b2) {
            Upcoming up = new Upcoming();
            this.setVisible(false);
            up.setVisible(true);
        }
    }

    private boolean validateInput() {
        String address = textArea.getText();
        String phone = phoneField.getText();

        if (address.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address and phone cannot be left empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (phone.length() != 11) {
            JOptionPane.showMessageDialog(this, "Phone number must be 11 digits long.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private String generateUniqueID() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder uniqueID = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            uniqueID.append(characters.charAt(random.nextInt(characters.length())));
        }

        return uniqueID.toString();
    }

    private String saveAddressToFile() {
        String address = textArea.getText();
        String phone = phoneField.getText();
        String selectedModel = (String) c1.getSelectedItem();
        String selectedRange = (String) c3.getSelectedItem();
        String uniqueID = generateUniqueID();

        try {
            File file = new File("data/preorder.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true); // true for append mode
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(uniqueID + "\t" + address + "\t" + phone + "\t" + selectedModel + "\t" + selectedRange + "\n");
            bw.close();

            JOptionPane.showMessageDialog(this, "Information saved successfully!");
            return uniqueID;
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving information.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

        public static void main(String[] args) {
          SwingUtilities.invokeLater(() -> {
          PreOrder po = new PreOrder();
          po.setVisible(true);
          });
    }

}
