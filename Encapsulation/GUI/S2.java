//Swing without pannel
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class S2{
public static void main(String[] args) {
  JFrame a=new JFrame();//for frame
  JTextField t=new JTextField();
  JCheckBox c=new JCheckBox();
  //for buttons
  JButton b1=new JButton("Button b1");
  JButton b2=new JButton("Button b2");
  JButton b3=new JButton("Button b3");
  JButton b4=new JButton("Button b4");

//button size  and position 
  b1.setBounds(0,0,100,50);//x-axis|y-axis|width|height
  b2.setBounds(0,50,100,50);//x-axis|y-axis|width|height
  b3.setBounds(0,100,100,50);//x-axis|y-axis|width|height
  b4.setBounds(200,0,100,50);//x-axis|y-axis|width|height
  t.setBounds(200,50,100,50);  
  c.setBounds(200,100,20,20);
  //colur for buttons 
  b1.setBackground(Color.red);
  b2.setBackground(Color.blue);
  b3.setBackground(Color.yellow);
  b4.setBackground(Color.black);

  //for addinng buttons in frame 
  a.add(b1);
  a.add(b2);
  a.add(b3);
  a.add(b4);
  a.add(t);
  a.add(c);
  
  //size of frame
  a.setSize(300,300);
  a.setLayout(null);
  a.setVisible(true);
}
}