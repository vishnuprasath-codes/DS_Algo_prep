//9.SPECIAL SERIES->https://www.geeksforgeeks.org/problems/special-series-sum0903/1
// User function Template for Java
class Solution {
    static long sumOfTheSeries(long n) {
        // Initialize variables
        int sum = 0;        // To store the cumulative sum (1 + 2 + ... + i)
        int series_sum = 0; // To store the sum of all cumulative sums

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum = sum + i;           // Add current number i to cumulative sum
            series_sum += sum;       // Add cumulative sum to the final result
        }

        // Return the final result
        return series_sum;
    }
}
