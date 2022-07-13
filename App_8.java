public class App_8 {
    public static void main(String Args[])
    {
        String msg="welcometojava";
        char data[]=msg.toCharArray();
        //int count=0;
        int a=0,b=0,c=0,d=0,e=0;
        for(int i=0;i<data.length;i++){
      //  System.out.println(data[i]);
        // if(data[i]=='a' ||data[i]=='e' ||data[i]=='i'||data[i]=='o'||data[i]=='u'){
         //count++;
         if(data[i]=='a'){
             a++;
         }
         if(data[i]=='e'){
            b++;
        }
        if(data[i]=='i'){
            c++;
        }
        if(data[i]=='o'){
            d++;
        }
        if(data[i]=='u'){
            e++;
        }
      

    }

    //System.out.println("count of vowels"+count);
    System.out.println("a :"+a);
    System.out.println("e :"+b);
    System.out.println("i :"+c);
    System.out.println("o :"+d);
    System.out.println("u :"+e);

    for(int i=data.length-1;i>0;i--)
    System.out.println(data[i]);
    }
}
