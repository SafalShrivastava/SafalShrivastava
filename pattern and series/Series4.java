import java.util.Scanner;

//Tech Number 
public class Series4 {
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a,b,m,n;
     int count=0;
     n=sc.nextInt();
     a=n;
     b=n;
     while(a>0)
     {
        a=a/10;
        count++;
     }
     int Frist=(int)(b%Math.pow(10, count/2));
     int last=(int)(b/Math.pow(10, count/2));
     int sum=Frist+last;
     int Square=sum*sum;
     if (Square==n) {
        System.out.println("no is tech");
     } else {
        System.out.println("no is not tech ");
     }
    }
}

