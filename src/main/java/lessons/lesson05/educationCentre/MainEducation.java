package lessons.lesson05.educationCentre;

public class MainEducation {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Yevgeny", 2309, "yevgeny@uzum.com");
        Course java = new Course("Java Junior", "none");
        Student student = new Student("Feruz", 25091, "feruz@uzum.com", "", 0);
        Student student1 = new Student("Matvey", 25092, "matvey@uzum.com", java.getName(), 0);

        student.enroll(java);
        java.addStudent(student1);
        java.showStudents();
        System.out.println();

        student.attendCourse(java);
        java.recordAttendance(student, true);
        System.out.println();

        teacher.assignCourse(java);
        teacher.gradeStudent(student, java, 100.0);
        java.showStudents();

        Student student2 = new Student("Feruz", 25091, "feruz@uzum.com", "", 0);
        java.addStudent(student2);
        java.showStudents();


    }
}
