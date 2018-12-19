package SkunkAppTests;

import static org.junit.Assert.*;


import org.junit.BeforeClass;
import org.junit.Test;

public class BroadcastTest {

	private static String message;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BroadcastTest.message = "message to broadcast";
	}

	@Test
	public final void testShowMessage() {
		assertTrue(BroadcastTest.message instanceof String);;
	}

}
