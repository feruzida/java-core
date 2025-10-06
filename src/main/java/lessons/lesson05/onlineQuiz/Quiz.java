package lessons.lesson05.onlineQuiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private String title;
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<Team> teams = new ArrayList<>();

    public Quiz(String title) {
        this.title = title;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void startQuiz() {
        System.out.println("The Quiz of " + title + " is started! Two teams will be versus each other" + "\nEvery question has their individual points");
        Scanner sc = new Scanner(System.in);

        for (int q = 0; q < questions.size(); q++) {
            Question question = questions.get(q);

            for (int t = 0; t < teams.size(); t++) {

                Team currentTeam = teams.get(t % teams.size());
                System.out.println("Question " + q + " - answers team " + currentTeam.getName());

                System.out.println(question.getText());
                String answer = sc.nextLine().trim().toUpperCase();
//                if (answer.isEmpty()) {
//                    System.out.println("Please, input answer!");
//                    continue;
//                }

                if (question.checkAnswer(answer)) {
                    currentTeam.addScore(question.getPoints());
                    System.out.println("Correct! " + currentTeam.getName() + " got " + question.getPoints() + " points!");
                } else {
                    System.out.println("Wrong! 0 points.");
                }
            }
        }
    }


    public void showResults() {
        System.out.println("\nQuiz results for " + "\"" + title + "\"");
        int maxScore = 0;
        for (Team team : teams) {
            System.out.println("Team " + team.getName() + ": " + team.getScore() + " scores");
            if (team.getScore() > maxScore) {
                maxScore = team.getScore();
            }
        }
        for (Team team : teams) {
            if (team.getScore() == maxScore) {
                System.out.println("The winner of " + "\"" + title + "\"" + " is " + team.getName());
            }
        }
    }
}
