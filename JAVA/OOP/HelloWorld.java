package OOP;
public class HelloWorld {
    void sayHello() {
        System.out.println("Hello, OOP");
    }
}

public class Main{
    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.sayHello();
    }
}
