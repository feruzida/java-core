package lessons.lesson05.educationCentre;

public class Student extends Person {
    private String enrolledCourse;
    private double grades;

    public String getEnrolledCourse() {
        return enrolledCourse;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public Student(String name, int id, String email, String enrolledCourse, double grades) {
        super(name, id, email);
        this.enrolledCourse = enrolledCourse;
        this.grades = grades;
    }

    public void enroll(Course course) {
        enrolledCourse = course.getName();
        System.out.println(this.getName() + " enrolled " + enrolledCourse);
        course.addStudent(this);
    }

    public void attendCourse(Course course) {
        System.out.println("I attended!");
        course.recordAttendance(this, true);
    }

    public void studentInfo() {
        System.out.println(getInfo());
    }
}
