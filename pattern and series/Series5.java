import java.util.ArrayList;
import java.util.Scanner;

public class Series5 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
  int a,b,m,n,count=0;
      n=sc.nextInt();
      a=n*2;
      b=n*3;
      String c=Integer.toString(n);
      String d=Integer.toString(a);
      String e=Integer.toString(b);
       String con=c+d+e;
       ArrayList<Character> li=new ArrayList<Character>();
       for (int i = 0; i < con.length(); i++) {
         char ch=con.charAt(i);
         for (int j = '1'; j <='9'; j++) {
            if(ch==j){
            if(! li.contains(ch))
            {
                li.add(ch);
            }
         }
        }
    }
        if (li.size()==9) {
           System.out.println("Fascinating num");
        } else {
           System.out.println("not an Fascinating num");
        }
    }
}        
            
