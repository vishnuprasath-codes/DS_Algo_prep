//2.REVERSE A NUMBER-> https://www.geeksforgeeks.org/problems/reverse-digit0316/1
// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Variable to store the reversed number
        int rev_num = 0;

        // Variable to hold the last digit in each step
        int ld = 0;

        // Loop until all digits are processed
        while (n > 0) {
            // Extract the last digit
            ld = n % 10;

            // Build the reversed number
            // (shift previous digits left by *10, then add last digit)
            rev_num = rev_num * 10 + ld;

            // Remove the last digit from the original number
            n = n / 10;
        }

        // Return the reversed number
        return rev_num;
    }
}
