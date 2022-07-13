class Address
{
    String city;
    String state;
    String phoneno;
    Address(String c,String s,String p)
    {
        this.city=c;
        this.state=s;
        this.phoneno=p;
    }
}
class Employe
{
    int id;
    String name;
    Address add; 

Employe(int i,String n,Adress a)
{
    this.id=i;
    this.name=n;
    this.add=a;
}
public void print()
{
    System.out.println("id ="+id+"Name :"+name"city :"+add.city+"State :"+add.state+"phone"+add.phoneno);

}
}
public class Test10 {
 public static void main(String args[]]) {
    
    Address a1=new Address("jbp","mp","4573");
}    
}
