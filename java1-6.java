import java.io.*;
import java.util.*;

// CO4: class with private fields, constructor, getters
class Workout {
    private String name;
    private int duration;
    private int calories;
    public Workout(String name, int duration, int calories) {
        this.name = name; this.duration = duration; this.calories = calories;
    }
    public String getName() { return name; }
    public int getDuration() { return duration; }
    public int getCalories() { return calories; }
}

public class java1-6 {
    // CO6: ArrayList of objects
    static ArrayList workouts = new ArrayList<>();
    // CO1: Scanner for input
    static Scanner scanner = new Scanner(System.in);

    // CO2: menu loop with switch
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add  2. View  3. Total duration  4. Save  0. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: addWorkout(); break;
                case 2: viewAll(); break;
                case 3: System.out.println("Total: " + totalDuration() + " min"); break;
                case 4: saveWorkouts(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
    // CO3: small static methods
    static void addWorkout() {
        System.out.print("Exercise: ");
        String name = scanner.nextLine();
        System.out.print("Minutes: ");
        int duration = scanner.nextInt();
        System.out.print("Calories: ");
        int calories = scanner.nextInt();
        scanner.nextLine();
        workouts.add(new Workout(name, duration, calories));
    }

    static void viewAll() {
        for (Workout w : workouts)
            System.out.println(w.getName() + " - " + w.getDuration() + " min - " + w.getCalories() + " kcal");
    }

    // CO6: one stream for totals
    static int totalDuration() {
        return workouts.stream().mapToInt(Workout::getDuration).sum();
    }

    // CO5: PrintWriter for saving
    static void saveWorkouts() {
        try (PrintWriter writer = new PrintWriter("workouts.txt")) {
            for (Workout w : workouts)
                writer.println(w.getName() + "," + w.getDuration() + "," + w.getCalories());
            System.out.println("Saved to workouts.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
