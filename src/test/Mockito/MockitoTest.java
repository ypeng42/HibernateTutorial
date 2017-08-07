package Mockito;

import learn.MockitoResources.MyClass;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.objenesis.instantiator.ObjectInstantiator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoTest  {

	/**
	 * go over some mockito magic!
	 *
	 */
	@Test
	public void test1()  {
		/**
		 * Use mock() or @Mock to mock object
		 */
		MyClass test = mock(MyClass.class);

		/**
		 * The mockSetting idea is pretty neat, without overloading too many mock() method
		 *
		 * MockHandler is the core of mockito
		 *
		 * ByteBuddyMockMaker serve as the programmatic entry point to all mockito internal MockMakers
		 *
		 *
		 *
		 * purpose of instantiator:
		 * Return an {@link ObjectInstantiator} allowing to create instance without any constructor being
		 * called.
		 *
		 *
		 * https://groups.google.com/forum/#!topic/mockito/QsIloTgOOi4
		 * Mockito uses runtime code generation techniques to build implementations of mocks
		 *
		 * what the hell is org.objenesis??
		 */

		// define return value for method getUniqueId()
		when(test.getUniqueId()).thenReturn(43);

		// Step 2: let's step in and see what's going on there...
		int value = test.getUniqueId();
		assertEquals(value, 43);

		// Step 1: add a different method
		// this doesn't work!
		// seems like the mock class only does what we tell it to do!
		assertEquals(test.anotherMethod(), 10000);
	}
}