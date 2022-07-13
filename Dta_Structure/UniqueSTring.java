public class UniqueSTring {
    public static void main(String[] args) {
        String s="Alive";
        boolean chk= false;
        for(char c:s.toCharArray())
        {
            if(s.indexOf(c)==s.lastIndexOf(c)){
                chk=true;
            }
            else
            {
                chk =false;
                break;
            }
        }
        System.out.println(chk);
    }
}
