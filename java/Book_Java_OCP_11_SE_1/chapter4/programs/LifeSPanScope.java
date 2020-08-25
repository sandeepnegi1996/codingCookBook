class Test {

	int data=10;

	public static void main(String args[]) {

		Test t1=new Test();
		t1=null;
		try {
			System.out.println(t1.data);
		}
		catch(Exception e) {
			System.out.println(e);
	
		}
		finally {
			System.out.println("this is outside the exception");
		}

	}

}
