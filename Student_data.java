public class Student_data {
    private string name;
    private string email;
    String getname(){
        return name;
    } 
    void setemail(string n){
        if(n.length()<3)
        
        this.name=a;
    }string getemail(){
        return email;
    }
    void setemail(string e){
        if(e.indexof("@")==-1){
            this.email="invalid email";
        }
         else{
        this.email=e;}
    }
    Student(){}
    Student(string n,string e)
    {
        this.name=n;
        this.email=e;
    }

}
