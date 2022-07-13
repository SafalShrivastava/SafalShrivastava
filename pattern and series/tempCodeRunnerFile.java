public class patt5{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
                for (int j = i; j < 5; j++) {
                    System.out.print("* ");
                }
               
                for (int j = 0; j < 4*i; j++) {
                     System.out.print(" ");
                }