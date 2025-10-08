package lessons.lesson05.onlineQuiz;

public class MainQuiz {
    public static void main(String[] args) {
        Quiz quiz = new Quiz("Java Basics");
        quiz.addQuestion(new MultipleChoiceQuestion("What is JVM?", "Java virtual machine", 10));
        quiz.addQuestion(new MultipleChoiceQuestion("What is the main purpose of the JVM?", "Execution", 10));
        quiz.addQuestion(new MultipleChoiceQuestion("What concept allows one class to inherit from another?", "Inheritance", 10));
        quiz.addQuestion(new MultipleChoiceQuestion("What keyword creates an instance of a class?", "New", 10));
        quiz.addQuestion(new MultipleChoiceQuestion("Which keyword is used to inherit a class in Java?\nA) implement\nB) inherits\nC) extends\nD) import", "C", 5));

        Team team = new Team("LABUBU", 0);
        Team team1 = new Team("SPINER", 0);

        quiz.addTeam(team);
        quiz.addTeam(team1);

        quiz.startQuiz();

        quiz.showResults();
    }
}
