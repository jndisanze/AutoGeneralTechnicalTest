package au.autogeneral.api;

import static org.junit.Assert.*;

import org.junit.Test;

import au.autogeneral.api.model.Balanced;

public class BalancedTest {

	@Test
	public void testIsBalancedEfficient() {
		assertTrue(Balanced.isBalancedEfficient("(){{{}}}[]"));
		assertFalse(Balanced.isBalancedEfficient("(){{{2}}}[]"));
		assertFalse(Balanced.isBalancedEfficient("("));
		assertFalse(Balanced.isBalancedEfficient("({[}])"));
		assertFalse(Balanced.isBalancedEfficient(null));
		assertFalse(Balanced.isBalancedEfficient(""));
		
	}

}
