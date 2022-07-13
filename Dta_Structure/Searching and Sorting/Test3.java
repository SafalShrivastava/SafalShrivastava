import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={1,2,3};
        int arr3[]=arr2;
        if(Arrays.equals(arr1,arr2))
        System.out.println("Same");
        else
        System.out.println("Not Same");
        String a="hello";
        String b="hello";
        System.out.println(a.equals(b));

    }
}
