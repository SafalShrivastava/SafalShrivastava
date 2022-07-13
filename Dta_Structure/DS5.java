import java.util.*;
public class DS5 {
    int spellCheck(char[] str1,char[] str2,int K)
    {
    int cnt=0;
    if(Arrays.equals(str1, str2));
     {
         for(int i=0;i<str1.length;i++)
         {
            if(str1[i]==str2[i])
            {

            }
            else
            {
                cnt++;
            }

         }
         if(cnt ==K)
         {
             return 3;
         }
         if(cnt>K)
         {
             return 4;
         }
         if(cnt<K)
         {
             return 3;
         }
         return 0;
     }

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1=sc.nextLine();
        System.out.println("Enter string 2");
        String str2=sc.nextLine();

        System.out.println("Enter K vakue");
        int K= sc.nextInt();
        System.exit(0);
        if (str1.length() !=str2.length()){
            System.out.println("lengthmismatch");
            System.exit(0);
        }
        if(K<0)
        {System.out.println("k cannot be less than zero");
        System.exit(0);
    }
            char s1[]=str1.toCharArray();
            char s2[]=str2.toCharArray();
            DS5 obj =new DS5();
            int res =obj.spellCheck(s1, s2, K);
            System.out.println(res);
            }
}
