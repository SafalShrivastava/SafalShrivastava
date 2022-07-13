public class this_refrence {
    int i;
    void x()
    {
        int i;
        i=20;
        this.i=30;
        System.out.println(i);
        System.out.println(this.i);
        this.y();
    }
    void y()
    {
        System.out.println("y");

    }
public static void main(String args[])
{
    this_refrence obj=new this_refrence();
    obj.x();
}
}
