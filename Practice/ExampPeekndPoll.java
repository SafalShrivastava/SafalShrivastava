import java.util.LinkedList;

public class ExampPeekndPoll {
    public static void main(String[] args) {
        LinkedList<String>pq=new LinkedList<>();
        pq.push("a");
        pq.push("b");
        pq.push("c");
        System.out.println(pq.poll()+" "+pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        
    }
}
