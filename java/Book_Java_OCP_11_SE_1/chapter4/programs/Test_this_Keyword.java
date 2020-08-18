class Test {

	String name;

	public void display() {
		
		System.out.println(name);
	}

	public void setName(String name) {
		
		name=name;
	}
	public static void main(String args[]) {

		System.out.println("hello world");

		Test t1=new Test();
		t1.setName("Sandy coder");
		t1.display();

	}
}
