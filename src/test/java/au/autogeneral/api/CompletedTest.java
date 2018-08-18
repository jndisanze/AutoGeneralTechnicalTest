package au.autogeneral.api;

import static org.junit.Assert.*;

import org.junit.Test;

import au.autogeneral.api.model.Balanced;
import au.autogeneral.api.model.Completed;

public class CompletedTest {

	@Test
	public void test() {
		assertTrue(Completed.isCompleted("fff566"));
		assertTrue(Completed.isCompleted("2"));
		assertTrue(Completed.isCompleted("012345678901234567890123"));
		assertFalse(Completed.isCompleted(null));
		assertFalse(Completed.isCompleted("012345678901234567890123012345678901234567890123012345678901234567890123"));
	}

}
