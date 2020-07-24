package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestNullPointerException {

	
	
	
	//Below test case will pass since we are expecting it to be null pointer exception
	// and it is null pointer exception
	//if we are expecting it to be nullpointer exception and exception doesn't come then it will fail
	//refer it in second test case
	
	@Test(expected=NullPointerException.class)
	public void testNullpointerException() {
		int arr[]= null;
		int expected[]= {1,2,3};
		Arrays.sort(arr);
		
	}
	
	//this test case will be failing
	
	@Test(expected=NullPointerException.class)
	public void testNullpointerExceptionSecond() {
		int arr[]= {3,2,1};
		int expected[]= {1,2,3};
		Arrays.sort(arr);
		//Assert.assertArrayEquals(expected, arr);
	}

}
