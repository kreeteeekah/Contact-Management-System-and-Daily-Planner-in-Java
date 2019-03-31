import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class tictictoe extends JApplet implements ActionListener
{
JPanel p;
JLabel l1,l2;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
GridBagLayout gb;
GridBagConstraints gbc;
JOptionPane p1;
String msg,msg1;
int x=0;
Font f,f1;
int i,j;
public void init()
{
p =new JPanel();
gb= new GridBagLayout();
gbc =new GridBagConstraints();
i=0;
b1= new JButton("  ");
b2= new JButton("  ");
b3= new JButton("  ");
b4= new JButton("  ");
b5= new JButton("  ");
b6= new JButton("  ");
b7= new JButton("  ");
b8= new JButton("  ");
b9= new JButton("  ");
f= new Font("Comic Sans MS",Font.BOLD,26);
f1= new Font("Comic Sans MS",Font.BOLD,20);

b10 = new JButton("start");
l1=new JLabel("PLAYER 1  '0'  ");
l2=new JLabel("  PLAYERD 2  '*'");
l1.setFont(f1);
l2.setFont(f1);
l1.setForeground(Color.blue);
l2.setForeground(Color.yellow);
getContentPane().add(p);
p.setLayout(gb);
gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=0;
gbc.gridy=0;
gb.setConstraints(l1,gbc);
p.add(l1);


gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=1;
gbc.gridy=0;
gb.setConstraints(l2,gbc);
p.add(l2);



gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=6;
gbc.gridy=7;
gb.setConstraints(b1,gbc);
p.add(b1);


gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=11;
gbc.gridy=7;
gb.setConstraints(b2,gbc);
p.add(b2);


gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=16;
gbc.gridy=7;
gb.setConstraints(b3,gbc);
p.add(b3);



gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=6;
gbc.gridy=12;
gb.setConstraints(b4,gbc);
p.add(b4);


gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=11;
gbc.gridy=12;
gb.setConstraints(b5,gbc);
p.add(b5);



gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=16;
gbc.gridy=12;
gb.setConstraints(b6,gbc);
p.add(b6);



gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=6;
gbc.gridy=17;
gb.setConstraints(b7,gbc);
p.add(b7);

gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=11;
gbc.gridy=17;
gb.setConstraints(b8,gbc);
p.add(b8);



gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=16;
gbc.gridy=17;
gb.setConstraints(b9,gbc);
p.add(b9);



gbc.anchor=GridBagConstraints.NORTHWEST;
gbc.gridx=210;
gbc.gridy=200;
gb.setConstraints(b10,gbc);
p.add(b10);
b1.setFont(f);
b2.setFont(f);
b3.setFont(f);
b4.setFont(f);
b5.setFont(f);
b6.setFont(f);
b7.setFont(f);
b8.setFont(f);
b9.setFont(f);
b10.setFont(f);


b10.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b1.setEnabled(false);
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
}
public void actionPerformed(ActionEvent evt)
{
if(evt.getSource()==b10)
{
//msg=b10.getLabel();
msg="*";

b10.setEnabled(false);
b1.setEnabled(true);
b2.setEnabled(true);
b3.setEnabled(true);
b4.setEnabled(true);
b5.setEnabled(true);
b6.setEnabled(true);
b7.setEnabled(true);
b8.setEnabled(true);
b9.setEnabled(true);
//setlabels();
}
//System.out.println(msg);

if(evt.getSource()==b1)
{
i=i+1;
if(msg.equals("*"))
{
msg="o";
b1.setBackground(Color.cyan);
b1.setLabel(msg);
}
else
{
msg="*";
b1.setLabel(msg);
b1.setBackground(Color.yellow);
}
b1.setEnabled(false);
if(b1.getLabel().equals(b2.getLabel())&& b1.getLabel().equals(b3.getLabel()))
{
message();
}
if(b1.getLabel().equals(b4.getLabel())&& b1.getLabel().equals(b7.getLabel()))
{
message();
}
if(b1.getLabel().equals(b5.getLabel())&& b1.getLabel().equals(b9.getLabel()))
{
message();
}

check();

}
if(evt.getSource()==b2)
{

if(msg.equals("*"))
{
msg="o";
b2.setBackground(Color.cyan);
b2.setLabel(msg);
}
else
{
msg="*";
b2.setLabel(msg);
b2.setBackground(Color.yellow);
}
b2.setEnabled(false);
i=i+1;
//msg="  ";
if(b1.getLabel().equals(b2.getLabel())&& b1.getLabel().equals(b3.getLabel()))
{
message();


}
if(b2.getLabel().equals(b5.getLabel())&& b2.getLabel().equals(b8.getLabel()))
{
message();

}

check();

}
if(evt.getSource()==b3)
{

if(msg.equals("*"))
{
msg="o";
b3.setBackground(Color.cyan);
b3.setLabel(msg);
}
else
{
msg="*";
b3.setLabel(msg);
b3.setBackground(Color.yellow);
}
b3.setEnabled(false);
i=i+1;
if(b1.getLabel().equals(b2.getLabel())&& b1.getLabel().equals(b3.getLabel()))
{

message();
}
if(b3.getLabel().equals(b6.getLabel())&& b3.getLabel().equals(b9.getLabel()))
{
message();
}

if(b3.getLabel().equals(b5.getLabel())&& b3.getLabel().equals(b7.getLabel()))
{
message();
}
check();
}
if(evt.getSource()==b4)
{

if(msg.equals("*"))
{
msg="o";
b4.setBackground(Color.cyan);
b4.setLabel(msg);
}
else
{
msg="*";
b4.setBackground(Color.yellow);
b4.setLabel(msg);
}
b4.setEnabled(false);
i=i+1;

if(b4.getLabel().equals(b5.getLabel())&& b4.getLabel().equals(b6.getLabel()))
{
message();

}
if(b1.getLabel().equals(b4.getLabel())&& b1.getLabel().equals(b7.getLabel()))
{
message();

}
check();
}

if(evt.getSource()==b5)
{

if(msg.equals("*"))
{
msg="o";
b5.setBackground(Color.cyan);

b5.setLabel(msg);
}
else
{
msg="*";
b5.setBackground(Color.yellow);
b5.setLabel(msg);
}
b5.setEnabled(false);
i=i+1;
if(b4.getLabel().equals(b5.getLabel())&& b4.getLabel().equals(b6.getLabel()))
{
message();

}
if(b2.getLabel().equals(b5.getLabel())&& b2.getLabel().equals(b8.getLabel()))
{
message();
}
if(b1.getLabel().equals(b5.getLabel())&& b1.getLabel().equals(b9.getLabel()))
{
message();
}



if(b3.getLabel().equals(b5.getLabel())&& b3.getLabel().equals(b7.getLabel()))
{
message();
}
check();
}
if(evt.getSource()==b6)
{

if(msg.equals("*"))
{
msg="o";
b6.setBackground(Color.cyan);
b6.setLabel(msg);
}
else
{
msg="*";
b6.setBackground(Color.yellow);
b6.setLabel(msg);
}
b6.setEnabled(false);
i=i+1;
if(b4.getLabel().equals(b5.getLabel())&& b4.getLabel().equals(b6.getLabel()))
{
message();

}
if(b3.getLabel().equals(b6.getLabel())&& b3.getLabel().equals(b9.getLabel()))
{
message();
}
check();
}
if(evt.getSource()==b7)
{

if(msg.equals("*"))
{
msg="o";
b7.setBackground(Color.cyan);
b7.setLabel(msg);
}
else
{
msg="*";
b7.setBackground(Color.yellow);
b7.setLabel(msg);
}
b7.setEnabled(false);
i=i+1;
if(b7.getLabel().equals(b8.getLabel())&& b7.getLabel().equals(b9.getLabel()))
{
message();

}
if(b1.getLabel().equals(b4.getLabel())&& b1 .getLabel().equals(b7.getLabel()))
{
message();

}


if(b3.getLabel().equals(b5.getLabel())&& b3.getLabel().equals(b7.getLabel()))
{
message();
}
check();
}
if(evt.getSource()==b8)
{

if(msg.equals("*"))
{
msg="o";
b8.setBackground(Color.cyan);
b8.setLabel(msg);

}
else
{
msg="*";
b8.setBackground(Color.yellow);
b8.setLabel(msg);
}
b8.setEnabled(false);
i=i+1;
if(b7.getLabel().equals(b8.getLabel())&& b7.getLabel().equals(b9.getLabel()))
{
message();
}

if(b2.getLabel().equals(b5.getLabel())&& b2.getLabel().equals(b8.getLabel()))
{
message();
}
check();
}
if(evt.getSource()==b9)
{

if(msg.equals("*"))
{
msg="o";
b9.setBackground(Color.cyan);
b9.setLabel(msg);
}
else
{
msg="*";
b9.setBackground(Color.yellow);
b9.setLabel(msg);
}
b9.setEnabled(false);
i=i+1;
if(b7.getLabel().equals(b8.getLabel())&& b7.getLabel().equals(b9.getLabel()))
{
message();

}


if(b3.getLabel().equals(b6.getLabel())&& b3.getLabel().equals(b9.getLabel()))
{
message();
}
if(b1.getLabel().equals(b5.getLabel())&& b1.getLabel().equals(b9.getLabel()))
{
message();
}
check();
}
}
public void message()
{
x=1;
j=i%2;

if(j==0)
{
msg1="player 2";
}
else
{
msg1="player 1";
}

p1.showMessageDialog(null, msg1 + " WON THE GAME  ","message1",2);

b1.setEnabled(false);
b2.setEnabled(false);
b3.setEnabled(false);
b4.setEnabled(false);
b5.setEnabled(false);
b6.setEnabled(false);
b7.setEnabled(false);
b8.setEnabled(false);
b9.setEnabled(false);
b10.setEnabled(false);
//b10.setEnabled(true);

}
public void check()
{

if(i==9 && x==0)
{
p1.showMessageDialog(null,  "  GAME DRAW  ","message1",2);
// a
//b10.setEnabled(true);
}

}
/*public void setlabels()
{
b1.setLabel(" ");
b2.setLabel(" ");
b3.setLabel(" ");
b4.setLabel(" ");
b5.setLabel(" ");
b6.setLabel(" ");
b7.setLabel(" ");
b8.setLabel(" ");
b9.setLabel(" ");
}*/
}






