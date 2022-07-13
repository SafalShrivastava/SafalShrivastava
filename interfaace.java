interface Myinterface{
    public static int num=100;
    public default void display(){
        System.out.println("display method of myinterface");

    }
}
public class InterfaceExample implements Myinterface{
    public static void main(String args[]){
        InterfaceExample obj =new InterfaceExample();
        obj.display();
    }
}