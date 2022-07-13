import java.io.IOException;

//import javax.management.openmbean.OpenDataException;

public class throws1 {
    
    public static void main(String[] args) throws IOException
    {
        ProcessBuilder obj =new ProcessBuilder("mspaint");
      /*  try{
            obj.start();

        }
        catch(IOException e){
           System.out.println(e.toString());
        }*/
        obj.start();
    }
}
