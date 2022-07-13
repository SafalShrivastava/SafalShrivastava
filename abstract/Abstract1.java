abstract class parent
{
int i;
abstract String getdata();
public void print()
{
    System.out.print(getdata());

}
abstract class child3 extends parent
{
    abstract void x();
}
}
class child1 extends parent{
    String getdata(){
        return "child1";
    }
}
class child2 extends parent{
    String getdata(){
        return "child2";
    }
}
public class Abstract1{
public static void main(String[] args) {
    parent obj1=new child1();
    parent obj2=new child2();
    obj1.print();
    obj2.print();
}
}