import java.util.Scanner;

/**
 * Series2
 */
public class Series2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,m,a;
    int count=0;
    n=sc.nextInt();
     m=n*n;
     a=n;
     while(a>0)
     {
        a=a/10;
        count++;
     }
     int last=(int)(m%Math.pow(10, count));
//System.out.println(last);
     if (last==n) {
        System.out.println("Automorphic");
     } else {
        System.out.println("Not an Automhorphic");
     }
}
    
    }

