import java.util.*;
public class arraylistToarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>b=new ArrayList<Integer>();
        while(n--> 0)
        {
           int a=sc.nextInt();
           b.add(a);
        }
        int c[]=new int[n];
        b.toArray(c);
    }
}
