
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Workout class
class Workout {
    private String name;
    private int duration;
    private int caloriesBurned;

    // Constructor
    public Workout(String name, int duration, int caloriesBurned) {
        this.name = name;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    // Getter methods
    public String getName() {
        return name;
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
        return name + " - " + duration + " min - "
                + caloriesBurned + " kcal";
    }
}

// Main class
public class java6 {
    public static void main(String[] args) {

        // Create workout list
        List<Workout> workouts = new ArrayList<>();

        workouts.add(new Workout("Running", 30, 250));
        workouts.add(new Workout("Cycling", 40, 320));
        workouts.add(new Workout("Walking", 20, 100));

        // Filter workouts lasting 30 minutes or more
        List<Workout> filtered = workouts.stream()
                .filter(w -> w.getDuration() >= 30)
                .collect(Collectors.toList());

        // Display filtered workouts
        System.out.println("Workouts >= 30 min:");
        filtered.forEach(System.out::println);

        // Calculate total calories burned
        int totalCal = filtered.stream()
                .mapToInt(Workout::getCaloriesBurned)
                .sum();

        // Display total count and calories
        System.out.println("Count: " + filtered.size());
        System.out.println("Total Calories: " + totalCal + " kcal");
    }
}
