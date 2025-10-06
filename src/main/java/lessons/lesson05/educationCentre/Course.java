package lessons.lesson05.educationCentre;

import java.util.ArrayList;

public class Course {
    private String name;
    private String teacher;
    private ArrayList<Student> student = new ArrayList<>();
    private ArrayList<Student> attendanceJournal = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void addStudent(Student s) {
        for (Student student1 : student) {
            if (student1.getEmail().equals(s.getEmail())) {
                System.out.println("This student is already studying!");
                return;
            }
        }
        student.add(s);
    }

    public void recordAttendance(Student s, boolean present) {
        if (s.getEnrolledCourse().equals(name) && present) {
            attendanceJournal.add(s);
            System.out.println(s.getName() + " has attended!");
        } else {
            System.out.println(s.getName() + " was absent.");
        }
    }

    public void recordGrade(Student s, double grade) {
        s.setGrades(grade);
        System.out.println("Teacher set grade " + grade + " for " + s.getName());
    }

    public void showStudents() {
        System.out.println("The list of attendants of " + name + " course:");
        for (Student student1 : student) {
            student1.studentInfo();
        }
        System.out.println();
    }
}
