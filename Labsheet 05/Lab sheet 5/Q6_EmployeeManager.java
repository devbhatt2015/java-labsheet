class Employee {
    private String name;
    private double salary;

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String department;

    void setDepartment(String department) {
        this.department = department;
    }

    void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
    }
}

public class Q6_EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.setName("Vanshika");
        m.setSalary(60000);
        m.setDepartment("IT");

        m.displayManager();
    }
}