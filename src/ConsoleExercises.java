import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String sentence = "";
        double roomLength;
        double roomWidth;
        double roomHeight;

        System.out.print("Please enter a number: ");
        input.nextInt();

        //Q: What happens if you input something that is not an integer?
        //A: A runtime error that crashes the program and prints out a stack trace

        System.out.print("Enter three words separated by spaces: ");
        str1 = input.next();
        str2 = input.next();
        str3 = input.next();
        System.out.printf("The three words you entered were %s, %s and %s\n", str1, str2, str3);
        input.nextLine();

        /*
        * Q: What happens if you enter less than 3 words?
        * A: The scanner will go to the next line and wait for another word to be entered
        *
        * Q: What happens if you enter more than 3 words?
        * A: The scanner will disregard the any input after the first three words
        * */

        System.out.print("Enter a sentence: ");
        //sentence = input.next();

        //Q: Do you capture all the words?
        //A: No, the scanner old grabs input until the first whitespace character is entered

        sentence = input.nextLine();
        System.out.printf("You entered the following string: %s\n", sentence);

        System.out.print("Please enter the length of the room: ");
        roomLength = input.nextDouble();

        System.out.print("Please enter the width of the room: ");
        roomWidth = input.nextDouble();

        System.out.print("Please enter the height of the room: ");
        roomHeight = input.nextDouble();

        System.out.printf("The perimeter of the room is %.2f ft.\n", calcPerimeter(roomLength, roomWidth));
        System.out.printf("The area of the room is %.2f sq. ft.\n", calcArea(roomLength, roomWidth));
        System.out.printf("The volume of the room is %.2f cu. ft.\n", calcVolume(roomLength, roomWidth, roomHeight));
    }

    public static double calcPerimeter(double length, double width) {
        return (2 * length + 2 * width);
    }

    public static double calcArea(double length, double width) {
        return (length * width);
    }

    public static double calcVolume(double length, double width, double height) {
        return (calcArea(length, width) * height);
    }
}