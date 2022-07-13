import java.util.Scanner;

public class Search_no {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int a[]=new int[n];
      for (int i = 0; i < n; i++) {
          a[i]=sc.nextInt();
          
        }
        int num =sc.nextInt();
      for (int i = 0; i < n; i++) {
          if(a[i]==num)
          {
              count=1;
         break;
        }
        else{
            count=0;
        }
      }
      if (count==1) {
        System.out.println("yes");
      } else {
        System.out.println("No");
      }
    }
}
