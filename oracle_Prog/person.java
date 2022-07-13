public class person {
    String name;
   static int age=25;
    public person(String name)
    {
        this(name,age);
        //this.setName(name);
    }
    public person(String name,int age)
    {
       // person(name,age);
        //this.setAge(age);
        this.name=name;
        person.age=age;
    }
    public String show()
    {
        return name+ ""+age+" ";
    }
    public static void main(String[] args) {
        person p1=new person("jesse");
       person p2=new person("jesse",52);
          System.out.println(p1.show());    
          System.out.println(p2.show());    
    }
}
