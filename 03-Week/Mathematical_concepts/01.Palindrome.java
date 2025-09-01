//1.PALINDROME NUMBER->https://www.geeksforgeeks.org/problems/palindrome0746/1
class Solution {
    public boolean isPalindrome(int n) {
        // Store the original number (because 'n' will change when we reverse it)
        int num = n;  

        // Variable to store the reversed number
        int sum = 0;

        // Loop until the number becomes 0
        while (n > 0) {
            // Get the last digit
            int ld = n % 10;

            // Add last digit to reversed number
            // (shift previous digits to left by *10, then add ld)
            sum = sum * 10 + ld;

            // Remove the last digit from n
            n = n / 10;
        }

        // If reversed number equals original, then it's a palindrome
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }
}

