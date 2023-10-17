package pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {

	static Account actTesting;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		actTesting = new Account(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		actTesting.setBalance(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testRemove() {
		actTesting.remove(3000);
		assertEquals(-3000,actTesting.getBalance());
	}

	@Test
	void testEnter() {
		actTesting.enter(3000);
		assertEquals(3000,actTesting.getBalance());
	}
	
	

}
