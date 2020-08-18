class Test {
	
	static int x;

	public void setX(int x) {
		Test.x=x;
	}
	
	public static void setXStatic(int x) {
		this.x=x;
	}
	
	public static void main(String args[]) {


		Test t1=new Test();
		t1.setX(20);
		System.out.println(Test.x);
	}

}
