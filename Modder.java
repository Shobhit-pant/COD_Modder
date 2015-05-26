

import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Modder
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

l1=new JLabel("Name with Location of the recipe file");
l2=new JLabel("[Ex "c:\Program Files\COD MW3\players2\default.dspl"");
l3=new JLabel("You will use this in making your server ! ");

b1=new JButton("Save");
b2=new JButton("Clear All");
b3=new JButton("Clear Field");
b4=new JButton("");

t1=new JTextArea(1,20);
t2=new JTextArea(1,20);
t3=new JTextArea(1,20);

list=new JList(listContents);


b3.addActionListener(new B3ActionListener());
b2.addActionListener(new B2ActionListener());
b1.addActionListener(new SaveActionListener());

p1.add(l1);
p1.add(t1);
p2.add(l2);
p3.add(l3);
p4.add(b1);
p4.add(b2);
p4.add(b3);


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

class SaveActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t1.setText("");
}
}

class B3ActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t1.setText("default.dspl");
}
}

class B2ActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t1.setText("");
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
File file=new File(t1.getText());

if (!file.exists())
{
file.createNewFile(); 
FileWriter tempFOS= new FileWriter(file,true);
String tempString="*,tunngle,1";
tempFOS.write(tempString);
tempFOS.close();
}


BufferedReader br=new BufferedReader(new FileReader(file));
FileWriter fOS;


while((seeker=br.readLine())!=null)
{


if(!(t1.getText().substr(0,2)).equals("//"))
{
System.out.println("Burrahahaha");
//String toWrite=t1.getText()+"/"+t2.getText();
//fOS.write("\n");
//fOS.write(toWrite);
}

//fOS.write(seeker);

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
