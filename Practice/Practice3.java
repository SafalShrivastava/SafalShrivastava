import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Practice3  
{
    JFrame j;
    JLabel a;
    JTextArea b;
    JTextField c;
    JButton d;
    JPanel p;
    JScrollPane js;
    public Practice3(){
        j.setVisible(true);
       j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       j.setSize(500,500);
        p=new JPanel();
        a=new JLabel("Distance in miles ");
     b=new JTextArea(10,20);
     c=new JTextField(20);
     d=new JButton("Convert");
     js=new JScrollPane(b);
     p.add(a);
     p.add(b);
     p.add(c);
     p.add(d);
     j.add(p);

     j.setSize(400,400);
     d.addActionListener((ActionListener) j);
     b.setEditable(false);
    }
    public void actionPerformed(ActionEvent e){
        double km=Double.parseDouble(c.getText())*1.6;
        b.append(c.getText()+"equals"+km+"km\n");
    }
    public static void main(String[] args) {
        new Practice3();
    }

}
