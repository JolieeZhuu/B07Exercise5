package exercise5;

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
