import java.util.LinkedList;

//import javax.swing.plaf.synth.SynthSeparatorUI;

public class DS8 {
    public static void main(String[] args) {
        LinkedList<String> tt=new LinkedList<String>();
        tt.add("orange");
        tt.add("Apple");
        tt.add("Grape");
        tt.add("Banana");
    System.out.println(tt); 
    System.out.println("Size of linklist"+tt.size());
    System.out.println("Linllist is empty"+tt.isEmpty());
    System.out.println("Does linklist contians Grape?"+tt.contains("Grape"));
}
}
