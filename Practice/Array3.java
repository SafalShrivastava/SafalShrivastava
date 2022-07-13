public class Array3 {
     int a[]={10,20};
     int b[]={30,50};
     int c[]={80,90};
     int d[]={100,120};

    String e[][]={{"abc","xyz","Dr"},{"tqr","Err"}};
     
     int f[][]=new int[4][2];

          void test()
          {
              String g[][]=new String[2][];
              g[0]=new String[3];
              g[1]=new String[2];

            //   g[0][0]="abc";g[0][1]="xyz";g[0][2]="Dr";
            //   g[1][0]="tqr";g[1][1]="Err";
             g[0]=e[0];
             g[1]=e[1];
              f[0]=a;
              f[1]=b;
              f[2]=c;
              f[3]=d;
              System.out.println(g[0][0]+" "+g[0][1]);
              System.out.println(g[0].length);
              System.out.println(f.length);
          }
          public static void main(String[] args) {
            Array3 o=new Array3();
            o.test();
          }
}
