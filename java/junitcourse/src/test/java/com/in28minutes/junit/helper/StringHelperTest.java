package com.in28minutes.junit.helper;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//https://www.youtube.com/watch?v=o5k9NOR9lrI

public class StringHelperTest {

	// we should always test one assert in one test method
	StringHelper helper = new StringHelper();

	
	@Before
	public void setUp() throws Exception {
		System.out.println("before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test");
	}

	// AABAA --> true
	// AABBCC --> false
	// ACBBA ---> false
	// CABAE ---> false
	@SuppressWarnings("deprecation")
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_FirstTwoCharacterSame() {
		assertEquals(true, helper.areFirstAndLastTwoCharactersTheSame("AABAA"));
	}

	@Test
	public void testareFirstAndLastTwoCharactersTheSame_FirstTwoCharacterDifferent() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("AABBCD"));

	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_oneCharacterMatches() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ACBBA"));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_secondCharacterIsSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("CABAE"));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_inputStringEmpty() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(""));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_inputStringLengthOne() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_inputStringLengthTwo() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AA"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	
	/*
	 * @Test public void
	 * testareFirstAndLastTwoCharactersTheSame_inputStringLengthOneNegativeNumber()
	 * { assertFalse(helper.areFirstAndLastTwoCharactersTheSame("-1")); }
	 */
	
	
	@Test
	public void testareFirstAndLastTwoCharactersTheSame_inputNullCheck() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(null));
	}

}
