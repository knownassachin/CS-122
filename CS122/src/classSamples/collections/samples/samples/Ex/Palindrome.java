package classSamples.collections.samples.Ex;

public class Palindrome {
//    public static boolean isPalindrome(String s) {
////        if length is 1
////            it is plaindrome
//        if (s.length() <= 1) // Base case
//            return true;
//        else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
//            return false;//it is not a plaindrome
//        else
////        if 1st and last chars are equal
////        check the remiaing isPalindrome
//            return isPalindrome(s.substring(1, s.length() - 1));
//    }
//    sosos
    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0, s.length()-1);
    }
    public static boolean isPalindrome(String s, int low, int high){
        if(high<=low){
            return true;
        }
        else if (s.charAt(low)!=s.charAt(high))
            return false;
        else
            return isPalindrome(s,low+1, high-1);
    }



    public static void main(String[] args) {
        System.out.println(isPalindrome("qwertyuiopasdfghjklzxcvbnmnbvcxzlkjhgfdsapoiuytrewq"));
    }
}
