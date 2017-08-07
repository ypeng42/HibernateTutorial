package JUnit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JavaTestSup {
	// not extend TestCase will use BlockJUnit4Runner instead of JUnit38 runner
	// and will call ParentRunner.run()
	// the core is BlockRunner will override runChile() method

	@Test
	public void test3(){
		double result = 6;
		assertTrue(result == 6);
	}
}
