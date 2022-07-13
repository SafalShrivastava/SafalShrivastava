public class Array2 {
    int a[]={10,20};
    int b[]={60,70};
    int c[]={110,120};
    int d[]={400,500};
    int e[][]=new  int[4][2];
    void test()
    {
      e[0]=a;
      e[1]=b;
      e[2]=c;
      e[3]=d;
      
  System.out.println(e[0][1]+" "+e[2][1]);
    }
    
    public static void main(String[] args) {
        Array2 o=new Array2();
        o.test();
    }
}
