import java.util.ArrayList;

class Employee{
    int id;
    String name;
    int salary;

    void setDetails(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println(this.id + " " +this.name + " " + this.salary);
    }
}

public class Company{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.setDetails(100, "karthi", 10000);
        emp2.setDetails(101, "kavin", 15000);
        emp3.setDetails(102, "magen", 17000);
 
        Employee employees[] = {emp1, emp2, emp3};
        for(Employee employee : employees){
            System.out.println(employee.name + "'s salary is " + employee.salary);
        }
    }
}