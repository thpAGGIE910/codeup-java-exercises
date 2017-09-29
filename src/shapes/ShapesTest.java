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
 *
 * Q: Does `Rectangle` need to implement `Measurable`?
 * Ans: No, since the abstract class that `Rectangle` inherits from (`Quadrilateral`) implements `Measurable`,
 * the `Rectangle` class would need to define the methods in the `Measurable` interface.
 *
 * Q: Could a class other than `Quadrilateral` implement `Measurable`?
 * Ans: Yes, the `Rectangle` and `Square` classes could implement the `Measurable` interface.
 *
 * Q: Can your `Circle` class implement `Measurable`, or extend a class that does? What Changes, if any, would you need
 * to make?
 * Ans: Yes, the circle class can implement 'Measurable' without any changes, if the programmer is willing to
 * concede that the circumference of a circle is it's perimeter.
 *
 * Q: Is there anywhere in `CircleApp` that could benefit from the use of interfaces?
 * Ans:
 */