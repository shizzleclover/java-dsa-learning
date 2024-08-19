public class StringOperations {
    public static void main(String[] args) {
        
        // Strings are objects that store sequences of characters. 
        // Here we demonstrate various string operations.

        String str = "Java Programming";

        // Concatenation
        // Adding another string to the existing string. 
        // This creates a new String object with the combined text.
        String str2 = str + " is fun!";
        System.out.println("Concatenation: " + str2);

        // Length
        // Finding the length of the string, which is the number of characters it contains.
        int length = str.length();
        System.out.println("Length: " + length);

        // Substring
        // Extracting a part of the string from index 5 to 15 (16th character is excluded).
        // This creates a new String object with the extracted part.
        String subStr = str.substring(5, 16);
        System.out.println("Substring: " + subStr);

        // Comparison
        // Comparing the original string with another string to check if they are equal.
        // `equals` method returns true if the strings are the same.
        boolean isEqual = str.equals("Java Programming");
        System.out.println("Equals: " + isEqual);

        // Case Conversion
        // Converting all characters in the string to uppercase.
        // This creates a new String object with the uppercase text.
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper Case: " + upperCaseStr);

        // Trimming
        // Removing leading and trailing whitespace from the string.
        // `trim` method creates a new String object without the extra spaces.
        String trimmedStr = "   Extra spaces   ".trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");
    }
}
