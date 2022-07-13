public class Patt8 {
    public static void main(String[] args) {
        for (int i = 3; i < 7; i++) {
            for (int j = 3; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
        for (int i = 5; i >=3; i--) {
            for (int j = 3; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
