import java.util.Arrays;

public class IncreasingNdecreasing {
    public static void main(String[] args) {
        int a[]={7,9,6,1,3,2,8,10};
        Arrays.sort(a);
        int n=a.length;
        for (int i = 0; i <n/2; i++) {
            System.out.print(a[i]);
            }
            for (int j = n-1; j >=n/2; j--) {
                System.out.print(a[j]);
                }
    }
}
