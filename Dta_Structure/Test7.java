///sorting main clss of employee
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"alex ",LocalDate.of(2018, Month.APRIL, 21)));
        list.add(new Employee(41,"arian ",LocalDate.of(2018, Month.APRIL, 01)));
        list.add(new Employee(31,"alex ",LocalDate.of(2018, Month.APRIL, 25)));
        list.add(new Employee(51,"charles ",LocalDate.of(2018, Month.APRIL, 23)));
        list.add(new Employee(51,"alex ",LocalDate.of(2018, Month.APRIL, 30)));

        Collections.sort(list
        ,Comparator.comparing(Employee::getName).thenComparing(Employee::getdob));
        System.out.println(list);
    }
}
