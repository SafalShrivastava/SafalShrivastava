import java.util.Arrays;

public class UniqueString1 {
    public static void main(String[] args) {
        
    
    String a="now";
    String b="own";
    if(!(a.length()==b.length()))
    {
        System.out.println("false");
        return;
    }
    char sa[]=a.toCharArray();
     char ta[]=b.toCharArray();
    Arrays.sort(sa);
    Arrays.sort(ta);

    if(Arrays.equals(sa,ta)){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
}
}