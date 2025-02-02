import java.util.Scanner;

public class UserVerificationIf { 
    public static void main(String[] args) {
        // Predefined correct username and password
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter username
        System.out.println("Enter username:");
        String enteredUsername = scanner.nextLine();

        // Prompt user to enter password
        System.out.println("Enter password:");
        String enteredPassword = scanner.nextLine();

        // Verify user credentials using if statement
        if (enteredUsername == (correctUsername) && enteredPassword == (correctPassword)) {
            // If both username and password are correct
            System.out.println("Login successful! Welcome, " + correctUsername + "!");
        }

        // Additional verification can be added here without using else
        if (enteredUsername != (correctUsername)) {
            // If the username is incorrect
            System.out.println("Invalid username.");
        }

        if (enteredPassword != (correctPassword)) {
            // If the password is incorrect
            System.out.println("Invalid password.");
        }
    }
}
