package perm;


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
JComboBox jcbMap,jcbType;


String seeker;

public static void main(String args[])
{

Modder abc=new Modder();
abc.go();
}

public void go()
{

String[] typeListContents={ 
		"*","TDM_default"
		,"DOM_default"
		,"CTF_default"
		,"DZ_default"
		,"FFA_default"
		,"GG_default"
		,"HQ_default"
		,"INF_default"
		,"JUG_default"
		,"KC_default"
		,"OIC_default"
		,"SAB_default"
		,"SD_default"
		,"TDEF_default"
		,"TJ_default"};



String[] mapListContents=
		{"*","mp_alpha"
		,"mp_bootleg"
		,"mp_bravo"
		,"mp_carbon"
		,"mp_dome"
		,"mp_exchange"
		,"mp_hardhat"
		,"mp_interchange"
		,"mp_lambeth"
		,"mp_mogadishu"
		,"mp_paris"
		,"mp_plaza2"
		,"mp_radar"
		,"mp_seatown"
		,"mp_underground"
		,"mp_village"};

jcbType= new JComboBox<String>(typeListContents);
jcbMap= new JComboBox<String>(mapListContents);
frame=new JFrame("COD MW3 MODDER- by SHOBHIT PANT");

p0=new JPanel();
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
p4=new JPanel();

l1=new JLabel("Name with Location of the recipe file");
l2=new JLabel("[Ex \"c:\\Program Files\\COD MW3\\players2\\default.dspl\"");

b1=new JButton("Save-Clear");
b2=new JButton("Save-Append");

t1=new JTextArea(2,20);



b1.addActionListener(new B1ActionListener());
b2.addActionListener(new SaveActionListener());

p1.add(l1);
p1.add(t1);
p2.add(l2);
p3.add(b1);
p3.add(b2);
p4.add(jcbMap);
p4.add(jcbType);


p0.setLayout(new BoxLayout(p0,BoxLayout.Y_AXIS));
p0.add(p1);
p0.add(p2);
p0.add(p4);
p0.add(p3);




frame.getContentPane().add(BorderLayout.NORTH,p0);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,300);
frame.setVisible(true);

}


class B3ActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
t1.setText("default.dspl");
}
}

class B1ActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
	

System.out.println(t1.getText());

try
{
File file=new File(t1.getText());

if (!file.exists())
{
file.createNewFile(); 
}
FileWriter fOS=new FileWriter(file,false);
String toBeAdded= jcbMap.getSelectedItem()+","+jcbType.getSelectedItem()+",1\n";
fOS.write(toBeAdded);
fOS.close();

}
catch(Exception ex)
{
	ex.printStackTrace();
}
}

}
class SaveActionListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{

System.out.println(t1.getText());

try
{
File file=new File(t1.getText());

if (!file.exists())
{
file.createNewFile(); 
}
FileWriter fOS=new FileWriter(file,true);
String toBeAdded= jcbMap.getSelectedItem()+","+jcbType.getSelectedItem()+",1\n";
fOS.write(toBeAdded);

//
//while((seeker=br.readLine())!=null)
//{
//
//int i=0;
////if(!(seeker.substring()).equals("////"))
//{
//	
//System.out.println("Line "+i+" : "+seeker);
////String toWrite=t1.getText()+"/"+t2.getText();
////fOS.write("\n");
////fOS.write(toWrite);
//}
//
////fOS.write(seeker);
//
//}
fOS.close();


}
catch(Exception ex)
{
ex.printStackTrace();
}

}


}

}
