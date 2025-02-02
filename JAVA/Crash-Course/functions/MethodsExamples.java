public class MethodsExamples {

    // Method without Parameters and without Return Value
    // This method simply prints a greeting message to the console.
    public static void greet() {
        System.out.println("Hello, welcome to Java programming!");
    }

    // Method with Parameters and without Return Value
    // This method takes two integers as input, calculates their sum, and prints the result.
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Method with Parameters and Return Value
    // This method takes two integers as input, multiplies them, and returns the product.
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Method with Return Value and No Parameters
    // This method generates and returns a random number between 1 and 100.
    public static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        // Calling the method without parameters and without return value
        // This prints a greeting message to the console.
        greet();

        // Calling the method with parameters and without return value
        // This calculates and prints the sum of 5 and 10.
        printSum(5, 10);

        // Calling the method with parameters and return value
        // This multiplies 4 and 5 and stores the result in the variable 'result'.
        int result = multiply(4, 5);
        System.out.println("Product: " + result);

        // Calling the method with return value and no parameters
        // This generates a random number between 1 and 100 and stores it in 'randomNumber'.
        int randomNumber = getRandomNumber();
        System.out.println("Random Number: " + randomNumber);
    }
}
