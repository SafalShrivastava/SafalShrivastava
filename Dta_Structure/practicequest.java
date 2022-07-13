import java.util.*;
public class practicequest {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        ArrayList<Character> obj=new ArrayList<Character>();
        System.out.println("Enter char");
        int a=0,e=0,i=0,o=0,u=0;
        while(true)
        {
            char c=sc.next().charAt(0);
            if(a==1&&i==1&&o==1&&u==1&&e==1)
            {
                System.out.println("end");
                break;
            }
            switch(c)
            {
                case 'a':a=1;break;
                case 'e':e=1;break;
                case 'i':i=1;break;
                case 'o':o=1;break;
                case 'u':u=1;break;
            }
            obj.add(c);
        }
        System.out.println(obj);
    
}
}