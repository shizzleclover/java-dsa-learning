public class operators {
    public static void main(String[] args) {
        // Operators in Java are symbols that perform operations on variables and values.
        // They are used to perform mathematical, logical, and other operations in a program.

        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;       // Addition
        int difference = a - b; // Subtraction
        int product = a * b;   // Multiplication
        int quotient = a / b;  // Division
        int remainder = a % b; // Modulus

        // Use Case: Calculating total price with tax
        double price = 100.0;
        double taxRate = 0.08;
        double totalPrice = price + (price * taxRate); // totalPrice = price + (price * 0.08)

        // 2. Unary Operators
        int x = 5;
        int increment = ++x; // Pre-increment: x becomes 6 before assignment
        int decrement = x--; // Post-decrement: x becomes 5 after assignment

        // Use Case: Toggle a boolean flag
        boolean isActive = false;
        isActive = !isActive; // isActive becomes true

        // 3. Assignment Operators
        int num = 10;
        num += 5; // Equivalent to num = num + 5; num becomes 15
        num -= 3; // Equivalent to num = num - 3; num becomes 12

        // Use Case: Accumulating a running total
        int total = 0;
        total += 25; // total = total + 25
        total -= 5;  // total = total - 5

        // 4. Relational Operators
        boolean isEqual = (a == b);      // Checks if a is equal to b
        boolean isNotEqual = (a != b);   // Checks if a is not equal to b
        boolean isGreater = (a > b);     // Checks if a is greater than b
        boolean isLess = (a < b);        // Checks if a is less than b

        // Use Case: Checking user eligibility
        int userAge = 20;
        boolean canVote = userAge >= 18; // True if userAge is 18 or more

        // 5. Logical Operators
        boolean andResult = (a > 0 && b > 0);  // Logical AND: True if both conditions are true
        boolean orResult = (a > 0 || b < 0);   // Logical OR: True if at least one condition is true
        boolean notResult = !(a > b);          // Logical NOT: Inverts the boolean result

        // Use Case: Validating input
        boolean isAdult = (userAge >= 18);
        boolean hasPermission = true;
        boolean canAccess = isAdult && hasPermission; // Access granted if both conditions are true

        // 6. Ternary Operator
        int max = (a > b) ? a : b; // Assigns the larger value of a or b to max

        // Use Case: Determining eligibility based on score
        int score = 85;
        String result = (score >= 60) ? "Pass" : "Fail"; // Assign "Pass" if score is 60 or more

        // 7. Bitwise Operators
        int bitwiseAnd = a & b;   // Bitwise AND
        int bitwiseOr = a | b;    // Bitwise OR
        int bitwiseXor = a ^ b;   // Bitwise XOR
        int bitwiseNot = ~a;      // Bitwise NOT

        // Use Case: Masking bits
        int permissions = 0b1010; // Binary representation for permission bits
        int readPermission = 0b0100; // Check read permission
        boolean hasReadPermission = (permissions & readPermission) != 0; // Checks if the read permission bit is set

        // 8. Shift Operators
        int leftShift = a << 2;  // Left shift by 2 bits (multiplies by 4)
        int rightShift = a >> 1; // Right shift by 1 bit (divides by 2)
        int unsignedRightShift = a >>> 1; // Unsigned right shift (divides by 2 without sign extension)

        // Use Case: Efficiently multiplying or dividing by powers of 2
        int value = 8;
        int multiplied = value << 3; // Equivalent to value * 8
        int divided = value >> 2;    // Equivalent to value / 4

        // 9. Instance of Operator
        String str = "Hello";
        boolean isString = str instanceof String; // Checks if str is an instance of String

        // Use Case: Type checking before casting
        Object obj = "Sample";
        if (obj instanceof String) {
            String text = (String) obj; // Safe cast since obj is a String
        }
    }
}
