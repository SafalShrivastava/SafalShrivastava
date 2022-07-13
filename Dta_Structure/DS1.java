import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    String Name;
    String Email;
}
public class DS1 {
    public static void main(String[] args) {
        ArrayList<Student>names=new ArrayList<Student>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            Student s=new Student();
            System.out.println("Enter name");
            s.Name=sc.nextLine();
            if(s.Name.length()>0)
            {
                names.add(s);
            }
            else
            {
                break;
            }
        }
        System.out.println(names.size());
        System.out.println(names);
        object data[]
        }
}
