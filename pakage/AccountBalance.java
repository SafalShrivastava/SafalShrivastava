
import pakage.Balance;
import java.util.Date;
import java.util.*;
import java.util.regex.*;

public class AccountBalance {
    public static void main(String[] args) {
        Balance obj=new Balance("Safal",45.45);
        obj.show();
        System.out.println("Date -" +new Date());

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter mob no-");
            String mobile=sc.nextLine();
            Pattern p=Pattern.compile("[0-9]{10}");
            Matcher m=p.matcher(mobile);
            if(m.matches())
            {
             System.out.println("Valid no");
            }
            else
            {
                System.out.println("InValid no");
            }
        }
    }
}
