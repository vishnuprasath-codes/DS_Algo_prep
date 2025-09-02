//14.SQUARE DIFFERENCE->https://www.geeksforgeeks.org/problems/squares-difference0939/1
class Solution {
    static long squaresDiff(int N) {
        // Initialize variables
        long result = 0;   // (not actually needed, can be removed)
        long e_sq = 0;     // will store sum of squares (1^2 + 2^2 + ... + N^2)
        long w_sq = 0;     // will store sum of numbers (1 + 2 + ... + N)
        
        // Loop through numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            e_sq = e_sq + (i * i); // add i^2 to sum of squares
            w_sq = w_sq + i;       // add i to sum of numbers
        }
        
        // Square the sum of numbers
        w_sq = w_sq * w_sq;  // (1 + 2 + ... + N)^2
        
        // Return the difference (currently not absolute)
        // Problem statement asks for ABSOLUTE difference → should be Math.abs(w_sq - e_sq)
        return w_sq - e_sq;
    }
}
