import java.util.ArrayList;

public class ExampArrayList {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,20,10};
        ArrayList x=new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if(!x.contains(arr[i]))
            {
                x.add(arr[i]);
            }
        }
        System.out.println(x);
}
}