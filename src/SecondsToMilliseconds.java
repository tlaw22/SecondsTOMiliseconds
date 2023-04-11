import java.util.Scanner;

public class SecondsToMilliseconds {

    public static void main(String[] args) {
        // Get the number of seconds from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        // Convert the number of seconds to milliseconds
        long milliseconds = seconds * 1000;

        // Display the number of milliseconds to the user
        System.out.println(seconds + " seconds is " + milliseconds + " milliseconds.");
    }
}