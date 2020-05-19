package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();

		int result1 = test.countA("suit");		// failed
		int result2 = test.countA("tarantino");	// success
		int result3 = test.countA("fiction");	// failed

		assertEquals(1, result1);
		assertEquals(2, result2);
		assertEquals(3, result3);
	}

}
