import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //4. Grade Converter (numeric -> alphabetic)
        Scanner input = new Scanner(System.in);
        int end = 0, gradeToConvert = 0;
        char runAgain = 'n';

        do {
            System.out.println("This program converts the numeric grade entered into an alphabetic grade.");
            System.out.print("Please enter a grade [0 - 100]: ");
            gradeToConvert = input.nextInt();
            input.nextLine();

            if (gradeToConvert > 87) {
                System.out.println(gradeToConvert + " = " + "A");
            } else if (gradeToConvert > 79) {
                System.out.println(gradeToConvert + " = " + "B");
            } else if (gradeToConvert > 66) {
                System.out.println(gradeToConvert + " = " + "C");
            } else if (gradeToConvert >= 60) {
                System.out.println(gradeToConvert + " = " + "D");
            } else {
                System.out.println(gradeToConvert + " = " + "F");
            }

            System.out.print("\nWould you like to enter another grade? [y/n]: ");
            runAgain = Character.toLowerCase(input.next().charAt(0));
        }
        while(runAgain != 'n');
    }
}
