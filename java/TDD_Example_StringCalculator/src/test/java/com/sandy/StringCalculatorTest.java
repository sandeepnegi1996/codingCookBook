package com.sandy;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void testStringCalculatorMethodIntPresence() {
		StringCalculator calc=new StringCalculator();
		String str="123";
		assertEquals(5,calc.Add(str));
	
	}
	
	@Test
	public void testStringCalculatorAddEmptyString() {
		StringCalculator calc=new StringCalculator();
		assertEquals(0,calc.Add(""));
	}
	
	

}
