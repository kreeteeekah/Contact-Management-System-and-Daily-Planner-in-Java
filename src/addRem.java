import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class addRem implements ActionListener
{
    JPanel p;
    JFrame f;
    JLabel smnth,sday,rlabel;
    JLabel rtext;
    JTextField tid,t1,t2,treminder;
    JButton m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    JButton d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30,d31;
    JButton b1,b2,b3;
    Font fo=new Font("Georgia",Font.BOLD,18);
    Font foo=new Font("Georgia",Font.BOLD,16);
    Connection con;
    PreparedStatement stat;
    
    public addRem()
    {
       p=new JPanel();
       f=new JFrame();
       p.setLayout(null);
       p.setBackground(Color.white);
       f.add(p);
    
      rtext=new JLabel("Enter Reminder Text");
      treminder=new JTextField(100);
    
       smnth=new JLabel("Select Month");
       sday=new JLabel("Select Day");
       rlabel=new JLabel("Enter Reminder For :");
       t1=new JTextField(10);
       t2=new JTextField(10);
       smnth.setFont(fo);
       sday.setFont(fo);
       rlabel.setFont(foo);
       
       rlabel.setBounds(100,250,150,30);
       t1.setBounds(350,250,50,30);
       t2.setBounds(420,250,50,30);
       p.add(rlabel);
       p.add(t1);
       p.add(t2);
       rtext.setBounds(100,375,150,30);
       treminder.setBounds(300,375,150,30);
       p.add(rtext);
       p.add(treminder);
      
       m1=new JButton("Jan");
       m2=new JButton("Feb");
       m3=new JButton("Mar");
       m4=new JButton("Apr");
       m5=new JButton("May");
       m6=new JButton("Jun");
       m7=new JButton("Jul");
       m8=new JButton("Aug");
       m9=new JButton("Sep");
       m10=new JButton("Oct");
       m11=new JButton("Nov");
       m12=new JButton("Dec");
       m1.setBackground(Color.orange);
       m2.setBackground(Color.orange);
       m3.setBackground(Color.orange);
       m4.setBackground(Color.orange);
       m5.setBackground(Color.orange);
       m6.setBackground(Color.orange);
       m7.setBackground(Color.orange);
       m8.setBackground(Color.orange);
       m9.setBackground(Color.orange);
       m10.setBackground(Color.orange);
       m11.setBackground(Color.orange);
       m12.setBackground(Color.orange);
    
           d1=new JButton("1");
           d2=new JButton("2");
           d3=new JButton("3");
           d4=new JButton("4");
           d5=new JButton("5");
           d6=new JButton("6");
           d7=new JButton("7");
           d8=new JButton("8");
           d9=new JButton("9");
           d10=new JButton("10");
           d11=new JButton("11");
           d12=new JButton("12");
           d13=new JButton("13");
           d14=new JButton("14");
           d15=new JButton("15");
           d16=new JButton("16");
           d17=new JButton("17");
           d18=new JButton("18");
           d19=new JButton("19");
               d20=new JButton("20");
           d21=new JButton("21");
           d22=new JButton("22");
           d23=new JButton("23");
           d24=new JButton("24");
           d25=new JButton("25");
           d26=new JButton("26");
           d27=new JButton("27");
           d28=new JButton("28");    
           d29=new JButton("29");
           d30=new JButton("30");
           d31=new JButton("31");
        
           d1.setBackground(Color.orange);
           d2.setBackground(Color.orange);
           d3.setBackground(Color.orange);
           d4.setBackground(Color.orange);
           d5.setBackground(Color.orange);
           d6.setBackground(Color.orange);
           d7.setBackground(Color.orange);
           d8.setBackground(Color.orange);
           d9.setBackground(Color.orange);
           d10.setBackground(Color.orange);
           d11.setBackground(Color.orange);
           d12.setBackground(Color.orange);
           d13.setBackground(Color.orange);
           d14.setBackground(Color.orange);
           d15.setBackground(Color.orange);
           d16.setBackground(Color.orange);
           d17.setBackground(Color.orange);
           d18.setBackground(Color.orange);
           d19.setBackground(Color.orange);
           d20.setBackground(Color.orange);
           d21.setBackground(Color.orange);
           d22.setBackground(Color.orange);
           d23.setBackground(Color.orange);    
           d24.setBackground(Color.orange);
           d25.setBackground(Color.orange);
           d26.setBackground(Color.orange);
           d27.setBackground(Color.orange);
           d28.setBackground(Color.orange);
           d29.setBackground(Color.orange);
           d30.setBackground(Color.orange);
           d31.setBackground(Color.orange);
    
           b1=new JButton("Submit");
           b2=new JButton("Back");
           b3=new JButton("Exit");
   
/* --------------for month ---------------*/
           
           smnth.setBounds(80,10,150,40);
           p.add(smnth);
    
            m1.setBounds(30,65,60,20);
            p.add(m1);
            m2.setBounds(110,65,60,20);
            p.add(m2);
            m3.setBounds(190,65,60,20);
            p.add(m3);
        
            m4.setBounds(30,100,60,20);
            p.add(m4);
            m5.setBounds(110,100,60,20);
            p.add(m5);
            m6.setBounds(190,100,60,20);
            p.add(m6);
          
            m7.setBounds(30,135,60,20);
            p.add(m7);
            m8.setBounds(110,135,60,20);
            p.add(m8);
            m9.setBounds(190,135,60,20);
            p.add(m9);
               
           m10.setBounds(30,170,60,20);
           p.add(m10);
           m11.setBounds(110,170,60,20);
           p.add(m11);
           m12.setBounds(190,170,60,20);
           p.add(m12);
    
/* ------------------ for day ----------------*/
    
          sday.setBounds(510,10,150,40);
           p.add(sday);
    
          d1.setBounds(350,65,50,20);
          p.add(d1);
          d2.setBounds(405,65,50,20);
          p.add(d2);
          d3.setBounds(460,65,50,20);
          p.add(d3);
          d4.setBounds(515,65,50,20);
          p.add(d4);
          d5.setBounds(570,65,50,20);
          p.add(d5);
          d6.setBounds(625,65,50,20);
          p.add(d6);
              d7.setBounds(680,65,50,20);
          p.add(d7);
          d8.setBounds(735,65,50,20);
          p.add(d8);
   
         d9.setBounds(350,100,50,20);
          p.add(d9);
          d10.setBounds(405,100,50,20);
          p.add(d10);
           d11.setBounds(460,100,50,20);
          p.add(d11);
           d12.setBounds(515,100,50,20);
          p.add(d12);
          d13.setBounds(570,100,50,20);
          p.add(d13);
          d14.setBounds(625,100,50,20);
          p.add(d14);
         d15.setBounds(680,100,50,20);
          p.add(d15);
         d16.setBounds(735,100,50,20);
         p.add(d16);
        
           d17.setBounds(350,135,50,20);
          p.add(d17);
          d18.setBounds(405,135,50,20);
          p.add(d18);
           d19.setBounds(460,135,50,20);
          p.add(d19);
           d20.setBounds(515,135,50,20);
          p.add(d20);
          d21.setBounds(570,135,50,20);
          p.add(d21);
          d22.setBounds(625,135,50,20);
          p.add(d22);
         d23.setBounds(680,135,50,20);
          p.add(d23);
         d24.setBounds(735,135,50,20);
          p.add(d24);
    
          d25.setBounds(350,170,50,20);
          p.add(d25);
          d26.setBounds(405,170,50,20);
          p.add(d26);
           d27.setBounds(460,170,50,20);
          p.add(d27);
           d28.setBounds(515,170,50,20);
          p.add(d28);
          d29.setBounds(570,170,50,20);
          p.add(d29);
          d30.setBounds(625,170,50,20);
          p.add(d30);
         d31.setBounds(680,170,50,20);
          p.add(d31);
          
        b1.setBounds(30,500,80,25);
        p.add(b1);
        b2.setBounds(610,500,80,25);
        p.add(b2);
        b3.setBounds(700,500,80,25);
        p.add(b3);
       
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        m8.addActionListener(this);
        m9.addActionListener(this);
        m10.addActionListener(this);
        m11.addActionListener(this);
        m12.addActionListener(this);
        d1.addActionListener(this);
        d2.addActionListener(this);
        d3.addActionListener(this);
        d4.addActionListener(this);
        d5.addActionListener(this);
        d6.addActionListener(this);
        d7.addActionListener(this);
        d8.addActionListener(this);
        d9.addActionListener(this);
        d10.addActionListener(this);
        d11.addActionListener(this);
        d12.addActionListener(this);
        d13.addActionListener(this);
        d14.addActionListener(this);
        d15.addActionListener(this);
        d16.addActionListener(this);
        d17.addActionListener(this);
        d18.addActionListener(this);
        d19.addActionListener(this);
        d20.addActionListener(this);
        d21.addActionListener(this);
        d22.addActionListener(this);
        d23.addActionListener(this);
        d24.addActionListener(this);
        d25.addActionListener(this);
        d26.addActionListener(this);
        d27.addActionListener(this);
        d28.addActionListener(this);
        d29.addActionListener(this);
        d30.addActionListener(this);
        d31.addActionListener(this);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.setLocation(100,50);
        f.setResizable(false);
        f.setSize(820,580);
        f.setVisible(true);
}
     public void actionPerformed(ActionEvent evt)
     {
              if(evt.getSource()==m1)
             {
                 d29.setEnabled(true);  
                 d30.setEnabled(true); 
                 d31.setEnabled(true);   
                 t2.setText("Jan");
                 }
                if(evt.getSource()==m2)
                 {
                       d29.setEnabled(false);  
                   d30.setEnabled(false); 
                       d31.setEnabled(false); 
                       t2.setText("Feb");
                 }       
                 if(evt.getSource()==m3)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                   d31.setEnabled(true); 
                   t2.setText("Mar");  
                 } 
                 if(evt.getSource()==m4)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(false);              
                       t2.setText("Apr");
                 }
                 if(evt.getSource()==m5)
                 {
              d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(true);              
                   t2.setText("May");
                 }
                 if(evt.getSource()==m6)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(false);              
                   t2.setText("Jun");
                 } 
                 if(evt.getSource()==m7)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(true);              
                   t2.setText("Jul");
                 }
                 if(evt.getSource()==m8)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(true);      
                   t2.setText("Aug");        

                 }
                 if(evt.getSource()==m9)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(false);              
                   t2.setText("Sep");
                 }
                 if(evt.getSource()==m10)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(true);              
                   t2.setText("Oct");
                 }
                 if(evt.getSource()==m11)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(false);              
                   t2.setText("Nov");
                 }
                 if(evt.getSource()==m12)
                 {
                       d29.setEnabled(true);  
                       d30.setEnabled(true); 
                       d31.setEnabled(true);              
                   t2.setText("Dec");
                 }
                 if(evt.getSource()==d1)
                 {
                       t1.setText("1");
                 }
                 if(evt.getSource()==d2)
                 {
                       t1.setText("2");
                 } 
                 if(evt.getSource()==d3)
                 {
                       t1.setText("3");
                 }
                 if(evt.getSource()==d4)
                 {
                       t1.setText("4");
                 }
                 if(evt.getSource()==d1)
                 {
                       t1.setText("1");
                 } 
                 if(evt.getSource()==d5)
                 {
                       t1.setText("5");
                 }
                 if(evt.getSource()==d6)
                 {
                       t1.setText("6");
                 }
                 if(evt.getSource()==d7)
                 {
                       t1.setText("7");
                 }
                 if(evt.getSource()==d8)
                 {
                       t1.setText("8");
                 }
                 if(evt.getSource()==d9)
                 {
                       t1.setText("9");
                 }
                 if(evt.getSource()==d10)
                 {
                       t1.setText("10");
                 }
                 if(evt.getSource()==d11)
                 {
                       t1.setText("11");
                 } 
                 if(evt.getSource()==d12)
                 {
                       t1.setText("12");
                 }
                 if(evt.getSource()==d13)
                 {
                       t1.setText("13");
                 }
                 if(evt.getSource()==d14)
                 {
                       t1.setText("14");
                 }
                 if(evt.getSource()==d15)
                 {
                       t1.setText("15");
                 }
                 if(evt.getSource()==d16)
                 {
                       t1.setText("16");
                 }
                 if(evt.getSource()==d17)
                 {
                       t1.setText("17");
                 }
                 if(evt.getSource()==d18)
                 {
                       t1.setText("18");
                 }
                 if(evt.getSource()==d19)
              {
                 t1.setText("19");
              }
             if(evt.getSource()==d20)
              {
                 t1.setText("20");
              }
             if(evt.getSource()==d21)
              {
                 t1.setText("21");
              }
             if(evt.getSource()==d22)
              {
                 t1.setText("22");
              }
             if(evt.getSource()==d23)
              {
                 t1.setText("23");
              }
             if(evt.getSource()==d24)
              {
                 t1.setText("24");
              }
             if(evt.getSource()==d25)
              {
                 t1.setText("25");
              }
             if(evt.getSource()==d26)
              {
                 t1.setText("26");
              }
             if(evt.getSource()==d27)
              {
                 t1.setText("27");
              }
             if(evt.getSource()==d28)
              {
                 t1.setText("28");
              }
             if(evt.getSource()==d29)
              {
                 t1.setText("29");
              }
             if(evt.getSource()==d30)
              {
                 t1.setText("30");
              }
    
             if(evt.getSource()==d31)
              {
                 t1.setText("31");
              }
             if(evt.getSource()==b2)
             {
            dayPlanner wrk=new dayPlanner ();
                    f.setVisible(false);
             }
             if(evt.getSource()==b3)
             {
                    System.exit(0);
              }
         if(evt.getSource()==b1)
         { 
                try
                {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
                    PreparedStatement stat=con.prepareStatement("insert into reminder(date,month,text)values(?,?,?)");
                    stat.setString(1,t1.getText());
                    stat.setString(2,t2.getText());
                    stat.setString(3,treminder.getText());
                    stat.executeUpdate();
                }
                catch(Exception ee)
                {
                    System.out.println(ee);
                }             
          }
     }
     public static void main(String p[])
     {
         new addRem();
     }
}

