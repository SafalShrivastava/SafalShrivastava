import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.border.Border;

public class Practice2 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JPanel p=new JPanel(new BorderLayout());
        JTextField t= new JTextField();
        JCheckBox c=new JCheckBox();

        JButton b1=new JButton("Button b1");
        JButton b2=new JButton("Button b2");
        JButton b3=new JButton("Button b3");
        

        p.add(b1, BorderLayout.EAST);
        p.add(b2, BorderLayout.WEST);
        p.add(b3, BorderLayout.NORTH);
        p.add(t, BorderLayout.CENTER);
        p.add(c, BorderLayout.SOUTH);
        a.add(p);

        a.setSize(400,400);
        a.setVisible(true);

    }
}
