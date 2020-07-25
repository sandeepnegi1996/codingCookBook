package com.sandy;

import static org.junit.Assert.*;

import  org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	public StringCalculator calc = null;

	@Before
	public void setup() {
		calc = new StringCalculator();
	}

	// refactor the first test case
	@Test
	public void testStringCalculatorMethodIntPresence() {
		calc.Add("1");
		Assert.assertTrue(true);
	}

	@Test
	public void test_StringCalculator_Add_EmptyStringr_ShouldreturnZero() {
		Assert.assertEquals(0, calc.Add(""));
	}

	

	@Test
	public void test_StringCalculator_add_whenTwoNumbersAreUsed_ThrowNoException() {
		calc.Add("1,2");
		Assert.assertTrue(true);

	}

	@Test(expected = RuntimeException.class)
	public void test_StringCalculator_WhenNonNumbersAreUsed_ThrowRunTimeException() {
		calc.Add("1,X");
	}
	
	
	//sum --> one number,return same number
	//two numbers --> return their sum
	
	@Test
	public void test_StringCalculator_WhenOneNumberIsGiven_Then_ReturnSameNumber() {
		Assert.assertEquals(1,calc.Add("1"));
	}
	
	@Test
	public void test_StringCalculator_WhenTwoNumbersIsGiven_Then_ReturnValueIsSum() {
		Assert.assertEquals(3,calc.Add("1,2"));
	}
	
	
	
	//negative not allowed if any of the input is negative than throw Exception
	
	@Test(expected=RuntimeException.class)
	public void test_SpringCalculator_whenAnyNegativeIsGiven_Then_ReturnThrowException() {
		calc.Add("-1,-2");
	}
	

	
	//Test two digit number sums
	
	@Test
	public void test_StringCalculator_WhenTwoDigitsNumbersUsed_Then_ReturnValidSum() {
		Assert.assertEquals(24,calc.Add("12,12"));
	}
	
	
	
	//allow the method to add unknown amount of numbers
	
	@Test
	public void test_StringCalculator_WhenMultipleDigitsUsed_ThenReturmSum() {
		Assert.assertEquals(10, calc.Add("1,2,3,2,2"));
	}
	

	
	//Numbers bigger than thousand should be ignored
	// 10001 +2 = 2
	
	@Test
	public void test_StringCalculator_WhenNumberMoreThanThousantUsed_Then_ReturnTheOtherNumber() {
		Assert.assertEquals(2 ,calc.Add("1002,2"));
	}
	
	
	//The following input is ok: "1\n2,3" (will equal 6)
	//allow to have a \n between the numbers
	

	@Test
	public void test_StringCalculator_WhenNewlineBetweenNumbers_Then_ReturnTheValidSum() {
		Assert.assertEquals(6,calc.Add("1\n2,3"));
	}
	
	
	//test with multiple number where the delimiter is \n 
	
	@Test
	public void test_StringCalculator_WhenNewLineIsOnlyDelimiter_then_return_validSum() {
		Assert.assertEquals(8, calc.Add("1\n2\n1\n2\n2"));
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
