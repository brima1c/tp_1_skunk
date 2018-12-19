package SkunkAppTests;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

import SkunkAppPackage.PredictableDie;

public class PredictableDieTest {

	private static PredictableDie pDie;
	private static int[] dieValues;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		PredictableDieTest.dieValues = new int[] {1,3,2,3,4,5,6,5,4,3,3,3,1,3,1,5,2,6,5,3,5,1};
		PredictableDieTest.pDie = new PredictableDie(PredictableDieTest.dieValues);
	}


	@Test
	public final void testPredictableDie() {
		assertTrue(PredictableDieTest.pDie instanceof PredictableDie);
	}

	@Test
	public final void testGetLastRoll() {
		PredictableDieTest.pDie.roll();
		assertEquals(PredictableDieTest.pDie.getLastRoll(),PredictableDieTest.dieValues[2]);
	}

	@Test
	public final void testRoll() {
		PredictableDieTest.pDie.roll();
		assertEquals(PredictableDieTest.pDie.getLastRoll(),PredictableDieTest.dieValues[0]);	}

	@Test
	public final void testToString() {
		PredictableDieTest.pDie.roll();
		assertEquals(PredictableDieTest.pDie.toString(),"Die: " +PredictableDieTest.dieValues[1]);	}
}
