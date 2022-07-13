import java.util.TreeSet;

public class DS7 {
   public static void main(String[] args) {
       TreeSet<String> ts=new TreeSet<String>();
       ts.add("one"); ts.add("two");ts.add("three");
       System.out.println("Elements"+ts);
       ts.clear();
       System.out.println("ts set empty"+ts.isEmpty());
       ts.add("one"); ts.add("two");ts.add("three");
       System.out.println("size of the set"+ts.size());
       ts.remove("two");
       System.out.println("Elements"+ts);
   } 
}
