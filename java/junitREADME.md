
# Important Junit Notes

1. Hierarchial structure for the tests should be similar to the Src code.
2. @Before is used to run before a test case
3. @After is used to run after a test case
4. @BeforeClass is used to run before test class
5. @AfterClass is used to run after the test class
6. * IMP * one test should do only one thing same as the function.
7. @BeforeClass and @AfterClass should be static

```code


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


```
