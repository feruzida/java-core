package lessons.lesson05.educationCentre;

public class Teacher extends Person {
    private String specialization;

    public Teacher(String name, int id, String email) {
        super(name, id, email);
    }

    public void assignCourse(Course course) {
        specialization = course.getName();
        System.out.println(getName() + " is teacher of " + specialization);
        course.setTeacher(this.getName());
    }

    public void gradeStudent(Student student, Course course, double grade) {
        if (this.getName().equals(course.getTeacher())) {
            if (student.getEnrolledCourse().equals(course.getName())) {
                student.setGrades(grade);
                course.recordGrade(student, grade);
            } else {
                System.out.println(student.getName() + " is not studing in this course!");
            }
        } else {
            System.out.println(this.getName() + " is not teaching this course");
        }
    }
}
