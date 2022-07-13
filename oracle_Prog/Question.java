import java.math.*;
public class Circle{
    double radius;
    public double area;
    public int getradius;
    public Circle(double r){radius=r;}
    public double getradius(){return radius;}
    public void setradius(double r){radius=r;}
    public double getarea(){return Math.PI * radius * radius;}
} 
public class Question {
    public static void main(String[] args) {
        Circle c1=new Circle(17.4);
        c1.area=Math.PI*c1.getradius*c1.getradius();
    }
}
