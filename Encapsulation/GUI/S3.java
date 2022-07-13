import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class S3 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JPanel p=new JPanel(new BorderLayout());
        JCheckBox c=new JCheckBox();
        JTextField t=new JTextField();
        
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        

        p.add(b1, BorderLayout.EAST);        
        p.add(b2, BorderLayout.WEST);        
        p.add(b3, BorderLayout.NORTH);   
        p.add(c, BorderLayout.SOUTH);
        p.add(t, BorderLayout.CENTER);
        a.add(p);
        a.setSize(300,300);    
        a.setVisible(true); 

       }
}
