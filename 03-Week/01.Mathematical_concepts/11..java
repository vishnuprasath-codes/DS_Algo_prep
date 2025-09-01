//11.SUM OF NATURAL NUMBERS
class Solution {
    public static int findSum(int n) {
        // Initialize sum variable to store the result
        int sum = 0;

        // Loop from 1 to n (inclusive)
        // In each iteration, add the current number i to sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;  // or sum += i
        }

        // After loop ends, sum will contain (1 + 2 + 3 + ... + n)
        return sum;  // Return the final result
    }
}
