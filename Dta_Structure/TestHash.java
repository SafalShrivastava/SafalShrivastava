import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class TestHash {
    public static void main(String[] args) {
        Hashtable<String, String> obj=new Hashtable<String, String>();

        Scanner sc=new Scanner(System.in);

        while(true)
    {
        System.out.println("enter enrolment no");
            String Key=sc.nextLine();

            System.out.println("enter name");
            String Name=sc.nextLine();

            if(Name.length()>0)
            {
                obj.put(Key,Name);
            }
            else{
                break;
            }
    }
    System.out.println("Size :"+obj.size());
    System.out.println("contains ss"+obj.contains("ss"));
    System.out.println("key :"+obj.containsKey("0208CS191109"));
    Enumeration<String> keys =obj.keys();
    {
        String k=(String) keys.nextElement();//key
        String V=obj.get(k);
        System.out.println(k+" : "+V);

    }
    }
}
