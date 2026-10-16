
import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store workout durations in an array
        int[] durations = {30, 45, 20};

        // Display workout durations
        System.out.print("Workout Durations: ");
        for (int d : durations) {
            System.out.print(d + " ");
        }

        // Calculate total duration
        int total = 0;
        for (int d : durations) {
            total += d;
        }

        System.out.println("\nTotal: " + total + " min");

        // Calculate average duration
        System.out.printf(
                "Average: %.2f min\n",
                (double) total / durations.length
        );

        // Search for a workout duration
        System.out.print("Search duration: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int d : durations) {
            if (d == search) {
                found = true;
                break;
            }
        }

        // Display search result
        System.out.println(found ? "Found" : "Not found");

        sc.close();
    }
}
