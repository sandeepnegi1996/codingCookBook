package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAndAfterTest {

	@BeforeClass
	public static void beforeClass() {
		
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	
	
	@Test
	public void test() {
		System.out.println("this is just information");
	}

}
