package Die.java;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.princeton.cs.introcs.*;
	public class DieTest
	{
		
		@Test
		public void testSetLastRoll() {
		    System.out.println("setLastRoll");
		    int lastRoll = 100;
		    Die instance = new Die();
		    instance.lastRoll(lastRoll);
		    // TODO review the generated test code and remove the default call to fail.
		    assertEquals(instance.getLastRoll(), lastRoll);
		}

		/**
		 * Test of getLastRoll method, of class Die.
		 */
		@Test
		public void testGetLastRoll() {
		    System.out.println("getLastRoll");
		    Die instance = new Die();
		    int expResult = 100;
		    instance.lastRoll(6);
		    int result = instance.getLastRoll();
		    assertEquals(expResult, result);
	}
	}

