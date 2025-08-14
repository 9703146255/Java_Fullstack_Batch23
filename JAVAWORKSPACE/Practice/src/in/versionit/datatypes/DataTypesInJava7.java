package in.versionit.datatypes;

public class DataTypesInJava7 {

	public static void main(String[] args) {

		// String literal approach
		String stringLiteral = "Hari";

		// By using new keyword
		String newKeyWord = new String("Charan");

		// Converting character array into String object
		char[] names = { 'a', 'p', 'p', 'l', 'e' };
		String charArrayToString = new String(names);

		System.out.println("String Literal Approach : " + stringLiteral);
		System.out.println("By using new keyword : " + newKeyWord);
		System.out.println("By using char array to string : " + charArrayToString);

	}

}
