package englishApp;


import java.util.Hashtable;

public class Exercise {
    int numberOfExercise;
    String question, answerA, answerB, answerC, answerD;
    char correctAnswer;
    String[] list = new String[4];
    Hashtable<Character, String> dict = new Hashtable<>();

    public Exercise(int numberOfExercise, String question, String answerA, String answerB, String answerC, String answerD, char correctAnswer) {
        this.question = question;
        this.answerA = answerA;
        this.numberOfExercise = numberOfExercise;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        dict.put('A', answerA);
        dict.put('B', answerB);
        dict.put('C', answerC);
        dict.put('D', answerD);

        list[0] = (answerA);
        list[1] = (answerB);
        list[2] = (answerC);
        list[3] = (answerD);
    }
}
