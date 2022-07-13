public class Patt7 {

    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            for (int j = 2*i; j < 2*5; j++) {
                System.out.print(" ");
            }
                for (int j2 = 0; j2 <=i; j2++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();          
            
        }

        for (int i=1; i < 5; i++) {
            for (int j = 0; j < 2*i+2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <5; j++) {
                System.out.print("* ");
            }
            for (int j = i+1; j <5; j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }*/
        for (int i = 0; i < 5; i++) {
            for (int j = 2*i; j < 2*5;j++) {
                System.out.print( " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= 2*i+2; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print( "* ");
            }
            for (int j = i+1; j < 5; j++) {
                    System.out.print( "* ");
            }
            System.out.println(" ");
        }
    }
}
