interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Employee {
    private String name;
    private int employeeId;

    void setName(String name) {
        this.name = name;
    }

    void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    String getName() {
        return name;
    }

    int getEmployeeId() {
        return employeeId;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee implements Programmer, Researcher {

    public void writeCode() {
        System.out.println("Developer is writing code");
    }

    public void conductResearch() {
        System.out.println("Developer is conducting research");
    }
}

public class Q19_Developer {
    public static void main(String[] args) {
        Developer d = new Developer();

        d.setName("Vanshika");
        d.setEmployeeId(101);

        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}
