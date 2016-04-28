import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sk.main.Main;

public class TestJUnit {
	Main main;

	@Before
	public void avant() {
		main = new Main();
		String s = main.extraitAtt("<qsdfsdf nom='b' qsdfsdf=''>", "nom='");
		assertEquals("b", s);
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
	}

}
