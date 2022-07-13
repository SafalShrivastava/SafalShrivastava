import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

public class DS9 {
    public static void main(String[] args) {
        LinkedList<String> a=new LinkedList<String>();
        a.add("ravi");
        a.add("vijay");
        a.add("Ravi");
    a.add("Ajay");
    Iterator<String > itr=a.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }    }
}
