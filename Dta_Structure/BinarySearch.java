import java.util.Arrays;

public class BinarySearch{
  public static void main(String[] args) {
      
    byte byteArr[]={ 1,2,5,55,44 };
    Arrays.sort(byteArr);
    System.out.println("Sorted Array will be :");
    for(byte number: byteArr)
    {
        System.out.println(+number);
    }
       byte searchVal= 55;
       int retval=Arrays.binarySearch(byteArr, searchVal);
       System.out.println("index of 55 will be :"+retval);

}
}