import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();//Map map=new HashMap();
        //adding elements to map  
          map.put(1,"Amit");
          map.put(5,"rahul");
          map.put(2,"jai");
          map.put(6,"amit");
          //treversing map
        //   Set set=map.entrySet();
        //   Iterator itr=set.iterator();//->old style
        //   while(itr.hasNext())
        //   {
        //       Map.Entry entry=(Map.Entry)itr.next();
        //       System.out.println(entry.getKey()+""+entry.getValue());
        //   }
        //elements can treverse in any order
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
