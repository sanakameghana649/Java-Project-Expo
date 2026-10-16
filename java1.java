
import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get user name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Get exercise name
        System.out.print("Enter exercise name: ");
        String exercise = sc.nextLine();

        // Get workout duration
        System.out.print("Enter duration (min): ");
        int duration = sc.nextInt();

        // Get calories burned
        System.out.print("Enter calories burned: ");
        int calories = sc.nextInt();

        // Display workout summary
        System.out.println("\nWorkout Summary");
        System.out.println("----------------------");
        System.out.println("User: " + name);
        System.out.println("Exercise: " + exercise);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Calories burned: " + calories + " kcal");

        // Close Scanner
        sc.close();
    }
}
