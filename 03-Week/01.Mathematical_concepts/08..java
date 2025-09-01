//8.NTH NUMBER
class Solution {
    // Method to find the Nth term in the series (sum of first n natural numbers)
    static int findNthTerm(int n) {
        // Initialize sum as 0 (this will store the cumulative total)
        int sum = 0;

        // Loop runs from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // Add each number i to the sum
            sum = sum + i;
        }

        // After the loop ends, 'sum' contains the result (1 + 2 + 3 + ... + n)
        return sum;
    }
}
