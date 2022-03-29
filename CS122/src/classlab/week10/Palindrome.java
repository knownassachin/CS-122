package classlab.week10;

public class Palindrome {
	public static boolean isPalindrome(String s) {
//		if length is 1
//		it is Palindrome
        if (s.length() <= 1) // Base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
            return false; //it is not a palindorme
//        if 1st and last chars are equal
//		check the remaining
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }
	
	//Recurrsion often has "HELPER Methods"

    public static void main(String[] args) {
        System.out.println(isPalindrome("qwertyuiopasdfghjklzxcvbnmnbvcxzlkjhgfdsapoiuytrewq"));
    }
}