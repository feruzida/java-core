package lessons.lesson05.onlineQuiz;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
    private ArrayList<String> options = new ArrayList<>();

    public MultipleChoiceQuestion(String text, String correctAnswer, int points) {
        super(text, points);
        setCorrectAnswer(correctAnswer);
    }

    @Override
    public void ask() {
        System.out.println("Answer for this question: " + getText() + "\nYou need to choose only one answer. (A-D)");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return getCorrectAnswer().equalsIgnoreCase(answer);
    }

//    public ArrayList<String> getOptions() {
//        return options;
//    }
//
//    public void setOptions(ArrayList<String> options) {
//        this.options = options;
//    }
}

