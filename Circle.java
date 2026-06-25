package exercise4;

public class Circle {
    double r; // radius

    public Circle(double r) {
        this.r = r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
}