package midterm2Review;

public class Recursion {
	public static void main(String[] args) {
		
	}
	
	public static int factorial(int num) {
		//base case
		if(num==1)
			return 1;
		// recursive case
		else
			return num * factorial(num-1);
	}
	
	public static int indirectFactorial(int num) {
		//base case
		if(num==1)
			return 1;
		//indirect recursive case
		else
			return num * decrementAndFactorial(num);
	}
	
	public static int decrementAndFactorial(int num) {
		num = num - 1;
		return indirectFactorial(num);
	}
	
}

/*
 in recursion
	recursive case
	base case
 */

