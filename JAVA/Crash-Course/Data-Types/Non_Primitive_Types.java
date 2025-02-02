public class Non_Primitive_Types {
    public static void main(String[] args) {

        // Non-primitive data types
        // Non-primitive data types are more complex than primitive data types. They can hold multiple values or objects and can have methods associated with them.
        // Some common non-primitive data types include: String, Arrays, Classes, and Interfaces.

        // String
        // A String is a sequence of characters used to represent text. In Java, Strings are objects that belong to the String class.
        // Example of initializing a String variable:
        String greeting = "Hello, World!";

        // Arrays
        // Arrays are used to store multiple values of the same type in a single variable. They can be of any data type, including primitive and non-primitive types.
        // Example of initializing an array of integers:
        int[] numbers = {1, 2, 3, 4, 5};
        // Accessing array elements:
        int firstNumber = numbers[0]; // Accesses the first element of the array

        // Example of initializing a String array:
        String[] names = {"Alice", "Bob", "Charlie"};

        // Classes
        // Classes are blueprints for creating objects. They can contain fields (variables) and methods (functions) to define the behavior of the objects.
        // Example of a simple class definition and object creation:
        class Person {
            String name;
            int age;

            // Method to display person's details
            void display() {
                System.out.println("Name: " + name + ", Age: " + age);
            }
        }

        // Creating an object of the Person class
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 30;
        person1.display(); // Outputs: Name: John, Age: 30

        // Interfaces
        // Interfaces are used to define a contract for what a class can do, without specifying how it does it. Classes that implement an interface must provide the method implementations.
        // Example of an interface definition and implementation:
        interface Animal {
            void makeSound();
        }

        class Dog implements Animal {
            public void makeSound() {
                System.out.println("Woof!");
            }
        }

        // Creating an object of the Dog class
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof!

        // Code use and example
        System.out.println("String: " + greeting);
        System.out.println("First number in array: " + firstNumber);
        System.out.println("Name in array: " + names[0]);
        
    }
}

