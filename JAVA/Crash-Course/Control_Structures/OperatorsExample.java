public class OperatorsExample {
    public static void main(String[] args) {
        // Operators in Java are symbols used to perform operations on variables and values.
        // They perform mathematical, logical, and other operations in a program.

        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        // Subtraction
        int difference = a - b;
        // Multiplication
        int product = a * b;
        // Division
        int quotient = a / b;
        // Modulus (remainder)
        int remainder = a % b;

        // Use Case: Calculating total price with tax
        double price = 100.0;
        double taxRate = 0.08;
        double totalPrice = price + (price * taxRate); // totalPrice = price + (price * 0.08)

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Total Price with Tax: " + totalPrice);

        // 2. Unary Operators
        int x = 5;
        int increment = ++x; // Pre-increment: x becomes 6 before assignment
        int decrement = x--; // Post-decrement: x becomes 5 after assignment

        // Use Case: Toggle a boolean flag
        boolean isActive = false;
        isActive = !isActive; // isActive becomes true

        System.out.println("\nUnary Operators:");
        System.out.println("Pre-increment: " + increment);
        System.out.println("Post-decrement: " + decrement);
        System.out.println("Toggled boolean flag: " + isActive);

        // 3. Assignment Operators
        int num = 10;
        num += 5; // Equivalent to num = num + 5; num becomes 15
        num -= 3; // Equivalent to num = num - 3; num becomes 12

        // Use Case: Accumulating a running total
        int total = 0;
        total += 25; // total = total + 25
        total -= 5;  // total = total - 5

        System.out.println("\nAssignment Operators:");
        System.out.println("Updated num: " + num);
        System.out.println("Running total: " + total);

        // 4. Relational Operators
        boolean isEqual = (a == b);      // Checks if a is equal to b
        boolean isNotEqual = (a != b);   // Checks if a is not equal to b
        boolean isGreater = (a > b);     // Checks if a is greater than b
        boolean isLess = (a < b);        // Checks if a is less than b

        // Use Case: Checking user eligibility
        int userAge = 20;
        boolean canVote = userAge >= 18; // True if userAge is 18 or more

        System.out.println("\nRelational Operators:");
        System.out.println("a is equal to b: " + isEqual);
        System.out.println("a is not equal to b: " + isNotEqual);
        System.out.println("a is greater than b: " + isGreater);
        System.out.println("a is less than b: " + isLess);
        System.out.println("Can vote: " + canVote);

        // 5. Logical Operators
        boolean andResult = (a > 0 && b > 0);  // Logical AND: True if both conditions are true
        boolean orResult = (a > 0 || b < 0);   // Logical OR: True if at least one condition is true
        boolean notResult = !(a > b);          // Logical NOT: Inverts the boolean result

        // Use Case: Validating input
        boolean isAdult = (userAge >= 18);
        boolean hasPermission = true;
        boolean canAccess = isAdult && hasPermission; // Access granted if both conditions are true

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT: " + notResult);
        System.out.println("Can access: " + canAccess);

        // 6. Ternary Operator
        int max = (a > b) ? a : b; // Assigns the larger value of a or b to max

        // Use Case: Determining eligibility based on score
        int score = 85;
        String result = (score >= 60) ? "Pass" : "Fail"; // Assign "Pass" if score is 60 or more

        System.out.println("\nTernary Operator:");
        System.out.println("Maximum value: " + max);
        System.out.println("Result: " + result);

        // 7. Bitwise Operators
        int bitwiseAnd = a & b;   // Bitwise AND
        int bitwiseOr = a | b;    // Bitwise OR
        int bitwiseXor = a ^ b;   // Bitwise XOR
        int bitwiseNot = ~a;      // Bitwise NOT

        // Use Case: Masking bits
        int permissions = 0b1010; // Binary representation for permission bits
        int readPermission = 0b0100; // Check read permission
        boolean hasReadPermission = (permissions & readPermission) != 0; // Checks if the read permission bit is set

        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise NOT: " + bitwiseNot);
        System.out.println("Has read permission: " + hasReadPermission);

        // 8. Shift Operators
        int leftShift = a << 2;  // Left shift by 2 bits (multiplies by 4)
        int rightShift = a >> 1; // Right shift by 1 bit (divides by 2)
        int unsignedRightShift = a >>> 1; // Unsigned right shift (divides by 2 without sign extension)

        // Use Case: Efficiently multiplying or dividing by powers of 2
        int value = 8;
        int multiplied = value << 3; // Equivalent to value * 8
        int divided = value >> 2;    // Equivalent to value / 4

        System.out.println("\nShift Operators:");
        System.out.println("Left shift: " + leftShift);
        System.out.println("Right shift: " + rightShift);
        System.out.println("Unsigned right shift: " + unsignedRightShift);
        System.out.println("Multiplied by 8: " + multiplied);
        System.out.println("Divided by 4: " + divided);

        // 9. Instance of Operator
        String str = "Hello";
        boolean isString = str instanceof String; // Checks if str is an instance of String

        // Use Case: Type checking before casting
        Object obj = "Sample";
        if (obj instanceof String) {
            String text = (String) obj; // Safe cast since obj is a String
        }

        System.out.println("\nInstance of Operator:");
        System.out.println("Is str an instance of String: " + isString);
    }
}
