import java.util.Scanner;

public class Series7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=n+1;
        if(Math.sqrt(m)%1==0){
                System.out.println("Sunny Number ");
        }
        else
        {
     System.out.println("NOt a sunny number");
        }
      }
}
