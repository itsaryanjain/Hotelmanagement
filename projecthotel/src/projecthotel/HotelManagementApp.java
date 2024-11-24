package projecthotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




    public class HotelManagementApp extends JFrame implements ActionListener {

        HotelManagementApp() {
       

            ImageIcon icon = new ImageIcon("C:\\Users\\Aryan jain\\Desktop\\hotelmanagement\\icons\\first.jpg");
            JLabel image = new JLabel(icon);
            image.setBounds(0, 0, 1366, 565);
            add(image);
           
          
    
            JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
            text.setBounds(20, 430, 1000, 90);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("serif", Font.PLAIN, 50));
            image.add(text);
    
            JButton next = new JButton("Next");
            next.setBounds(1170, 325, 150, 50);
            next.setFont(new Font("serif", Font.PLAIN, 24));
            next.addActionListener(this);
            next.setForeground(Color.BLACK);
            image.add(next);


    setSize(1366,450);
    setLocation(100,300);
    setVisible(true);


            while (true) {
                text.setVisible(false);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                text.setVisible(true);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            
          

        }


                public void actionPerformed(ActionEvent ac) {
                    
                    new Page();
                }
               
            
            





        public static void main(String[] args) {
           new HotelManagementApp() ;

        }

       
    
    }

