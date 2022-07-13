import java.util.Arrays;
import java.util.List;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //create an array of string
        String a[]=new String[]{"abc","klm","pqr","xyz"};
       //String a[]={"abc","klm","pqr","xyz"};
        List list1=Arrays.asList(a);
        //printing the lis
        System.out.println("the list is"+list1);
    }
}
