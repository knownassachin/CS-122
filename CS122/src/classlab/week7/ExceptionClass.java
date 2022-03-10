package classlab.week7;

import java.util.Scanner;

public class ExceptionClass {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter here: ");
		String str = scnr.nextLine();
		
		
		try {
			if (str.charAt(10) == "Y") {
				System.out.println("Yes!");
			}
		}
		catch (Exception e) {
			System.out.println("Error: ");
			System.out.println(e.getMessage());
		}
		try {
			if (str.substring(3, 8).equals("CS122")) {
				System.out.println("Inclass");
			}
		}
		catch (Exception e) {
			System.out.println("Error: ");
			System.out.println(e.getMessage());
		}
	
	}
}
