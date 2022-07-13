import javax.swing.*;
import java.awt.event.*;
public class Converter extends JFrame implements ActionListener {

  JLabel L1;
  JTextField t1;
  JButton b1;
  JTextArea ta1;
  JPanel p1;
  public Converter()
  {
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600,500);
    p1 = new JPanel();
    L1 = new JLabel("Distance in miles");
    t1 = new JTextField(20);
    b1 = new JButton("Convert");
    ta1 =  new JTextArea(10,20);
    JScrollPane js = new JScrollPane(ta1);
    p1.add(L1);
    p1.add(t1);
    p1.add(b1);
    p1.add(js);
    this.add(p1);
    this.setSize(601,501);
    b1.addActionListener(this);
    ta1.setEditable(false);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    double km = Double.parseDouble(t1.getText())*1.6;
    ta1.append(t1.getText()+" equals "+km+" km \n");
  }
  public static void main(String[] args) {
    
new Converter();
  }

}