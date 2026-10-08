class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    int getEmployeeId() {
        return employeeId;
    }

    String getEmployeeName() {
        return employeeName;
    }

    double getSalary() {
        return salary;
    }

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
        } else if (salary > 1000000) {
            System.out.println("Salary cannot be greater than 1000000.");
        } else {
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        }
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class Q3_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setEmployeeId(101);
        e1.setEmployeeName("Vanshika");

        e1.setSalary(50000);
        e1.displayDetails();

        e1.setSalary(1500000);
    }
}
