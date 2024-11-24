package projecthotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {

	JTextField aaj1, tt1, tt6, tt7, tt8;
	JLabel aaj, tt, tt5, tt3, tt9,A3, A2,A;
	JButton submit, Cancel;
	JRadioButton rm1, rm2;
	JComboBox<String> cb,cb1,cb3;

	AddRoom() {
		setLayout(null);

		JLabel heading = new JLabel("Add Rooms");
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(150, 20, 200, 20);
		add(heading);

		aaj = new JLabel("Room Number");
		aaj.setBounds(60, 80, 120, 20);
		aaj.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(aaj);
		aaj1 = new JTextField();
		aaj1.setBounds(200, 80, 150, 30);
		add(aaj1);

		 A = new JLabel("Available");
		A.setBounds(60, 130, 120, 30);
		A.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(A);

		String[] str = { "Available", "Not Available", };
		cb = new JComboBox<>(str);
		cb.setBounds(200, 130, 150, 30);
		cb.setBackground(Color.WHITE);
		add(cb);

		A3 = new JLabel("	Cleaning Status ");
		A3.setBounds(60, 180, 120, 30);
		A3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(A3);

		String[] str3 = { "Cleaned", "Dirty", };
		cb1 = new JComboBox<>(str3);
		cb1.setBounds(200, 180, 150, 30);
		cb1.setBackground(Color.WHITE);
		add(cb1);

		tt5 = new JLabel("Price");
		tt5.setBounds(60, 230, 120, 30);
		tt5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(tt5);
		tt6 = new JTextField();
		tt6.setBounds(200, 230, 150, 30);
		add(tt6);

		A2 = new JLabel("Bed type ");
		A2.setBounds(60, 270, 120, 60);
		A2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add(A2);

		String[] str2 = { "Single Bed ", "Double Bed", "Triple Bed" };
		cb3 = new JComboBox<>(str2);
		cb3.setBounds(200, 280, 150, 30);
		cb3.setBackground(Color.WHITE);
		add(cb3);

		submit = new JButton("Add Rooms");
		submit.setBounds(60, 350, 130, 30);
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);

		Cancel = new JButton("Cancel");
		Cancel.setBounds(220, 350, 130, 30);
		Cancel.setBackground(Color.BLACK);
		Cancel.setForeground(Color.WHITE);
		Cancel.addActionListener(this);
		add(Cancel);

		ImageIcon icon = new ImageIcon("C:\\Users\\Aryan jain\\Desktop\\hotelmanagement\\icons\\twelve.jpg");
		Image i2 = icon.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(400, 30, 500, 300);
		add(image);

		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
		setBounds(350, 200, 940, 470);
	}

	public void actionPerformed(ActionEvent ae) {
    	
    	
    	if(ae.getSource() == submit) {
    		String addrooms = aaj.getText();
    		 String available=(String) cb.getSelectedItem(); 
    		 String status = (String) cb1.getSelectedItem();
    		 String price=tt5.getText();
    		 String type = (String) cb3 .getSelectedItem(); 
    		 
    		 try {
    			 
    			 
    			 Conn c=new Conn();
    			 String str= "insert into room values('" + addrooms + "', '" + available + "', '" + status + "', '" + price+ "', '" + type + "')";
    		c.s.executeUpdate(str);
    		JOptionPane.showMessageDialog(null, "Room is added successfully");
    		setVisible(false);
    		 }catch(Exception e){
    			 e.printStackTrace();
    			 
    		 }
    		 
			 
    		
    		
    		
    	}else {
    		
    		
    		setVisible(false);
    	}
	}

	
	public static void main(String args[]) {
		new AddRoom();
	}
}