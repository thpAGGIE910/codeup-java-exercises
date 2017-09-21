import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //Problem 1
        System.out.printf("The sum of 1 and 3 is %d\n", add(1,3));
        System.out.printf("The difference of 5 and 2 is %d\n", subtract(5, 2));
        System.out.printf("The quotient of 6 by 3 is %d\n", divide(6,3));
        System.out.printf("The product of 9 and 5 is %d\n", multiply(9,5));
        System.out.printf("The remainder of 7 divided by 3 is %d\n", modulus(7,3));
        //System.out.printf("Trying to divide by zero, this should throw an error...", divide(1,0));

        //Problem 2
        int min = 1;
        int max = 10;
        int userInput;

        if(min <= max) {
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            userInput = getInteger(min, max);
        } else {
            System.out.printf("Please enter a number between %d and %d: ", max, min);
            userInput = getInteger(max, min);
        }

        System.out.printf("You entered the number %d!\n", userInput);

        //Problem 3
        boolean userFinished = false;
        Scanner input = new Scanner(System.in);
        long factorialResult;
        min = -1;
        max = 20;

        do {
            System.out.printf("I print the factorial of an integer between %d and %d.\nEnter a number (-1 to quit): ", 1, max);
            userInput = getInteger(min, max);
            if (userInput >= 0) {
                factorialResult = factorial(userInput);
                System.out.printf("The factorial of %d is %d\n", userInput, factorialResult);
            } else {
                userFinished = true;
            }
        } while(!userFinished);
    }

    private static long factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int getInteger(int min, int max) {
        Scanner inputStream = new Scanner(System.in);
        int input = inputStream.nextInt();

        if(input < min) {
            System.out.printf("ERROR: The number you entered (%d) is less than the min (%d)!\n", input, min);
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        } else if (input > max) {
            System.out.printf("ERROR: The number you entered (%d) is greater than the max (%d)!\n", input, max);
            System.out.printf("Please enter a number between %d and %d: ", min, max);
            return getInteger(min, max);
        }

        return input;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int divide(int c, int d) {
        if(d == 0) {
            System.err.print("Error: Attempt to divide by zero detected...");
        }
        return c / d;
    }

    public static int multiply(int a, int b) {
//        int product = 0;
//
//        for (int i = 0; i < b; i++) {
//            product += a;
//        }
//
//        return product;
        if(b == 0) {
            return 0;
        }
        return (a + multiply(a, b - 1));
    }

    public static int modulus(int c, int d) {
        return c % d;
    }
}