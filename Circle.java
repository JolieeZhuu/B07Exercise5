/*

 * Circle
 * 
 * 1.0
 *
 * Jul 16
 * 
 * Apache 3.0 license
 */

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