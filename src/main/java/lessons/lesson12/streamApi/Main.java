package lessons.lesson12.streamApi;

public class Main {
    public static void main(String[] args) {
        Task1EvenNumbers task1EvenNumbers = new Task1EvenNumbers();
        task1EvenNumbers.runTask1WithFor();
        task1EvenNumbers.runTask1withStream();

        Task2Max5 task2Max5 = new Task2Max5();
        task2Max5.runWithFor();
        task2Max5.runWithStream();

        Task3MaxAndMin task3MaxAndMin = new Task3MaxAndMin();
        task3MaxAndMin.runWithFor();
        task3MaxAndMin.runWithSteam();

        Task4AverageString task4AverageString = new Task4AverageString();
        task4AverageString.runWithFor();
        task4AverageString.runWithStream();

        Task5DeleteDublicats task5DeleteDublicats = new Task5DeleteDublicats();
        task5DeleteDublicats.runWithFor();
        task5DeleteDublicats.runWithStream();

        Task6StringtoLength task6StringtoLength = new Task6StringtoLength();
        task6StringtoLength.runWithFor();
        task6StringtoLength.runWithStream();

        Task7NameGroupe task7NameGroupe = new Task7NameGroupe();
        task7NameGroupe.runWithFor();
        task7NameGroupe.runWithStream();

        Task8CollectName task8CollectName = new Task8CollectName();
        task8CollectName.runWithFor();
        task8CollectName.runWithStream();

        Task9ListOfWords task9ListOfWords = new Task9ListOfWords();
        task9ListOfWords.runWithFor();
        task9ListOfWords.runWithStream();
    }
}
