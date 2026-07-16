/*
 * Quadrilateral Class
 * 
 * 1.0
 *
 * Jul 16
 * 
 * Apache 3.0 license
 */
package exercise5;

public class Quadrilateral {
    Point[] p;

    Quadrilateral(Point p1, Point p2, Point p3, Point p4){
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        p[3] = p4;
    }

    Quadrilateral(Point[] p_arr){
        p = p_arr;
    }

    double p_mult(Point p1, Point p2){
        return p1.x * p2.y - p2.x * p1.y;
    }

    double area(){
        double area = 0; 
        for (int i = 0; i < 4; ++i) {
            area += p_mult(p[i], p[(i + 1) % 4]); // Shoelace formula.
        }
        return area;
    }

    double perimeter(){
        double perimeter = 0;
        for (int i = 0; i < 4; ++i) {
            perimeter += p[i].distance(p[(i + 1) % 4]);
        }
        return perimeter;
    }
}
