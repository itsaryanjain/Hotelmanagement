package projecthotel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Page extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;
    JButton login, cancel;

    public Page() {
        setLayout(null);
        setLocation(600, 100);
        setBackground(Color.WHITE);

        JLabel head = new JLabel("USERNAME");
        head.setBounds(40, 50, 100, 30);
        add(head);

        // For the image, make sure the path is correct
        ImageIcon icon = new ImageIcon("C:\\Users\\Aryan jain\\Desktop\\hotelmanagement\\icons\\second.jpg");
        JLabel image = new JLabel(icon);
        image.setBounds(350, 10, 200, 200);
        add(image);

        JLabel head2 = new JLabel("PASSWORD");
        head2.setBounds(40, 100, 100, 30);
        add(head2);

        username = new JTextField();
        username.setBounds(150, 50, 150, 30);
        add(username);

        password = new JPasswordField();
        password.setBounds(150, 100, 150, 30);
        add(password);

        login = new JButton("LOGIN");
        login.setBounds(40, 150, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("CANCEL");
        cancel.setBounds(180, 150, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String user = username.getText();
            String pass = new String(password.getPassword()); // Getting password as a String

            try {
                Conn a = new Conn(); // Assuming this is your database connection class
                String query = "SELECT * FROM login WHERE username = '" + user + "' AND password = '" + pass + "'";

                ResultSet rs = a.s.executeQuery(query);

                if (rs.next()) {
                    setVisible(false);
                    new Board();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

                // Always close the ResultSet and Connection when done
                rs.close();
                a.s.close();
              //  a.c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Page();
    }
}