//15.REVERSE A NUMBER
class Solution {
    public int reverseDigits(int n) {
        // Variable to store the reversed number
        int rev_num = 0;
        
        // Variable to store the last digit at each step
        int ld = 0;
        
        // Loop until all digits are processed
        while (n > 0) {
            // Extract the last digit
            ld = n % 10;
            
            // Append the digit to rev_num
            // Multiply rev_num by 10 to shift left, then add the digit
            rev_num = rev_num * 10 + ld;
            
            // Remove the last digit from n
            n = n / 10;
        }
        
        // Return the reversed number
        return rev_num;
    }
}
