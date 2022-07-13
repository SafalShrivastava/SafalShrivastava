import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException
    {
        ProcessBuilder obj =new ProcessBuilder("C:safal photos");
      /*  try{
            obj.start();

        }
        catch(IOException e){
           System.out.println(e.toString());
        }*/
        obj.start();
    }
}
