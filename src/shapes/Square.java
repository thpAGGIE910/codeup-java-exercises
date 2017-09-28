package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getLength() {
        return super.getLength();
    }

    public void setLength(double length) {
        super.setLength(length);
    }

    public double getPerimeter() {
        return 4 * super.getLength();
    }

    public double getArea() {
        return Math.pow(super.getLength(), 2);
    }
}