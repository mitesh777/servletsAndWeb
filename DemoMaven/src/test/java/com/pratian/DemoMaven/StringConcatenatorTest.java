package com.pratian.DemoMaven;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

import com.pratian.DemoMaven.main.InvalidInputException;
import com.pratian.DemoMaven.main.StringConcatenator;

public class StringConcatenatorTest {

	@Test(expected=InvalidInputException.class)
	public void testConcatenate_whenPassesTwoNullStrings_throwsInvalodOnputException() throws InvalidInputException {
		// Arrange 
		StringConcatenator obj = new StringConcatenator();
		//Act 
		String result = obj.concatenate(null,null);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testConcatenate_whenPassesNullStringAndABC_returnABC() throws InvalidInputException{
		// Arrange 
		StringConcatenator obj = new StringConcatenator();
		//Act 
		String result = obj.concatenate(null,"ABC");
		//Assert
		assertEquals("ABC", result);
	}
	
	@Test
	public void testConcatenate_whenPassesStringABCAndNull_returnABC() throws InvalidInputException{
		// Arrange 
		StringConcatenator obj = new StringConcatenator();
		//Act 
		String result = obj.concatenate("ABC",null);
		//Assert
		assertEquals("ABC", result);
	}
	
	@Test
	public void testConcatenate_whenPassesStringABCAndDEF_returnABC() throws InvalidInputException{
		// Arrange 
		StringConcatenator obj = new StringConcatenator();
		//Act 
		String result = obj.concatenate("ABC","DEF");
		//Assert
		assertEquals("ABCDEF", result);
	}
}
