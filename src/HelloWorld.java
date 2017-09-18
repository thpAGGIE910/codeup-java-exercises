public class HelloWorld {
    //intellij shortcut: psvm
    public static void main(String[] args) {

        //intellij shortcut: sout
        System.out.println("Hello World!");

        int myFavoriteNumber = 42;
        String myString = "I LOVE statically typed languages!";
        float myNumber;

        System.out.println(myFavoriteNumber);
        System.out.println(myString);

        // myString = 'T';
        // You cannot assign a character to a string, I received an incompatible types error

        // myString = 3.14159;
        // You cannot assign a double to a string, I received an incompatible types error

        // System.out.println(myNumber);
        // I received an error stating that the variable might not have been initialized

        // myNumber = 3.14;
        // System.out.println(myNumber);
        // I received an error 'possible lossy conversion from double to long'

        myNumber = 123;
        // Q: Why does assigning the value 3.14 to a variable declared as a long not compile,
        // but assigning an integer value does?
        // A: Because there is no loss in precision when assigning an integer to a long number, it performs an
        // implicit cast

        myNumber = (float) 3.14;
        // I received an error 'possible lossy conversion from double to float'
        // 1. Use an explicit cast to convert the number to a float ---> myNumber = (float) 3.14;
        // 2. Add an 'f' to the end of the number to let the compiler know to treat the
        // number as a float ---> myNumber = 3.14f;

        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        // int x = 5;
        // System.out.println(++x);
        // System.out.println(x);

        // The difference between the two code blocks is post- vs. pre-increment the post-increment (x++) in the first
        // example will increment the variable AFTER the println method uses the variable, whereas the pre-increment
        // (++x) will increment the variable BEFORE the println method uses the variable

        // double class = 0;
        // I receive multiple errors because 'class' is a keyword in Java

        // int x = 4;
        // x += 5;
        //System.out.println(x);

        // int x = 3;
        // int y = 4;
        // y *= x;
        // System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}
