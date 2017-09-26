import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.getString("Enter a string: "));

        System.out.println(input.yesNo("This is a test of the yesNo method\nWould you like to continue? [y/N]:") ? "Yes" : "No");

        System.out.printf("You entered %d\n", input.getInt(1, 5, "Enter an integer between 1 and 5:"));

        System.out.printf("You entered %d\n", input.getInt("Enter an integer: "));

        System.out.printf("You entered %.1f\n", input.getDouble(3.0, 3.5, "Enter a double between 3.0 and 3.5: "));

        System.out.printf("You entered %.2f\n", input.getDouble("Enter an double: "));
    }
}