package unitTest;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class unitTest {
	@Test
	public void testFindMin() {
		int[] nums = {1,2,3,4};
		assertEquals(1, sprint0.testCase.findMin(nums));
	}
	
	@Test
	public void testComputeSquare() {
		assertEquals(16, sprint0.testCase.computeSquare(4));
		assertEquals(400, sprint0.testCase.computeSquare(20));
	}
}
