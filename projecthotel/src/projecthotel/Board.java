package projecthotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Board extends JFrame implements ActionListener{

  
    public Board() {
        super("HOTEL MANAGEMENT SYSTEM");

      //  setForeground(Color.CYAN);
        setLayout(null); 
        
        JLabel heading = new JLabel("TAJ GROUP WELCOMES YOU ");
		heading.setFont(new Font("Tahoma", Font.BOLD, 35));
		heading.setBounds(460, 100, 1000, 80);
		add(heading);


        ImageIcon icon = new ImageIcon("C:\\Users\\Aryan jain\\Desktop\\hotelmanagement\\icons\\need.jpg");
            JLabel image = new JLabel(icon);
            image.setBounds(0, 0, 1366, 1000);
            add(image);
           
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

         JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
         AirlineSystem.setForeground(Color.BLUE);
	 menuBar.add(AirlineSystem);

         JMenuItem FlightDetails = new JMenuItem("RECEPTION");
	 AirlineSystem.add(FlightDetails);

	 JMenu AirlineSystemHello = new JMenu("ADMIN");
         AirlineSystemHello.setForeground(Color.RED);
	 menuBar.add(AirlineSystemHello);

        JMenuItem FlightDetailshello1 = new JMenuItem("ADD EMPLOYEE");
        FlightDetailshello1.addActionListener(this);
	 AirlineSystemHello.add(FlightDetailshello1);

     

         JMenuItem FlightDetailshello2 = new JMenuItem("ADD ROOMS");
         FlightDetailshello2.addActionListener(this);
	 AirlineSystemHello.add(FlightDetailshello2);

        


         JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
         FlightDetailshello3.addActionListener(this);
	 AirlineSystemHello.add(FlightDetailshello3);

        setSize(1366,1000);
	setVisible(true);
      //  getContentPane().setBackground(Color.WHITE);
//setLocation(1950,1000);

    }
    
    public void actionPerformed(ActionEvent ae) {
    	if(ae.getActionCommand().equals("ADD EMPLOYEE"))
    			{
    		new AddEmployee();
    			}else if(ae.getActionCommand().equals("ADD ROOMS")){
    				new AddRoom();
    				
    			}else if(ae.getActionCommand().equals("ADD DRIVERS")) {
    				new Adddrivers();
    				//JOptionPane.showMessageDialog(null, "PLEASE TRY AGAIN LATER");
    			}
    	
    }
  public static void main(String[] args) {
        new Board(); 
    }
}