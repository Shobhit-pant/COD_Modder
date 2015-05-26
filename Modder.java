

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PassSaver
{

JButton b1,b2,b3,b4,b5,b6;
JPanel p0,p1,p2,p3,p4;
JFrame frame;
JLabel l1,l2,l3;
JTextArea t1,t2,t3;
JList list;


String seeker;

public static void main(String args[])
{

PassSaver abc=new PassSaver();
abc.go();
}

public void go()
{

String[] listContents={"gmail.com","yahoo.com","hotmail.com"};

frame=new JFrame("Password Saver Advanced- by SHOBHIT");

p0=new JPanel();
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
p4=new JPanel();

l1=new JLabel("Username");
l2=new JLabel("Password");
l3=new JLabel("Website ");

b1=new JButton("Save");
b2=new JButton("Clear All");
b3=new JButton("Clear Field");
b4=new JButton("Clear Field");
b5=new JButton("Clear Field");
b6=new JButton("");

t1=new JTextArea(1,20);
t2=new JTextArea(1,20);
t3=new JTextArea(1,20);

list=new JList(listContents);


b3.addActionListener(new WebsiteActionListener());
b4.addActionListener(new UsernameActionListener());
b5.addActionListener(new PasswordActionListener());
b2.addActionListener(new B2ActionListener());
b1.addActionListener(new SaveActionListener());

p1.add(l3);
p1.add(t3);
p1.add(b5);
p2.add(l1);
p2.add(t1);
p2.add(b3);
p3.add(l2);
p3.add(t2);
p3.add(b4);
p4.add(b1);
p4.add(b2);
p4.add(b6);


p0.setLayout(new BoxLayout(p0,BoxLayout.Y_AXIS));
p0.add(p1);
p0.add(p2);
p0.add(p3);
p0.add(p4);
p0.add(list);




frame.getContentPane().add(BorderLayout.NORTH,p0);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,300);
frame.setVisible(true);

}

class WebsiteActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t1.setText("");
}
}

class UsernameActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t2.setText("");
}
}
 
class PasswordActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t3.setText("");
}
}

class B2ActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}

class SaveActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{

System.out.println(t1.getText());
System.out.println(t2.getText());
System.out.println(t3.getText());

try
{
File file=new File("usp.txt");

if (!file.exists())
{
file.createNewFile(); 
FileWriter tempFOS= new FileWriter(file,true);
String tempString="gmail.com\n\nyahoo.com\n\nhotmail.com";
tempFOS.write(tempString);
tempFOS.close();
}


BufferedReader br=new BufferedReader(new FileReader(file));
FileWriter fOS;


while((seeker=br.readLine())!=null)
{

fOS= new FileWriter(new File("temp.txt"),true);
fOS.write("\n");

if((t3.getText()).equals(seeker))
{
String toWrite=t1.getText()+"/"+t2.getText();
fOS.write("\n");
fOS.write(toWrite);
}

fOS.write(seeker);

}
fOS.close();


}
catch(Exception ex)
{
ex.printStackTrace();
}

}


}

}
