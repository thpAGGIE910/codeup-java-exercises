package shapes;

public class Circle {
    private double radius;

    public Circle(double r) {
        setRadius(r);
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}