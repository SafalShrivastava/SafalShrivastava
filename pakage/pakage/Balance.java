package pakage;
public class Balance{
    String name;
    double bal;
public Balance(String n,double d)
{
    this.name=n;
    this.bal=d;
}
public void show()
{
    System.out.println("Name :"+this.name+"\nBalance :"+this.bal+"Rs");
}
}