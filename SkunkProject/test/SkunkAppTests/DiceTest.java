package SkunkAppTests;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import SkunkAppPackage.Dice;
import SkunkAppPackage.Die;

public class DiceTest {
	private static Dice dice;
	private static Dice dice2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		DiceTest.dice = new Dice();
		Die die1 = new Die(); 
		Die die2 = new Die();
		DiceTest.dice2 = new Dice(die1, die2);
	}


	@Test
	public final void testDice() {
		assertTrue(DiceTest.dice instanceof Dice);
		assertTrue(DiceTest.dice.getDie1() instanceof Die);
		assertTrue(DiceTest.dice.getDie2() instanceof Die);
		DiceTest.dice.roll();
		boolean range = DiceTest.dice.getLastRoll() > 0 && DiceTest.dice.getLastRoll() < 13;
		assertTrue(range);
	}

	@Test
	public final void testDiceDieDie() {
		assertTrue(DiceTest.dice2 instanceof Dice);
		assertTrue(DiceTest.dice2.getDie1() instanceof Die);
		assertTrue(DiceTest.dice2.getDie2() instanceof Die);
		DiceTest.dice2.roll();
		boolean range = DiceTest.dice2.getLastRoll() > 0 && DiceTest.dice2.getLastRoll() < 13;
		assertTrue(range);
	}

	@Test
	public final void testGetLastRoll() {
		DiceTest.dice.roll();
		boolean range = DiceTest.dice.getLastRoll() > 0 && DiceTest.dice.getLastRoll() < 13;
		assertTrue(range);
	}

	@Test
	public final void testRoll() {
		DiceTest.dice.roll();
		boolean range = DiceTest.dice.getLastRoll() > 0 && DiceTest.dice.getLastRoll() < 13;
		assertTrue(range);
	}

	@Test
	public final void testToString() {
		DiceTest.dice.roll();
		assertTrue(DiceTest.dice.toString() instanceof String);

	}

	@Test
	public final void testGetDie1() {
		DiceTest.dice.roll();
		assertTrue(DiceTest.dice.getDie1() instanceof Die);
	}

	@Test
	public final void testGetDie2() {
		DiceTest.dice.roll();
		assertTrue(DiceTest.dice.getDie2() instanceof Die);	}

}
