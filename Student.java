class Student {
    String name = "Rahul";
    int rollNo = 101;
    int age = 20;
    String course = "BCA";

    void displayInfo() {
        System.out.println("Student Information");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
    }
}

public class StudentInfo {
    public static void main(String[] args) {

        Student student = new Student();

        student.displayInfo();
    }
}
