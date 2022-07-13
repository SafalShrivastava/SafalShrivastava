public class patt9 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
             int k=1;
        for (int j = 0; j <i; j++) {
            System.out.print(i);
        
        if (k<i) {
            System.out.print("*");
            k++;
        }
    }
        System.out.println(" ");
        }
        for (int i = 3; i >= 1; i--) {
            int k=1;
            for (int j = 0; j <i; j++) {
                System.out.print(i);
            
            if (k<i) {
                System.out.print("*");
                k++;
            }
        }
            System.out.println(" ");
        }
    }
}
