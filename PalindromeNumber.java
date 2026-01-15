/**
 * Palindrome Number
 * 
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * A palindrome is a number that reads the same forwards and backwards.
 * 
 * Constraints:
 * - Negative numbers are not palindromes
 * - Numbers ending with 0 are not palindromes (except 0 itself)
 * - -2^31 <= x <= 2^31 - 1
 */
public class PalindromeNumber {
    
    /**
     * Check if an integer is a palindrome.
     * 
     * @param x the integer to check
     * @return true if x is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        // Numbers ending with 0 are not palindromes (except 0 itself)
        if (x != 0 && x % 10 == 0) {
            return false;
        }
        
        // Reverse the number and compare
        int original = x;
        int reversed = 0;
        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        
        return original == reversed;
    }
    
    public static void main(String[] args) {
        // Test case 1
        int x1 = 121;
        System.out.println("Input: " + x1);
        System.out.println("Output: " + isPalindrome(x1));
        System.out.println("Expected: true");
        System.out.println("Explanation: 121 reads as 121 from left to right and from right to left.");
        System.out.println();
        
        // Test case 2
        int x2 = -121;
        System.out.println("Input: " + x2);
        System.out.println("Output: " + isPalindrome(x2));
        System.out.println("Expected: false");
        System.out.println("Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.");
        System.out.println();
        
        // Test case 3
        int x3 = 10;
        System.out.println("Input: " + x3);
        System.out.println("Output: " + isPalindrome(x3));
        System.out.println("Expected: false");
        System.out.println("Explanation: Reads 01 from right to left. Therefore it is not a palindrome.");
        System.out.println();
        
        // Additional test cases
        System.out.println("Additional test cases:");
        System.out.println("0: " + isPalindrome(0) + " (Expected: true)");
        System.out.println("9: " + isPalindrome(9) + " (Expected: true)");
        System.out.println("1221: " + isPalindrome(1221) + " (Expected: true)");
        System.out.println("12321: " + isPalindrome(12321) + " (Expected: true)");
        System.out.println("123: " + isPalindrome(123) + " (Expected: false)");
        System.out.println("-1: " + isPalindrome(-1) + " (Expected: false)");
    }
}
