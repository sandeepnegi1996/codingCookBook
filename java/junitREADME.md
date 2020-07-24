
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


8. Lets test some performance of the function

```code
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

```

9. Running Parameterixed Test

1. For this we just needs to create a class basically test call with tag @RunWith(Parameterized.class)
2. Now we have to create one function which will store all the input and expected output
3. Than we need to call the instance variables in our class and hence the test is parameterixed now.

```code


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


```
