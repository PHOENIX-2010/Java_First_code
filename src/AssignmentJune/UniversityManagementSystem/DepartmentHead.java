package AssignmentJune.UniversityManagementSystem;

public class DepartmentHead extends Professor{

    String officeRoom;

    public DepartmentHead(String name, int age, String employeeID, String department, double salary, String officeRoom) {
        super(name, age, employeeID, department, salary);
        this.officeRoom = officeRoom;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office room: " + officeRoom);
    }
}
