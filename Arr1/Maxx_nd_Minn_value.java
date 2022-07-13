import java.util.*;
public class Maxx_nd_Minn_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
         int minn=1000;
         int maxx=0;
         for(int i=0;i<n;i++)
         {
            
             a[i]=sc.nextInt();
              if(a[i]<minn)
              {minn=a[i];}
              if (a[i]>maxx) {
                maxx=a[i];
              }
         }
       //  Arrays.sort(a);
       //System.out.println("MInn Value="+a[0]);
       //System.out.println("Maxx Value="+a[n-1]); 
         System.out.println("Minn"+minn);           
         System.out.println("Maxx"+maxx);           
    }
}
