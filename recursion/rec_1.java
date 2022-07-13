public class rec_1{
    static int count=0;
    static void p()
    {
        count++;
        if(count<=5){//if we can't use any condtion it will go to infinite loop;
        System.out.println("hello"+count);
        p();
    }
    }
public static void main(String[] args) {
    p();

}
}