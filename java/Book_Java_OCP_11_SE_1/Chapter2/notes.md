# Important Notes Chapter2

1. You don't need to put the java files in the package while compiling java compiler can do that for you
2. so Imagine our Class Test is in Package --> package p1 --> class Test --> to compile this --> javac -d . Test.java
3. A folder will be created with name p1 with the Test.class
4. To compile multiple files with dependency -->  ``` javac -d . *.java ``` --> it will compile all the java files and put all the .class files in the appropiate directory.
5. While doing the import static you need to mention the data member or member function you are importing ``` import static foo.bar.Program2.display;
6. 
