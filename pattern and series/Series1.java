import java.util.Scanner;

/**
 * Series1
 * REVerse
 */
public class Series1 {

    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);

           int m;
          int rev=0;
         int n=sc.nextInt();
          while (n>0) {
            m=n%10;
            n/=10;
            rev=(rev*10)+m;
          }
        System.out.println(rev);
    }

}
