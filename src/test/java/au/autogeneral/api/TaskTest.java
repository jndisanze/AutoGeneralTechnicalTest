package au.autogeneral.api;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import au.autogeneral.api.model.Task;

public class TaskTest {
    private Task a;
    @Before
    public void beforeFunction(){
        a = new Task();
        a.setTask("");
        Long n = (long) 1256399;
        a.setId(n);
        a.setIsBalanced(false);
    }
	@Test
	public void testGetId() {
		assertFalse(a.getId()==(long) 125639);
		assertTrue(a.getId()==(long) 1256399);
	}

	@Test
	public void testSetId() {
		a.setId((long) -12);
		assertFalse(a.getId()==(long) 500);
		assertTrue(a.getId()==(long) -12);
	}

	@Test
	public void testGetTask() {
		assertEquals("",a.getTask());
		a.setId((long) -2569);
		assertFalse(a.getId()==(long) 500);
		assertTrue(a.getId()==(long) -2569);
	}

	@Test
	public void testSetIsBalanced() {
		a.setIsBalanced(false);
		assertFalse(a.getIsBalanced());
		a.setIsBalanced(true);
		assertTrue(a.getIsBalanced());
		a.setId((long) -2569);
		assertFalse(a.getId()==(long) 500);
		assertTrue(a.getId()==(long) -2569);
		
	}

	@Test
	public void testGetIsBalanced() {
		
		
	}

	@Test
	public void testSetTask() {
		a.setTask("dfsgddg");
		assertEquals("dfsgddg",a.getTask());
	}

	@Test
	public void testToString() {
		
	}

}
