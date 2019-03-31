import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class viewRem implements ActionListener
{
    JFrame f;
    JPanel p,p2;
    JLabel d,m,l1;
    JTextField t2,td,tm,t3;
    JButton r2;
    JButton b1,b2;
    Font foo=new Font("georgia",Font.BOLD,30);
    public viewRem()
    {
    
        f=new JFrame("View Reminder");
        p=new JPanel();
        p.setLayout(null);
        f.getContentPane().add(p);
        
        p2=new JPanel();
        p2.setBounds(0,31,770,60);
        p.add(p2);
        l1=new JLabel("View Reminder");
        l1.setFont(foo);
        l1.setForeground(Color.DARK_GRAY);
        l1.setBounds(10,32,670,40);
        p2.add(l1);
        p2.setBackground(Color.orange);
        p.setBackground(Color.white);
        td=new JTextField(20);
        tm=new JTextField(20);
        t3=new JTextField(200);
        d=new JLabel("Enter Day");
        m=new JLabel("Enter Month");
        r2=new JButton("View");
        b1=new JButton("Back");
        b2=new JButton("Exit");
       
        d.setBounds(150,220,100,30);
        p.add(d);
        td.setBounds(220,225,70,20);
        p.add(td);
        m.setBounds(330,220,300,30);
        p.add(m);
        tm.setBounds(410,225,70,20);
        p.add(tm);
        r2.setBounds(50,290,70,25);
        p.add(r2);
        t3.setBounds(130,280,530,50);
        p.add(t3);
        b1.setBounds(570,380,70,25);
        p.add(b1);
        b2.setBounds(650,380,70,25);
        p.add(b2);
        f.setSize(770,470);
        f.setLocation(140,60);
        f.setVisible(true);
        f.setResizable(false);
        r2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
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
            if(evt.getSource()==r2)
            {
            try
            {    
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                PreparedStatement stat=con.prepareStatement("select text from reminder where date=? and month=?");
                stat.setString(1,td.getText());
                stat.setString(2,tm.getText());
                ResultSet result=stat.executeQuery();
                result.next();
                t3.setText(result.getString(1));                               
            }
            catch(Exception ee)
            {
                System.out.println(ee);
            }
        }
    }
    public static void main(String arg[])
    {
                viewRem vr=new viewRem();
    }
}
   

