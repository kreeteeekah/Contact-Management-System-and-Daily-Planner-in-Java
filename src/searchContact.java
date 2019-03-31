import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class searchContact implements ActionListener
{
    JFrame f1;
    JPanel p0,p1 ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t9;
    TextArea t8;
    JButton b1,b2;
    JOptionPane q1;

    public searchContact()
    {
        f1=new JFrame("Search Contact");
        f1.setSize(1000,1000);
        p0=new JPanel();
        p0.setLayout(null);
        f1.add(p0);
        p0.setBackground(Color.white);
        
        Font c1=new Font("georgia",Font.BOLD,30);
        p1=new JPanel();
        p1.setBounds(0,31,1000,60);
        p0.add(p1);
        l1=new JLabel("Search Contact");
        l1.setFont(c1);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,900,40);
        p1.add(l1);
        p1.setBackground(Color.orange);
        JOptionPane q1=new JOptionPane();
        b2=new JButton("Back");
        b2.setBounds(550,675,95,30);
        p0.add(b2);
        b2.setToolTipText("Opens previous page.");
        b1=new JButton("Search");
        b1.setBounds(400,675,95,30);
        p0.add(b1);
        
        l1=new JLabel("Enter your Username");
        t1=new JTextField(20);
        l2=new JLabel("Enter Contact's Name");
        t2=new JTextField(20);
        l3=new JLabel("See Contact Information");
        l4=new JLabel("Contact Number");
        t3=new JTextField(20);
        l5=new JLabel("Date fo Birth");
        t4=new JTextField(20);
        l6=new JLabel("Anniversary");
        t5=new JTextField(20);
        l7=new JLabel("Email ID");
        t6=new JTextField(20);
        l8=new JLabel("Address");
        t7=new JTextField(20);
        l10=new JLabel("Realationship");
        t9=new JTextField(20);
        l9=new JLabel("Note");
        t8=new TextArea();
        l1.setBounds(300,100,150,30);
        p0.add(l1);
        t1.setBounds(450,100,150,30);
        p0.add(t1);
        l2.setBounds(300,175,150,30);
        p0.add(l2);
        t2.setBounds(450,175,150,30);
        p0.add(t2);
        l3.setBounds(400,250,150,30);
        p0.add(l3);
        l4.setBounds(100,300,150,30);
        p0.add(l4);
        t3.setBounds(250,300,150,30);
        p0.add(t3);
        l5.setBounds(100,375,150,30);
        p0.add(l5);
        t4.setBounds(250,375,150,30);
        p0.add(t4);
        l6.setBounds(100,450,150,30);
        p0.add(l6);
        t5.setBounds(250,450,150,30);
        p0.add(t5);
        l7.setBounds(600,300,150,30);
        p0.add(l7);
        t6.setBounds(750,300,150,30);
        p0.add(t6);
        l8.setBounds(600,375,150,30);
        p0.add(l8);
        t7.setBounds(750,375,150,30);
        p0.add(t7);
        l10.setBounds(600,450,150,30);
        p0.add(l10);
        t9.setBounds(750,450,150,30);
        p0.add(t9);
        l9.setBounds(100,525,150,30);
        p0.add(l9);
        t8.setBounds(250,525,700,100);
        p0.add(t8);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.setVisible(true);
        f1.setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource()==b1)
        { 
                if(t1.getText().length()==0)
                {
                    q1.showMessageDialog(null,"Enter Username.","Error Submitting Data",1);
                }
                else
                {
                    try 
                    {
                      Class.forName("org.apache.derby.jdbc.ClientDriver");
                      Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                      PreparedStatement stat=con.prepareStatement("select from project(cphone,cbday,canniversary,cemail,caddress,crelation,cnote)values where username=? and cname=? ");
                      stat.setString(1, t1.getText());
                      stat.setString(2, t2.getText());
                      ResultSet res=stat.executeQuery();
                      while(res.next())
                      {
                          t3.setText(res.getString(8));
                          t4.setText(res.getString(9));
                          t5.setText(res.getString(10));
                          t6.setText(res.getString(11));
                          t7.setText(res.getString(12));
                          t8.setText(res.getString(13));
                          t9.setText(res.getString(14));
                      }
                      
                    }
                    catch(Exception ec)
                    {
                        System.out.println(ec);
                    }
                }
        }
          if(e.getSource()==b2)
        {
            contactManager sq=new contactManager();
            f1.setVisible(false);
        }
        
    }
    public static void main(String p[])
    {
        new searchContact();
    }
}
