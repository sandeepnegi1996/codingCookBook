
# Use of the This keyword

1. 
```java
//Guess the output of the following code

	

public void setName(Stirng name) {
		name=name;
}


//in this case the localvariables value will be assigned to the local variables and
//the instance variable value will be still null;

```

2. This --> this keyword can only be used in context of an instance of a class means 
	  constructor,instance menthods and class, it is not availables within the static method and a
          static block.

3. We can have a block of code inside the function also
4. When a method ends the variables defined in that method cease to exist.
5. When an objecr cease to exist, the instance variables of that object cease to exist.

#### Important Points about the Scope of the Variable

1. The instance variable can be shadowed by the variable inside the method block.
2. Instance variable can be shadowed by the variable inside the block.
3. Static variable and instance variable both are having the same class scoped so both can be shadowed by the 
method and the block.
4. But the Methods scopes variables cannot be shadowed by the loops or blocks


##### Objects value when nothing is assgined.

1. 
```java
	String str[]=new String[10];
	System.out.println(str[0]); --> Currently nothing is assigned so this will give me null


	//But in case of Array it will be zero


	int Arr[]=new int[2];
	System.out.println(Arr[1]);    ---> This will print the answer as '0'



```


#### How to Use Var ?

1. Var should only be used in the block scoped.
2. It cannot be used as the instance or static variable.
3. cannot be used as the method parameter.
4. Cannot be used as the return type in a method 
5. cannot be used for unitialized variable ex. var x; --> CTE
6. Cannot assign null to var --> var x=null  --> This will Give CTE
7. var[] a=new int []{1,2};   --> left side will give error can't use [] with var right side is OK.
8.



##### Conversion
1. Explicity float can be converted to int.
``` java
public int display(float x) {

	return (int)x;
}
	

```
2. above function will work for int,float,
3. If we try to pass double it will not compile since implicitly we cannot convert doublt to float so 
if we want to pass the double we need to explicity convert it to the float type then it will work
4. String will not work in case as the imput.
``` java

  String x=23;
  System.out.println(x);

//above mentioned code will fail since int cannot be converted to string

String x="hello"+23;
System.out.println(x);
```
