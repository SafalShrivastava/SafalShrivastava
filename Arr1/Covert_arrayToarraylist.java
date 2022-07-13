import java.util.ArrayList;
import java.util.Scanner;

public class Covert_arrayToarraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        ArrayList<Integer>b=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            b.add(a[i]);
        }
        System.out.println(b);
    }
}
