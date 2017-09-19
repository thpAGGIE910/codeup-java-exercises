import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //3. Table of Powers
        Scanner input = new Scanner(System.in);
        int end = 0;
        char runAgain = 'n';

        do {
            System.out.println("This program displays the squares and cubes of numbers from 1 to the number you enter");
            System.out.print("What number would you like to go up to?: ");
            end = input.nextInt();
            input.nextLine();

            System.out.println("Here is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int count = 1; count <= end; count++) {
                System.out.printf("%-6d | %-7d | %d\n", count, (int) Math.pow(count, 2), (int) Math.pow(count, 3));
            }

            System.out.print("\nWould you like to enter another number? [y/n]: ");
            runAgain = Character.toLowerCase(input.next().charAt(0));
        }
        while(runAgain != 'n');
    }
}