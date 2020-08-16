# Chapter3 

1. valid declarations --> 
```
int m=20;int p=m=10;

```
2. in the above declaration m value will be changed to 10;

3. Invalid declaration
```java

int x=y=10;
//here y needs to be declared first then only it can be used
```

4. if programmer didn;t initialize the instance and the static varibales of the class the default
	values will be stored in this case in these variables 

	``` java

	int --> 0
	byte --> 0
	flot --> 0.0
	boolean --> false

	reference type --> null

	```

5. For the local variables we cannot use them without initializing, we can declare them and compile the code that will work

6. default value of the instance variable and the static variables will be 0 for the primitive type
.
7. but for the refernce variables default value will be null;
8. local varibales is used without instalizing then this will throw some error.
9. local variables are instialized based on the local variables in that case compiler will think of ways.

//below code will throw error since compiler does not know the value of the varibale in run timw
```java

void test() {
	int i=0;
	int x;

	if(i==0) {

	x=1;
}

	System.out.println(x);
}
