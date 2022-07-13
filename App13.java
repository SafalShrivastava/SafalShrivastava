public class App13 {
    static int cnt = 0;
    public App13()
    {
        cnt+=1;
        System.out.println(cnt);
    }
    public static void main(String[] args)
    {
        App13 obj1 = new App13();
        App13 obj2 = new App13();
        App13 obj3 = new App13();
    }
}
