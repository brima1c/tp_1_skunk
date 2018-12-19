package SkunkAppTests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import SkunkAppPackage.Die;

public class DieTest {

	private static Die die;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		DieTest.die = new Die();
	}

	@Test
	public final void testDie() {
		assertTrue(DieTest.die instanceof Die);
	}

	@Test
	public final void testGetLastRoll() {
		DieTest.die.roll();
		boolean range = DieTest.die.getLastRoll() > 0 && DieTest.die.getLastRoll() < 7;
		assertTrue(range);	
	}

	@Test
	public final void testRoll() {
		DieTest.die.roll();
		boolean range = DieTest.die.getLastRoll() > 0 && DieTest.die.getLastRoll() < 7;
		assertTrue(range);		}

	@Test
	public final void testToString() {
		DieTest.die.roll();
		assertTrue(DieTest.die.toString() instanceof String);
	}

}
