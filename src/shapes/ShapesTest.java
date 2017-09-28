package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        showShapeInfo(myShape);
        myShape = new Square(5);
        showShapeInfo(myShape);
    }

    public static void showShapeInfo(Measurable shape) {
        System.out.printf("Perimeter = %f Area = %f\n", shape.getPerimeter(), shape.getArea());
    }
}