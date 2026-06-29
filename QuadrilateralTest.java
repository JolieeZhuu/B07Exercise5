package exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuadrilateralTest {
     @Test
    void testAreaOfRectangle() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 5);
        Point p4 = new Point(0, 5);
        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertEquals(15.0, q.area(),0.001);
    }
    @Test
    void testAreaOfSquare() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(0, 3);
        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertEquals(9, q.area(),0.001);
    }

    @Test
    void testAreaOfNonRectangle() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(3, 2);
        Point p4 = new Point(0, 2);
        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertEquals(7.0, q.area(), 0.001);
    }


    void testPerimeterOfRectangle() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 5);
        Point p4 = new Point(0, 5);
        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertEquals(16.0, q.perimeter(),0.001);
    }
    @Test
    void testPerimeterOfSquare() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(0, 3);
        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertEquals(12.0, q.perimeter(),0.001);
    }

    @Test
    void testPerimeterOfNonRectangle() {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(2, 4);
        Point p3 = new Point(4, 7);
        Point p4 = new Point(5, 8);
        Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);
        assertEquals(12.84, q.perimeter(), 0.01);
    }
   
}
