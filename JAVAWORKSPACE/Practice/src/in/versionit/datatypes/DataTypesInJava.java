package in.versionit.datatypes;

public class DataTypesInJava {

	// Integral Data types
	// declaration
	byte b=10;
	short s=20;
	int i=30;
	long l=40;

	public void nonStatic() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}

	public static void main(String[] args) {

		DataTypesInJava d1=new DataTypesInJava();
		d1.nonStatic();

	}

}
