public class App10 {
    public App10()
    {
        // or this(10);
        this("sameer");
        System.out.println("no args");
    }
    public App10(int i)
    {
        //this();
        System.out.println(i);
    }
    public App10(String s)
    {
        this(10);
        System.out.println(s);
    }
    public static void main(String args[])
    {
        App10 obj=new App10();
    }
}
