import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a,m,n;
         int sum=0;
         int fact=1;
         n=sc.nextInt();
         a=n;
         while(a>0)
         {
            m=a%10;
            a=a/10;
            for (int i = 1; i <= m; i++) {
                fact=fact*i;
            }
            sum=sum+fact;
          fact=1;
         }
        // System.out.println(sum);
       if (sum==n) {
        System.out.println("number is peterson");
        
       } else {
        System.out.println("number is not peterson");
       }
    }
}
