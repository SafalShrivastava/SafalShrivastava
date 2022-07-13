import java.util.Scanner;

public class index_prog {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();//size of arr
        int num=sc.nextInt();// no to be search
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();//no of series
            if (a[i]==num) {
                System.out.println(i);
            } 
                
            
        }

     }
}
