public class L1PrimitiveTypes {
    public static void main(String[] args) {
        // Primitive data types
        int myInt = 100;
        double myDouble = 5.99;
        char myChar = 'A';
        boolean myBool = true;
        byte myByte = 127;
        short myShort = 10000;
        long myLong = 15000000000L;
        float myFloat = 5.75f;

        // Additional primitive data types
        int anotherInt = 50;
        double anotherDouble = 3.14;
        boolean anotherBool = false;

        // Evaluating arithmetic expressions
        int sum = myInt + anotherInt;
        double product = myDouble * anotherDouble;
        boolean boolResult = myBool && anotherBool;

        // Using assignment operators
        sum += 10; // sum = sum + 10
        product *= 2; // product = product * 2
        boolResult |= true; // boolResult = boolResult | true

        // Print the values
        System.out.println("int: " + myInt);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBool);
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);

        // Print additional values
        System.out.println("another int: " + anotherInt);
        System.out.println("another double: " + anotherDouble);
        System.out.println("another boolean: " + anotherBool);

        // Print results of arithmetic expressions
        System.out.println("sum: " + sum);
        System.out.println("product: " + product);
        System.out.println("boolean result: " + boolResult);
        
        // Print multiple variables in one line
        System.out.println("int: " + myInt + ", double: " + myDouble + ", char: " + myChar + ", boolean: " + myBool);
    }
}