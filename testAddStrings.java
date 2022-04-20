package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test()
	{
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addString("Hello","World");
		assertEquals("HelloWorld",result);
	}

}
