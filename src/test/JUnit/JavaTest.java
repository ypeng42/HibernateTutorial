package JUnit;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

/**
 * JUnit is part of XUnit family, see wiki:
 * https://en.wikipedia.org/wiki/XUnit
 *
 *
 * There are JUnit competitors out there, TestNG.
 * but junit is definitely the most popular test framework and also the most
 * popular repo on Github.
 *
 * Jnuit vs TestNg:
 * http://blog.takipi.com/junit-vs-testng-which-testing-framework-should-you-choose/
 */
public class JavaTest extends TestCase {
	protected int value1, value2;
	/**
	 * to extend or not to extend TestCase
	 * https://stackoverflow.com/questions/10964427/unit-test-using-junit-4-10
	 */



	/**
	 * JUnitCore is the starting point of test. Notice it has a main() method there.
	 *
	 * Tests can be run either manually or using IDE integration, same code is called under the hood.
	 *
	 * When run manually, the main method will be invoked and the name of the testSuit should be passed in as arguments
	 * if you want more control:
	 * https://stackoverflow.com/questions/9288107/run-single-test-from-a-junit-class-using-command-line
	 *
	 * A nice blog post explaining the process:
	 * https://medium.com/@pelensky/java-tdd-with-junit-without-using-an-ide-cd24d38adff
	 *
	 * In IDE integration, the run method of JUnitCore will be called. They have an online doc for how to integrate IDE with JUnit.
	 */

	// assigning the values
	protected void setUp(){
		value1 = 3;
		value2 = 3;
	}

	@Test
	public void testAdd(){
		double result = value1 + value2;
		assertTrue(result == 6);
	}

	public void test2(){
		double result = value1 + value2;
		assertTrue(result == 6);
	}
}
