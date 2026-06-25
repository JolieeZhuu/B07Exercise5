package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exercise4_Tests {

	// Testing Point Class
	
	Point p0 = new Point(0, 0);
	Point p1 = new Point(Math.sqrt(5), 0);
	Point p2 = new Point(Math.sqrt(5)/2, Math.sqrt(15)/2);
	Point p3 = new Point(0, 0);
	
	@Test
	void test_cons1() {
		assertEquals(p0.x, 0);
	}
	@Test
	void test_cons2() {
		assertEquals(p2.y, Math.sqrt(15)/2);
	}
	
	@Test
	void test_dist() {
		assertEquals(p0.distance(p1), Math.sqrt(5));
	}
	
	@Test
	void test_hash() {
		assertEquals(p0.hashCode(), p3.hashCode());
	}
	
	@Test 
	void test_equals0() {
		assertEquals(p0, p0);
	}
	@Test
	void test_equals1(){
		assertEquals(p0, p3);
	}
	@Test
	void test_equals2() {
		assertFalse(p0.equals(null));
	}
	@Test
	void test_equals3() {
		String s = "hello there";
		assertFalse(p0.equals(s));
	}
	@Test
	void test_equals4() {
		assertFalse(p0.equals(p1));
	}
	@Test
	void test_equals5() {
		p3.y = 2;
		assertFalse(p0.equals(p3));
	}
	
	
	// Testing triangle class
	
	Triangle t = new Triangle(p0, p1, p2);
	
	@Test
	void test_consA() {
		assertEquals(t.A, p0);
	}
	@Test
	void test_consB() {
		assertEquals(t.B, p1);
	}
	@Test
	void test_consC() {
		assertEquals(t.C, p2);
	}

	@Test
	void test_perimeter() {
		assertEquals(p0.distance(p1) + p1.distance(p2) + p2.distance(p0), t.perimeter());
	}
	
	@Test
	void test_equilateral() {
		assertTrue(t.isEquilateral());
	}
	
	@Test
	void test_non_equilateral() {
		t.C = p3;
		assertFalse(t.isEquilateral());
	}
}
