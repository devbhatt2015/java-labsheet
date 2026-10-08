class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        System.out.println("Student is studying " + course);
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println("Teacher is teaching " + subject);
    }
}

public class Q11_PersonStudentTeacher {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.name = "Dev";
        s.course = "BCA";

        t.name = "Rahul";
        t.subject = "Java";

        s.displayName();
        s.study();

        t.displayName();
        t.teach();
    }
}
