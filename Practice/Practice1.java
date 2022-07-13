import java.awt.Color;
import javax.swing.JButton;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Practice1 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JCheckBox c=new JCheckBox();
        JTextField t=new JTextField();

        //Buttons
        JButton b1=new JButton("Button b1");
        JButton b2=new JButton("Button b2");
        JButton b3=new JButton("Button b3");
        JButton b4=new JButton("Button b4");

        //size and postion
        b1.setBounds(0,0,150,50);
        b2.setBounds(0,50,150,50);
        b3.setBounds(0,100,150,50);
        b4.setBounds(0,150,150,50);
        c.setBounds(0,200,150,50);
        t.setBounds(0,250,150,50);
        
        //color
        b1.setBackground(Color.ORANGE);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.BLACK);
        b4.setBackground(Color.PINK);
    
        a.add(b1);
        a.add(b2);
        a.add(b3);
        a.add(b4);
        a.add(c);
        a.add(t);

        a.setSize(500,600);
        a.setLayout(null);
        a.setVisible(true);
    }
}
