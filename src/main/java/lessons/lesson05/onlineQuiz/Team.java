package lessons.lesson05.onlineQuiz;

import lessons.lesson05.educationCentre.Student;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Student> members = new ArrayList<>();
    private int score;

    public Team(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addMember(Student student) {
        members.add(student);
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
