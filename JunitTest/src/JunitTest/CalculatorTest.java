package JunitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		System.out.println(" Adding test");
		 Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1));
	}
	@Test
	void failTestAdd() {
		System.out.println(" Adding test");
		 Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(2, 1));
	}

}
