import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        primitiveTypes();
        referenceTypes();
    }

    static void primitiveTypes(){
        byte a = 2; // 1 byte [-2^8, 2^8 - 1]
        short b = 2000; // 2 bytes [-2^16, 2^16 - 1]
        int c = 100000; // 4 bytes [-2^31, 2^31 - 1]
        long d = 999_999_999; // 8 bytes
        float price = 9.99F; // 4 bytes
        double pi = 3.14159; // 8 bytes
        char letter = 'A';  // one character
        boolean isEighteen = false;  // true or false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(price);
        System.out.println(pi);
        System.out.println(letter);
        System.out.println(isEighteen);
    }

    static void referenceTypes(){
        // Strings are a list of characters
        String message = "Hello World"; // Initializing a String
        System.out.println(message);

        // Initializing any other Reference Type
        // Reference Types "Refer" or "Point" to an object in memory (like a C pointer)
        Point point1 = new Point(10, 5);
        System.out.println(point1);
        System.out.println(point1.x);
        System.out.println(point1.y);
    }
}