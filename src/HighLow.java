import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class HighLow {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int NUM_GUESSES = 7;

    public static void main(String[] args) {
        int correctNumber = randomIntegerInRange(MIN_NUMBER, MAX_NUMBER);
        int guessesRemaining = NUM_GUESSES;
        int userGuess;
        boolean userWon = false;

        displayInstructions();

        do {
             System.out.printf("\nYou have %d %s remaining.\n",
                               guessesRemaining, (guessesRemaining == 1 ? "guess" : "guesses"));

             userGuess = getIntegerInRange(MIN_NUMBER, MAX_NUMBER);

             if(userGuess == correctNumber) {
                 userWon = true;
                 System.out.println("Congratulations, you guessed the correct number!!!");
             } else {
                 guessesRemaining--;
                 System.out.printf("Sorry, %d was not the correct number. " +
                                   "The number is %s!\n",
                                   userGuess, (correctNumber < userGuess ? "LOWER" : "HIGHER"));
             }

        } while(!userWon && guessesRemaining > 0);

        if(!userWon) {
            System.out.printf("The number was %d.\n", correctNumber);
        }
    }

    public static void displayInstructions() {
        System.out.println("   WELCOME TO THE GUESSING GAME!!!");
        System.out.println("-------------------------------------");
        System.out.printf("You have %d chances to pick a randomly chosen number between %d and %d.\n",
                          NUM_GUESSES, MIN_NUMBER, MAX_NUMBER);
    }

    public static int randomIntegerInRange(int low, int high) {
        Random randomNumGen = new Random();

        // Random's nextInt() method chooses a number in the range [0, range)
        // adding 1 to the high value to have a range of [0, range]
        int range = high + 1 - low;
        int numberInRange = randomNumGen.nextInt(range);

        //shifting the range to be in [low, high]
        numberInRange += low;

        return numberInRange;
    }

    public static int getIntegerInRange(int min, int max) {
        Scanner inputStream = new Scanner(System.in);
        int input;

        System.out.printf("Please enter a number between %d and %d: ", min, max);
        try {
            input = inputStream.nextInt();

            if(input < min) {
                System.out.printf("ERROR: The number you entered (%d) is less than the min (%d)!\n", input, min);
                return getIntegerInRange(min, max);
            } else if (input > max) {
                System.out.printf("ERROR: The number you entered (%d) is greater than the max (%d)!\n", input, max);
                return getIntegerInRange(min, max);
            }
        }
        catch (InputMismatchException ime) {
            System.out.printf("ERROR: Input must be an integer between %d and %d\n", min, max);
            return getIntegerInRange(min, max);
        }

        return input;
    }
}