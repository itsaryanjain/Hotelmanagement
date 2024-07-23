package projecthotel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adddrivers extends JFrame implements ActionListener {

    JTextField aaj1, tt1, tt6, tt7, tt8;
    JLabel aaj, tt, tt5, tt3, tt9,JLabel,  jobLabel;
    JButton submit, cancel ;
    JRadioButton rm1, rm2;
    JComboBox<String> cb;

    Adddrivers() {
        setLayout(null);
        
        
        
        JLabel heading = new JLabel("ADD DRIVERS");
		heading.setFont(new Font("Tahoma", Font.BOLD, 18));
		heading.setBounds(150, 10, 200, 20);
		add(heading);

        aaj = new JLabel("Name");
        aaj.setBounds(60, 30, 120, 60);
        aaj.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(aaj);
        aaj1 = new JTextField();
        aaj1.setBounds(200, 45, 150, 30);
        add(aaj1);

        tt = new JLabel("Age");
        tt.setBounds(60, 80, 120, 60);
        tt.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(tt);
        tt1 = new JTextField();
        tt1.setBounds(200, 90, 150, 30);
        add(tt1);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(60, 130, 120, 60);
        genderLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(genderLabel);
        rm1 = new JRadioButton("Male");
        rm1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rm1.setBounds(200, 130, 70, 60);
        add(rm1);
        rm2 = new JRadioButton("Female");
        rm2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rm2.setBounds(280, 130, 70, 60);
        add(rm2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rm1);
        bg.add(rm2);

        jobLabel = new JLabel("AVAILABLE");
        jobLabel.setBounds(60, 310, 120, 60);
        jobLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(jobLabel);

        String[] str = {"AVAILABLE","NOT AVAILABLE"};
        cb = new JComboBox<>(str);
        cb.setBounds(200, 310, 120, 50);
        cb.setBackground(Color.WHITE);
        add(cb);

        tt3 = new JLabel("CAR COMPANY");
        tt3.setBounds(60, 180, 200, 60);
        tt3.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(tt3);
        tt7 = new JTextField();
        tt7.setBounds(200, 200, 150, 40);
        add(tt7);

        tt5 = new JLabel("CAR MODEL");
        tt5.setBounds(60, 260, 120, 30);
        tt5.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(tt5);
        tt6 = new JTextField();
        tt6.setBounds(200, 260, 150, 40);
        add(tt6);

        tt9 = new JLabel("LOCATION");
        tt9.setBounds(60, 380, 120, 60);
        tt9.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(tt9);
        tt8 = new JTextField();
        tt8.setBounds(200, 390, 150, 30);
        add(tt8);

        submit = new JButton("SUBMIT");
        submit.setBounds(50, 450, 150, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        

        cancel = new JButton("CANCEL");
        cancel .setBounds(150, 450, 150, 30);
        cancel .setBackground(Color.BLACK);
        cancel .setForeground(Color.WHITE);
        cancel .addActionListener(this);
        add(cancel);

        ImageIcon icon = new ImageIcon("C:\\Users\\Aryan jain\\Desktop\\hotelmanagement\\icons\\eleven.jpg");
        Image i2 = icon.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380, 60, 450, 370);
        add(image);

        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setBounds(350, 200, 850, 540);
    }

    public void actionPerformed(ActionEvent ae) {
        String name = aaj1.getText();
        String age = tt1.getText();
        String company =   tt3.getText();
        String model = tt5.getText();
        String available =(String) cb.getSelectedItem();
        String location = tt9.getText();

        String gender = null;
        if (rm1.isSelected()) {
            gender = "Male";
        } else if (rm2.isSelected()) {
            gender = "Female";
        }

        String job = (String) cb.getSelectedItem();

        try {
            Conn c = new Conn();
            String query = "insert into Adddrivers values('" + name + "', '" + age + "', '" + gender + "', '" + company + "', '" + model + "', '" + available + "','"+location+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Driver is added successfully");
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Adddrivers();
    }
}