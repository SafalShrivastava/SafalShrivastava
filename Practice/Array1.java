import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
//         char [] A={'a','b','c','c','d','e','f','g','h','i','j','k'};
//         char [] B=new char[7];
//         System.arraycopy(A,2,B,0,7);
//         System.out.println(B);
//         B=new char[7];
//     System.arraycopy(A,5,B,2,5);   //  2->index element 5-> length
//     // System.arraycopy(src, srcPos, dest, destPos, length);
//     System.out.println(B);
String f[]={"a","b","c","d","e"};
        String  [] g=new String[5];
        System.arraycopy(f,0,g,0,5);
        System.out.println(Arrays.toString(g));
 }
}