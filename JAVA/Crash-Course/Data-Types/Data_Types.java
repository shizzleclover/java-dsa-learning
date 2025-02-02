public class Data_Types {
    public static void main(String[] args) {

        // So we have things called variables and data types.
        // A variable is practically a piece of data that has been assigned a value.
        // A data type is a way or form of representing data; it could be an int which stands for integer (e.g., {30, 0}) and represents whole positive numbers,
        // a String which is a collection of words or numbers or both (e.g., {abc123, abc}), and much more.
        // Data types are categorized into two: primitive and non-primitive. We'd get into those too.

        // Primitive data types
        // Primitive data are only single values and have no special capabilities. There are 8 primitive data types:
        // boolean, char, int, short, byte, long, float, and double. We’ll delve into them more.
        // We'd focus mainly on boolean, char, int, float, and double for now.

        // boolean fact; // The boolean data type represents a logical value that can be either true or false.
        // fact is a data with the type boolean.
        // fact = true;
        // Now fact has been initialized as a variable by assigning a value to it. boolean has only two options, true or false.
        // Fact could also be assigned like this:
        // We'd use this method or way of assigning variables till we got to Input/Output.
        boolean fact = true;

        // Integers are used to store positive whole numbers (e.g., 0, 1, 2, 3, 4, 5, 6, 7, 8, 9).
        int age = 50;

        String name; // Declaring a String variable 'name'.
        Double time; // Declaring a Double variable 'time'.

        // Code use and example

        // Creating and initializing custom character
        char a = 'G';

        // Integer data type is generally used for numeric values
        int i = 89;

        // Use byte and short if memory is a constraint
        byte b = 4;

        // This will give an error as the number is larger than the byte range
        // byte b1 = 7888888955;

        short s = 56;

        // This will give an error as the number is larger than the short range
        // short s1 = 87878787878;

        // By default, fraction value is double in Java
        double d = 4.355453532;

        // For float, use 'f' as a suffix as standard
        float f = 4.7333434f;

        // Need to hold a big range of numbers, then we need this data type
        long l = 12121;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);

    }
}

//NON PRIMITIVE DATA TYPES WOULD BE SONE IN THE SECOND PART

