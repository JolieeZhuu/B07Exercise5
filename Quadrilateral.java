package exercise5;

public class Quadrilateral {
    Point[] p;

    Quadrilateral(Point p1, Point p2, Point p3, Point p4){
        p = {p1, p2, p3, p4};   
    }

    Quadrilateral(Point[4] p_arr){
        p = p_arr;
    }

    double p_mult(Point p1, p2){
        return (p1.x * p2.y - p2.x * p1.y);
    }

    double area(){
        // Implements shoelace formula.
        double area = 0;
        for (int i = 0; i < 4; ++i){
            area += p_mult(p[i], p[(i + 1) % 4]);
        }
        return area;
    }

    double perimeter(){
        double perimeter = 0;
        for (int i = 0; i < 4; ++i){
            perimeter += p[i].distance(p[(i + 1) % 4]);
        }
        return perimeter;
    }
}
