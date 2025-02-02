public class StringExample {
    public static void main(String[] args) {

        // Strings are objects that store sequences of characters in Java.
        // There are two main ways to create a String in Java:

        // 1. String Literal
        // Using a String literal is the most common way to create a String. The Java compiler optimizes the storage of String literals.
        String demo = "Java is quite Sexy";

        // 2. Using new Keyword
        // The 'new' keyword is used to create a new String object. This method is often used when working with multiple classes, methods, input/output, and other concepts.
        String s = new String("Welcome");

        // Code use and example
        // Display the created Strings
        System.out.println("String Literal: " + demo);
        System.out.println("String using new keyword: " + s);
    }
}
