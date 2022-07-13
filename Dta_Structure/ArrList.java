//import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrList {
    public static void main(String[] args) {
      //int arr1[]=new int[]{1,5,55};
     int[]arr1={1,5,55};
      System.out.println("Arraylist 1 is:");
      for(int i=0;i<arr1.length;i++)
      {
          System.out.println(arr1[i]);
      }
     int[] arr2=Arrays.copyOf(arr1,5);
     arr2[3]=66;
     arr2[4]=99;
     System.out.println("the new array list is:");
     for(int i=0;i<arr2.length;i++)
     {
       System.out.println(arr2[i]);
     }
        }
}
