import java.util.*;
public class DS6 {
    public static void main(String[] args) {
        //craeate a new emopty stack
        Stack lifo=new Stack();
        for(int i=0;i<=10;i++)
        {
      lifo.push(new Integer(i));
      while(lifo.empty())
      {
          System.out.println(lifo.pop());
          
          System.out.println('.');
          
      }
      System.out.println("Lift off");
        }
    }
}
