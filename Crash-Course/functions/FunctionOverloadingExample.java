public class FunctionOverloadingExample {

    // Method with one integer parameter
    // This method prints the square of the given integer.
    // Example usage: print(5) will print "Square of 5 is: 25"
    public static void print(int a) {
        System.out.println("Square of " + a + " is: " + (a * a));
    }

    // Overloaded method with two integer parameters
    // This method prints the sum of the two given integers.
    // Example usage: print(10, 20) will print "Sum of 10 and 20 is: 30"
    public static void print(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    // Overloaded method with one double parameter
    // This method prints the square root of the given double value.
    // Example usage: print(25.0) will print "Square root of 25.0 is: 5.0"
    public static void print(double a) {
        System.out.println("Square root of " + a + " is: " + Math.sqrt(a));
    }

    // Overloaded method with one string parameter
    // This method prints the length of the given string.
    // Example usage: print("Java Programming") will print "Length of "Java Programming" is: 16"
    public static void print(String a) {
        System.out.println("Length of \"" + a + "\" is: " + a.length());
    }

    public static void main(String[] args) {
        // Calling the overloaded methods with different parameters

        // Calls the method with one integer parameter
        // This prints the square of 5
        print(5);

        // Calls the overloaded method with two integer parameters
        // This prints the sum of 10 and 20
        print(10, 20);

        // Calls the overloaded method with one double parameter
        // This prints the square root of 25.0
        print(25.0);

        // Calls the overloaded method with one string parameter
        // This prints the length of the string "Java Programming"
        print("Java Programming");
    }
}
