import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class delRem implements ActionListener 
{
    JPanel p,p2;
    JFrame f;
    JLabel vdate,d,m,l1;
    JTextField td,tm;
    JButton dlt2,b1,b2;
    PreparedStatement stat1; 
    Connection con;
    Font foo=new Font("Georgia",Font.BOLD,30);
    public delRem()
    {
        p=new JPanel();
        f=new JFrame("Delete Reminder");   
        f.getContentPane().add(p);
        p.setLayout(null);
        p2=new JPanel();
        p2.setBounds(0,31,700,60);
        p.add(p2);
        l1=new JLabel("Delete Reminder");
        l1.setFont(foo);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,670,40);
        p2.add(l1);
        p2.setBackground(Color.orange);
        p.setBackground(Color.white);
        
        dlt2=new JButton("Delete");
        b1=new JButton("Main");
        b2=new JButton("Exit");
        vdate=new JLabel("Delete Reminder By Date");
        d=new JLabel("Enter Day");
        m=new JLabel("Enter Month");
        td=new JTextField(20);
        tm=new JTextField(20);        
        
        vdate.setBounds(90,100,300,30);
        p.add(vdate);
        td.setBounds(290,100,50,25);
        p.add(td);
        tm.setBounds(350,100,50,25);
        p.add(tm);
        
        td.setText("day");
        tm.setText("month");
        
        dlt2.setBounds(470,100,70,25);
        p.add(dlt2);
        b1.setBounds(500,180,70,25);
        p.add(b1);
        b2.setBounds(580,180,70,25);
        p.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        dlt2.addActionListener(this);
        f.setSize(700,270);
            f.setLocation(140,160);
            f.setVisible(true);
        f.setResizable(false);
    }

    public static void main(String arg[])
    {
        delRem dlt=new delRem();
    }
    
    public void actionPerformed(ActionEvent evt)
    {
         if(evt.getSource()==b1)
         {
              dayPlanner wrk=new dayPlanner();
              f.setVisible(false);
         }
             if(evt.getSource()==b2)
             {
                  System.exit(0);
             }
             if(evt.getSource()==dlt2);
             {
            try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            stat1=con.prepareStatement("delete from reminder where date=? AND month=?");
            stat1.setString(1,td.getText());
            //stat.executeUpdate();
            stat1.setString(2,tm.getText());
            stat1.executeUpdate();
                }          
        catch(Exception ee)
        {
             System.out.println("ERROR OCCURRED" +ee);
        }
        }
      }
}


