public class Adress {
    String city;
    String state;
    String Zipcode;
    public Adress(String c,String s,String z)
    {
      this.city=c;
      this.state=s;
      this.Zipcode=z;
    }
}
public class Adress2{
    int id;
    String name;
    Adress2 add;
    public Emp(int i,String s,Adress2 a)
    {
        this.id=1;
        this.name=n;
        this.add=a;
    }
    public void shoow()
    {
        System.out.println("id :"+this.id+"name :"+this.name+
        "city :"+add.city+"state :"+add.state:"Zipcode :"+add.Zipcode);
    }
}
