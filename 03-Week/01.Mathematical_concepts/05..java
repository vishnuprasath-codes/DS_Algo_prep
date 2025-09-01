//5.DIVISORS OF A NUMBER
// User function Template for Java
class Solution {
    static int countDivisors(int n) {
        // Variable to count the divisors of n that are divisible by 3
        int count = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            // Check two conditions:
            // 1. i is a divisor of n  (n % i == 0)
            // 2. i is divisible by 3  (i % 3 == 0)
            if (n % i == 0 && i % 3 == 0) {
                count += 1; // increase the count if both conditions are true
            }
        }

        // Return the total count of divisors divisible by 3
        return count;
    }
}
