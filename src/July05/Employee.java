package July05;

public class Employee {

    private String empid;
    private String firstname;
    private String lastname;
    private double salary;
    private String company;

    public Employee(String empid, String firstname, String lastname, double salary, String company) {
        this.empid = empid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + empid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

    public String getEmpid() {
        return empid;
    }
}
