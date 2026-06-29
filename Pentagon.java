package exercise4;
public class Pentagon {
    Point[] p;
    
    Pentagon(Point p1, Point p2, Point p3, Point p4, Point p5) {
        this.p = new Point[]{p1, p2, p3, p4, p5};
    }
    
    public boolean isRegular() {
        double e = 1e-9;
        double side1 = p[0].distance(p[1]);
        double side2 = p[1].distance(p[2]);
        double side3 = p[2].distance(p[3]);
        double side4 = p[3].distance(p[4]);
        double side5 = p[4].distance(p[0]);

        double diagonal1 = p[0].distance(p[2]);
        double diagonal2 = p[1].distance(p[3]);
        double diagonal3 = p[2].distance(p[4]);
        double diagonal4 = p[3].distance(p[0]);
        double diagonal5 = p[4].distance(p[1]);

        return Math.abs(side1 - side2) < e && Math.abs(side2 - side3) < e && Math.abs(side3 - side4) < e && Math.abs(side4 - side5) < e && Math.abs(diagonal1 - diagonal2) < e && Math.abs(diagonal2 - diagonal3) < e && Math.abs(diagonal3 - diagonal4) < e && Math.abs(diagonal4 - diagonal5) < e;
    }
    
    public double area() {
        if (!isRegular()) return -1;
        double s = p[0].distance(p[1]);
        return 0.25 * Math.sqrt(5*(5+2*Math.sqrt(5)))* s * s;
    }
    
    public double perimeter() {
        return p[0].distance(p[1]) + p[1].distance(p[2]) +p[2].distance(p[3]) + p[3].distance(p[4]) + p[4].distance(p[0]);
    }
}