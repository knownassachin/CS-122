package midterm2Review;

public class RecursionRe {
	public static void main(String[] args) {
		
	}
	//direct recursion
	public static int factorial(int num) {
		
		//base case
		if(num==0)
			return 1;
		//recursive case
		else
			return num * factorial(num-1);
		
	}
	
	//indirect recursion
	public static int indirectFactorial(int num) {
		//base case
		if(num==0)
			return 1;
		//indirect recursion
		else
			return num * decrementFactorial(num);
	}
	
	public static int decrementFactorial(int num) {
		num = num -1;
		return factorial(num);
	}
}
// example of recursion
//factorial(){
//	....
//	factorial()
//	....
//}

//for recursion:
//	base case
//	recursive case
//	
