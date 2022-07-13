import java.util.*;
public class Arr1 {
public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    while (m-->0) {
    int l=sc.nextInt();
    int r=sc.nextInt();
    int count =0;
    for (int i = l; i < r; i++) {
        int t=0;
        t=t+(i%10);
        if (t==2||t==3||t==9) {
            count++;
        } 
    }
    System.out.println(count);
}
    
}
}