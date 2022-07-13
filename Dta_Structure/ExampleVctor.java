import java.util.Vector;

public class ExampleVctor {
    public static void main(String[] args) {
        Vector<String>vct=new Vector<String>();
        vct.add("Frist");
        vct.add("Second");
        vct.add("Thrid");
        System.out.println(vct);
        vct.add(2,"Random");
        System.out.println(vct);
        System.out.println("Element at index 3"+vct.get(3));
        System.out.println("the frist element of this vector are"+vct.firstElement());
        System.out.println("the last of this vector is"+vct.lastElement());
        System.out.println("is this vector empty?"+vct.isEmpty());
    }
}
