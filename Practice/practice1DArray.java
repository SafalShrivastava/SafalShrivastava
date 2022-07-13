import java.util.Arrays;

import javax.print.event.PrintEvent;

public class practice1DArray {
    
    void test(){
        int a[]={10,20};
        int b[]={10,20};
        int c[]={10,20};
        int d[]={10,20};

      int e[][]=new int[4][2];

      e[0]=a;
      e[1]=b;
      e[2]=c;
      e[3]=d;
      // String f[]={"a","b","c","d","e"};
      String f[][]={{"a","b","c","d"},
      {"a","b","c","d"},
      {"a","b","c","d"},
      {"a","b","c","d"}};

      for (int i = 0; i < f.length; i++) {
          System.out.print(f[i][0]);
          for (int j = 1; j < f.length; j++) {
              System.out.print(f[i][j]);
          }
          System.out.println();
      }


    //   String  g[]=new String[3];
    //   System.arraycopy(f, 0, g, 0, 3);
    //   System.out.println(Arrays.toString(g));
      System.out.println(e[0][0]+" "+e[0][1]);
    }
    public static void main(String[] args) {
        practice1DArray o=new practice1DArray();
        o.test();
    }
}
