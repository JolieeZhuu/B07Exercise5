/*
 * Circle test
 * 
 * 1.0
 *
 * Jul 16
 * 
 * Apache 3.0 license
 */
package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testPerimeter() {
		Circle circle = new Circle(2);
		assertEquals(circle.perimeter(), 4 * Math.PI);
	}

	@Test
	void testArea() {
		Circle circle = new Circle(3);
		assertEquals(circle.area(), 9 * Math.PI);
	}

}
