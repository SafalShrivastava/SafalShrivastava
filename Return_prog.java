public class Return_prog {

void x()
    {
     System.out.println("x");
    } 

  int x1()
  {
      return 5;
  }

  float x2()
  {
    return 5.5f;
  }

  String x3()
  {
    return "ABC";
  }

     Employee x4()
  {
     Employee obj = new Employee();
    return obj;
  }

  void x (int i){}//x(5);

  int x5 (int i){return 9;}//para-->int,return-->int;

  int x5 (int i,int j){return 9;}//para-->int int,return-->int;//x5(10,20);

  String x5(String obj){return"abc";}//para-->string obj return-->string obj//x5("tt");

  int[] x7() {
    int a[]={10,20,30};
     return a;
    }//return int [];

    void x8(int[] i){}//para -->int array;

    int[] x9(int[] i)
    {
      int a[]={10,20,30};
      return a;
    }//para -->int array,return --> int array ;

    void x10(Employee obj){}//para-->employee class ka obj;
      public static void main(String args[])
    {
     Return_prog obj = new Return_prog();
     obj.x();
     int i =obj.x1();
     System.out.println(i);
     float j=obj.x2();
     System.out.println(j);
     String k=obj.x3();
     System.out.println(k);
     Employee x=obj.x4();
    


    }
}
