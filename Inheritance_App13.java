

class c1{
    c1(){
        System.out.println("c1");
    }
}
class b1 extends c1{
    b1()
    {
        System.out.println("b1");
    }

    public static void speedLimit() {
    }
}

public class Inheritance_App13 extends b1{
    Inheritance_App13(){
        System.out.println("Inheritance_App13");
    }
    public static void main(String args[])
    {
        Inheritance_App13 obj= new Inheritance_App13();
    }
}
