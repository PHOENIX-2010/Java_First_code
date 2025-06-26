package June21;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Edward", 170000.00));
        list.add(new Employee(2, "Dharmik", 200000.00));
        list.add(new Employee(3, "Utsav", 220000.00));
        list.add(new Employee(4, "Sunny", 150000.00));
        list.add(new Employee(5, "Roop", 120000.00));

        System.out.println(list);

        double highSalary = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).salary>highSalary){
                highSalary = list.get(i).salary;
            }
        }
        System.out.println(highSalary);
    }
}
