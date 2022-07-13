interface Myinterface{
    public static int num=100;
    public default void display(){
        System.out.println("display method of myinterface");

    }
}

public class InterfaaceExample implements Myinterface{
    public static void main(String args[]){
        InterfaaceExample obj =new InterfaaceExample();
        obj.display();
        Myinterface.display();
    }
}