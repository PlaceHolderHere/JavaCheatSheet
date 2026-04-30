import java.awt.*;  // referenceTypes() example -> Point
import java.util.Arrays;  // for arrays()

public class Main {
    public static void main(String[] args) {
//        primitiveTypes();
//        referenceTypes();
//        strings();
        arrays();
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

    static void strings(){
        String message = "Hello World" + "!!!"; // Concatenating/Combining two strings
        System.out.println("Concatenation: " + message);
        System.out.println("startsWith: " + message.startsWith("!!")); // Returns a bool whether a string starts with a certain string
        System.out.println("endsWith: " + message.endsWith("!!")); // Returns a bool whether a string starts with a certain string
        System.out.println("length: " + message.length()); // Returns number of characters in a string
        System.out.println("indexOf: " + message.indexOf("o")); // Returns the index where this string first appears
        // returns -1 if it doesn't appear

        // For functions that modify the string itself, it returns a modified string without affecting the original
        // To update the original, set the variable equal to the function's output
        // Like so:
        message = message.replace("!", ".");
        // replaces instances of the target string with the replacement string
        System.out.println("Replace: " + message);

        // Removes white spaces at the start and end
        System.out.println("Trim: " + "  Hello World  ".trim());

        // Escape Sequences - Store special characters in a string by using \
        String doubleQuote = "\"";
        String backslash = "\\";
        String newLine = "\n";
        String tab = "\t";

        System.out.println(doubleQuote);
        System.out.println(backslash);
        System.out.println(newLine);
        System.out.println(tab);
    }

    static void arrays(){
        int[] emptyArray = new int[5]; // Initialize an empty array of 0's
        int[] numbers = {2, 3, 1, 5, 4}; // Initializing an array with specific values

        // Printing an array as a string
        System.out.println(Arrays.toString(emptyArray));

        // Accessing/changing a specific item of an array
        // Index starts at 0
        emptyArray[1] = 2;
        System.out.println(Arrays.toString(emptyArray));
        System.out.println("Index 1 or 2nd item: " + emptyArray[1]);

        // Built in sorting method
        // This modifies the array itself
        System.out.println("Unsorted Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Length of an array
        System.out.println("numbers array Length: " + numbers.length);
    }
}