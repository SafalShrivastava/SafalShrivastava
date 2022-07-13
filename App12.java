class c{
    int i,j;
    void getDetail(){}
    
    }
class b extends c{
    int i;
    void display(){
        System.out.println("b");
    }
}
public class App12 extends b{
    int i;
    void print()
    {
        this.i=10;
        super.i=20;
        System.out.println(this.i+" "+super.i);
        super.display();
        super.getDetail();


    }
    public static void main(String args[]){
    App12 obj = new App12();
        obj.print();
}
}