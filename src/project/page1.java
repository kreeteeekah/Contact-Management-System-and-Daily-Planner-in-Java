import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class page1 implements ActionListener
{
    JFrame f1;
    JPanel p0,p1,p2,p3;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4;
    JTextField t1,t2;
    JOptionPane q1;
    
    public page1()
    {
      f1=new JFrame("Assisstant");
      f1.setSize(800,800);
      p0=new JPanel();
      p0.setLayout(null);
      f1.add(p0);
      p0.setBackground(Color.white);
      Font c1=new Font("georgia",Font.BOLD,30);
        //PANEL 1
        p1=new JPanel();
        p1.setBounds(0,31,800,70);
        p0.add(p1);
        l1=new JLabel("Contact Manager and Day Planner");
        l1.setFont(c1);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,700,60);
        p1.add(l1);
        p1.setBackground(Color.orange);
        l1=new JLabel("Username");
        t1=new JTextField(20);
        l2=new JLabel("Password");
        t2=new JPasswordField(20);
        b1=new JButton("LOGIN");
        b2=new JButton("CLEAR");
        l3=new JLabel("Don't have an account?");
        b3=new JButton("SIGN IN");
        l1.setBounds(300,300, 150,50);
        p0.add(l1);
        t1.setBounds(400,300, 150,30);
        p0.add(t1);
        l2.setBounds(300,350, 150,50);
        p0.add(l2);
        t2.setBounds(400,350, 150,30);
        p0.add(t2);
        b1.setBounds(320,400, 100,30);
        p0.add(b1);
        b2.setBounds(470,400,100,30);
        p0 .add(b2);
        l3.setBounds(300,450, 250,30);
        p0.add(l3);
        b3.setBounds(450,450, 100,30);
        p0.add(b3);
        b1.addActionListener(this);   
        b2.addActionListener(this);
        b3.addActionListener(this);
        f1.setVisible(true); 
        f1.setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
         {
             String a1,a2;
                 a1=t1.getText();
                 a2=t2.getText();
             if(a1.length()==0 || a2.length()==0)
                      {
                          q1.showMessageDialog(null,"Enter username and Passord","Error",1);
                      }
        try
        {
          Class.forName("org.apache.derby.jdbc.ClientDriver");
                      Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                      PreparedStatement stat=con.prepareStatement("select * from project where username=? and password=?");
                      stat.setString(3, a1);
                      stat.setString(4, a2);
                      ResultSet res=stat.executeQuery();
           
                      int count=0;
                      while(res.next())
                      {
                          count++;
                      }
                      if(count>0)
                      {
                          q1.showMessageDialog(null,"Welcome, click ok to proceed.","Welcome User",1);
                      }
                      else
                      {
                          q1.showMessageDialog(null,"Username or Password is incorrect.","Error",1);
                      }
                     
         
        }
        catch(Exception z)
        {
            System.out.println(z);
        }
         }
        if(e.getSource()==b2)
        {
            t1.setText(" ");
            t2.setText(" ");
        }
        if(e.getSource()==b3)
         {
             q1.showMessageDialog(null,"Welcome user, click OK to proceed.","Welcome",1);
             page3 gg=new page3();
             f1.setVisible(false);
         }
        
    }
        public static void main(String p[])
        {
            new page1();
        }
}
