package Part_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(18, 3);
		assertEquals(6,output);
		double output2 = test.divide(20, 5);
		assertEquals(4,output2);
	}
	 @Test
	   public void testFail() {
		 JunitTesting test = new JunitTesting();
			double output = test.divide(18, 3);
	      assertNotEquals(5,output);
	   }

}
