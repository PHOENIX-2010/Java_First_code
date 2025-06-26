package AssignmentJune.UniversityManagementSystem;

public class University{

   static String universityName;
   static int totalStudents;
   static int totalProfessors;

    public static void setUniversityName(String universityName) {

        University.universityName = universityName;
    }

    public static void incrementStudentCount(){
        totalStudents++;
    }

    public static void incrementProfessorCount(){
        totalProfessors++;
    }

    public static void getStatistic(){
        System.out.println("========== University Statistics ==========");
        System.out.println("University Name: " + universityName);
        System.out.println("Total Student: " + totalStudents);
        System.out.println("Total professor: " + totalProfessors);
        System.out.println("===========================================");
    }
}
