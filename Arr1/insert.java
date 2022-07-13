import java.util.Scanner;

public class insert {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();//size
    int num=sc.nextInt();//value to be add
    int p=sc.nextInt();//position of number
    int a[]=new int[n+1];
    for (int i = 0; i < n; i++) {
        a[i]=sc.nextInt();//no series
    }
    for (int i = n-1; i >= p-1;i-- ) {
        a[i+1]=a[i];
    }
    a[p-1]=num;      
    for(int i=0;i<=n;i++)
    {
        System.out.println(a[i]);
    }
}
}
