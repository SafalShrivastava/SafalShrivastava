import java.util.Scanner;
class studentdata
{
    private String Email;
    private String Name;
    public String getName()
    {
        return this.Name;
    }
    public String getEmail()
    {
        return this.Email;
    }
    public void setName(String n)
    {
       if(n.length()<3)
       this.Name="Invalid name";
       else
       this.Name=n;
    }
    public void setEmail(String e)
    {
       if(e.indexOf("@")==-1)
       this.Email="Invalid Email";
       else
       this.Email=e;
    }
}
    public class Encapsu_1
    {
     public static void main(String[] args) {
         studentdata obj=new studentdata();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter name");
         String n=sc.nextLine();
         obj.setName(n);
         System.out.println("Enter Email");
         String e=sc.nextLine();
         obj.setName(e);
         System.out.println("name :"+obj.getName()+"Email"+obj.getEmail());

     }
    }