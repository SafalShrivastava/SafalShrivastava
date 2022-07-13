enum car{audi,maruti,tata};
public class TestEnum {
    
    
    public static void main(String[] args) {
        car c;//car-data tyype
        c=car.tata;
        switch(c)
        {
            case tata:
            System.out.println("You choose tata !");
            break;
            case audi:
            System.out.println("You choose audi ! ");
            break;
        }


    }
}
