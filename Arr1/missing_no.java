import java.util.*;
public class missing_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(a[i]+1 != a[i+1])
            {
                System.out.println(a[i]+1);
            }
        }
    }
}
