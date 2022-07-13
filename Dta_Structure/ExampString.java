public class ExampString {
    public static void main(String[] args) {
        String s="teeter";
        for (char c:s.toCharArray()) {
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                System.out.println(c);
            }
        }
    }
}
