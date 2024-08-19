package DSA.Arrays;

// This class demonstrates different ways to initialize arrays in Java.

public class ArrayInitialization {
    public static void main(String[] args) {
        // Inline initialization of an array
        // The array 'inlineArray' is initialized with values at the time of declaration
        int[] inlineArray = {1, 2, 3, 4, 5};

        // Separate initialization of an array
        // The array 'separateArray' is created with a specific size and then populated
        int[] separateArray = new int[5]; // Array of size 5
        for (int i = 0; i < separateArray.length; i++) {
            separateArray[i] = i + 1; // Assign values to each index
        }

        // Print the arrays to demonstrate their contents
        System.out.println("ArrayInitialization:");
        System.out.print("Inline Initialization: ");
        for (int num : inlineArray) {
            // Print each element of the inlineArray
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Separate Initialization: ");
        for (int num : separateArray) {
            // Print each element of the separateArray
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
