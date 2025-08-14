package in.versionit;

import java.util.Scanner;

public class WTF {
	static char ch;
	public static void main(String[] args) {
		
		System.out.println("default value "+ch);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your name and Password");
		String name = input.next();
		String password = input.next();

		if ((password.equalsIgnoreCase("1234")) && (name.equalsIgnoreCase("shanu"))) {
			System.out.println("login Sucssuful");
		} else {
			System.out.println( " plz enter valid login ditiles");
		}

		input.close();
	}

}
