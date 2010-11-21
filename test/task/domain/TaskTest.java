package task.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {

	private static final String TEST_TITLE = "Test Title";

	@Test
	public void testSetTitel() {
		Task task = new Task();
		task.setTitel(TEST_TITLE);
		assertEquals(TEST_TITLE, task.getTitel());
	}

}
