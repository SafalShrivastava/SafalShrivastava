public class constructor_employe {
    String EmployeName;
    String EmployeAdress;
    public constructor_employe()
    {
        EmployeName="abc";
        EmployeAdress="jbp";
    }
public void getDetails()
{
    System.out.println("Name of employ"+EmployeName);
    System.out.println("Adress of employ"+EmployeAdress);
    System.out.println("2"+"3");//23
    System.out.println(2+3);//5
}

public static void main(String args[])
{
   constructor_employe obj=new constructor_employe();
    obj.getDetails();
}
}