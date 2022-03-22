public class OOP_testdrive_employee {
    public static void main (String[] args){
        OOP_employee Employee1 = new OOP_employee(10001,"Chinathai","Panditya",999999);
        //create a new object of class oop_employee called "Employee1", 10001 Chinathai Panditya 99999 are the information of that employee

        System.out.println(Employee1);
        //println is basically toString (we've already overided the toString method in OOP_employee, so it prints in a format of "Employee[id,name,salary]"

        Employee1.setSalary(4);
        System.out.println(Employee1);
        System.out.println(Employee1.getName());
        System.out.println(Employee1.getID());
    }
}
