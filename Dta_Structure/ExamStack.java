import java.util.Stack;

public class ExamStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("garima");
        stack.push("sikha");
        stack.push("lalu");
        
        System.out.println(stack);
        System.out.println("size"+stack.size());

       // int s=stack.size();
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(i);
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
