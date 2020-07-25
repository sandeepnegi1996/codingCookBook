package com.sandy;

import static org.junit.Assert.*;

import org.junit.Assert;
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

	@Test(expected = RuntimeException.class)
	public void test_StringCalculator_WhenMoreThanTwoNumbersAreAdded_ThrowException() {
		calc.Add("1,2,3");

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
	
	@Test
	public void test_StringCalculator_WhenOneNumberIsGivenPositiveOtherAsNegative_Then_ReturnSumWillHaveTheGreaterNumberSign() {
		Assert.assertEquals(-4, calc.Add("2,-6"));
	}
	
	
	//if both negative then answer should be negative
	
	@Test
	public void test_StringCalculator_WhenBothInputNegative_Then_ReturnValueNegative() {
		Assert.assertEquals(-4, calc.Add("-1,-3"));
	}
	
	//Test two digit number sums
	
	@Test
	public void test_StringCalculator_WhenTwoDigitsNumbersUsed_Then_ReturnValidSum() {
		Assert.assertEquals(24,calc.Add("12,12"));
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
