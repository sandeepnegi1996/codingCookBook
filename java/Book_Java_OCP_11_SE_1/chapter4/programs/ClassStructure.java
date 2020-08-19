
class Test {

	static int accountNumber;
	String name;


	static{

		System.out.println("Class is loaded");
	}


	{


		Test.accountNumber=Test.accountNumber + 1;

		
		System.out.println("Account number is incremented" + Test.accountNumber);
	}

	Test(String name) {

		this.name=name;


	}

	public String toString() {
		
		return "Student name  "+this.name +" : Student accountNumber is :"+Test.accountNumber;
	}
	public static void main(String args[]) {


		Test t1=new Test("SANDY");
		System.out.println(t1);
	}

}
