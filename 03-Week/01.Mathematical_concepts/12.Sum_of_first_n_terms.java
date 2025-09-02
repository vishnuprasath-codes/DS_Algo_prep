//12.SUM OF CUBE OF NATURAL NUMBERS->https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // Initialize variable to store the result
        int sum = 0;
        
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i * i * i;  // Add the cube of i (i³) to sum
        }
        
        // After loop ends, sum will contain (1³ + 2³ + 3³ + ... + n³)
        return sum;  // Return the final sum
    }
}

