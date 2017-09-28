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

/*
 * 9. Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
 * Ans: Every class that implements an interface must implement each method declared in the interface. Since
 * the Rectangle class implements the Measurable interface, it must define the implementation of the getPerimeter()
 * method.
 *
 * 10. What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
 * Ans: Because the Measurable interface does not declare the getLength or getWidth methods, it will not be available
 * to any instances that are declared type Measurable.
 */