package Die.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import edu.princeton.cs.introcs.*;
	public class DieTest
	{
	private Die die;
	
	@Before
	public void setUp () throws Exception{
		int[]init_values = new int[]
				{3,2,1};
		die = new Die (init_values);
		StdOut.println("setUp() called");
		
	}
	@After
	public void tearDown() throws Exception{}
	
	
	@Test
	public void test_initialization_of_practicable_die()
	{
		die.roll();
		int value = die.getLastRoll();
		asserEquals("first value not 3", 3, value);
	}
	
		
		private void asserEquals(String string, int i, int value) {
		// TODO Auto-generated method stub
		
	}
		
	}

