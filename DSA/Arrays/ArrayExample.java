package DSA.Arrays;

/* Arrays are collections of elements of the same type, stored in contiguous memory locations.
   They have an initial index of 0, meaning if you are to count elements in an array, you start with 0, 1, 2, ..., instead of the usual 1, 2, 3. */

/* To use an array, it has to be declared first in this format:
   dataType[] arrayName; */

/* Basically, arrays are used to store data. Imagine having to individually print out data for a farm and starting manually with an output statement.
   It would be time-consuming, the code would be cumbersome and ambiguous, and errors would likely occur.
   Instead, we can store all the data in an array. */
   
// Here is an example to illustrate the concept:

public class ArrayExample {
    public static void main(String[] args) {
        // Declare variables for each fruit
        String apple = "Apple";
        String banana = "Banana";
        String mango = "Mango";
        String cherry = "Cherry";
        String apricot = "Apricot";
        String pear = "Pear";

        // Instead of using separate variables, use an array to store the fruit names
        final String[] fruits = {apple, banana, mango, cherry, apricot, pear};

        // Print each fruit in the array
        // This is how you access and print array data
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }
    }
}
