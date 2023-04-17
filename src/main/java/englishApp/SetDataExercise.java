package englishApp;

import java.util.ArrayList;
import java.util.List;

public class SetDataExercise {

    List<Exercise> newExercise = new ArrayList<Exercise>();
    public SetDataExercise() {
        Exercise exercise1 = new Exercise(1, "Put the keys __ the table", "at", "in", "on", "up", 'C');
        Exercise exercise2 = new Exercise(2, "She was looking __ her phone.", "out", "for", "to", "on", 'B');
        Exercise exercise3 = new Exercise(3, "Are you going ___ the concert?", "to", "at", "in", "by", 'A');
        newExercise.add(exercise1);
        newExercise.add(exercise2);
        newExercise.add(exercise3);
    }
}
