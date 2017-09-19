public class ControlFlowExercises {
    public static void main(String[] args) {
    //1. Loop Basics
        //a. While Loop
        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        //b. Do-While
        i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while (i >= -10);

        i = 2;
        do {
            System.out.println(i);
            i = (int) Math.pow(i, 2);
        } while (i < 1000000);

        //c. For
        for (int j = 0; j <= 15; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int j = 100; j >= -10; j -= 5) {
            System.out.println(j);
        }

        for (int j = 2; j < 1000000; j = (int) Math.pow(j, 2)) {
            System.out.println(j);
        }
    }
}