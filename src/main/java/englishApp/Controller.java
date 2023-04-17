package englishApp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;


public class Controller {
    @FXML
    private Label question;
    @FXML
    private RadioButton answerA, answerB, answerC, answerD;
    @FXML
    ToggleGroup groupOfButtons;
    @FXML
    private Button next;
    SetDataExercise data = new SetDataExercise();
    int i=0, result=0;
    protected void setDataOnScene(Exercise exercise, int currentExercise, int exerciseSize) {
        question.setText(exercise.question);
        answerA.setText(exercise.answerA);
        answerB.setText(exercise.answerB);
        answerC.setText(exercise.answerC);
        answerD.setText(exercise.answerD);
        if (currentExercise == exerciseSize) {
            next.setText("Finish");
        }
    }
    @FXML
    protected void onNextButtonClick() {
        int currentExercise = i+1;
        RadioButton chosen = (RadioButton) groupOfButtons.getSelectedToggle();
        String correctAnswer = data.newExercise.get(i).dict.get(data.newExercise.get(i).correctAnswer);
        isCorrect(chosen, correctAnswer);
        if (currentExercise < data.newExercise.size()) {
            i++;
            setDataOnScene(data.newExercise.get(i), currentExercise, data.newExercise.size());
            chosen.setSelected(false);
        }
        else {
            question.setText("Your result is: " + result + "/" + data.newExercise.size());
            answerA.setVisible(false);
            answerB.setVisible(false);
            answerC.setVisible(false);
            answerD.setVisible(false);
            next.setVisible(false);
        }
    }
    protected void isCorrect(RadioButton chosen, String correctAnswer) {
        if (correctAnswer.equals(chosen.getText())) {
            result += 1;
        }
    }
}