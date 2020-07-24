package com.in28minutes.junit.helper;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper=new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	
	@Parameters
	public static Collection<String []> testConditions() {
		
		//this array is for the input and the output for the test cases
		String array[][]= {{"AABCD","BCD"},{"BCDE","BCDE"}};
		
		return Arrays.asList(array);
	}


	@Test
	public void testtruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

}
