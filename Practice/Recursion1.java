public class Recursion1 {
    static int i=0;
    static void p()
    {
        System.out.println("Hello"+i);
        i++;
         
        if(i<=100){
            p();
        }
    }
    public static void main(String[] args) {
        p();
    }
}
