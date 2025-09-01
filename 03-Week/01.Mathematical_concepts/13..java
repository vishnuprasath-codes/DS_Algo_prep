//13.NATURAL NUMBERS POWER OF 5
class Solution {
    long sumOfFifthPowers(long N) {
        // Initialize sum to 0 (this will hold the final result)
        long sum = 0;
        
        // Loop through all natural numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            // Math.pow(i, 5) calculates i^5 (fifth power of i)
            // Cast it to long because Math.pow returns double
            sum += (long) Math.pow(i, 5);
        }
        
        // Return the total sum of fifth powers
        return sum;
    }
}
