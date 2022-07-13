import java.util.Scanner;

public class Series6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,a,sum=0;
        n=sc.nextInt();
        m=n*n;
        while(m>0){
            a=m%10;
             m/=10;
             sum=sum+a;
        }
        if (sum==n) {
            System.out.println("Neon Number");
        } else {
            System.out.println(" Not a Neon Number");

        }
    }
}
