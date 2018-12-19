package SkunkAppTests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import SkunkAppPackage.Dice;
import SkunkAppPackage.PredictableDie;
import SkunkAppPackage.Roll;

public class RollTest {
	private static PredictableDie pDie1;
	private static PredictableDie pDie2;
	private static int[] die1Values;
	private static int[] die2Values;
	private static Roll roll;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		roll	 				= new Roll();
	}

	@Test
	public final void testRoll() {		
		boolean range = RollTest.roll.getDice().getLastRoll() > 0 && RollTest.roll.getDice().getLastRoll() < 13;
		assertTrue(range);
		assertTrue(RollTest.roll instanceof Roll);
	}

	@Test
	public final void testGetDice() {
		assertTrue(RollTest.roll.getDice() instanceof Dice);
	}

	@Test
	public final void testIsSingleSkunk() {
		RollTest.die1Values 	= new int[] {1};
		RollTest.die2Values 	= new int[] {2};
		RollTest.pDie1 			= new PredictableDie(RollTest.die1Values);
		RollTest.pDie2 			= new PredictableDie(RollTest.die2Values);
		roll	 				= new Roll();
		roll.setDice(pDie1, pDie2);		
		//assertEquals(RollTest.roll.getDie1Value(), 1);
		assertTrue(roll.isSingleSkunk());	}

	@Test
	public final void testIsDeuceSkunk() {
		RollTest.die1Values 	= new int[] {1};
		RollTest.die2Values 	= new int[] {2};
		RollTest.pDie1 			= new PredictableDie(RollTest.die1Values);
		RollTest.pDie2 			= new PredictableDie(RollTest.die2Values);
		roll	 				= new Roll();
		roll.setDice(pDie1, pDie2);		
		assertEquals(RollTest.roll.getDie1Value(), 1);
		assertEquals(RollTest.roll.getDie2Value(), 1);
		assertTrue(roll.isDeuceSkunk());
	}

	@Test
	public final void testIsDoubleSkunk() {
		RollTest.die1Values 	= new int[] {1};
		RollTest.die2Values 	= new int[] {1};
		RollTest.pDie1 			= new PredictableDie(RollTest.die1Values);
		RollTest.pDie2 			= new PredictableDie(RollTest.die2Values);
		roll	 				= new Roll();
		roll.setDice(pDie1, pDie2);		
		assertEquals(RollTest.roll.getDie1Value(), 1);
		assertEquals(RollTest.roll.getDie2Value(), 1);
		assertTrue(roll.isDoubleSkunk());
	}

	@Test
	public final void testGetDie1Value() {
		RollTest.die1Values 	= new int[] {1};
		RollTest.die2Values 	= new int[] {2};
		RollTest.pDie1 			= new PredictableDie(RollTest.die1Values);
		RollTest.pDie2 			= new PredictableDie(RollTest.die2Values);
		roll	 				= new Roll();
		roll.setDice(pDie1, pDie2);		
		assertEquals(RollTest.roll.getDie1Value(), 1);
	}

	@Test
	public final void testGetDie2Value() {
		RollTest.die1Values 	= new int[] {1};
		RollTest.die2Values 	= new int[] {2};
		RollTest.pDie1 			= new PredictableDie(RollTest.die1Values);
		RollTest.pDie2 			= new PredictableDie(RollTest.die2Values);
		roll	 				= new Roll();
		roll.setDice(pDie1, pDie2);		
		assertEquals(RollTest.roll.getDie2Value(), 2);
	}

}
