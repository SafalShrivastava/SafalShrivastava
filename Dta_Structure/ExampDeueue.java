import java.util.ArrayDeque;
import java.util.Deque;

public class ExampDeueue {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("gautam");
        deque.add("karan");
        deque.add("ajay");
        //treversing elements
        for(String str:deque)
        {
            System.out.println(str);
        }
    }
}
