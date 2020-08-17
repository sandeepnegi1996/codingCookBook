class Test {

	static int staticVal;
	int y;
	public static void main(String args[]) throws Exception {
		
		int x;
		int i=0;
		System.out.println("This is the default instance variable " +   new Test().y);

		
		System.out.println("This is default static  variable " +   Test.staticVal);

	
		if(i==0) {
		
			x=22;
		}


		if(i!=0) {

			x=24;
		}

	//	else{

		
	//		x=23;
	//	}

		System.out.println("This is default local variable " +   x);

	}

}
