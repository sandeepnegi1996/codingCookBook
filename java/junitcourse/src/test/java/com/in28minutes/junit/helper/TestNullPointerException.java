package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestNullPointerException {

	// Below test case will pass since we are expecting it to be null pointer
	// exception
	// and it is null pointer exception
	// if we are expecting it to be nullpointer exception and exception doesn't come
	// then it will fail
	// refer it in second test case

	@Test(expected = NullPointerException.class)
	public void testNullpointerException() {
		int arr[] = null;
		int expected[] = { 1, 2, 3 };
		Arrays.sort(arr);

	}

	// this test case will be failing

	@Test(expected = NullPointerException.class)
	public void testNullpointerExceptionSecond() {
		int arr[] = {3,2,1};
		int expected[] = { 1, 2, 3 };
		Arrays.sort(arr);
		// Assert.assertArrayEquals(expected, arr);
	}

	
	// lets test the performance
	// here performance means that the particular function should finish in some
	// particular time ,we will use the **timeout** parameter in test 

	@Test(timeout = 1)
	public void testPerformance() {
		int array[] = { 3, 2, 1 ,4,3,3,43,34343,234322434,23423423,423,423423,423,423,423,4,2345,645,6456,45,645,645645645,645,6,456,45,64546,45 };
		for (int i = 0; i < 1000000; i++) {
			Arrays.sort(array);
		}

	}

}
