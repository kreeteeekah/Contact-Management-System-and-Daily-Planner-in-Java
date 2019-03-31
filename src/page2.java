import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class page2 implements ActionListener
{
    JFrame f1;
    JPanel p0,p1,p2,p3;
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JOptionPane q1;
     public page2()
     {
         f1=new JFrame("Contact Manager and Day Planner");
        f1.setSize(900,900);
        p0=new JPanel();
        p0.setLayout(null);
        f1.add(p0);
        p0.setBackground(Color.white);
        
        Font c1=new Font("georgia",Font.BOLD,30);
        p1=new JPanel();
        p1.setBounds(0,31,900,60);
        p0.add(p1);
        l1=new JLabel("Contact Manager & Day Planner ");
        l1.setFont(c1);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,800,40);
        p1.add(l1);
        p1.setBackground(Color.orange);
        JOptionPane q1=new JOptionPane();
        
        p2=new JPanel();
        p2.setBounds(110,280,600,80);
        p0.add(p2);
        l2=new JLabel("Manage Your Contacts");
        l2.setFont(c1);
        l2.setForeground(Color.orange);
        l2.setBounds(150,282,400,40);
        p2.add(l2);
        b1=new JButton("Next");
        b1.setBounds(590,385,100,30);
        p2.add(b1);
        p2.setBackground(Color.blue);
        
        p3=new JPanel();
        p3.setBounds(180,400,600,80);
        p0.add(p3);
        l3=new JLabel("Plan Your Day");
        l3.setFont(c1);
        l3.setForeground(Color.orange);
        l3.setBounds(200,382,400,40);
        p3.add(l3);
        b2=new JButton("Next");
        b2.setBounds(690,500,100,30);
        p3.add(b2);
        p3.setBackground(Color.blue);
        
        b3=new JButton("Back");
        b3.setBounds(760,690,100,30);
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
            q1.showMessageDialog(null,"Welcome,click OK to proceed.","Welocme",1);
            contactManager aa=new contactManager();
            f1.setVisible(false);
        }
        if(e.getSource()==b2)
        {
            q1.showMessageDialog(null,"Welcome,click OK to proceed.","Welocme",1);
            dayPlanner aa=new dayPlanner();
            f1.setVisible(false);
        }
        if(e.getSource()==b3)
        {
            q1.showMessageDialog(null,"You will be taken back to the login page. Click OK to proceed","Message Box",1);
            page1 aw=new page1();
            f1.setVisible(false);
        }
    }
  public static void main(String p[])
  {
      new page2();
  }
    
}
