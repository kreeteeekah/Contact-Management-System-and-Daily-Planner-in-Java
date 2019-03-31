import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class updel implements ActionListener
{
JFrame f1;
JPanel p0,p1;
JLabel l1;
JButton b1,b2,b3,b4,b5,b6,b7,b8;
GridLayout g1;  
 public updel()
 {
        f1=new JFrame("Update or Delete Contacts");
        f1.setSize(500,500);
        p0=new JPanel();
        p0.setLayout(null);
        f1.add(p0);
        p0.setBackground(Color.white);
        g1=new GridLayout(4,2);
        p0.setLayout(g1);
        
        b1=new JButton("Update/Delete Birthday");
        b2=new JButton("Update/Delete Anniversary");
        b3=new JButton("Update/Delete Phone Number");
        b4=new JButton("Update/Delete Email ID");
        b5=new JButton("Update/Delete Address");
        b6=new JButton("Update/Delete Relation");
        b7=new JButton("Back");
        b8=new JButton("Exit");
        
        b1.setBackground(Color.orange);
        b2.setBackground(Color.orange);
        b3.setBackground(Color.orange);
        b4.setBackground(Color.orange);
        b5.setBackground(Color.orange);
        b6.setBackground(Color.orange);
        b7.setBackground(Color.lightGray);
        b8.setBackground(Color.lightGray);
        
        b1.setToolTipText("Click to update/delete contact information.");
        b2.setToolTipText("Click to update/delete contact information.");
        b3.setToolTipText("Click to update/delete contact information.");
        b4.setToolTipText("Click to update/delete contact information.");
        b5.setToolTipText("Click to update/delete contact information.");
        b6.setToolTipText("Click to update/delete contact information.");
        b7.setToolTipText("Click to open previous page.");
        b8.setToolTipText("Click to go to main page.");
        
        p0.add(b1);
        p0.add(b2);
        p0.add(b3);
        p0.add(b4);
        p0.add(b5);
        p0.add(b6);
        p0.add(b7);
        p0.add(b8);
     
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        f1.setVisible(true);
        f1.setResizable(false);
 }         
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        ubirthday aa=new ubirthday();
        f1.setVisible(false);
    }
     if(e.getSource()==b2)
    {
        uanni ss=new uanni();
        f1.setVisible(false);
    }
      if(e.getSource()==b3)
    {
        uphone qq=new uphone();
        f1.setVisible(false);
    }
       if(e.getSource()==b4)
    {
        uemail ww=new uemail();
        f1.setVisible(false);
    }
        if(e.getSource()==b5)
    {
        uaddress rr=new uaddress();
        f1.setVisible(false);
    }
         if(e.getSource()==b6)
    {
        urel oo=new urel();
        f1.setVisible(false);
    }
          if(e.getSource()==b7)
    {
        contactManager ee=new contactManager();   
        f1.setVisible(false);
    }
           if(e.getSource()==b8)
    {
        page1 tt=new page1();
        f1.setVisible(false);
    }
}
public static void main(String p[])
{
new updel();
}
}
