package AssignmentJune.UniversityManagementSystem;

public class Main {
    public static void main(String[] args) {

        University.setUniversityName("Pragra University"); // set static university name

        Person[] person = new Person[5];

        person[0] = new Student("Utsav", 27, "S252800", "Java Full-Stack Development", 3.8);
        University.incrementStudentCount();

        person[1] = new Professor("Sunny", 32,"P123456", "Java Full-Stack Development", 100000);
        University.incrementProfessorCount();

        person[2] = new DepartmentHead("Atin",45,"P000001", "HOD", 200000,"A001");
        University.incrementProfessorCount();

        person[3] = new Student("Dharmik", 28, "S252801", "Java Full-Stack Development", 3.8);
        University.incrementStudentCount();

        person[4] = new Student("Edward", 25, "S252802", "Java Full-Stack Development", 3.8);
        University.incrementStudentCount();

        for (Person p : person){
            System.out.println("===========================");
            p.displayInfo();
        }
        University.getStatistic();
    }
}
