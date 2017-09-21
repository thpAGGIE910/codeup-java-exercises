import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userResponse = "";
        boolean userIsFinished = false;

        System.out.println("Hey, I\'m Bob, how\'s it going today?");
        do {
            System.out.print("Your response(Type \'q\' to quit): ");
            userResponse = input.nextLine();
            if (userResponse.equalsIgnoreCase("q")){
                System.out.println("See ya later!");
                userIsFinished = true;
            }
            else {
                if (userResponse.isEmpty()) {
                    System.out.println("Fine. Be that way!");
                } else if (userResponse.equals(userResponse.toUpperCase()) || userResponse.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userResponse.endsWith("?")) {
                    System.out.println("Sure.");
                } else {
                    System.out.println("Whatever.");
                }
            }
        } while (!userIsFinished);
    }
}