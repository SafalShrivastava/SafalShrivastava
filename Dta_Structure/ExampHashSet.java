import java.util.HashSet;

public class ExampHashSet {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<String>();
        hs.add("frist");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println("Is hashset empty"+hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of hashset"+hs.size());
        System.out.println("Does hashset contains frist element"+hs.contains("frist"));
    }
}
