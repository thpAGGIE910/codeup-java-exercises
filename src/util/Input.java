package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String response = scanner.nextLine();
        return (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"));
    }

    public int getInt(int min, int max) {
        int response;

        try {
            response = scanner.nextInt();
            if (response < min || response > max) {
                throw new OutOfBoundsException();
            }
        } catch(InputMismatchException ime) {

            System.out.println("Input must be an integer!");
            scanner.nextLine();
            return getInt(min, max);

        } catch(OutOfBoundsException obe) {

            System.out.printf("Input is outside the range [%d, %d]!\n", min, max);
            scanner.nextLine();
            return getInt(min, max);
        }

        return response;
    }

    public int getInt() {
        try {
            return scanner.nextInt();

        } catch (InputMismatchException ime) {

            System.out.println("Input must be an integer!");
            scanner.nextLine();
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double response;

        try {
            response = scanner.nextDouble();
            if (response < min || response > max) {
                throw new OutOfBoundsException();
            }
        } catch(InputMismatchException ime) {

            System.out.println("Input must be an double!");
            scanner.nextLine();
            return getDouble(min, max);

        } catch(OutOfBoundsException obe) {

            System.out.printf("Input is outside the range [%.2f, %.2f]!\n", min, max);
            scanner.nextLine();
            return getDouble(min, max);
        }

        return response;
    }

    public double getDouble() {
        try {
            return scanner.nextDouble();

        } catch (InputMismatchException ime) {

            System.out.println("Input must be an double!");
            scanner.nextLine();
            return getDouble();
        }
    }
}
