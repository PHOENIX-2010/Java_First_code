package AssignmentJune.UniversityManagementSystem;

public class Student extends Person{

    String studentID;
    String course;
    double gpa;

    public Student(String name, int age, String studentID, String course, double gpa) {
        super(name, age); // Calls Person constructor
        this.studentID = studentID;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calls Person's displayInfo
        System.out.println("Student ID: " + studentID);
        System.out.println("Course name: " + course);
        System.out.println("GPA: " + gpa);
    }
}
