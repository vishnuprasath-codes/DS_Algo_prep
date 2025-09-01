//10. ODD SPECIAL SERIES
// User function Template for Java
class Solution {
    static long sumOfTheSeries(long n) {
        // code here

        // Initialize variables
        int sum = 0;        // To store the cumulative sum (adds odd numbers step by step)
        int series_sum = 0; // To store the sum of all cumulative sums

        /*
         * Loop through odd numbers only
         * Why (2*n - 1)? Because there are n odd numbers from 1 to (2*n - 1).
         * Example: if n = 3 → odd numbers = 1, 3, 5
         */
        for (int i = 1; i <= (2 * n) - 1; i = i + 2) {
            sum = sum + i;       // Add the current odd number to cumulative sum
            series_sum += sum;   // Add cumulative sum to the final result
        }

        // Return the final result (sum of squares of first n numbers)
        return series_sum;
    }
}

