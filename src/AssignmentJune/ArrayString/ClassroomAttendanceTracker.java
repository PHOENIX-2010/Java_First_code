package AssignmentJune.ArrayString;

import java.util.Scanner;

public class ClassroomAttendanceTracker {
    public static void main(String[] args) {

        String[] students = {"Utsav", "Dharmik", "Edward", "Sunny", "Raj"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student name to check attendance: ");
        String studentName = scanner.nextLine();

        boolean found = false;

        for (String student : students){
            if (student.equalsIgnoreCase(studentName)){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println(studentName + " was present.");
        } else {
            System.out.println(studentName + " was absent.");
        }
    }
}
