package hotelmanagemnt;

/*import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
*/

 public  class Login extends JFrame implements ActionListener{

    JTextField username,password;
    JButton LOGIN,cancel;
Login(){
    setLayout(null);
    setLocation(600,100);
   
    setBackground(Color.WHITE);
    JLabel head=new JLabel("USERNAME");
    head.setBounds(40,50,100,30);
    add(head);

   




    JLabel pass=new JLabel("PASSWORD");
    pass.setBounds(40,100,100,30);
    add(pass);

    JTextField username= new JTextField ();
    username.setBounds(150,50,150,30);
    add(username);
    JTextField password=new JTextField();
    password.setBounds(150,100,150,30);
    add(password);

     LOGIN=new JButton("LOGIN");
LOGIN.setBounds(40,150,120,30);
    LOGIN.setBackground(Color.BLACK);
    LOGIN.setForeground(Color.WHITE);
    LOGIN.addActionListener(this);
    add(LOGIN);

 cancel=new JButton("CANCEL");
cancel.setBounds(180,150,120,30);
    cancel.setBackground(Color.BLACK);
   cancel.setForeground(Color.WHITE);
    add(cancel);
    cancel.addActionListener(this);
    setLayout(null);

    ImageIcon a2=new ImageIcon("C:\\Users\\Aryan jain\\Desktop\\hotelmanagement\\icons\\second.jpg");
    JLabel image= new JLabel(a2);
    image.setBounds(350,40,220,200);
   add(image);

    setSize(600,300);
    setLocation(600,350);
    setVisible(true);

}
    public void actionPerformed(ActionEvent ac){
        if(ac.getSource() == Login){

        }else if (ac.getSource() == cancel){
            setVisible(false);
        }

    }





    public static void main(String[] args){

        new Login();


    }
 }