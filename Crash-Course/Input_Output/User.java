// To allow user input in Java, we need to import a library that provides this functionality.
// The Scanner library from java.util is used for this purpose.
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        // Creating a Scanner object to enable user input from the console.
        // Scanner reads input from various sources, but here we use System.in for console input.
        Scanner sc = new Scanner(System.in);
        
        // Declare an integer variable to store the user's age.
        int age;

        // Prompt the user to input their age.
        // The message will be displayed on the console.
        System.out.println("Input age");
        
        // Read the integer input provided by the user and assign it to the age variable.
        // `nextInt()` method reads the next integer value from the console.
        age = sc.nextInt();
        
        // Output the age to the console.
        System.out.println(age);

        // Prompt the user to input their name.
        // The message will be displayed on the console.
        System.out.println("Input name");
        
        // Read the string input provided by the user. 
        // `nextLine()` method reads the entire line of text entered by the user.
        // Note: Calling `nextLine()` after `nextInt()` requires a dummy read to clear the buffer.
        String name = sc.nextLine();
        
        // Output the name to the console.
        System.out.println(name);

        // Prompt the user to input a boolean value to confirm if they are human.
        // The message will be displayed on the console.
        System.out.println("Are you human");
        
        // Read the boolean input provided by the user and assign it to the isHuman variable.
        // `nextBoolean()` method reads the next boolean value (true or false) from the console.
        boolean isHuman = sc.nextBoolean();
        
        // Output the boolean value to the console.
        System.out.println(isHuman);

        // Prompt the user to input a decimal value to confirm humanity.
        // The message will be displayed on the console.
        System.out.println("Input a decimal to confirm humanity");
        
        // Read the decimal input (double) provided by the user and assign it to the decimal variable.
        // `nextDouble()` method reads the next double value from the console.
        double decimal = sc.nextDouble();
        
        // Output the decimal value to the console.
        System.out.println(decimal);
    }
}
