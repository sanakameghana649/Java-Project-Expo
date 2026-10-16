
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class java5 {
    public static void main(String[] args) {

        // Save workouts to a file
        try (PrintWriter writer = new PrintWriter(
                new FileWriter("workouts.txt"))) {

            writer.println("Running,30,250");
            writer.println("Cycling,40,320");
            writer.println("Walking,20,100");

            System.out.println("Saved successfully");

        } catch (IOException e) {
            System.out.println("Error saving workouts: "
                    + e.getMessage());
            return;
        }

        // Load and display workouts
        try (BufferedReader reader = new BufferedReader(
                new FileReader("workouts.txt"))) {

            String line;

            System.out.println("\nWorkout Details:");

            while ((line = reader.readLine()) != null) {

                // Split each line using commas
                String[] parts = line.split(",");

                // Display workout information
                System.out.println(
                        parts[0] + " — "
                        + parts[1] + " min — "
                        + parts[2] + " kcal");
            }

            System.out.println("Retrieved successfully");

        } catch (IOException e) {
            System.out.println("Error reading workouts: "
                    + e.getMessage());
        }
    }
}

