package hotelmanagemnt;
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    Dashboard() {
        setLayout(null);
        setBounds(0, 0, 1550, 1000);

        // Load the image with exception handling
        
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Aryan jain\\Desktop\\hotelmanagement\\icons\\first.jpg"));
            Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel NewLabel = new JLabel(i3);
            NewLabel.setBounds(0, 0, 1950, 1000);
            add(NewLabel);
        } catch (NullPointerException e) {
            System.out.println("Error loading image: " + e.getMessage());
            // You can handle the exception as needed, for example, by displaying an error message.
        }

        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");
        text.setBounds(400, 80, 1000, 50);
        text.setFont(new Font("Tahoma", Font.PLAIN, 56));
        text.setForeground(Color.WHITE);
        add(text);

        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1550, 30);
        add(mb);

        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);

        JMenuItem reception = new JMenuItem("Reception");
        hotel.add(reception);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem addEmployee = new JMenuItem("Add Employee");
        admin.add(addEmployee);
        
        setLocation(1000, 1000);
        setVisible(true);
        setSize(1000,1000);
    }


    public static void main(String[] args) {
        new Dashboard();
    }

    }
