import java.util.Arrays;

public class Array5{

    int a[]={1,2};
    int b[]={2,4};
    int c[]={3,5};
    int d[]={6,7};
    int e[][]= new int [4][2];
    String f[]={"a","b","c","d","e"};

    void test()
    {
        e[0]=a;
        e[1]=b;
        e[2]=c;
        e[3]=d;
        String  g[]=new String[3];
       System.arraycopy(f, 2,g,0, 3);
       System.out.println(Arrays.toString(g));//Arrays.toString is only used for string 
       System.out.println(e[0][0]+" "+e[1][0]);
    }
     
    public static void main(String[] args) {
    Array5 o=new Array5();
    o.test();
}
}