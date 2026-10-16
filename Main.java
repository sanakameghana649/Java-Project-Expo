
class Workout {
    private String exerciseName;
    private int duration;
    private int caloriesBurned;

    // Constructor
    public Workout(String name, int dur, int cal) {
        this.exerciseName = name;
        this.duration = dur;
        this.caloriesBurned = cal;
    }

    // Getter methods
    public String getExerciseName() {
        return exerciseName;
    }

    public int getDuration() {
        return duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    // Display workout details
    @Override
    public String toString() {
        return "Exercise: " + exerciseName
                + "\nDuration: " + duration + " min"
                + "\nCalories: " + caloriesBurned + " kcal";
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create a Workout object
        Workout w = new Workout("Cycling", 40, 320);

        // Display workout details
        System.out.println(w.toString());
    }
}
