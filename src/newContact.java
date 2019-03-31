import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class newContact implements ActionListener
{
    JFrame f1;
    JPanel p0,p1 ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    TextArea t8;
    JRadioButton n1,n2,n3,n4;
    ButtonGroup x1;
    JButton b1,b2;
    JOptionPane q1;
     public newContact()
     {
        f1=new JFrame("Add Contact");
        f1.setSize(1000,1000);
        p0=new JPanel();
        p0.setLayout(null);
        f1.add(p0);
        p0.setBackground(Color.white);
        
        Font c1=new Font("georgia",Font.BOLD,30);
        p1=new JPanel();
        p1.setBounds(0,31,1000,60);
        p0.add(p1);
        l1=new JLabel("Add new Contact");
        l1.setFont(c1);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,900,40);
        p1.add(l1);
        p1.setBackground(Color.orange);
        JOptionPane q1=new JOptionPane();
        b2=new JButton("Back");
        b2.setBounds(550,700,95,30);
        p0.add(b2);
        b2.setToolTipText("Opens previous page.");
        b1=new JButton("Add");
        b1.setBounds(400,700,95,30);
        p0.add(b1);
        
        l1=new JLabel("Enter your Username");
        t1=new JTextField(20);
        l2=new JLabel("Add Contact Information");
        l3=new JLabel("Name");
        t2=new JTextField(20);
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
        n1=new JRadioButton("Family");
        n2=new JRadioButton("Friend");
        n3=new JRadioButton("Work");
        n4=new JRadioButton("Other");
        x1=new ButtonGroup();
        x1.add(n1);
        x1.add(n2);
        x1.add(n3);
        x1.add(n4);
        l9=new JLabel("Add a Note");
        t8=new TextArea();
        l1.setBounds(300,100,150,30);
        p0.add(l1);
        t1.setBounds(450,100,150,30);
        p0.add(t1);
        l2.setBounds(400,150,150,30);
        p0.add(l2);
        l3.setBounds(100,200,150,30);
        p0.add(l3);
        t2.setBounds(250,200,150,30);
        p0.add(t2);
        l4.setBounds(100,250,150,30);
        p0.add(l4);
        t3.setBounds(250,250,150,30);
        p0.add(t3);
        l5.setBounds(100,300,150,30);
        p0.add(l5);
        t4.setBounds(250,300,150,30);
        p0.add(t4);
        l6.setBounds(100,350,150,30);
        p0.add(l6);
        t5.setBounds(250,350,150,30);
        p0.add(t5);
        l7.setBounds(100,400,150,30);
        p0.add(l7);
        t6.setBounds(250,400,150,30);
        p0.add(t6);
        l8.setBounds(100,450,150,30);
        p0.add(l8);
        t7.setBounds(250,450,150,30);
        p0.add(t7);
        l9.setBounds(100,600,150,30);
        p0.add(l9);
        t8.setBounds(250,600,700,100);
        p0.add(t8);
        l10.setBounds(100,500,150,30);
        p0.add(l10);
        n1.setBounds(250,500,90,30);
        p0.add(n1);
        n2.setBounds(350,500,90,30);
        p0.add(n2);
        n3.setBounds(250,550,90,30);
        p0.add(n3);
        n4.setBounds(350,550,90,30);
        p0.add(n4);
        n1.setBackground(Color.white);
        n2.setBackground(Color.white);
        n3.setBackground(Color.white);
        n4.setBackground(Color.white);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        f1.setVisible(true);
        f1.setResizable(false);
}
     public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==b1)
        {
            String a1,a2,a3,a4,a5,a6,a7,a8;
                
                a1=t1.getText();
                a2=t2.getText();
                a3=t3.getText();
                a4=t4.getText();
                a5=t5.getText();
                a6=t6.getText();
                a7=t7.getText();
                a8=t8.getText();
                
                if(a1.length()==0)
                {
                    q1.showMessageDialog(null,"Enter Username.","Error Submitting Data",1);
                }
                else
                {
                    try 
                    {
                      Class.forName("org.apache.derby.jdbc.ClientDriver");
                      Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                      PreparedStatement stat=con.prepareStatement("insert into project(cname,cphone,cbday,canniversary,cemail,caddress,crelation,cnote)values(?,?,?,?,?,?,?,?,?)");
                      stat.setString(3, a1);
                      stat.setString(2, a2);
                      stat.setString(3, a3);
                      stat.setString(4, a4);
                      stat.setString(5, a5);
                      stat.setString(6, a6);
                      stat.setString(7, a7);
                      stat.setString(8, a8);
                      
                      
         if(n1.isSelected())
                      {
                          stat.setString(9,"male");
                      }
                      else if (n2.isSelected())
                      {
                          stat.setString(9,"female");
                      } 
                      else if (n3.isSelected())
                      {
                          stat.setString(9,"other");
                      }
         stat.executeUpdate();
                      q1.showMessageDialog(null," New contact created.","Message Box",1);
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
        new newContact(); 
     }
}
