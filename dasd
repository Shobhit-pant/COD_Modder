[33mcommit 96480f2ca4a5c72966a5b0e569d92e530eae31b0[m
Author: Shobhit Pant <Shobhitpant01@gmail.com>
Date:   Tue May 26 13:47:24 2015 +0530

    Added Modder.java

[1mdiff --git a/Modder.java b/Modder.java[m
[1mnew file mode 100644[m
[1mindex 0000000..b6dd838[m
[1m--- /dev/null[m
[1m+++ b/Modder.java[m
[36m@@ -0,0 +1,188 @@[m
[32m+[m
[32m+[m
[32m+[m[32mimport java.io.*;[m
[32m+[m[32mimport java.awt.*;[m
[32m+[m[32mimport java.awt.event.*;[m
[32m+[m
[32m+[m[32mimport javax.swing.*;[m
[32m+[m
[32m+[m[32mpublic class PassSaver[m
[32m+[m[32m{[m
[32m+[m
[32m+[m[32mJButton b1,b2,b3,b4,b5,b6;[m
[32m+[m[32mJPanel p0,p1,p2,p3,p4;[m
[32m+[m[32mJFrame frame;[m
[32m+[m[32mJLabel l1,l2,l3;[m
[32m+[m[32mJTextArea t1,t2,t3;[m
[32m+[m[32mJList list;[m
[32m+[m
[32m+[m
[32m+[m[32mString seeker;[m
[32m+[m
[32m+[m[32mpublic static void main(String args[])[m
[32m+[m[32m{[m
[32m+[m
[32m+[m[32mPassSaver abc=new PassSaver();[m
[32m+[m[32mabc.go();[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mpublic void go()[m
[32m+[m[32m{[m
[32m+[m
[32m+[m[32mString[] listContents={"gmail.com","yahoo.com","hotmail.com"};[m
[32m+[m
[32m+[m[32mframe=new JFrame("Password Saver Advanced- by SHOBHIT");[m
[32m+[m
[32m+[m[32mp0=new JPanel();[m
[32m+[m[32mp1=new JPanel();[m
[32m+[m[32mp2=new JPanel();[m
[32m+[m[32mp3=new JPanel();[m
[32m+[m[32mp4=new JPanel();[m
[32m+[m
[32m+[m[32ml1=new JLabel("Username");[m
[32m+[m[32ml2=new JLabel("Password");[m
[32m+[m[32ml3=new JLabel("Website ");[m
[32m+[m
[32m+[m[32mb1=new JButton("Save");[m
[32m+[m[32mb2=new JButton("Clear All");[m
[32m+[m[32mb3=new JButton("Clear Field");[m
[32m+[m[32mb4=new JButton("Clear Field");[m
[32m+[m[32mb5=new JButton("Clear Field");[m
[32m+[m[32mb6=new JButton("");[m
[32m+[m
[32m+[m[32mt1=new JTextArea(1,20);[m
[32m+[m[32mt2=new JTextArea(1,20);[m
[32m+[m[32mt3=new JTextArea(1,20);[m
[32m+[m
[32m+[m[32mlist=new JList(listContents);[m
[32m+[m
[32m+[m
[32m+[m[32mb3.addActionListener(new WebsiteActionListener());[m
[32m+[m[32mb4.addActionListener(new UsernameActionListener());[m
[32m+[m[32mb5.addActionListener(new PasswordActionListener());[m
[32m+[m[32mb2.addActionListener(new B2ActionListener());[m
[32m+[m[32mb1.addActionListener(new SaveActionListener());[m
[32m+[m
[32m+[m[32mp1.add(l3);[m
[32m+[m[32mp1.add(t3);[m
[32m+[m[32mp1.add(b5);[m
[32m+[m[32mp2.add(l1);[m
[32m+[m[32mp2.add(t1);[m
[32m+[m[32mp2.add(b3);[m
[32m+[m[32mp3.add(l2);[m
[32m+[m[32mp3.add(t2);[m
[32m+[m[32mp3.add(b4);[m
[32m+[m[32mp4.add(b1);[m
[32m+[m[32mp4.add(b2);[m
[32m+[m[32mp4.add(b6);[m
[32m+[m
[32m+[m
[32m+[m[32mp0.setLayout(new BoxLayout(p0,BoxLayout.Y_AXIS));[m
[32m+[m[32mp0.add(p1);[m
[32m+[m[32mp0.add(p2);[m
[32m+[m[32mp0.add(p3);[m
[32m+[m[32mp0.add(p4);[m
[32m+[m[32mp0.add(list);[m
[32m+[m
[32m+[m
[32m+[m
[32m+[m
[32m+[m[32mframe.getContentPane().add(BorderLayout.NORTH,p0);[m
[32m+[m[32mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);[m
[32m+[m[32mframe.setSize(400,300);[m
[32m+[m[32mframe.setVisible(true);[m
[32m+[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mclass WebsiteActionListener implements ActionListener[m
[32m+[m[32m{[m
[32m+[m[32mpublic void actionPerformed(ActionEvent e)[m
[32m+[m[32m{[m
[32m+[m[32mt1.setText("");[m
[32m+[m[32m}[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mclass UsernameActionListener implements ActionListener[m
[32m+[m[32m{[m
[32m+[m[32mpublic void actionPerformed(ActionEvent e)[m
[32m+[m[32m{[m
[32m+[m[32mt2.setText("");[m
[32m+[m[32m}[m
[32m+[m[32m}[m
[32m+[m[41m [m
[32m+[m[32mclass PasswordActionListener implements ActionListener[m
[32m+[m[32m{[m
[32m+[m[32mpublic void actionPerformed(ActionEvent e)[m
[32m+[m[32m{[m
[32m+[m[32mt3.setText("");[m
[32m+[m[32m}[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mclass B2ActionListener implements ActionListener[m
[32m+[m[32m{[m
[32m+[m[32mpublic void actionPerformed(ActionEvent e)[m
[32m+[m[32m{[m
[32m+[m[32mt1.setText("");[m
[32m+[m[32mt2.setText("");[m
[32m+[m[32mt3.setText("");[m
[32m+[m[32m}[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mclass SaveActionListener implements ActionListener[m
[32m+[m[32m{[m
[32m+[m[32mpublic void actionPerformed(ActionEvent e)[m
[32m+[m[32m{[m
[32m+[m
[32m+[m[32mSystem.out.println(t1.getText());[m
[32m+[m[32mSystem.out.println(t2.getText());[m
[32m+[m[32mSystem.out.println(t3.getText());[m
[32m+[m
[32m+[m[32mtry[m
[32m+[m[32m{[m
[32m+[m[32mFile file=new File("usp.txt");[m
[32m+[m
[32m+[m[32mif (!file.exists())[m
[32m+[m[32m{[m
[32m+[m[32mfile.createNewFile();[m[41m [m
[32m+[m[32mFileWriter tempFOS= new FileWriter(file,true);[m
[32m+[m[32mString tempString="gmail.com\n\nyahoo.com\n\nhotmail.com";[m
[32m+[m[32mtempFOS.write(tempString);[m
[32m+[m[32mtempFOS.close();[m
[32m+[m[32m}[m
[32m+[m
[32m+[m
[32m+[m[32mBufferedReader br=new BufferedReader(new FileReader(file));[m
[32m+[m[32mFileWriter fOS;[m
[32m+[m
[32m+[m
[32m+[m[32mwhile((seeker=br.readLine())!=null)[m
[32m+[m[32m{[m
[32m+[m
[32m+[m[32mfOS= new FileWriter(new File("temp.txt"),true);[m
[32m+[m[32mfOS.write("\n");[m
[32m+[m
[32m+[m[32mif((t3.getText()).equals(seeker))[m
[32m+[m[32m{[m
[32m+[m[32mString toWrite=t1.getText()+"/"+t2.getText();[m
[32m+[m[32mfOS.write("\n");[m
[32m+[m[32mfOS.write(toWrite);[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mfOS.write(seeker);[m
[32m+[m
[32m+[m[32m}[m
[32m+[m[32mfOS.close();[m
[32m+[m
[32m+[m
[32m+[m[32m}[m
[32m+[m[32mcatch(Exception ex)[m
[32m+[m[32m{[m
[32m+[m[32mex.printStackTrace();[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m}[m
[32m+[m
[32m+[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32m}[m

[33mcommit 7ab7f4c2d7ac3cebfc0a2e8a020b53d7596f5f6e[m
Author: Shobhit Pant <Shobhitpant01@gmail.com>
Date:   Tue May 26 13:28:20 2015 +0530

    Added

[1mdiff --git a/newfile.java b/newfile.java[m
[1mnew file mode 100644[m
[1mindex 0000000..e69de29[m
