//sorting
import java.time.LocalDate;

public class Employee implements  Comparable<Employee>  {
    private Long id;
    private String Name;
    private LocalDate dob;

    public Employee(Long id,String name,LocalDate dob)
    {
        this.id =id;this.Name=name;this.dob=dob;
    }
    public Employee(int i, String name2, LocalDate of) {
    }
    public long getid(){
        return id;
    }
    public void setid(Long id){
        this.id=id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public LocalDate getdob(){
        return dob;
    }
    public void setid(LocalDate dob){
        this.dob=dob;
    
    }
    public int compareTo(Employee o )
    {
        return this.getName().compareTo(o.getName());
    } 
    public String tostrString()
    {
        return "Employee:-id"+getid()+getName()+"dob"+getdob()+"\n";
    }
}
