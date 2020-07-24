package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArrayCompare() {
		int actual[]= {5,7,1,2,3};
		int expected[]= {1,2,3,5,7};
		Arrays.sort(actual);
		Assert.assertArrayEquals(expected,actual);
	}
	
	
	

}
