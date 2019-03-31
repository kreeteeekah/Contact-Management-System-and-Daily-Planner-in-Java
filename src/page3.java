 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class page3 implements ActionListener
{
    JFrame f1;
    JPanel p1,p2;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t5;
    JPasswordField t4;
    JRadioButton n1,n2,n3;
    ButtonGroup x1;
    JButton b1,b5;
    JOptionPane q1;
    public page3()
    {
        f1=new JFrame("New User");
        f1.setSize(700,700);
        p1=new JPanel();
        p1.setLayout(null);
        f1.add(p1);
        Font c1=new Font("georgia",Font.BOLD,30);
        p2=new JPanel();
        p2.setBounds(0,31,700,60);
        p1.add(p2);
        l1=new JLabel("Sign In");
        l1.setFont(c1);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,600,40);
        p2.add(l1);
        p2.setBackground(Color.orange);
        
        l1=new JLabel("First Name");
        t1=new JTextField(20);
        l2=new JLabel("Last Name");
        t2=new JTextField(20);
        l3=new JLabel("Enter Username");
        t3=new JTextField(20);
        l4=new JLabel("Enter New Password");
        t4=new JPasswordField(20);
        l5=new JLabel("Enter Your e-mail ID");
        t5=new JTextField(50);
        b1=new JButton("Submit");
        b5=new JButton("Back");
        q1=new JOptionPane();
        l6=new JLabel("Select Gender");
        n1=new JRadioButton("Male");
        n2=new JRadioButton("Female");
        n3=new JRadioButton("Other");
        x1=new ButtonGroup();
        
        b5.setToolTipText("Opens previous page.");
      
        l1.setBounds(150,100,150,30);
        t1.setBounds(320,100,150,30);
        l2.setBounds(150,150,150,30);
        t2.setBounds(320,150,150,30);
        l3.setBounds(150,200,150,30);
        t3.setBounds(320,200,150,30);
        l4.setBounds(150,250,150,30);
        t4.setBounds(320,250,150,30);
        l5.setBounds(150,300,150,30);
        t5.setBounds(320,300,150,30);
        l6.setBounds(150,350,150,30);
        n1.setBounds(320,350,150,30);
        n2.setBounds(320,375,150,30);
        n3.setBounds(320,400,150,30);
        b1.setBounds(250,450,150,30);
        b5.setBounds(520,550, 150,30);
        p1.setBackground(Color.white);
        n1.setBackground(Color.white);
        n2.setBackground(Color.white);
        n3.setBackground(Color.white);
        
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        x1.add(n1);
        x1.add(n2);
        x1.add(n3);
        p1.add(l6);
        p1.add(n1);
        p1.add(n2);
        p1.add(n3);
        p1.add(b1);
        p1.add(b5);
        
        b1.addActionListener(this);
        b5.addActionListener(this);
        f1.setVisible(true);
        f1.setResizable(false);
    }
        
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b1)
            {
                String a1,a2,a3,a4,a5;
                
                a1=t1.getText();
                a2=t2.getText();
                a3=t3.getText();
                a4=t4.getText();
                a5=t5.getText();
                
                if(a1.length()==0 ||a2.length()==0 || a3.length()==0 || a4.length()==0 || a5.length()==0)
                {
                    q1.showMessageDialog(null,"All the fields must be filled.","Error Submitting Data",1);
                }
                else
                {
                    try 
                    {
                      Class.forName("org.apache.derby.jdbc.ClientDriver");
                      Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                      PreparedStatement stat=con.prepareStatement("insert into project(name1,name2,username,password,email,gender) values(?,?,?,?,?,?)");
                      stat.setString(1, a1);
                      stat.setString(2, a2);
                      stat.setString(3, a3);
                      stat.setString(4, a4);
                      stat.setString(5, a5);   
         if(n1.isSelected())
                      {
                          stat.setString(6,"male");
                      }
                      else if (n2.isSelected())
                      {
                          stat.setString(6,"female");
                      } 
                      else if (n3.isSelected())
                      {
                          stat.setString(6,"other");
                      }
                      stat.executeUpdate();
                      q1.showMessageDialog(null,"Your account has been created.","Welcome",1);
                      q1.showMessageDialog(null,"Login to access your account.","Welcome",1);
                      page1 kk=new page1();
                      f1.setVisible(false);
                    }
                    catch(Exception ec)
                    {
                        System.out.println(ec);
                    }
                    }
            }
            if(e.getSource()==b5)
                {
                     page1 ww=new page1();
                     f1.setVisible(false);
                }
        }
        public static void main (String p[])
        {
            new page3();
        }
}

                    
                
                
                
            
        

        
        
    
    
    


