import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MyDate {
    public static void main(String[] args) {
        LocalDate obj1=LocalDate.now();
        LocalTime obj2=LocalTime.now();
        LocalDateTime obj3=LocalDateTime .now();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
