package classlab.week10;

public class Fibonacci {
	public static int fibonacci(int n)  {
		int result;
		//fib(0) = 0;
		//fib(1) = 1;
	    if(n == 0)
//	    	System.out.print(0 + "\t");
	        return 0;
	    else if(n == 1)
//	    	System.out.print(1 + "\t");
	      return 1;
	    else 
	    	result= fibonacci(n - 1) + fibonacci(n - 2);
//	    	System.out.print(result + "\t");
	    	return result;
	}


	public static void main(String[] args) {
		for(int i=0;i<=11;i++)
		System.out.print(fibonacci(i) + "\t");
	}
}
