import java.util.*;

public class ExampArray6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        int K=sc.nextInt();
        
        
        ArrayList<Integer> Even=new ArrayList<Integer>();
        ArrayList<Integer> Odd=new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]%2==0)
            {
                Even.add(arr[i]);
                
            }
            else
            {
                Odd.add(arr[i]);
            }
        }
        Collections.sort(Even, Collections.reverseOrder());
        Collections.sort(Odd, Collections.reverseOrder());
        // for (int i : Even) {
        //     System.out.println("Even : "+i);
        // }
        // for (int i : Odd) {
        //     System.out.println("odd : "+i);
        // }
          }

    }

