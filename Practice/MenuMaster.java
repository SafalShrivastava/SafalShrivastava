import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class MenuMaster extends JFrame{
 JPanel p1;
 JLabel l1,l2;
 JTextField t1,t2;
 JButton b1;
  public MenuMaster()
  {
      this.setVisible(true);
      this.setSize(350,150);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      p1=new JPanel();
      l1=new JLabel("item name");
      l2=new JLabel("rate");
      t1=new JTextField(20);
      t1=new JTextField(5);
      b1=new JButton("submit");
      b1.addActionListener((ActionListener) this);
      p1.setBorder(BorderFactory,createTitleBorder("menu master"));
      p1.add(l1);
      p1.add(t1);
      p1.add(l2);
      p1.add(b1);
    this.add(p1);
    this.setSize(331,150);
    
  }
  public void actionperformed(ActionEvent o)
  {
      try{
       DBconnect d=new DBconnect();
       d.queryExecuter("insert into manuemaster values('"+t1.getText()"',"+t2.getText()+")");
       
      }
      catch (Exception ex){

      }
  }
}
