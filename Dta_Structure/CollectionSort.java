
import java.util.*;


public class CollectionSort {
    public static void main(String[] args) {
        Integer[] numbers =new Integer[]{12,14,5,18,19,4,8};
        List<Integer> obj=Arrays.asList(numbers);
     Collections.sort(obj);
     System.out.println(obj);

     Collections.sort(obj,Collections.reverseOrder());
     System.out.println(obj);
  }
}
