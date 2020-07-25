

# Requirements to Do the test driven development

1. Create a simple String calculator with a method int Add(string numbers)
2. The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example "" or "1" or "1,2"
3. Allow the Add method to handle an unknown amount of numbers
4. Allow the Add method to handle new lines between numbers (instead of commas). The following input is ok: "1\n2,3" (will equal 6)
5. Support different delimiters To change a delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ';' .
6. The first line is optional. All existing scenarios should still be supported
    Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed. If there are multiple negatives, show all of them in the exception message stop here if you are a beginner.
7. Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
8. Delimiters can be of any length with the following format: "//[delimiter]\n" for example: "//[---]\n1---2---3" should return 6
9. Allow multiple delimiters like this: "//[delim1][delim2]\n" for example "//[-][%]\n1-2%3" should return 6.
10. Make sure you can also handle multiple delimiters with length longer than one char
