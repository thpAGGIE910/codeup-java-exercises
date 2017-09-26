package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle;
        Input inputReader = new Input();

        do {
            System.out.print("Enter the radius of the circle: ");
            circle = new Circle(inputReader.getDouble());

            System.out.printf("A circle with radius %.2f has a circumference of %.5f and area of %.5f\n",
                              circle.getRadius(), circle.getCircumference(), circle.getArea());

            inputReader.getString();
            System.out.print("Would you like to get information for another circle?[y/N]: ");
        } while(inputReader.yesNo());
    }
}
