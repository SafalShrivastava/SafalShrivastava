import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Total no of elements ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            
        }
        Arrays.sort(a);
        System.out.println("Sorted Array =");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter no to be Search");
        int s=sc.nextInt();
         int b=Arrays.binarySearch(a, s);
         System.out.println("Index of Searched number"+s+"-"+b);
           
    }
}
