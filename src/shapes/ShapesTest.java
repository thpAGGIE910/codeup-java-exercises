package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        System.out.printf("Box 1\nPerimeter = %f Area = %f\n", box1.getPerimeter(), box1.getArea());
        System.out.printf("\nBox 2\nPerimeter = %f Area = %f\n", box2.getPerimeter(), box2.getArea());
    }
}