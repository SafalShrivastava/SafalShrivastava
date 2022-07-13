class Bike{
    int speed=60;
    int getSpeed(){return speed;}
    void speedLimit()
    {
        System.out.println("running with 60 km");

    }
    void stop(){System.out.println("Stop");}
}
class Honda extends Bike{
    int speed=90;
    int getSpeed()
    {
        return speed;
    }
    void speedLimit()
    {
        System.out.println("running with 90km");
    }
}
class Yamha extends Bike
{
    int speed =120;
    int getSpeed()
    {
        return speed;
    }
    void speedLimit()
    {
        System.out.println("running with 120 km");
    }
}
public class test_4 {
  public static void main(String[] args) {
        Bike b1=new Honda();//upcasting
        b1.speedLimit();
        b1.stop();
        Bike b2=new Yamha();
        b2.speedLimit();
        b2.stop();
        System.out.println(b1.speed);
    }
}
