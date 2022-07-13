import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteContentReader {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.imgimgjbp.com");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while ((i=stream.read())!=-1) {
                System.out.println((char)i);
            } 
        } catch (Exception e) {
            System.out.println(e);
            //TODO: handle exception
        }
    }
}
