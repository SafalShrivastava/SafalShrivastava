import java.util.Scanner;

public class Addition2DArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int a[][]=new int [n][m];
        int b[][]=new int [n][m];
        int c[][]=new int [n][m];

        System.out.println("Enter the valuee of a");

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                a[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Enter the valuee of b");

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                b[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("sum =");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j]=a[i][j]+b[i][j];//same as for minus(-)and divide(/) 
                System.out.println(c[i][j]);
            }
        }
    }
}
