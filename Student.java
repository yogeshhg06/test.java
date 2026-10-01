import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int age;
    String course;

    void displayInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        student.rollNo = sc.nextInt();

        System.out.print("Enter age: ");
        student.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        student.course = sc.nextLine();

        student.displayInfo();

        sc.close();
    }
}
