import java.util.Scanner;

public class Delete_no {
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
     int n=sc.nextInt();
     int num =sc.nextInt();
     int a[]=new int[n];
     int c=0;
     for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            if(a[i]==num)
            {
                 c=i;
            }
     }
     for (int i = c ; i < n-1; i++) {
        a[i]=a[i]+1;
    
     }
    for (int i = 0; i < n-1; i++) {
        System.out.println(a[i]);
    }
  }  
}
