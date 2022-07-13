public class Adress2 {
    String city;
    String state;
    String Zipcode;
    public Adress2(String c,String s,String z)
    {
      this.city=c;
      this.state=s;
      this.Zipcode=z;
    }
}
class Emp{
    int id;
    String name;
    Adress2 add;
    public Emp(int i,String n,Adress2 a)
    {
        this.id=i;
        this.name=n;
        this.add=a;
    }

    public void shoow()
    {
        System.out.println("id :"+this.id+"name :"+this.name+
        "city :"+add.city+"state :"+add.state+"Zipcode :"+add.Zipcode);
    }

}
class temp{

public static void main(String[] args) {
    Emp obj=new Emp(1,"safal",a);
      Address2 obj1=new Adress2("jabalpur","M.P","482001");
      obj.shoow();
}
}