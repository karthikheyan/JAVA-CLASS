class Employee {
    int id;
    int sal;
    int bonus;

    Employee(){
        System.out.println("Default constructor");
    }

    Employee(int id, int sal, int bonus){
        this.id = id;
        this.sal = sal;
        this.bonus = bonus;
        System.out.println("Details added successfully");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(100, 100000, 5000);
        
    }
}
