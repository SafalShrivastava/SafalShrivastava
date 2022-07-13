public class Array4 {
    public static void main(String[] args) {
        String elements[][]={
            {"a","b","c","d"},
            {"e","f","g","h","i"},
            {"j","k","l","m","n","o"},
            {"p","q","R","s","t"}
        };
        for(int i=0;i<elements.length;i++)
        {
            System.out.print(elements[i][0]+"");
            for(int j=1;j<elements[i].length;j++)
            {
                System.out.print(" "+elements[i][j]);
            }
            System.out.println();
        }
    }
}
