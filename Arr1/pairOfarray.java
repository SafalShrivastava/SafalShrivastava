import java.util.Scanner;

//Write a Java program to find common elements from three sorted (in non-decreasing order) arrays
public class pairOfarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]+a[j]==sum)
                {
                    System.out.println(a[i]+" + "+a[j]+" = "+sum);
                }
            }
        }
    }
}
