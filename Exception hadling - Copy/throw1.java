class valueException extends Exception{
public String toString(){
    return "value cannot be greater than 10";
}
}
public class throw1{
    public static void main(String[] args) {
        int i=9;
        try{
            if(i>10)
            throw new valueException();
            else
            System.out.println("valid vlue");
        }
        catch (valueException ex){
            System.out.println(ex.toString());
        }
    }
}