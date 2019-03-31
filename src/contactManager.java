import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class contactManager implements ActionListener 
{
  JFrame f1;
    JPanel p0,p1,p2,p3,p4;
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3,b4;
    JOptionPane q1;
     public contactManager()
     {
         f1=new JFrame("Contact Mananger");
        f1.setSize(1000,600);
        p0=new JPanel();
        p0.setLayout(null);
        f1.add(p0);
        p0.setBackground(Color.white);
        
        Font c1=new Font("georgia",Font.BOLD,30);
        p1=new JPanel();
        p1.setBounds(0,31,1000,60);
        p0.add(p1);
        l1=new JLabel("Contact Manager");
        l1.setFont(c1);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,900,40);
        p1.add(l1);
        p1.setBackground(Color.orange);
        JOptionPane q1=new JOptionPane();
        
        p2=new JPanel();
        p2.setBounds(70,180,700,80);
        p0.add(p2);
        l2=new JLabel("Add New Contact");
        l2.setFont(c1);
        l2.setForeground(Color.orange);
        l2.setBounds(150,282,400,40);
        p2.add(l2);
        b1=new JButton("Next");
        b1.setBounds(590,285,100,30);
        p2.add(b1);
        p2.setBackground(Color.blue);
        
        p3=new JPanel();
        p3.setBounds(150,280,700,80);
        p0.add(p3);
        l3=new JLabel("Search Contact Information");
        l3.setFont(c1);
        l3.setForeground(Color.orange);
        l3.setBounds(200,482,400,40);
        p3.add(l3);
        b2=new JButton("Next");
        b2.setBounds(650,500,100,30);
        p3.add(b2);
        p3.setBackground(Color.blue);
        
        p4=new JPanel();
        p4.setBounds(230,380,700,80);
        p0.add(p4);
        l4=new JLabel("Update or Delete Contact Information");
        l4.setFont(c1);
        l4.setForeground(Color.orange);
        l4.setBounds(200,382,400,40);
        p4.add(l4);
        b3=new JButton("Next");
        b3.setBounds(690,400,100,30);
        p4.add(b3);
        p4.setBackground(Color.blue);
        
        b4=new JButton("Back");
        b4.setBounds(860,500,100,30);
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
            q1.showMessageDialog(null,"Welcome,click OK to proceed.","Welocme",1);
            newContact aa=new newContact();
            f1.setVisible(false);
        }
        if(e.getSource()==b3)
        {
            q1.showMessageDialog(null,"Welcome,click OK to proceed.","Welocme",1);
            updel ah=new updel();
            f1.setVisible(false);
        }
        if(e.getSource()==b2)
        {
            q1.showMessageDialog(null,"Welcome,click OK to proceed.","Welocme",1);
            searchContact ar=new searchContact();
            f1.setVisible(false);
        }
        if(e.getSource()==b4)
        {
            q1.showMessageDialog(null,"You will be taken back to the login page. Click OK to proceed","Message Box",1);
            page2 sq=new page2();
            f1.setVisible(false);
        }
    }
  public static void main(String p[])
  {
      new contactManager();
  }
    
}
   

