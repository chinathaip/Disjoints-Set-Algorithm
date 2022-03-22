public class OOP_employee {

    //constructor
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public OOP_employee (int id,String firstName, String lastName,int salary){
         this.id = id; // this.id = the instance,   id = the argument
         this.firstName = firstName;
         this.lastName= lastName;
         this.salary = salary;
    }

    public int getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return firstName + " " +lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalaray(){
        return salary*12;
    }

    public int raise_salary(int percent){
        return salary * (percent /100);
    }

    public String toString(){
        return "Employee[id="+id+",name="+getName()+", salary="+salary+"]";
    }
}
