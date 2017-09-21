public class MethodsExercises {
    public static void main(String[] args) {
        System.out.printf("The sum of 1 and 3 is %d\n", add(1,3));
        System.out.printf("The difference of 5 and 2 is %d\n", subtract(5, 2));
        System.out.printf("The quotient of 6 by 3 is %d\n", divide(6,3));
        System.out.printf("The product of 9 and 5 is %d\n", multiply(9,5));
        System.out.printf("The remainder of 7 divided by 3 is %d\n", modulus(7,3));
        //System.out.printf("Trying to divide by zero, this should throw an error...", divide(1,0));
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