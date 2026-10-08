interface Researcher {
    void conductResearch();
}

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    int getEmployeeId() {
        return employeeId;
    }

    String getEmployeeName() {
        return employeeName;
    }

    double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    void calculateSalary() {
        System.out.println("Employee salary: " + salary);
    }
}

class Teacher extends Employee implements Researcher {
    String subject;

    void teach() {
        System.out.println("Teaching " + subject);
    }

    public void conductResearch() {
        System.out.println("Teacher is conducting research");
    }

    @Override
    void calculateSalary() {
        System.out.println("Teacher salary: " + getSalary());
    }
}

class VisitingTeacher extends Teacher {
    int hoursWorked;

    @Override
    void calculateSalary() {
        System.out.println("Visiting Teacher salary: " + (hoursWorked * 500));
    }
}

class Admin extends Employee {
    String department;

    void manageDepartment() {
        System.out.println("Managing " + department + " department");
    }
}

public class Q20_UniversityEmployee {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setEmployeeId(101);
        t.setEmployeeName("Vanshika");
        t.setSalary(50000);
        t.subject = "Java";

        t.displayDetails();
        t.teach();
        t.conductResearch();
        t.calculateSalary();

        System.out.println();

        VisitingTeacher v = new VisitingTeacher();
        v.setEmployeeId(102);
        v.setEmployeeName("Rahul");
        v.hoursWorked = 20;

        v.displayDetails();
        v.calculateSalary();

        System.out.println();

        Admin a = new Admin();
        a.setEmployeeId(103);
        a.setEmployeeName("Amit");
        a.setSalary(40000);
        a.department = "Computer Science";

        a.displayDetails();
        a.manageDepartment();
        a.calculateSalary();
    }
}