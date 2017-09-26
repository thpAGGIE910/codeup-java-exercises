package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        String response;

        response = scanner.nextLine();

        return response;
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String response;

        response = scanner.nextLine();
        return (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"));
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
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

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        return getInt(min, max);
    }

    public int getInt() {
        int response;

        try {
            response = scanner.nextInt();

        } catch (InputMismatchException ime) {

            System.out.println("Input must be an integer!");
            scanner.nextLine();
            return getInt();
        }

        return response;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
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

    public double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        return getDouble(min, max);
    }

    public double getDouble() {
        double response;
        try {
            response = scanner.nextDouble();

        } catch (InputMismatchException ime) {

            System.out.println("Input must be an double!");
            scanner.nextLine();
            return getDouble();
        }

        return response;
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble();
    }
}
