public class ExampIntersectionArray {
    public static void main(String[] args) {
       int Arr1[]={1,2,6,4,8,7};
       int Arr2[]={9,1,10,12,7};
       for (int i = 0; i < Arr1.length; i++) {

           for (int j = 0; j < Arr2.length; j++) {
               if(Arr1[i]==Arr2[j])
               {
                  System.out.println(Arr1[i]);
               }
           }
       }
    }
}
