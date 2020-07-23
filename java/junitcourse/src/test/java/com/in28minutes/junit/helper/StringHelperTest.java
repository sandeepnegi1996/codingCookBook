package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StringHelperTest {

	//we should always test one assert in one test method
	
	
	
	@Before
	public void setUp() throws Exception {
		System.out.println("before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_FirstTwoCharacterSame() {
		
		//AABAA --> true
		//AABBCC -->  false
		//ACBBA  ---> false
		//CABAE  ---> false
		
	StringHelper helper=new StringHelper();
	Assert.assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("AABAA"));
	
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_FirstTwoCharacterNotSame() {

	StringHelper helper=new StringHelper();

	Assert.assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("AABBCD"));
	
	}

}
