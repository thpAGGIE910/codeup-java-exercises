import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: ");
        System.out.println(input.getString());

        System.out.println("This is a test of the yesNo method\nWould you like to continue? [y/N]:");
        System.out.println(input.yesNo() ? "Yes" : "No");

        System.out.println("Enter an integer between 1 and 5:");
        System.out.printf("You entered %d\n", input.getInt(1, 5));

        System.out.println("Enter an integer: ");
        System.out.printf("You entered %d\n", input.getInt());

        System.out.println("Enter a double between 3.0 and 3.5:");
        System.out.printf("You entered %.1f\n", input.getDouble(3.0, 3.5));

        System.out.println("Enter an double: ");
        System.out.printf("You entered %.2f\n", input.getDouble());
    }
}