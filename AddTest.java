package co.maximuspro.jenkinsjavatest2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void testAdd1() {
		Functions test = new Functions();
		int result = test.add(1, 1);
		assertEquals(2, result);
	}

	@Test
	public void testAdd2() {
		Functions test = new Functions();
		int result = test.add(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void testAdd3() {
		Functions test = new Functions();
		int result = test.add(2, 3);
		assertNotEquals(6, result);
	}
}
