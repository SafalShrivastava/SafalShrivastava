import java.util.*;
public class Arrllist2 {
    public static void main(String[] args) {
       int arr[]= new int[]{10,20,30,40,50};
       System.out.println("1st arraylis:");
       for(int value:arr)
              {
           System.out.println(+value);
       }
       Arrays.fill(arr,4,5,18);
       System.out.println("2nd arraylis:");
       for(int value:arr)
              {
           System.out.println(+value);
       }
    }
}
