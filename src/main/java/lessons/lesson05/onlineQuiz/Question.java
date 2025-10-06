package lessons.lesson05.onlineQuiz;

public abstract class Question {
    private String text;
    private String correctAnswer;
    private int points;

    public Question(String text, int points) {
        this.text = text;
        this.points = points;
    }

    public void ask() {
        System.out.println("Answer for this question: " + text);
    }

    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getText() {
        return text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setText(String text) {
        this.text = text;
    }
}
