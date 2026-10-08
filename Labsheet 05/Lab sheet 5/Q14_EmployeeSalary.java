class Employee {
    void calculateSalary() {
        System.out.println("Employee salary is calculated");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Manager salary = Basic Salary + Bonus");
    }
}

public class Q14_EmployeeSalary {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        e.calculateSalary();
        m.calculateSalary();
    }
}