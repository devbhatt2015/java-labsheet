class Student {
    private String name;
    private int rollNo;
    private double marks;

    void setName(String name) {
        this.name = name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setMarks(double marks) {
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getRollNo() {
        return rollNo;
    }

    double getMarks() {
        return marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class Q1_Student {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Vanshika");
        s1.setRollNo(101);
        s1.setMarks(95.5);

        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Marks: " + s1.getMarks());

        s1.displayDetails();
    }
}