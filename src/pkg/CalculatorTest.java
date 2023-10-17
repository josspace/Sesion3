package pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSum() {
		assertEquals(5, Calculator.sum(2,3));
	}
	
	@Test
	void testSubtraction() {
		assertEquals(-1, Calculator.subtraction(2,3));
	}
	
	@Test
	void testMultplication() {
		assertEquals(6, Calculator.multiplication(2,3));
	}
	
	@Test
	void testDivide() {
		assertEquals(0, Calculator.divide(2,3));
	}

}
