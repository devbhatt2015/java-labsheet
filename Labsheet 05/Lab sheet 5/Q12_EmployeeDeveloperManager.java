class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Developer is writing " + programmingLanguage + " code");
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        System.out.println("Manager is conducting a meeting in " + department);
    }
}

public class Q12_EmployeeDeveloperManager {
    public static void main(String[] args) {
        Developer d = new Developer();
        Manager m = new Manager();

        d.employeeName = "Vanshika";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        m.employeeName = "Rahul";
        m.employeeId = 102;
        m.department = "IT";

        d.displayEmployee();
        d.writeCode();

        m.displayEmployee();
        m.conductMeeting();
    }
}
