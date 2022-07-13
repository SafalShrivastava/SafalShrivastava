import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
                 int n;
                 System.out.println("enter no of elements");
                 n=sc.nextInt();
                 int a[]= new int[n];
                 System.out.println("Enter Array Elements");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
       System.out.println("Sorted Array will be:");
       for (int i = 0; i < a.length; i++) {
           System.out.println(a[i]);
       }
    }
}
