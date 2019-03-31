import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class uphone implements ActionListener
{
   JFrame f1;
    JPanel p0,p1;
    JLabel l1,l2,l3,text;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4,b5;
    JOptionPane q1;
    public uphone()
    {
        f1=new JFrame("Contact Manager and Day Planner");
        f1.setSize(700,700);
        p0=new JPanel();
        p0.setLayout(null);
        f1.add(p0);
        p0.setBackground(Color.white);
        Font c1=new Font("georgia",Font.BOLD,30);
        p1=new JPanel();
        p1.setBounds(0,31,700,60);
        p0.add(p1);
        l1=new JLabel("Update or Delete Contact Information");
        l1.setFont(c1);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,550,40);
        p1.add(l1);
        p1.setBackground(Color.orange);
        JOptionPane q1=new JOptionPane();
        l1=new JLabel("Username");
        t1=new JTextField(20);
        l2=new JLabel("Enter Name");
        t2=new JTextField(13);
        l3=new JLabel("Enter Phone");
        t3=new JTextField(13);
        text=new JLabel("Enter contact information for updation or deletion.");
        b1=new JButton("Update");
        b2=new JButton("Delete");
        b3=new JButton("Back");
        b4=new JButton("Exit");
        l2.setToolTipText("Enter full name of the contact.");
        l1.setBounds(200,200,150,30);
        p0.add(l1);
        t1.setBounds(350,200,150,30);
        p0.add(t1);
        text.setBounds(200,240,400,30);
        p0.add(text);
        l2.setBounds(200,280,150,30);
        p0.add(l2);
        t2.setBounds(350,280,150,30);
        p0.add(t2);
        l3.setBounds(200,340,150,30);
        p0.add(l3);
        t3.setBounds(350,340,150,30);
        p0.add(t3);
        b1.setBounds(200,400,100,30);
        p0.add(b1);
        b2.setBounds(350,400,100,30);
        p0.add(b2);
        b3.setBounds(450,600,90,30);
        p0.add(b3);
        b4.setBounds(550,600,90,30);
        p0.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f1.setVisible(true);
        f1.setResizable(false);
    }
  public void actionPerformed(ActionEvent e)
  {
      if(e.getSource()==b1)
      {
           try
          {
              String a1=t3.getText();
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
              PreparedStatement stat=con.prepareStatement("update poject set cphone=? , where username=? and cname=?");
              stat.setString(1,a1);
              stat.executeUpdate();
              q1.showMessageDialog(null,"Contact Number has been updated.","Success",1);
          }
          catch(Exception ec)
          {
              System.out.println(ec);
          }
      }
      if(e.getSource()==b2)
      {
          try
          {
              String a1=t3.getText();
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
              PreparedStatement stat=con.prepareStatement("delete from poject cphone=? , where username=? and cname=?");
              stat.setString(1,a1);
              stat.executeUpdate();
              q1.showMessageDialog(null,"Contact Number has been deleted.","Success",1);
          }
          catch(Exception ec)
          {
              System.out.println(ec);
          }
      }
      if(e.getSource()==b3)
      {
        contactManager nn=new contactManager();
        f1.setVisible(false);
      }
      if(e.getSource()==b4)
      {
          page1 yy=new page1();
          f1.setVisible(false);
      }
  }
  public static void main(String p[])
  {
      new uphone();
  }
}
 

