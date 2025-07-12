package July05;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) {

        Map<String, Employee> employee = new HashMap<>();

        Employee e1 = new Employee("e001", "Utsav", "Patel", 150000, "Google");
        Employee e2 = new Employee("e002", "Dharmik", "Patel", 140000, "Infosys");
        Employee e3 = new Employee("e003", "Sunny", "Kumar", 120000, "Facebook");
        Employee e4 = new Employee("e004", "Edward", "Johnson", 130000, "Concentrix");
        Employee e5 = new Employee("e005", "Subham", "Patel", 180000, "Netflix");

        employee.put(e1.getEmpid(), e1);
        employee.putIfAbsent(e2.getEmpid(), e2);
        employee.get(e3.toString()); 

    }

}
