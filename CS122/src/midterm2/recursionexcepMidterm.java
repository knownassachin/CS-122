package midterm2;

import java.util.Scanner;

public class recursionexcepMidterm extends Exception {

	public static void main(String[] args) throws OddException {
		Scanner scnr = new Scanner(System.in);
		String input = scnr.next();

		try {
			if (!Character.isDigit(input.charAt(0))) {
				throw new OddException("First 2 Chararacters are not integers");
			}
			else if (!Character.isDigit(input.charAt(1))) {
				throw new OddException("First 2 Chararacters are not integers");
			}
			
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
	
	private static int num(int i) {
		int x = input.charat(0);
		int y = input.charAt(1);
		int sum = x + y;
		
		if (sum == 0) {
			return 1;
		} else {
			return 2 / num(x -1);
		}
		
	}
	
	
	
	}


class OddException extends Exception{
	public OddException(String message) {
		super(message);
	}
	}