
import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int choice;

        // Repeat menu until user chooses Exit
        while (!exit) {

            System.out.println("\n===== Fitness & Workout Tracker =====");
            System.out.println("1. Running");
            System.out.println("2. Cycling");
            System.out.println("3. Walking");
            System.out.println("4. Exit");

            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Selected: Running");
                    System.out.print("Duration (min): ");
                    int runningDuration = sc.nextInt();

                    if (runningDuration > 0) {
                        System.out.println(
                                "Workout duration: "
                                + runningDuration + " min");
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;

                case 2:
                    System.out.println("Selected: Cycling");
                    System.out.print("Duration (min): ");
                    int cyclingDuration = sc.nextInt();

                    if (cyclingDuration > 0) {
                        System.out.println(
                                "Workout duration: "
                                + cyclingDuration + " min");
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;

                case 3:
                    System.out.println("Selected: Walking");
                    System.out.print("Duration (min): ");
                    int walkingDuration = sc.nextInt();

                    if (walkingDuration > 0) {
                        System.out.println(
                                "Workout duration: "
                                + walkingDuration + " min");
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
