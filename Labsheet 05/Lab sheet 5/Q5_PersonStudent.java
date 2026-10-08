class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Q5_PersonStudent {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Vanshika";
        s.age = 20;
        s.rollNo = 101;
        s.course = "BCA";

        s.displayPerson();
        s.displayStudent();
    }
}