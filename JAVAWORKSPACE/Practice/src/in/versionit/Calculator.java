package in.versionit;

//in.versionit.Calculator@1d8d30f7

public class Calculator {

	public void add(int a, int b) {
		System.out.println("Addition started");
		System.out.println(a + b);
		System.out.println("Addition completed");
	}
	public void mul(int a, int b) {
		System.out.println("multiplication started");
		System.out.println(a * b);
		System.out.println("multiplication completed");
	}

	public static void main(String[] args) {

		//Object creation
		//ClassName refVar=new ClassName();
		Calculator c1 = new Calculator();

		c1.add(30, 60);
		c1.mul(2, 3);
		c1.equals(c1);
		
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator();
		Calculator c4 = new Calculator();
		

	

	}

}
