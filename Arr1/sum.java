import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        double a[]=new double[n];
        double sum=0;
        for (int i = 0; i < n ;i++) {
            a[i]=sc.nextInt();
             sum+=a[i];
        } 
        //double avg=sum/n;
        //System.out.println(avg);
       System.out.println(sum);
    }
}
