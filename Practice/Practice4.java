import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        int i1[]=new int[]{5,4,6,7};
        System.out.println("Numbers are:");

        for(int number:i1)
        {
            System.out.println(+number);
        }
        System.out.println("the array representation is:");
        System.out.println(Arrays.toString(i1));


    }
}
